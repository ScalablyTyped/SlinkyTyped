package typingsSlinky.ethersprojectAbi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ethersprojectAbi.abiCoderMod.CoerceFunc
import typingsSlinky.ethersprojectAbi.abstractCoderMod.Result
import typingsSlinky.ethersprojectAbi.anon.Error
import typingsSlinky.ethersprojectAbi.fragmentsMod.JsonFragment
import typingsSlinky.ethersprojectAbi.fragmentsMod.JsonFragmentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/abi", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def checkResultErrors(result: Result): js.Array[Error] = js.native
  
  val defaultAbiCoder: typingsSlinky.ethersprojectAbi.abiCoderMod.AbiCoder = js.native
  
  @js.native
  class AbiCoder ()
    extends typingsSlinky.ethersprojectAbi.abiCoderMod.AbiCoder {
    def this(coerceFunc: CoerceFunc) = this()
  }
  
  @js.native
  class ConstructorFragment ()
    extends typingsSlinky.ethersprojectAbi.fragmentsMod.ConstructorFragment
  /* static members */
  @js.native
  object ConstructorFragment extends js.Object {
    
    def from(value: String): typingsSlinky.ethersprojectAbi.fragmentsMod.ConstructorFragment = js.native
    def from(value: typingsSlinky.ethersprojectAbi.fragmentsMod.ConstructorFragment): typingsSlinky.ethersprojectAbi.fragmentsMod.ConstructorFragment = js.native
    def from(value: JsonFragment): typingsSlinky.ethersprojectAbi.fragmentsMod.ConstructorFragment = js.native
    
    def fromObject(value: typingsSlinky.ethersprojectAbi.fragmentsMod.ConstructorFragment): typingsSlinky.ethersprojectAbi.fragmentsMod.ConstructorFragment = js.native
    def fromObject(value: JsonFragment): typingsSlinky.ethersprojectAbi.fragmentsMod.ConstructorFragment = js.native
    
    def fromString(value: String): typingsSlinky.ethersprojectAbi.fragmentsMod.ConstructorFragment = js.native
    
    def isConstructorFragment(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ConstructorFragment */ Boolean = js.native
  }
  
  @js.native
  class EventFragment ()
    extends typingsSlinky.ethersprojectAbi.fragmentsMod.EventFragment
  /* static members */
  @js.native
  object EventFragment extends js.Object {
    
    def from(value: String): typingsSlinky.ethersprojectAbi.fragmentsMod.EventFragment = js.native
    def from(value: typingsSlinky.ethersprojectAbi.fragmentsMod.EventFragment): typingsSlinky.ethersprojectAbi.fragmentsMod.EventFragment = js.native
    def from(value: JsonFragment): typingsSlinky.ethersprojectAbi.fragmentsMod.EventFragment = js.native
    
    def fromObject(value: typingsSlinky.ethersprojectAbi.fragmentsMod.EventFragment): typingsSlinky.ethersprojectAbi.fragmentsMod.EventFragment = js.native
    def fromObject(value: JsonFragment): typingsSlinky.ethersprojectAbi.fragmentsMod.EventFragment = js.native
    
    def fromString(value: String): typingsSlinky.ethersprojectAbi.fragmentsMod.EventFragment = js.native
    
    def isEventFragment(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.EventFragment */ Boolean = js.native
  }
  
  @js.native
  object FormatTypes extends /* name */ StringDictionary[String]
  
  @js.native
  abstract class Fragment protected ()
    extends typingsSlinky.ethersprojectAbi.fragmentsMod.Fragment {
    def this(constructorGuard: js.Any, params: js.Any) = this()
  }
  /* static members */
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
  
  @js.native
  class FunctionFragment ()
    extends typingsSlinky.ethersprojectAbi.fragmentsMod.FunctionFragment
  /* static members */
  @js.native
  object FunctionFragment extends js.Object {
    
    def from(value: String): typingsSlinky.ethersprojectAbi.fragmentsMod.FunctionFragment = js.native
    def from(value: typingsSlinky.ethersprojectAbi.fragmentsMod.FunctionFragment): typingsSlinky.ethersprojectAbi.fragmentsMod.FunctionFragment = js.native
    def from(value: JsonFragment): typingsSlinky.ethersprojectAbi.fragmentsMod.FunctionFragment = js.native
    
    def fromObject(value: typingsSlinky.ethersprojectAbi.fragmentsMod.FunctionFragment): typingsSlinky.ethersprojectAbi.fragmentsMod.FunctionFragment = js.native
    def fromObject(value: JsonFragment): typingsSlinky.ethersprojectAbi.fragmentsMod.FunctionFragment = js.native
    
    def fromString(value: String): typingsSlinky.ethersprojectAbi.fragmentsMod.FunctionFragment = js.native
    
    def isFunctionFragment(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.FunctionFragment */ Boolean = js.native
  }
  
  @js.native
  class Indexed ()
    extends typingsSlinky.ethersprojectAbi.interfaceMod.Indexed
  /* static members */
  @js.native
  object Indexed extends js.Object {
    
    def isIndexed(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/interface.Indexed */ Boolean = js.native
  }
  
  @js.native
  class Interface protected ()
    extends typingsSlinky.ethersprojectAbi.interfaceMod.Interface {
    def this(fragments: String) = this()
    def this(fragments: js.Array[typingsSlinky.ethersprojectAbi.fragmentsMod.Fragment | JsonFragment | String]) = this()
  }
  /* static members */
  @js.native
  object Interface extends js.Object {
    
    def getAbiCoder(): typingsSlinky.ethersprojectAbi.abiCoderMod.AbiCoder = js.native
    
    def getAddress(address: String): String = js.native
    
    def getEventTopic(eventFragment: typingsSlinky.ethersprojectAbi.fragmentsMod.EventFragment): String = js.native
    
    def getSighash(functionFragment: typingsSlinky.ethersprojectAbi.fragmentsMod.FunctionFragment): String = js.native
    
    def isInterface(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/interface.Interface */ Boolean = js.native
  }
  
  @js.native
  class LogDescription ()
    extends typingsSlinky.ethersprojectAbi.interfaceMod.LogDescription
  
  @js.native
  class ParamType protected ()
    extends typingsSlinky.ethersprojectAbi.fragmentsMod.ParamType {
    def this(constructorGuard: js.Any, params: js.Any) = this()
  }
  /* static members */
  @js.native
  object ParamType extends js.Object {
    
    def from(value: String): typingsSlinky.ethersprojectAbi.fragmentsMod.ParamType = js.native
    def from(value: String, allowIndexed: Boolean): typingsSlinky.ethersprojectAbi.fragmentsMod.ParamType = js.native
    def from(value: JsonFragmentType): typingsSlinky.ethersprojectAbi.fragmentsMod.ParamType = js.native
    def from(value: JsonFragmentType, allowIndexed: Boolean): typingsSlinky.ethersprojectAbi.fragmentsMod.ParamType = js.native
    def from(value: typingsSlinky.ethersprojectAbi.fragmentsMod.ParamType): typingsSlinky.ethersprojectAbi.fragmentsMod.ParamType = js.native
    def from(value: typingsSlinky.ethersprojectAbi.fragmentsMod.ParamType, allowIndexed: Boolean): typingsSlinky.ethersprojectAbi.fragmentsMod.ParamType = js.native
    
    def fromObject(value: JsonFragmentType): typingsSlinky.ethersprojectAbi.fragmentsMod.ParamType = js.native
    def fromObject(value: typingsSlinky.ethersprojectAbi.fragmentsMod.ParamType): typingsSlinky.ethersprojectAbi.fragmentsMod.ParamType = js.native
    
    def fromString(value: String): typingsSlinky.ethersprojectAbi.fragmentsMod.ParamType = js.native
    def fromString(value: String, allowIndexed: Boolean): typingsSlinky.ethersprojectAbi.fragmentsMod.ParamType = js.native
    
    def isParamType(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ParamType */ Boolean = js.native
  }
  
  @js.native
  class TransactionDescription ()
    extends typingsSlinky.ethersprojectAbi.interfaceMod.TransactionDescription
}
