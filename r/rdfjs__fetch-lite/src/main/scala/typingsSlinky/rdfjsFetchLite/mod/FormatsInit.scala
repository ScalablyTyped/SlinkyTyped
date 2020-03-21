package typingsSlinky.rdfjsFetchLite.mod

import org.scalajs.dom.experimental.AbortSignal
import org.scalajs.dom.experimental.ReferrerPolicy
import org.scalajs.dom.experimental.RequestCache
import org.scalajs.dom.experimental.RequestCredentials
import org.scalajs.dom.experimental.RequestMode
import org.scalajs.dom.experimental.RequestRedirect
import typingsSlinky.rdfjsFetchLite.FnCall
import typingsSlinky.rdfjsFetchLite.PickparsersSinkMapEventEm
import typingsSlinky.std.BodyInit
import typingsSlinky.std.HeadersInit
import typingsSlinky.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatsInit extends RequestInit {
  var fetch: js.UndefOr[FnCall] = js.undefined
  var formats: PickparsersSinkMapEventEm
}

object FormatsInit {
  @scala.inline
  def apply(
    formats: PickparsersSinkMapEventEm,
    body: BodyInit = null,
    cache: RequestCache = null,
    credentials: RequestCredentials = null,
    fetch: FnCall = null,
    headers: HeadersInit = null,
    integrity: String = null,
    keepalive: js.UndefOr[Boolean] = js.undefined,
    method: String = null,
    mode: RequestMode = null,
    redirect: RequestRedirect = null,
    referrer: String = null,
    referrerPolicy: ReferrerPolicy = null,
    signal: AbortSignal = null,
    window: js.Any = null
  ): FormatsInit = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (fetch != null) __obj.updateDynamic("fetch")(fetch.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatsInit]
  }
}

