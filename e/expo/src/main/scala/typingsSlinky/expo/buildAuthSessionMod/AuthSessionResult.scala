package typingsSlinky.expo.buildAuthSessionMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.expo.expoStrings.cancel
import typingsSlinky.expo.expoStrings.dismiss
import typingsSlinky.expo.expoStrings.error
import typingsSlinky.expo.expoStrings.locked
import typingsSlinky.expo.expoStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthSessionResult extends js.Object {
  var errorCode: js.UndefOr[String | Null] = js.undefined
  var params: js.UndefOr[StringDictionary[String]] = js.undefined
  var `type`: js.UndefOr[(cancel | dismiss | locked) with (error | success)] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object AuthSessionResult {
  @scala.inline
  def apply(
    errorCode: String = null,
    params: StringDictionary[String] = null,
    `type`: (cancel | dismiss | locked) with (error | success) = null,
    url: String = null
  ): AuthSessionResult = {
    val __obj = js.Dynamic.literal()
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSessionResult]
  }
}

