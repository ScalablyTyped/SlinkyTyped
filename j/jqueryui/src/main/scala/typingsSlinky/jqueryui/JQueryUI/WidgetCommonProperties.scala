package typingsSlinky.jqueryui.JQueryUI

import typingsSlinky.jqueryui.JQuery
import typingsSlinky.std.Document_
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WidgetCommonProperties extends js.Object {
  var defaultElement: String = js.native
  var document: Document_ = js.native
  var element: JQuery = js.native
  var namespace: String = js.native
  var uuid: String = js.native
  var widgetEventPrefix: String = js.native
  var widgetFullName: String = js.native
  var window: Window_ = js.native
}

object WidgetCommonProperties {
  @scala.inline
  def apply(
    defaultElement: String,
    document: Document_,
    element: JQuery,
    namespace: String,
    uuid: String,
    widgetEventPrefix: String,
    widgetFullName: String,
    window: Window_
  ): WidgetCommonProperties = {
    val __obj = js.Dynamic.literal(defaultElement = defaultElement.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], widgetEventPrefix = widgetEventPrefix.asInstanceOf[js.Any], widgetFullName = widgetFullName.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetCommonProperties]
  }
  @scala.inline
  implicit class WidgetCommonPropertiesOps[Self <: WidgetCommonProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocument(value: Document_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidgetEventPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgetEventPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidgetFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgetFullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindow(value: Window_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

