package typingsSlinky.materialDesignLite.MaterialDesignLite

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentConfigPublic extends js.Object {
  var classAsString: String = js.native
  var cssClass: String = js.native
  var widget: js.UndefOr[String | Boolean] = js.native
}

object ComponentConfigPublic {
  @scala.inline
  def apply(classAsString: String, cssClass: String): ComponentConfigPublic = {
    val __obj = js.Dynamic.literal(classAsString = classAsString.asInstanceOf[js.Any], cssClass = cssClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentConfigPublic]
  }
  @scala.inline
  implicit class ComponentConfigPublicOps[Self <: ComponentConfigPublic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassAsString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classAsString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidget(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widget")(js.undefined)
        ret
    }
  }
  
}

