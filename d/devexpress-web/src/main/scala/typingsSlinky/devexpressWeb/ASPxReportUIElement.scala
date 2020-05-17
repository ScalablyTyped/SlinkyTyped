package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about a UI element of the Web Report Designer or Web Document Viewer.
  */
@js.native
trait ASPxReportUIElement extends js.Object {
  /**
    * Provides access to an element model.
    */
  var model: js.Any = js.native
  /**
    * Provides access to the name of an HTML template used by an element.
    */
  var templateName: String = js.native
}

object ASPxReportUIElement {
  @scala.inline
  def apply(model: js.Any, templateName: String): ASPxReportUIElement = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxReportUIElement]
  }
  @scala.inline
  implicit class ASPxReportUIElementOps[Self <: ASPxReportUIElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

