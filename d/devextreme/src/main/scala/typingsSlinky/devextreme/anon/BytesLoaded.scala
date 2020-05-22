package typingsSlinky.devextreme.anon

import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.event
import typingsSlinky.devextreme.mod.DevExpress.ui.dxFileUploader
import typingsSlinky.devextreme.mod.global.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BytesLoaded extends js.Object {
  var bytesLoaded: js.UndefOr[Double] = js.undefined
  var bytesTotal: js.UndefOr[Double] = js.undefined
  var component: js.UndefOr[dxFileUploader] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var event: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.event] = js.undefined
  var file: js.UndefOr[org.scalajs.dom.raw.File] = js.undefined
  var jQueryEvent: js.UndefOr[JQueryEventObject] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var request: js.UndefOr[XMLHttpRequest] = js.undefined
  var segmentSize: js.UndefOr[Double] = js.undefined
}

object BytesLoaded {
  @scala.inline
  def apply(
    bytesLoaded: js.UndefOr[Double] = js.undefined,
    bytesTotal: js.UndefOr[Double] = js.undefined,
    component: dxFileUploader = null,
    element: dxElement = null,
    event: event = null,
    file: org.scalajs.dom.raw.File = null,
    jQueryEvent: JQueryEventObject = null,
    model: js.Any = null,
    request: XMLHttpRequest = null,
    segmentSize: js.UndefOr[Double] = js.undefined
  ): BytesLoaded = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bytesLoaded)) __obj.updateDynamic("bytesLoaded")(bytesLoaded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bytesTotal)) __obj.updateDynamic("bytesTotal")(bytesTotal.get.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (jQueryEvent != null) __obj.updateDynamic("jQueryEvent")(jQueryEvent.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (!js.isUndefined(segmentSize)) __obj.updateDynamic("segmentSize")(segmentSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesLoaded]
  }
}

