package typingsSlinky.reactDashRequest.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.AbortSignal
import org.scalajs.dom.experimental.ReferrerPolicy
import org.scalajs.dom.experimental.RequestCache
import org.scalajs.dom.experimental.RequestCredentials
import org.scalajs.dom.experimental.RequestMode
import org.scalajs.dom.experimental.RequestRedirect
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashRequest.reactDashRequestMod.FetchProps
import typingsSlinky.reactDashRequest.reactDashRequestMod.FetchResponse
import typingsSlinky.reactDashRequest.reactDashRequestMod.ResponseType
import typingsSlinky.std.BodyInit
import typingsSlinky.std.HeadersInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Fetch
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashRequest.reactDashRequestMod.Fetch[js.Any]] {
  @JSImport("react-request", "Fetch")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: integrity, method */
  def apply[T](
    url: String,
    afterFetch: /* args */ FetchResponse[T] => Unit = null,
    body: BodyInit = null,
    cache: RequestCache = null,
    credentials: RequestCredentials = null,
    headers: HeadersInit = null,
    keepalive: js.UndefOr[Boolean] = js.undefined,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    mode: RequestMode = null,
    redirect: RequestRedirect = null,
    referrer: String = null,
    referrerPolicy: ReferrerPolicy = null,
    responseType: ResponseType = null,
    signal: AbortSignal = null,
    transformData: /* data */ js.Any => T = null,
    window: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashRequest.reactDashRequestMod.Fetch[js.Any]] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (afterFetch != null) __obj.updateDynamic("afterFetch")(js.Any.fromFunction1(afterFetch))
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (transformData != null) __obj.updateDynamic("transformData")(js.Any.fromFunction1(transformData))
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashRequest.reactDashRequestMod.Fetch[js.Any]]]
  }
  type Props = FetchProps[js.Any]
}

