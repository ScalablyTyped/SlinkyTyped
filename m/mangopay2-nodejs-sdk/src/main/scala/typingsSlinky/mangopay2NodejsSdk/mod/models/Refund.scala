package typingsSlinky.mangopay2NodejsSdk.mod.models

import typingsSlinky.mangopay2NodejsSdk.mod.refund.CreatePayInRefund
import typingsSlinky.mangopay2NodejsSdk.mod.refund.CreateTransferRefund
import typingsSlinky.mangopay2NodejsSdk.mod.refund.RefundData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.Refund")
@js.native
class Refund protected () extends EntityBase[RefundData] {
  def this(data: CreatePayInRefund) = this()
  def this(data: CreateTransferRefund) = this()
}
