package typingsSlinky.libraCore.vmErrorsPbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VMInvariantViolationError extends StObject
@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMInvariantViolationError")
@js.native
object VMInvariantViolationError extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VMInvariantViolationError with Double] = js.native
  
  @js.native
  sealed trait EMPTYCALLSTACK extends VMInvariantViolationError
  /* 4 */ val EMPTYCALLSTACK: typingsSlinky.libraCore.vmErrorsPbMod.VMInvariantViolationError.EMPTYCALLSTACK with Double = js.native
  
  @js.native
  sealed trait EMPTYVALUESTACK extends VMInvariantViolationError
  /* 3 */ val EMPTYVALUESTACK: typingsSlinky.libraCore.vmErrorsPbMod.VMInvariantViolationError.EMPTYVALUESTACK with Double = js.native
  
  @js.native
  sealed trait LINKERERROR extends VMInvariantViolationError
  /* 6 */ val LINKERERROR: typingsSlinky.libraCore.vmErrorsPbMod.VMInvariantViolationError.LINKERERROR with Double = js.native
  
  @js.native
  sealed trait LOCALREFERENCEERROR extends VMInvariantViolationError
  /* 7 */ val LOCALREFERENCEERROR: typingsSlinky.libraCore.vmErrorsPbMod.VMInvariantViolationError.LOCALREFERENCEERROR with Double = js.native
  
  @js.native
  sealed trait OUTOFBOUNDSINDEX extends VMInvariantViolationError
  /* 1 */ val OUTOFBOUNDSINDEX: typingsSlinky.libraCore.vmErrorsPbMod.VMInvariantViolationError.OUTOFBOUNDSINDEX with Double = js.native
  
  @js.native
  sealed trait OUTOFBOUNDSRANGE extends VMInvariantViolationError
  /* 2 */ val OUTOFBOUNDSRANGE: typingsSlinky.libraCore.vmErrorsPbMod.VMInvariantViolationError.OUTOFBOUNDSRANGE with Double = js.native
  
  @js.native
  sealed trait PCOVERFLOW extends VMInvariantViolationError
  /* 5 */ val PCOVERFLOW: typingsSlinky.libraCore.vmErrorsPbMod.VMInvariantViolationError.PCOVERFLOW with Double = js.native
  
  @js.native
  sealed trait STORAGEERROR extends VMInvariantViolationError
  /* 8 */ val STORAGEERROR: typingsSlinky.libraCore.vmErrorsPbMod.VMInvariantViolationError.STORAGEERROR with Double = js.native
  
  @js.native
  sealed trait UNKNOWNINVARIANTVIOLATIONERROR extends VMInvariantViolationError
  /* 0 */ val UNKNOWNINVARIANTVIOLATIONERROR: typingsSlinky.libraCore.vmErrorsPbMod.VMInvariantViolationError.UNKNOWNINVARIANTVIOLATIONERROR with Double = js.native
}
