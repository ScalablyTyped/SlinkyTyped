package typingsSlinky.libraCore.transactionPbMod

import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/transaction_pb", "Program")
@js.native
class Program_ () extends Message {
  
  def addArguments(): TransactionArgument = js.native
  def addArguments(value: js.UndefOr[scala.Nothing], index: Double): TransactionArgument = js.native
  def addArguments(value: TransactionArgument): TransactionArgument = js.native
  def addArguments(value: TransactionArgument, index: Double): TransactionArgument = js.native
  
  def addModules(value: String): js.typedarray.Uint8Array | String = js.native
  def addModules(value: String, index: Double): js.typedarray.Uint8Array | String = js.native
  def addModules(value: js.typedarray.Uint8Array): js.typedarray.Uint8Array | String = js.native
  def addModules(value: js.typedarray.Uint8Array, index: Double): js.typedarray.Uint8Array | String = js.native
  
  def clearArgumentsList(): Unit = js.native
  
  def clearModulesList(): Unit = js.native
  
  def getArgumentsList(): js.Array[TransactionArgument] = js.native
  
  def getCode(): js.typedarray.Uint8Array | String = js.native
  
  def getCode_asB64(): String = js.native
  
  def getCode_asU8(): js.typedarray.Uint8Array = js.native
  
  def getModulesList(): js.Array[js.typedarray.Uint8Array | String] = js.native
  
  def getModulesList_asB64(): js.Array[String] = js.native
  
  def getModulesList_asU8(): js.Array[js.typedarray.Uint8Array] = js.native
  
  def setArgumentsList(value: js.Array[TransactionArgument]): Unit = js.native
  
  def setCode(value: String): Unit = js.native
  def setCode(value: js.typedarray.Uint8Array): Unit = js.native
  
  def setModulesList(value: js.Array[js.typedarray.Uint8Array | String]): Unit = js.native
}
