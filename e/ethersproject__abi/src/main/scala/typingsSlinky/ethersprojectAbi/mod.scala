package typingsSlinky.ethersprojectAbi

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.ethersprojectAbi.abiCoderMod.CoerceFunc
import typingsSlinky.ethersprojectAbi.abstractCoderMod.Result
import typingsSlinky.ethersprojectAbi.anon.Error
import typingsSlinky.ethersprojectAbi.fragmentsMod.JsonFragment
import typingsSlinky.ethersprojectAbi.fragmentsMod.JsonFragmentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/abi", "AbiCoder")
  @js.native
  class AbiCoder ()
    extends typingsSlinky.ethersprojectAbi.abiCoderMod.AbiCoder {
    def this(coerceFunc: CoerceFunc) = this()
  }
  
  @JSImport("@ethersproject/abi", "ConstructorFragment")
  @js.native
  class ConstructorFragment protected ()
    extends typingsSlinky.ethersprojectAbi.fragmentsMod.ConstructorFragment {
    def this(constructorGuard: js.Any, params: js.Any) = this()
  }
  /* static members */
  object ConstructorFragment {
    
    @JSImport("@ethersproject/abi", "ConstructorFragment.from")
    @js.native
    def from(value: String): typingsSlinky.ethersprojectAbi.fragmentsMod.ConstructorFragment = js.native
    @JSImport("@ethersproject/abi", "ConstructorFragment.from")
    @js.native
    def from(value: typingsSlinky.ethersprojectAbi.fragmentsMod.ConstructorFragment): typingsSlinky.ethersprojectAbi.fragmentsMod.ConstructorFragment = js.native
    @JSImport("@ethersproject/abi", "ConstructorFragment.from")
    @js.native
    def from(value: JsonFragment): typingsSlinky.ethersprojectAbi.fragmentsMod.ConstructorFragment = js.native
    
    @JSImport("@ethersproject/abi", "ConstructorFragment.fromObject")
    @js.native
    def fromObject(value: typingsSlinky.ethersprojectAbi.fragmentsMod.ConstructorFragment): typingsSlinky.ethersprojectAbi.fragmentsMod.ConstructorFragment = js.native
    @JSImport("@ethersproject/abi", "ConstructorFragment.fromObject")
    @js.native
    def fromObject(value: JsonFragment): typingsSlinky.ethersprojectAbi.fragmentsMod.ConstructorFragment = js.native
    
    @JSImport("@ethersproject/abi", "ConstructorFragment.fromString")
    @js.native
    def fromString(value: String): typingsSlinky.ethersprojectAbi.fragmentsMod.ConstructorFragment = js.native
    
    @JSImport("@ethersproject/abi", "ConstructorFragment.isConstructorFragment")
    @js.native
    def isConstructorFragment(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ConstructorFragment */ Boolean = js.native
  }
  
  @JSImport("@ethersproject/abi", "EventFragment")
  @js.native
  class EventFragment protected ()
    extends typingsSlinky.ethersprojectAbi.fragmentsMod.EventFragment {
    def this(constructorGuard: js.Any, params: js.Any) = this()
  }
  /* static members */
  object EventFragment {
    
    @JSImport("@ethersproject/abi", "EventFragment.from")
    @js.native
    def from(value: String): typingsSlinky.ethersprojectAbi.fragmentsMod.EventFragment = js.native
    @JSImport("@ethersproject/abi", "EventFragment.from")
    @js.native
    def from(value: typingsSlinky.ethersprojectAbi.fragmentsMod.EventFragment): typingsSlinky.ethersprojectAbi.fragmentsMod.EventFragment = js.native
    @JSImport("@ethersproject/abi", "EventFragment.from")
    @js.native
    def from(value: JsonFragment): typingsSlinky.ethersprojectAbi.fragmentsMod.EventFragment = js.native
    
    @JSImport("@ethersproject/abi", "EventFragment.fromObject")
    @js.native
    def fromObject(value: typingsSlinky.ethersprojectAbi.fragmentsMod.EventFragment): typingsSlinky.ethersprojectAbi.fragmentsMod.EventFragment = js.native
    @JSImport("@ethersproject/abi", "EventFragment.fromObject")
    @js.native
    def fromObject(value: JsonFragment): typingsSlinky.ethersprojectAbi.fragmentsMod.EventFragment = js.native
    
    @JSImport("@ethersproject/abi", "EventFragment.fromString")
    @js.native
    def fromString(value: String): typingsSlinky.ethersprojectAbi.fragmentsMod.EventFragment = js.native
    
    @JSImport("@ethersproject/abi", "EventFragment.isEventFragment")
    @js.native
    def isEventFragment(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.EventFragment */ Boolean = js.native
  }
  
  @JSImport("@ethersproject/abi", "Fragment")
  @js.native
  abstract class Fragment protected ()
    extends typingsSlinky.ethersprojectAbi.fragmentsMod.Fragment {
    def this(constructorGuard: js.Any, params: js.Any) = this()
  }
  /* static members */
  object Fragment {
    
    @JSImport("@ethersproject/abi", "Fragment.from")
    @js.native
    def from(value: String): typingsSlinky.ethersprojectAbi.fragmentsMod.Fragment = js.native
    @JSImport("@ethersproject/abi", "Fragment.from")
    @js.native
    def from(value: typingsSlinky.ethersprojectAbi.fragmentsMod.Fragment): typingsSlinky.ethersprojectAbi.fragmentsMod.Fragment = js.native
    @JSImport("@ethersproject/abi", "Fragment.from")
    @js.native
    def from(value: JsonFragment): typingsSlinky.ethersprojectAbi.fragmentsMod.Fragment = js.native
    
    @JSImport("@ethersproject/abi", "Fragment.fromObject")
    @js.native
    def fromObject(value: typingsSlinky.ethersprojectAbi.fragmentsMod.Fragment): typingsSlinky.ethersprojectAbi.fragmentsMod.Fragment = js.native
    @JSImport("@ethersproject/abi", "Fragment.fromObject")
    @js.native
    def fromObject(value: JsonFragment): typingsSlinky.ethersprojectAbi.fragmentsMod.Fragment = js.native
    
    @JSImport("@ethersproject/abi", "Fragment.fromString")
    @js.native
    def fromString(value: String): typingsSlinky.ethersprojectAbi.fragmentsMod.Fragment = js.native
    
    @JSImport("@ethersproject/abi", "Fragment.isFragment")
    @js.native
    def isFragment(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.Fragment */ Boolean = js.native
  }
  
  @JSImport("@ethersproject/abi", "FunctionFragment")
  @js.native
  class FunctionFragment protected ()
    extends typingsSlinky.ethersprojectAbi.fragmentsMod.FunctionFragment {
    def this(constructorGuard: js.Any, params: js.Any) = this()
  }
  /* static members */
  object FunctionFragment {
    
    @JSImport("@ethersproject/abi", "FunctionFragment.from")
    @js.native
    def from(value: String): typingsSlinky.ethersprojectAbi.fragmentsMod.FunctionFragment = js.native
    @JSImport("@ethersproject/abi", "FunctionFragment.from")
    @js.native
    def from(value: typingsSlinky.ethersprojectAbi.fragmentsMod.FunctionFragment): typingsSlinky.ethersprojectAbi.fragmentsMod.FunctionFragment = js.native
    @JSImport("@ethersproject/abi", "FunctionFragment.from")
    @js.native
    def from(value: JsonFragment): typingsSlinky.ethersprojectAbi.fragmentsMod.FunctionFragment = js.native
    
    @JSImport("@ethersproject/abi", "FunctionFragment.fromObject")
    @js.native
    def fromObject(value: typingsSlinky.ethersprojectAbi.fragmentsMod.FunctionFragment): typingsSlinky.ethersprojectAbi.fragmentsMod.FunctionFragment = js.native
    @JSImport("@ethersproject/abi", "FunctionFragment.fromObject")
    @js.native
    def fromObject(value: JsonFragment): typingsSlinky.ethersprojectAbi.fragmentsMod.FunctionFragment = js.native
    
    @JSImport("@ethersproject/abi", "FunctionFragment.fromString")
    @js.native
    def fromString(value: String): typingsSlinky.ethersprojectAbi.fragmentsMod.FunctionFragment = js.native
    
    @JSImport("@ethersproject/abi", "FunctionFragment.isFunctionFragment")
    @js.native
    def isFunctionFragment(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.FunctionFragment */ Boolean = js.native
  }
  
  @JSImport("@ethersproject/abi", "Indexed")
  @js.native
  class Indexed protected ()
    extends typingsSlinky.ethersprojectAbi.interfaceMod.Indexed {
    def this(info: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof @ethersproject/abi.@ethersproject/abi/lib/interface.Indexed ]: @ethersproject/abi.@ethersproject/abi/lib/interface.Indexed[K]}
      */ typingsSlinky.ethersprojectAbi.ethersprojectAbiStrings.Indexed with TopLevel[typingsSlinky.ethersprojectAbi.interfaceMod.Indexed]) = this()
  }
  /* static members */
  object Indexed {
    
    @JSImport("@ethersproject/abi", "Indexed.isIndexed")
    @js.native
    def isIndexed(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/interface.Indexed */ Boolean = js.native
  }
  
  @JSImport("@ethersproject/abi", "Interface")
  @js.native
  class Interface protected ()
    extends typingsSlinky.ethersprojectAbi.interfaceMod.Interface {
    def this(fragments: String) = this()
    def this(fragments: js.Array[typingsSlinky.ethersprojectAbi.fragmentsMod.Fragment | JsonFragment | String]) = this()
  }
  /* static members */
  object Interface {
    
    @JSImport("@ethersproject/abi", "Interface.getAbiCoder")
    @js.native
    def getAbiCoder(): typingsSlinky.ethersprojectAbi.abiCoderMod.AbiCoder = js.native
    
    @JSImport("@ethersproject/abi", "Interface.getAddress")
    @js.native
    def getAddress(address: String): String = js.native
    
    @JSImport("@ethersproject/abi", "Interface.getEventTopic")
    @js.native
    def getEventTopic(eventFragment: typingsSlinky.ethersprojectAbi.fragmentsMod.EventFragment): String = js.native
    
    @JSImport("@ethersproject/abi", "Interface.getSighash")
    @js.native
    def getSighash(functionFragment: typingsSlinky.ethersprojectAbi.fragmentsMod.FunctionFragment): String = js.native
    
    @JSImport("@ethersproject/abi", "Interface.isInterface")
    @js.native
    def isInterface(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/interface.Interface */ Boolean = js.native
  }
  
  @JSImport("@ethersproject/abi", "LogDescription")
  @js.native
  class LogDescription protected ()
    extends typingsSlinky.ethersprojectAbi.interfaceMod.LogDescription {
    def this(info: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof @ethersproject/abi.@ethersproject/abi/lib/interface.LogDescription ]: @ethersproject/abi.@ethersproject/abi/lib/interface.LogDescription[K]}
      */ typingsSlinky.ethersprojectAbi.ethersprojectAbiStrings.LogDescription with TopLevel[typingsSlinky.ethersprojectAbi.interfaceMod.LogDescription]) = this()
  }
  
  @JSImport("@ethersproject/abi", "ParamType")
  @js.native
  class ParamType protected ()
    extends typingsSlinky.ethersprojectAbi.fragmentsMod.ParamType {
    def this(constructorGuard: js.Any, params: js.Any) = this()
  }
  /* static members */
  object ParamType {
    
    @JSImport("@ethersproject/abi", "ParamType.from")
    @js.native
    def from(value: String): typingsSlinky.ethersprojectAbi.fragmentsMod.ParamType = js.native
    @JSImport("@ethersproject/abi", "ParamType.from")
    @js.native
    def from(value: String, allowIndexed: Boolean): typingsSlinky.ethersprojectAbi.fragmentsMod.ParamType = js.native
    @JSImport("@ethersproject/abi", "ParamType.from")
    @js.native
    def from(value: JsonFragmentType): typingsSlinky.ethersprojectAbi.fragmentsMod.ParamType = js.native
    @JSImport("@ethersproject/abi", "ParamType.from")
    @js.native
    def from(value: JsonFragmentType, allowIndexed: Boolean): typingsSlinky.ethersprojectAbi.fragmentsMod.ParamType = js.native
    @JSImport("@ethersproject/abi", "ParamType.from")
    @js.native
    def from(value: typingsSlinky.ethersprojectAbi.fragmentsMod.ParamType): typingsSlinky.ethersprojectAbi.fragmentsMod.ParamType = js.native
    @JSImport("@ethersproject/abi", "ParamType.from")
    @js.native
    def from(value: typingsSlinky.ethersprojectAbi.fragmentsMod.ParamType, allowIndexed: Boolean): typingsSlinky.ethersprojectAbi.fragmentsMod.ParamType = js.native
    
    @JSImport("@ethersproject/abi", "ParamType.fromObject")
    @js.native
    def fromObject(value: JsonFragmentType): typingsSlinky.ethersprojectAbi.fragmentsMod.ParamType = js.native
    @JSImport("@ethersproject/abi", "ParamType.fromObject")
    @js.native
    def fromObject(value: typingsSlinky.ethersprojectAbi.fragmentsMod.ParamType): typingsSlinky.ethersprojectAbi.fragmentsMod.ParamType = js.native
    
    @JSImport("@ethersproject/abi", "ParamType.fromString")
    @js.native
    def fromString(value: String): typingsSlinky.ethersprojectAbi.fragmentsMod.ParamType = js.native
    @JSImport("@ethersproject/abi", "ParamType.fromString")
    @js.native
    def fromString(value: String, allowIndexed: Boolean): typingsSlinky.ethersprojectAbi.fragmentsMod.ParamType = js.native
    
    @JSImport("@ethersproject/abi", "ParamType.isParamType")
    @js.native
    def isParamType(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ParamType */ Boolean = js.native
  }
  
  @JSImport("@ethersproject/abi", "TransactionDescription")
  @js.native
  class TransactionDescription protected ()
    extends typingsSlinky.ethersprojectAbi.interfaceMod.TransactionDescription {
    def this(info: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof @ethersproject/abi.@ethersproject/abi/lib/interface.TransactionDescription ]: @ethersproject/abi.@ethersproject/abi/lib/interface.TransactionDescription[K]}
      */ typingsSlinky.ethersprojectAbi.ethersprojectAbiStrings.TransactionDescription with TopLevel[typingsSlinky.ethersprojectAbi.interfaceMod.TransactionDescription]) = this()
  }
  
  @JSImport("@ethersproject/abi", "checkResultErrors")
  @js.native
  def checkResultErrors(result: Result): js.Array[Error] = js.native
  
  @JSImport("@ethersproject/abi", "defaultAbiCoder")
  @js.native
  val defaultAbiCoder: typingsSlinky.ethersprojectAbi.abiCoderMod.AbiCoder = js.native
}
