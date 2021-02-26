package typingsSlinky.sawtoothSdk

import typingsSlinky.node.Buffer
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exceptionsMod {
  
  @JSImport("sawtooth-sdk/processor/exceptions", "AuthorizationException")
  @js.native
  /**
    * Construcs a new AuthorizationException
    *
    * @param [message] - an optional message, defaults to the empty
    * string
    */
  class AuthorizationException () extends Error {
    def this(message: String) = this()
  }
  
  @JSImport("sawtooth-sdk/processor/exceptions", "InternalError")
  @js.native
  class InternalError protected () extends TransactionProcessorError {
    protected def this(message: String) = this()
    protected def this(message: js.UndefOr[scala.Nothing], extendedData: js.typedarray.Uint8Array) = this()
    protected def this(message: js.UndefOr[scala.Nothing], extendedData: Buffer) = this()
    protected def this(message: String, extendedData: js.typedarray.Uint8Array) = this()
    protected def this(message: String, extendedData: Buffer) = this()
  }
  
  @JSImport("sawtooth-sdk/processor/exceptions", "InvalidTransaction")
  @js.native
  class InvalidTransaction protected () extends TransactionProcessorError {
    protected def this(message: String) = this()
    protected def this(message: js.UndefOr[scala.Nothing], extendedData: js.typedarray.Uint8Array) = this()
    protected def this(message: js.UndefOr[scala.Nothing], extendedData: Buffer) = this()
    protected def this(message: String, extendedData: js.typedarray.Uint8Array) = this()
    protected def this(message: String, extendedData: Buffer) = this()
  }
  
  @JSImport("sawtooth-sdk/processor/exceptions", "_TransactionProcessorError")
  @js.native
  class TransactionProcessorError protected () extends StObject {
    protected def this(message: String) = this()
    protected def this(message: js.UndefOr[scala.Nothing], extendedData: js.typedarray.Uint8Array) = this()
    protected def this(message: js.UndefOr[scala.Nothing], extendedData: Buffer) = this()
    protected def this(message: String, extendedData: js.typedarray.Uint8Array) = this()
    protected def this(message: String, extendedData: Buffer) = this()
  }
  
  @JSImport("sawtooth-sdk/processor/exceptions", "ValidatorConnectionError")
  @js.native
  /**
    * Construcs a new ValidatorConnectionError
    *
    * @param [message] - an optional message, defaults to the empty
    * string
    */
  class ValidatorConnectionError () extends Error {
    def this(message: String) = this()
  }
}
