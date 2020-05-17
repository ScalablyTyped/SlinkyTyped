package typingsSlinky.meteor.anon

import typingsSlinky.meteor.Mongo.FieldSpecifier
import typingsSlinky.meteor.Mongo.SortSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Skip extends js.Object {
  var fields: js.UndefOr[FieldSpecifier] = js.native
  var reactive: js.UndefOr[Boolean] = js.native
  var skip: js.UndefOr[Double] = js.native
  var sort: js.UndefOr[SortSpecifier] = js.native
  var transform: js.UndefOr[js.Function | Null] = js.native
}

object Skip {
  @scala.inline
  def apply(): Skip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Skip]
  }
  @scala.inline
  implicit class SkipOps[Self <: Skip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: FieldSpecifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withReactive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReactive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactive")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: SortSpecifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(null)
        ret
    }
  }
  
}

