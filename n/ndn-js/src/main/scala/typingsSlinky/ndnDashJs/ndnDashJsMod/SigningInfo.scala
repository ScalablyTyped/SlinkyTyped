package typingsSlinky.ndnDashJs.ndnDashJsMod

import typingsSlinky.ndnDashJs.keyDashChainMod.SigningInfo.SignerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "SigningInfo")
@js.native
class SigningInfo ()
  extends typingsSlinky.ndnDashJs.keyDashChainMod.SigningInfo {
  def this(arg: String) = this()
  def this(arg: typingsSlinky.ndnDashJs.keyDashChainMod.PibIdentity) = this()
  def this(arg: typingsSlinky.ndnDashJs.keyDashChainMod.PibKey) = this()
  def this(arg: typingsSlinky.ndnDashJs.keyDashChainMod.SigningInfo) = this()
  def this(signerType: SignerType, signerName: typingsSlinky.ndnDashJs.nameMod.Name) = this()
}

@JSImport("ndn-js", "SigningInfo")
@js.native
object SigningInfo extends js.Object {
  @js.native
  object SignerType extends js.Object {
    /* 3 */ val CERT: typingsSlinky.ndnDashJs.keyDashChainMod.SigningInfo.SignerType.CERT with Double = js.native
    /* 1 */ val ID: typingsSlinky.ndnDashJs.keyDashChainMod.SigningInfo.SignerType.ID with Double = js.native
    /* 2 */ val KEY: typingsSlinky.ndnDashJs.keyDashChainMod.SigningInfo.SignerType.KEY with Double = js.native
    /* 0 */ val NULL: typingsSlinky.ndnDashJs.keyDashChainMod.SigningInfo.SignerType.NULL with Double = js.native
    /* 4 */ val SHA256: typingsSlinky.ndnDashJs.keyDashChainMod.SigningInfo.SignerType.SHA256 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ndnDashJs.keyDashChainMod.SigningInfo.SignerType with Double] = js.native
  }
  
}

