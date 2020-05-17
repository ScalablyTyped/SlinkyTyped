package typingsSlinky.ethers

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ethers.anon.Data
import typingsSlinky.ethers.anon.Topics
import typingsSlinky.ethers.typesMod.DeployDescription
import typingsSlinky.ethers.typesMod.EventDescription
import typingsSlinky.ethers.typesMod.EventFragment
import typingsSlinky.ethers.typesMod.FunctionDescription
import typingsSlinky.ethers.typesMod.FunctionFragment
import typingsSlinky.ethers.typesMod.LogDescription
import typingsSlinky.ethers.typesMod.ParamType
import typingsSlinky.ethers.typesMod.TransactionDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/contracts/interface", JSImport.Namespace)
@js.native
object interfaceMod extends js.Object {
  @js.native
  class Interface protected () extends js.Object {
    def this(abi: String) = this()
    def this(abi: js.Array[String | ParamType]) = this()
    val abi: js.Array[EventFragment | FunctionFragment] = js.native
    val deployFunction: DeployDescription = js.native
    val events: StringDictionary[EventDescription] = js.native
    val functions: StringDictionary[FunctionDescription] = js.native
    def parseLog(log: Topics): LogDescription = js.native
    def parseTransaction(tx: Data): TransactionDescription = js.native
  }
  
}

