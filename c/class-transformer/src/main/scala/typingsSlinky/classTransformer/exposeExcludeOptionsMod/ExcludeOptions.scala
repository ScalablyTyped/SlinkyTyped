package typingsSlinky.classTransformer.exposeExcludeOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcludeOptions extends js.Object {
  var toClassOnly: js.UndefOr[Boolean] = js.native
  var toPlainOnly: js.UndefOr[Boolean] = js.native
}

object ExcludeOptions {
  @scala.inline
  def apply(): ExcludeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcludeOptions]
  }
  @scala.inline
  implicit class ExcludeOptionsOps[Self <: ExcludeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

