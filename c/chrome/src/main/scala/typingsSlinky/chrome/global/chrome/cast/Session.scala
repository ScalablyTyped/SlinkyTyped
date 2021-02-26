package typingsSlinky.chrome.global.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.cast.Session")
@js.native
class Session protected ()
  extends typingsSlinky.chrome.chrome.cast.Session {
  /**
    * @param {string} sessionId
    * @param {string} appId
    * @param {string} displayName
    * @param {!Array<chrome.cast.Image>} appImages
    * @param {!chrome.cast.Receiver} receiver
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.Session
    */
  def this(
    sessionId: String,
    appId: String,
    displayName: String,
    appImages: js.Array[typingsSlinky.chrome.chrome.cast.Image],
    receiver: typingsSlinky.chrome.chrome.cast.Receiver
  ) = this()
}
