package typingsSlinky.classTransformer.exposeExcludeOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExposeOptions extends js.Object {
  var groups: js.UndefOr[js.Array[String]] = js.native
  var name: js.UndefOr[String] = js.native
  var since: js.UndefOr[Double] = js.native
  var toClassOnly: js.UndefOr[Boolean] = js.native
  var toPlainOnly: js.UndefOr[Boolean] = js.native
  var until: js.UndefOr[Double] = js.native
}

object ExposeOptions {
  @scala.inline
  def apply(): ExposeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExposeOptions]
  }
  @scala.inline
  implicit class ExposeOptionsOps[Self <: ExposeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSince(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(js.undefined)
        ret
    }
    @scala.inline
    def withToClassOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toClassOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToClassOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toClassOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withToPlainOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toPlainOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToPlainOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toPlainOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withUntil(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("until")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUntil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("until")(js.undefined)
        ret
    }
  }
  
}

