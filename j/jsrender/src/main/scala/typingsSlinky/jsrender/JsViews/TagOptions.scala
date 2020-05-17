package typingsSlinky.jsrender.JsViews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagOptions
  extends TagOptionProps
     with TagSetter {
  /* Tag options hash */
  var template: js.UndefOr[TemplateSetter] = js.native
}

object TagOptions {
  @scala.inline
  def apply(): TagOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagOptions]
  }
  @scala.inline
  implicit class TagOptionsOps[Self <: TagOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTemplate(value: TemplateSetter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
  }
  
}

