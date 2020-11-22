package typingsSlinky.ethers.utilsMod

import typingsSlinky.ethersprojectAbi.fragmentsMod.JsonFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/lib/utils", "Interface")
@js.native
class Interface protected ()
  extends typingsSlinky.ethersprojectAbi.mod.Interface {
  def this(fragments: String) = this()
  def this(fragments: js.Array[typingsSlinky.ethersprojectAbi.fragmentsMod.Fragment | JsonFragment | String]) = this()
}
/* static members */
@JSImport("ethers/lib/utils", "Interface")
@js.native
object Interface extends js.Object {
  
  def getAbiCoder(): typingsSlinky.ethersprojectAbi.abiCoderMod.AbiCoder = js.native
  
  def getAddress(address: String): String = js.native
  
  def getEventTopic(eventFragment: typingsSlinky.ethersprojectAbi.fragmentsMod.EventFragment): String = js.native
  
  def getSighash(functionFragment: typingsSlinky.ethersprojectAbi.fragmentsMod.FunctionFragment): String = js.native
  
  def isInterface(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/interface.Interface */ Boolean = js.native
}
