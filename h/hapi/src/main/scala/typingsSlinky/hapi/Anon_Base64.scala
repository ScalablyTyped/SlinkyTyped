package typingsSlinky.hapi

import typingsSlinky.hapi.hapiBooleans.`false`
import typingsSlinky.hapi.hapiStrings.Lax
import typingsSlinky.hapi.hapiStrings.Strict
import typingsSlinky.hapi.hapiStrings.base64
import typingsSlinky.hapi.hapiStrings.base64json
import typingsSlinky.hapi.hapiStrings.form
import typingsSlinky.hapi.hapiStrings.iron
import typingsSlinky.hapi.hapiStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base64 extends js.Object {
  var encoding: js.UndefOr[none | base64 | base64json | form | iron] = js.undefined
  var ignoreErrors: js.UndefOr[Boolean] = js.undefined
  var isHttpOnly: js.UndefOr[Boolean] = js.undefined
  var isSameSite: js.UndefOr[`false` | Strict | Lax] = js.undefined
  var isSecure: js.UndefOr[Boolean] = js.undefined
  var strictHeader: js.UndefOr[Boolean] = js.undefined
}

object Anon_Base64 {
  @scala.inline
  def apply(
    encoding: none | base64 | base64json | form | iron = null,
    ignoreErrors: js.UndefOr[Boolean] = js.undefined,
    isHttpOnly: js.UndefOr[Boolean] = js.undefined,
    isSameSite: `false` | Strict | Lax = null,
    isSecure: js.UndefOr[Boolean] = js.undefined,
    strictHeader: js.UndefOr[Boolean] = js.undefined
  ): Anon_Base64 = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(isHttpOnly)) __obj.updateDynamic("isHttpOnly")(isHttpOnly.asInstanceOf[js.Any])
    if (isSameSite != null) __obj.updateDynamic("isSameSite")(isSameSite.asInstanceOf[js.Any])
    if (!js.isUndefined(isSecure)) __obj.updateDynamic("isSecure")(isSecure.asInstanceOf[js.Any])
    if (!js.isUndefined(strictHeader)) __obj.updateDynamic("strictHeader")(strictHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Base64]
  }
}

