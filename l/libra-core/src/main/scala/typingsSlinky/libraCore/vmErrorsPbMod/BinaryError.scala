package typingsSlinky.libraCore.vmErrorsPbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BinaryError extends StObject
@JSImport("libra-core/lib/@/generated/vm_errors_pb", "BinaryError")
@js.native
object BinaryError extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BinaryError with Double] = js.native
  
  @js.native
  sealed trait BADHEADERTABLE extends BinaryError
  /* 8 */ val BADHEADERTABLE: typingsSlinky.libraCore.vmErrorsPbMod.BinaryError.BADHEADERTABLE with Double = js.native
  
  @js.native
  sealed trait BADMAGIC extends BinaryError
  /* 2 */ val BADMAGIC: typingsSlinky.libraCore.vmErrorsPbMod.BinaryError.BADMAGIC with Double = js.native
  
  @js.native
  sealed trait DUPLICATETABLE extends BinaryError
  /* 10 */ val DUPLICATETABLE: typingsSlinky.libraCore.vmErrorsPbMod.BinaryError.DUPLICATETABLE with Double = js.native
  
  @js.native
  sealed trait MALFORMED extends BinaryError
  /* 1 */ val MALFORMED: typingsSlinky.libraCore.vmErrorsPbMod.BinaryError.MALFORMED with Double = js.native
  
  @js.native
  sealed trait UNEXPECTEDSIGNATURETYPE extends BinaryError
  /* 9 */ val UNEXPECTEDSIGNATURETYPE: typingsSlinky.libraCore.vmErrorsPbMod.BinaryError.UNEXPECTEDSIGNATURETYPE with Double = js.native
  
  @js.native
  sealed trait UNKNOWNBINARYERROR extends BinaryError
  /* 0 */ val UNKNOWNBINARYERROR: typingsSlinky.libraCore.vmErrorsPbMod.BinaryError.UNKNOWNBINARYERROR with Double = js.native
  
  @js.native
  sealed trait UNKNOWNOPCODE extends BinaryError
  /* 7 */ val UNKNOWNOPCODE: typingsSlinky.libraCore.vmErrorsPbMod.BinaryError.UNKNOWNOPCODE with Double = js.native
  
  @js.native
  sealed trait UNKNOWNSERIALIZEDTYPE extends BinaryError
  /* 6 */ val UNKNOWNSERIALIZEDTYPE: typingsSlinky.libraCore.vmErrorsPbMod.BinaryError.UNKNOWNSERIALIZEDTYPE with Double = js.native
  
  @js.native
  sealed trait UNKNOWNSIGNATURETYPE extends BinaryError
  /* 5 */ val UNKNOWNSIGNATURETYPE: typingsSlinky.libraCore.vmErrorsPbMod.BinaryError.UNKNOWNSIGNATURETYPE with Double = js.native
  
  @js.native
  sealed trait UNKNOWNTABLETYPE extends BinaryError
  /* 4 */ val UNKNOWNTABLETYPE: typingsSlinky.libraCore.vmErrorsPbMod.BinaryError.UNKNOWNTABLETYPE with Double = js.native
  
  @js.native
  sealed trait UNKNOWNVERSION extends BinaryError
  /* 3 */ val UNKNOWNVERSION: typingsSlinky.libraCore.vmErrorsPbMod.BinaryError.UNKNOWNVERSION with Double = js.native
}
