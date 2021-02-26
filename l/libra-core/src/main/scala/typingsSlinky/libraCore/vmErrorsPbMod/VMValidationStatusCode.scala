package typingsSlinky.libraCore.vmErrorsPbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VMValidationStatusCode extends StObject
@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMValidationStatusCode")
@js.native
object VMValidationStatusCode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VMValidationStatusCode with Double] = js.native
  
  @js.native
  sealed trait EXCEEDEDMAXTRANSACTIONSIZE extends VMValidationStatusCode
  /* 10 */ val EXCEEDEDMAXTRANSACTIONSIZE: typingsSlinky.libraCore.vmErrorsPbMod.VMValidationStatusCode.EXCEEDEDMAXTRANSACTIONSIZE with Double = js.native
  
  @js.native
  sealed trait GASUNITPRICEABOVEMAXBOUND extends VMValidationStatusCode
  /* 16 */ val GASUNITPRICEABOVEMAXBOUND: typingsSlinky.libraCore.vmErrorsPbMod.VMValidationStatusCode.GASUNITPRICEABOVEMAXBOUND with Double = js.native
  
  @js.native
  sealed trait GASUNITPRICEBELOWMINBOUND extends VMValidationStatusCode
  /* 15 */ val GASUNITPRICEBELOWMINBOUND: typingsSlinky.libraCore.vmErrorsPbMod.VMValidationStatusCode.GASUNITPRICEBELOWMINBOUND with Double = js.native
  
  @js.native
  sealed trait INSUFFICIENTBALANCEFORTRANSACTIONFEE extends VMValidationStatusCode
  /* 5 */ val INSUFFICIENTBALANCEFORTRANSACTIONFEE: typingsSlinky.libraCore.vmErrorsPbMod.VMValidationStatusCode.INSUFFICIENTBALANCEFORTRANSACTIONFEE with Double = js.native
  
  @js.native
  sealed trait INVALIDAUTHKEY extends VMValidationStatusCode
  /* 2 */ val INVALIDAUTHKEY: typingsSlinky.libraCore.vmErrorsPbMod.VMValidationStatusCode.INVALIDAUTHKEY with Double = js.native
  
  @js.native
  sealed trait INVALIDSIGNATURE extends VMValidationStatusCode
  /* 1 */ val INVALIDSIGNATURE: typingsSlinky.libraCore.vmErrorsPbMod.VMValidationStatusCode.INVALIDSIGNATURE with Double = js.native
  
  @js.native
  sealed trait INVALIDWRITESET extends VMValidationStatusCode
  /* 9 */ val INVALIDWRITESET: typingsSlinky.libraCore.vmErrorsPbMod.VMValidationStatusCode.INVALIDWRITESET with Double = js.native
  
  @js.native
  sealed trait MAXGASUNITSBELOWMINTRANSACTIONGASUNITS extends VMValidationStatusCode
  /* 14 */ val MAXGASUNITSBELOWMINTRANSACTIONGASUNITS: typingsSlinky.libraCore.vmErrorsPbMod.VMValidationStatusCode.MAXGASUNITSBELOWMINTRANSACTIONGASUNITS with Double = js.native
  
  @js.native
  sealed trait MAXGASUNITSEXCEEDSMAXGASUNITSBOUND extends VMValidationStatusCode
  /* 13 */ val MAXGASUNITSEXCEEDSMAXGASUNITSBOUND: typingsSlinky.libraCore.vmErrorsPbMod.VMValidationStatusCode.MAXGASUNITSEXCEEDSMAXGASUNITSBOUND with Double = js.native
  
  @js.native
  sealed trait REJECTEDWRITESET extends VMValidationStatusCode
  /* 8 */ val REJECTEDWRITESET: typingsSlinky.libraCore.vmErrorsPbMod.VMValidationStatusCode.REJECTEDWRITESET with Double = js.native
  
  @js.native
  sealed trait SENDINGACCOUNTDOESNOTEXIST extends VMValidationStatusCode
  /* 7 */ val SENDINGACCOUNTDOESNOTEXIST: typingsSlinky.libraCore.vmErrorsPbMod.VMValidationStatusCode.SENDINGACCOUNTDOESNOTEXIST with Double = js.native
  
  @js.native
  sealed trait SEQUENCENUMBERTOONEW extends VMValidationStatusCode
  /* 4 */ val SEQUENCENUMBERTOONEW: typingsSlinky.libraCore.vmErrorsPbMod.VMValidationStatusCode.SEQUENCENUMBERTOONEW with Double = js.native
  
  @js.native
  sealed trait SEQUENCENUMBERTOOOLD extends VMValidationStatusCode
  /* 3 */ val SEQUENCENUMBERTOOOLD: typingsSlinky.libraCore.vmErrorsPbMod.VMValidationStatusCode.SEQUENCENUMBERTOOOLD with Double = js.native
  
  @js.native
  sealed trait TRANSACTIONEXPIRED extends VMValidationStatusCode
  /* 6 */ val TRANSACTIONEXPIRED: typingsSlinky.libraCore.vmErrorsPbMod.VMValidationStatusCode.TRANSACTIONEXPIRED with Double = js.native
  
  @js.native
  sealed trait UNKNOWNMODULE extends VMValidationStatusCode
  /* 12 */ val UNKNOWNMODULE: typingsSlinky.libraCore.vmErrorsPbMod.VMValidationStatusCode.UNKNOWNMODULE with Double = js.native
  
  @js.native
  sealed trait UNKNOWNSCRIPT extends VMValidationStatusCode
  /* 11 */ val UNKNOWNSCRIPT: typingsSlinky.libraCore.vmErrorsPbMod.VMValidationStatusCode.UNKNOWNSCRIPT with Double = js.native
  
  @js.native
  sealed trait UNKNOWNVALIDATIONSTATUS extends VMValidationStatusCode
  /* 0 */ val UNKNOWNVALIDATIONSTATUS: typingsSlinky.libraCore.vmErrorsPbMod.VMValidationStatusCode.UNKNOWNVALIDATIONSTATUS with Double = js.native
}
