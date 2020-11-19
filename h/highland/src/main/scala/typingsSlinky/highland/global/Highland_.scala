package typingsSlinky.highland.global

import typingsSlinky.highland.Highland.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Highland")
@js.native
object Highland_ extends js.Object {
  
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  /**
    * Used as an Error marker when writing to a Stream's incoming buffer
    */
  // TODO is this public?
  @js.native
  class StreamError protected ()
    extends typingsSlinky.highland.Highland.StreamError {
    def this(err: js.Error) = this()
  }
  
  /**
    * Used as a Redirect marker when writing to a Stream's incoming buffer
    */
  // TODO is this public?
  @js.native
  class StreamRedirect[R] protected ()
    extends typingsSlinky.highland.Highland.StreamRedirect[R] {
    def this(to: Stream[R]) = this()
  }
}
