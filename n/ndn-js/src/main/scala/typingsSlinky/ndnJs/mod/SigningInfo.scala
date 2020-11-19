package typingsSlinky.ndnJs.mod

import typingsSlinky.ndnJs.keyChainMod.SigningInfo.SignerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ndn-js", "SigningInfo")
@js.native
class SigningInfo ()
  extends typingsSlinky.ndnJs.keyChainMod.SigningInfo {
  def this(arg: String) = this()
  def this(arg: typingsSlinky.ndnJs.keyChainMod.PibIdentity) = this()
  def this(arg: typingsSlinky.ndnJs.keyChainMod.PibKey) = this()
  def this(arg: typingsSlinky.ndnJs.keyChainMod.SigningInfo) = this()
  def this(signerType: SignerType, signerName: typingsSlinky.ndnJs.nameMod.Name) = this()
}
@JSImport("ndn-js", "SigningInfo")
@js.native
object SigningInfo extends js.Object {
  
  @js.native
  object SignerType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ndnJs.keyChainMod.SigningInfo.SignerType with Double] = js.native
    
    /* 3 */ val CERT: typingsSlinky.ndnJs.keyChainMod.SigningInfo.SignerType.CERT with Double = js.native
    
    /* 1 */ val ID: typingsSlinky.ndnJs.keyChainMod.SigningInfo.SignerType.ID with Double = js.native
    
    /* 2 */ val KEY: typingsSlinky.ndnJs.keyChainMod.SigningInfo.SignerType.KEY with Double = js.native
    
    /* 0 */ val NULL: typingsSlinky.ndnJs.keyChainMod.SigningInfo.SignerType.NULL with Double = js.native
    
    /* 4 */ val SHA256: typingsSlinky.ndnJs.keyChainMod.SigningInfo.SignerType.SHA256 with Double = js.native
  }
}
