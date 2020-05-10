package typingsSlinky.reduxOrm.fieldsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationalFieldOpts extends js.Object {
  var as: js.UndefOr[String] = js.native
  var relatedName: js.UndefOr[String] = js.native
  var through: js.UndefOr[String] = js.native
  var throughFields: js.UndefOr[js.Tuple2[String, String]] = js.native
  var to: String = js.native
}

object RelationalFieldOpts {
  @scala.inline
  def apply(to: String): RelationalFieldOpts = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationalFieldOpts]
  }
  @scala.inline
  implicit class RelationalFieldOptsOps[Self <: RelationalFieldOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withRelatedName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedName")(js.undefined)
        ret
    }
    @scala.inline
    def withThrough(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("through")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("through")(js.undefined)
        ret
    }
    @scala.inline
    def withThroughFields(value: js.Tuple2[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throughFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThroughFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throughFields")(js.undefined)
        ret
    }
  }
  
}

