package typingsSlinky.fullcalendar.inputTypesMod

import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.jquery.JQuery.Ajax.CompleteCallback
import typingsSlinky.jquery.JQuery.Ajax.ErrorCallback
import typingsSlinky.jquery.JQuery.Ajax.StatusCodeCallbacks
import typingsSlinky.jquery.JQuery.Ajax.SuccessCallback
import typingsSlinky.jquery.JQuery.Ajax.XHRFields
import typingsSlinky.jquery.JQuery.AjaxSettings
import typingsSlinky.jquery.JQuery.PlainObject
import typingsSlinky.jquery.JQuery.TypeOrArray
import typingsSlinky.jquery.JQuery.jqXHR
import typingsSlinky.jquery.jqueryBooleans.`false`
import typingsSlinky.jquery.jqueryBooleans.`true`
import typingsSlinky.jquery.jqueryStrings.`applicationSlashx-www-form-urlencoded`
import typingsSlinky.jquery.jqueryStrings.`multipartSlashform-data`
import typingsSlinky.jquery.jqueryStrings.html
import typingsSlinky.jquery.jqueryStrings.json
import typingsSlinky.jquery.jqueryStrings.jsonp
import typingsSlinky.jquery.jqueryStrings.script
import typingsSlinky.jquery.jqueryStrings.text
import typingsSlinky.jquery.jqueryStrings.textSlashplain
import typingsSlinky.jquery.jqueryStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSourceExtendedInput
  extends AjaxSettings[js.Any]
     with EventOptionsBase {
  var allDayDefault: js.UndefOr[Boolean] = js.undefined
  var endParam: js.UndefOr[String] = js.undefined
  var eventDataTransform: js.UndefOr[js.Function1[/* eventData */ js.Any, EventObjectInput]] = js.undefined
  var events: js.UndefOr[EventSourceSimpleInput] = js.undefined
  var startParam: js.UndefOr[String] = js.undefined
}

object EventSourceExtendedInput {
  @scala.inline
  def apply(
    accepts: PlainObject[String] = null,
    allDayDefault: js.UndefOr[Boolean] = js.undefined,
    async: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: String = null,
    beforeSend: js.ThisFunction2[js.Any, /* jqXHR */ jqXHR[_], EventSourceExtendedInput, `false` | Unit] = null,
    borderColor: String = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    className: String | js.Array[String] = null,
    color: String = null,
    complete: TypeOrArray[CompleteCallback[js.Any]] = null,
    constraint: ConstraintInput = null,
    contentType: String | `false` = null,
    contents: PlainObject[js.RegExp] = null,
    context: js.Any = null,
    converters: PlainObject[(js.Function1[/* value */ _, _]) | `true`] = null,
    crossDomain: js.UndefOr[Boolean] = js.undefined,
    data: PlainObject[_] | String = null,
    dataFilter: (/* data */ String, /* type */ String) => _ = null,
    dataType: xml | html | script | json | jsonp | text | String = null,
    durationEditable: js.UndefOr[Boolean] = js.undefined,
    editable: js.UndefOr[Boolean] = js.undefined,
    enctype: `applicationSlashx-www-form-urlencoded` | `multipartSlashform-data` | textSlashplain = null,
    endParam: String = null,
    error: TypeOrArray[ErrorCallback[js.Any]] = null,
    eventDataTransform: /* eventData */ js.Any => EventObjectInput = null,
    events: EventSourceSimpleInput = null,
    global: js.UndefOr[Boolean] = js.undefined,
    headers: PlainObject[js.UndefOr[String | Null]] = null,
    ifModified: js.UndefOr[Boolean] = js.undefined,
    isLocal: js.UndefOr[Boolean] = js.undefined,
    jsonp: String | `false` = null,
    jsonpCallback: String | (js.ThisFunction0[js.Any, String]) = null,
    method: String = null,
    mimeType: String = null,
    overlap: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    processData: js.UndefOr[Boolean] = js.undefined,
    rendering: String = null,
    scriptCharset: String = null,
    startEditable: js.UndefOr[Boolean] = js.undefined,
    startParam: String = null,
    statusCode: StatusCodeCallbacks[js.Any] = null,
    success: TypeOrArray[SuccessCallback[js.Any]] = null,
    textColor: String = null,
    timeout: js.UndefOr[Double] = js.undefined,
    traditional: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    url: String = null,
    username: String = null,
    xhr: () => XMLHttpRequest = null,
    xhrFields: XHRFields = null
  ): EventSourceExtendedInput = {
    val __obj = js.Dynamic.literal()
    if (accepts != null) __obj.updateDynamic("accepts")(accepts.asInstanceOf[js.Any])
    if (!js.isUndefined(allDayDefault)) __obj.updateDynamic("allDayDefault")(allDayDefault.get.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(beforeSend.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (constraint != null) __obj.updateDynamic("constraint")(constraint.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (converters != null) __obj.updateDynamic("converters")(converters.asInstanceOf[js.Any])
    if (!js.isUndefined(crossDomain)) __obj.updateDynamic("crossDomain")(crossDomain.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataFilter != null) __obj.updateDynamic("dataFilter")(js.Any.fromFunction2(dataFilter))
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (!js.isUndefined(durationEditable)) __obj.updateDynamic("durationEditable")(durationEditable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.get.asInstanceOf[js.Any])
    if (enctype != null) __obj.updateDynamic("enctype")(enctype.asInstanceOf[js.Any])
    if (endParam != null) __obj.updateDynamic("endParam")(endParam.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (eventDataTransform != null) __obj.updateDynamic("eventDataTransform")(js.Any.fromFunction1(eventDataTransform))
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(ifModified)) __obj.updateDynamic("ifModified")(ifModified.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isLocal)) __obj.updateDynamic("isLocal")(isLocal.get.asInstanceOf[js.Any])
    if (jsonp != null) __obj.updateDynamic("jsonp")(jsonp.asInstanceOf[js.Any])
    if (jsonpCallback != null) __obj.updateDynamic("jsonpCallback")(jsonpCallback.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (!js.isUndefined(overlap)) __obj.updateDynamic("overlap")(overlap.get.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(processData)) __obj.updateDynamic("processData")(processData.get.asInstanceOf[js.Any])
    if (rendering != null) __obj.updateDynamic("rendering")(rendering.asInstanceOf[js.Any])
    if (scriptCharset != null) __obj.updateDynamic("scriptCharset")(scriptCharset.asInstanceOf[js.Any])
    if (!js.isUndefined(startEditable)) __obj.updateDynamic("startEditable")(startEditable.get.asInstanceOf[js.Any])
    if (startParam != null) __obj.updateDynamic("startParam")(startParam.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(traditional)) __obj.updateDynamic("traditional")(traditional.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (xhr != null) __obj.updateDynamic("xhr")(js.Any.fromFunction0(xhr))
    if (xhrFields != null) __obj.updateDynamic("xhrFields")(xhrFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSourceExtendedInput]
  }
}

