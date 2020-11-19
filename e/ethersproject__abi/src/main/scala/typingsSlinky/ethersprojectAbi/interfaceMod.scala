package typingsSlinky.ethersprojectAbi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ethersprojectAbi.abiCoderMod.AbiCoder
import typingsSlinky.ethersprojectAbi.abstractCoderMod.Result
import typingsSlinky.ethersprojectAbi.anon.Data
import typingsSlinky.ethersprojectAbi.anon.Error
import typingsSlinky.ethersprojectAbi.anon.Topics
import typingsSlinky.ethersprojectAbi.anon.Value
import typingsSlinky.ethersprojectAbi.fragmentsMod.ConstructorFragment
import typingsSlinky.ethersprojectAbi.fragmentsMod.EventFragment
import typingsSlinky.ethersprojectAbi.fragmentsMod.Fragment
import typingsSlinky.ethersprojectAbi.fragmentsMod.FunctionFragment
import typingsSlinky.ethersprojectAbi.fragmentsMod.JsonFragment
import typingsSlinky.ethersprojectAbi.fragmentsMod.ParamType
import typingsSlinky.ethersprojectBignumber.mod.BigNumber
import typingsSlinky.ethersprojectBytes.mod.BytesLike
import typingsSlinky.ethersprojectProperties.mod.Description
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/abi/lib/interface", JSImport.Namespace)
@js.native
object interfaceMod extends js.Object {
  
  def checkResultErrors(result: Result): js.Array[Error] = js.native
  
  @js.native
  class Indexed () extends Description[Indexed] {
    
    val _isIndexed: Boolean = js.native
    
    val hash: String = js.native
  }
  /* static members */
  @js.native
  object Indexed extends js.Object {
    
    def isIndexed(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/interface.Indexed */ Boolean = js.native
  }
  
  @js.native
  class Interface protected () extends js.Object {
    def this(fragments: String) = this()
    def this(fragments: js.Array[Fragment | JsonFragment | String]) = this()
    
    val _abiCoder: AbiCoder = js.native
    
    def _decodeParams(params: js.Array[ParamType], data: BytesLike): Result = js.native
    
    def _encodeParams(params: js.Array[ParamType], values: js.Array[_]): String = js.native
    
    val _isInterface: Boolean = js.native
    
    def decodeEventLog(eventFragment: String, data: BytesLike): Result = js.native
    def decodeEventLog(eventFragment: String, data: BytesLike, topics: js.Array[String]): Result = js.native
    def decodeEventLog(eventFragment: EventFragment, data: BytesLike): Result = js.native
    def decodeEventLog(eventFragment: EventFragment, data: BytesLike, topics: js.Array[String]): Result = js.native
    
    def decodeFunctionData(functionFragment: String, data: BytesLike): Result = js.native
    def decodeFunctionData(functionFragment: FunctionFragment, data: BytesLike): Result = js.native
    
    def decodeFunctionResult(functionFragment: String, data: BytesLike): Result = js.native
    def decodeFunctionResult(functionFragment: FunctionFragment, data: BytesLike): Result = js.native
    
    val deploy: ConstructorFragment = js.native
    
    def encodeDeploy(): String = js.native
    def encodeDeploy(values: js.Array[_]): String = js.native
    
    def encodeEventLog(eventFragment: EventFragment, values: js.Array[_]): Data = js.native
    
    def encodeFilterTopics(eventFragment: EventFragment, values: js.Array[_]): js.Array[String | js.Array[String]] = js.native
    
    def encodeFunctionData(functionFragment: String): String = js.native
    def encodeFunctionData(functionFragment: String, values: js.Array[_]): String = js.native
    def encodeFunctionData(functionFragment: FunctionFragment): String = js.native
    def encodeFunctionData(functionFragment: FunctionFragment, values: js.Array[_]): String = js.native
    
    def encodeFunctionResult(functionFragment: String): String = js.native
    def encodeFunctionResult(functionFragment: String, values: js.Array[_]): String = js.native
    def encodeFunctionResult(functionFragment: FunctionFragment): String = js.native
    def encodeFunctionResult(functionFragment: FunctionFragment, values: js.Array[_]): String = js.native
    
    val errors: StringDictionary[js.Any] = js.native
    
    val events: StringDictionary[EventFragment] = js.native
    
    def format(): String | js.Array[String] = js.native
    def format(format: String): String | js.Array[String] = js.native
    
    val fragments: js.Array[Fragment] = js.native
    
    val functions: StringDictionary[FunctionFragment] = js.native
    
    def getEvent(nameOrSignatureOrTopic: String): EventFragment = js.native
    
    def getEventTopic(eventFragment: String): String = js.native
    def getEventTopic(eventFragment: EventFragment): String = js.native
    
    def getFunction(nameOrSignatureOrSighash: String): FunctionFragment = js.native
    
    def getSighash(functionFragment: String): String = js.native
    def getSighash(functionFragment: FunctionFragment): String = js.native
    
    def parseLog(log: Topics): LogDescription = js.native
    
    def parseTransaction(tx: Value): TransactionDescription = js.native
    
    val structs: StringDictionary[js.Any] = js.native
  }
  /* static members */
  @js.native
  object Interface extends js.Object {
    
    def getAbiCoder(): AbiCoder = js.native
    
    def getAddress(address: String): String = js.native
    
    def getEventTopic(eventFragment: EventFragment): String = js.native
    
    def getSighash(functionFragment: FunctionFragment): String = js.native
    
    def isInterface(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/interface.Interface */ Boolean = js.native
  }
  
  @js.native
  class LogDescription () extends Description[LogDescription] {
    
    val args: Result = js.native
    
    val eventFragment: EventFragment = js.native
    
    val name: String = js.native
    
    val signature: String = js.native
    
    val topic: String = js.native
  }
  
  @js.native
  class TransactionDescription () extends Description[TransactionDescription] {
    
    val args: Result = js.native
    
    val functionFragment: FunctionFragment = js.native
    
    val name: String = js.native
    
    val sighash: String = js.native
    
    val signature: String = js.native
    
    val value: BigNumber = js.native
  }
}
