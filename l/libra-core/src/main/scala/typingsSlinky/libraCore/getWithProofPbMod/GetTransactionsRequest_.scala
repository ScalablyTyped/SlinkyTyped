package typingsSlinky.libraCore.getWithProofPbMod

import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetTransactionsRequest")
@js.native
class GetTransactionsRequest_ () extends Message {
  
  def getFetchEvents(): Boolean = js.native
  
  def getLimit(): String = js.native
  
  def getStartVersion(): String = js.native
  
  def setFetchEvents(value: Boolean): Unit = js.native
  
  def setLimit(value: String): Unit = js.native
  
  def setStartVersion(value: String): Unit = js.native
}
