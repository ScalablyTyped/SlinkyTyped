package typingsSlinky.ethers.mod.ethers.utils

import typingsSlinky.ethersprojectAbi.fragmentsMod.JsonFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.utils.Fragment")
@js.native
abstract class Fragment protected ()
  extends typingsSlinky.ethers.ethersMod.utils.Fragment {
  def this(constructorGuard: js.Any, params: js.Any) = this()
}
/* static members */
@JSImport("ethers", "ethers.utils.Fragment")
@js.native
object Fragment extends js.Object {
  
  def from(value: String): typingsSlinky.ethersprojectAbi.fragmentsMod.Fragment = js.native
  def from(value: typingsSlinky.ethersprojectAbi.fragmentsMod.Fragment): typingsSlinky.ethersprojectAbi.fragmentsMod.Fragment = js.native
  def from(value: JsonFragment): typingsSlinky.ethersprojectAbi.fragmentsMod.Fragment = js.native
  
  def fromObject(value: typingsSlinky.ethersprojectAbi.fragmentsMod.Fragment): typingsSlinky.ethersprojectAbi.fragmentsMod.Fragment = js.native
  def fromObject(value: JsonFragment): typingsSlinky.ethersprojectAbi.fragmentsMod.Fragment = js.native
  
  def fromString(value: String): typingsSlinky.ethersprojectAbi.fragmentsMod.Fragment = js.native
  
  def isFragment(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.Fragment */ Boolean = js.native
}
