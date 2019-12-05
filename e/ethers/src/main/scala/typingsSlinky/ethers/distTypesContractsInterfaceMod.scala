package typingsSlinky.ethers

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ethers.distTypesUtilsTypesMod.DeployDescription
import typingsSlinky.ethers.distTypesUtilsTypesMod.EventDescription
import typingsSlinky.ethers.distTypesUtilsTypesMod.EventFragment
import typingsSlinky.ethers.distTypesUtilsTypesMod.FunctionDescription
import typingsSlinky.ethers.distTypesUtilsTypesMod.FunctionFragment
import typingsSlinky.ethers.distTypesUtilsTypesMod.LogDescription
import typingsSlinky.ethers.distTypesUtilsTypesMod.ParamType
import typingsSlinky.ethers.distTypesUtilsTypesMod.TransactionDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/contracts/interface", JSImport.Namespace)
@js.native
object distTypesContractsInterfaceMod extends js.Object {
  @js.native
  class Interface protected () extends js.Object {
    def this(abi: String) = this()
    def this(abi: js.Array[String | ParamType]) = this()
    val abi: js.Array[EventFragment | FunctionFragment] = js.native
    val deployFunction: DeployDescription = js.native
    val events: StringDictionary[EventDescription] = js.native
    val functions: StringDictionary[FunctionDescription] = js.native
    def parseLog(log: Anon_DataTopics): LogDescription = js.native
    def parseTransaction(tx: Anon_Data): TransactionDescription = js.native
  }
  
}

