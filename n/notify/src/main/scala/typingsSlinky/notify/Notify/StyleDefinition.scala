package typingsSlinky.notify.Notify

import typingsSlinky.notify.AnonDictclassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleDefinition extends js.Object {
  /**
    * Defines the available classes in this style. The "base" property will be applied to every
    * notification with this style.
    */
  var classes: js.UndefOr[AnonDictclassName] = js.native
  /**
    * All notifications will have this CSS applied to it.
    */
  var css: js.UndefOr[String] = js.native
  /**
    * Defines the HTML wrapping the notification.
    *
    * If you only have HTML element that you need to modify per notification then you should give
    * this element an attribute of data-notify-text or data-notify-html. Use data-notify-html if
    * you wish to display arbitrary HTML inside the notification, otherwise, use data-notify-text
    * as it is more secure.
    * For more complex notifications, you may give a value to the data-notify-text/data-notify-html
    * attribute on an element, such as <div data-notify-html="propertyName"></div>. You may then
    * pass a javasript Object with a "propertyName" key to the notify method, whose value will be
    * the text/html that the element is populated with.
    */
  var html: String = js.native
}

object StyleDefinition {
  @scala.inline
  def apply(html: String): StyleDefinition = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleDefinition]
  }
  @scala.inline
  implicit class StyleDefinitionOps[Self <: StyleDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClasses(value: AnonDictclassName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withCss(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.undefined)
        ret
    }
  }
  
}

