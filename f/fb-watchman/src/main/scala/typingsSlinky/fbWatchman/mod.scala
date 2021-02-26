package typingsSlinky.fbWatchman

import typingsSlinky.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fb-watchman", "Client")
  @js.native
  class Client () extends EventEmitter {
    def this(options: ClientOptions) = this()
    
    def cancelCommands(why: String): Unit = js.native
    
    def capabilityCheck(caps: Capabilities, done: doneCallback): Unit = js.native
    
    def command(args: js.Any, done: doneCallback): Unit = js.native
    
    def connect(): Unit = js.native
    
    def end(): Unit = js.native
    
    def sendNextCommand(): Unit = js.native
  }
  
  @js.native
  trait Capabilities extends StObject {
    
    var optional: js.Array[_] = js.native
    
    var required: js.Array[_] = js.native
  }
  object Capabilities {
    
    @scala.inline
    def apply(optional: js.Array[_], required: js.Array[_]): Capabilities = {
      val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
      __obj.asInstanceOf[Capabilities]
    }
    
    @scala.inline
    implicit class CapabilitiesMutableBuilder[Self <: Capabilities] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptional(value: js.Array[_]): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalVarargs(value: js.Any*): Self = StObject.set(x, "optional", js.Array(value :_*))
      
      @scala.inline
      def setRequired(value: js.Array[_]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredVarargs(value: js.Any*): Self = StObject.set(x, "required", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ClientOptions extends StObject {
    
    /**
      * Absolute path to the watchman binary.
      * If not provided, the Client locates the binary using the PATH specified
      * by the node child_process's default env.
      */
    var watchmanBinaryPath: js.UndefOr[String] = js.native
  }
  object ClientOptions {
    
    @scala.inline
    def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWatchmanBinaryPath(value: String): Self = StObject.set(x, "watchmanBinaryPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchmanBinaryPathUndefined: Self = StObject.set(x, "watchmanBinaryPath", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.fbWatchman.fbWatchmanStrings.unilateralTags
    - typingsSlinky.fbWatchman.fbWatchmanStrings.log
  */
  trait UnilateralTags extends StObject
  object UnilateralTags {
    
    @scala.inline
    def log: typingsSlinky.fbWatchman.fbWatchmanStrings.log = "log".asInstanceOf[typingsSlinky.fbWatchman.fbWatchmanStrings.log]
    
    @scala.inline
    def unilateralTags: typingsSlinky.fbWatchman.fbWatchmanStrings.unilateralTags = "unilateralTags".asInstanceOf[typingsSlinky.fbWatchman.fbWatchmanStrings.unilateralTags]
  }
  
  type doneCallback = js.Function2[/* error */ js.UndefOr[js.Error | Null], /* resp */ js.UndefOr[js.Any], js.Any]
}
