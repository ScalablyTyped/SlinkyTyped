package typingsSlinky.highland

import typingsSlinky.highland.Highland.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Highland_ {
    
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    /**
      * Used as an Error marker when writing to a Stream's incoming buffer
      */
    // TODO is this public?
    @JSGlobal("Highland.StreamError")
    @js.native
    class StreamError protected ()
      extends typingsSlinky.highland.Highland.StreamError {
      def this(err: js.Error) = this()
    }
    
    /**
      * Used as a Redirect marker when writing to a Stream's incoming buffer
      */
    // TODO is this public?
    @JSGlobal("Highland.StreamRedirect")
    @js.native
    class StreamRedirect[R] protected ()
      extends typingsSlinky.highland.Highland.StreamRedirect[R] {
      def this(to: Stream[R]) = this()
    }
  }
  
  @JSGlobal("highland")
  @js.native
  def highland: HighlandStatic = js.native
  @scala.inline
  def highland_=(x: HighlandStatic): Unit = js.Dynamic.global.updateDynamic("highland")(x.asInstanceOf[js.Any])
}
