package typingsSlinky.ethereumProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AbiType extends StObject
@JSImport("ethereum-protocol", "AbiType")
@js.native
object AbiType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AbiType with String] = js.native
  
  @js.native
  sealed trait Constructor extends AbiType
  /* "constructor" */ val Constructor: typingsSlinky.ethereumProtocol.mod.AbiType.Constructor with String = js.native
  
  @js.native
  sealed trait Event extends AbiType
  /* "event" */ val Event: typingsSlinky.ethereumProtocol.mod.AbiType.Event with String = js.native
  
  @js.native
  sealed trait Fallback extends AbiType
  /* "fallback" */ val Fallback: typingsSlinky.ethereumProtocol.mod.AbiType.Fallback with String = js.native
  
  @js.native
  sealed trait Function extends AbiType
  /* "function" */ val Function: typingsSlinky.ethereumProtocol.mod.AbiType.Function with String = js.native
}
