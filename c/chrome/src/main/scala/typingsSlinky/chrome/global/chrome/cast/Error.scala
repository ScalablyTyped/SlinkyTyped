package typingsSlinky.chrome.global.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.Error")
@js.native
class Error protected ()
  extends typingsSlinky.chrome.chrome.cast.Error {
  /**
    * @param {!chrome.cast.ErrorCode} code
    * @param {string=} opt_description
    * @param {Object=} opt_details
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.Error
    */
  def this(code: typingsSlinky.chrome.chrome.cast.ErrorCode) = this()
  def this(code: typingsSlinky.chrome.chrome.cast.ErrorCode, description: String) = this()
  def this(code: typingsSlinky.chrome.chrome.cast.ErrorCode, description: String, details: js.Object) = this()
  /* CompleteClass */
  override var code: typingsSlinky.chrome.chrome.cast.ErrorCode = js.native
}

