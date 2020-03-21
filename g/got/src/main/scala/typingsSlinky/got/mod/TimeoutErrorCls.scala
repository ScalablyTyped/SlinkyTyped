package typingsSlinky.got.mod

import typingsSlinky.got.gotStrings.connect
import typingsSlinky.got.gotStrings.lookup
import typingsSlinky.got.gotStrings.request
import typingsSlinky.got.gotStrings.response
import typingsSlinky.got.gotStrings.secureConnect
import typingsSlinky.got.gotStrings.send
import typingsSlinky.got.gotStrings.socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("got", "TimeoutError")
@js.native
class TimeoutErrorCls () extends TimeoutError {
  /* CompleteClass */
  override var event: lookup | connect | secureConnect | socket | response | send | request = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  @JSName("name")
  override var name_TimeoutError: typingsSlinky.got.gotStrings.TimeoutError = js.native
}

