package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.mod.refund.CreateTransferRefund
import typingsSlinky.mangopay2NodejsSdk.mod.refund.RefundData
import typingsSlinky.mangopay2NodejsSdk.mod.transfer.CreateTransfer
import typingsSlinky.mangopay2NodejsSdk.mod.transfer.TransferData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "Transfers")
@js.native
class Transfers () extends js.Object {
  
  /**
    * Create new transfer
    * @param transfer
    * @param options
    */
  def create(data: CreateTransfer): js.Promise[TransferData] = js.native
  /**
    * Create new transfer
    * @param transfer
    * @param options
    */
  def create(data: CreateTransfer, callback: js.Function1[/* data */ TransferData, Unit]): Unit = js.native
  /**
    * Create new transfer
    * @param transfer
    * @param options
    */
  def create(
    data: CreateTransfer,
    callback: js.Function1[/* data */ WithResponse[TransferData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def create(
    data: CreateTransfer,
    callback: js.Function1[/* data */ TransferData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Create new transfer
    * @param transfer
    * @param options
    */
  def create(data: CreateTransfer, options: MethodOptionWithResponse): js.Promise[WithResponse[TransferData]] = js.native
  def create(data: CreateTransfer, options: MethodOptionWithoutResponse): js.Promise[TransferData] = js.native
  
  /**
    * Create refund for transfer object
    * @param transferId
    * @param refund
    * @param options
    */
  def createRefund(data: String, extra: CreateTransferRefund): js.Promise[RefundData] = js.native
  /**
    * Create refund for transfer object
    * @param transferId
    * @param refund
    * @param options
    */
  def createRefund(
    data: String,
    extra: CreateTransferRefund,
    callback: js.Function1[(/* data */ RefundData) | (/* data */ WithResponse[RefundData]), Unit]
  ): Unit = js.native
  def createRefund(
    data: String,
    extra: CreateTransferRefund,
    callback: js.Function1[/* data */ WithResponse[RefundData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def createRefund(
    data: String,
    extra: CreateTransferRefund,
    callback: js.Function1[/* data */ RefundData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Create refund for transfer object
    * @param transferId
    * @param refund
    * @param options
    */
  def createRefund(data: String, extra: CreateTransferRefund, options: MethodOptionWithResponse): js.Promise[WithResponse[RefundData]] = js.native
  def createRefund(data: String, extra: CreateTransferRefund, options: MethodOptionWithoutResponse): js.Promise[RefundData] = js.native
  /**
    * Create refund for transfer object
    * @param transferId
    * @param refund
    * @param options
    */
  @JSName("createRefund")
  var createRefund_Original: TwoArgsMethodOverload[String, CreateTransferRefund, RefundData] = js.native
  
  /**
    * Create new transfer
    * @param transfer
    * @param options
    */
  @JSName("create")
  var create_Original: MethodOverload[CreateTransfer, TransferData] = js.native
  
  /**
    * Get transfer
    * @param transferId
    * @param options
    */
  def get(data: String): js.Promise[TransferData] = js.native
  /**
    * Get transfer
    * @param transferId
    * @param options
    */
  def get(data: String, callback: js.Function1[/* data */ TransferData, Unit]): Unit = js.native
  /**
    * Get transfer
    * @param transferId
    * @param options
    */
  def get(
    data: String,
    callback: js.Function1[/* data */ WithResponse[TransferData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def get(
    data: String,
    callback: js.Function1[/* data */ TransferData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Get transfer
    * @param transferId
    * @param options
    */
  def get(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[TransferData]] = js.native
  def get(data: String, options: MethodOptionWithoutResponse): js.Promise[TransferData] = js.native
  
  /**
    * Gets list of Refunds of a Transfer
    * @param transferId
    * @param options
    */
  def getRefunds(data: String): js.Promise[js.Array[RefundData]] = js.native
  /**
    * Gets list of Refunds of a Transfer
    * @param transferId
    * @param options
    */
  def getRefunds(data: String, callback: js.Function1[/* data */ js.Array[RefundData], Unit]): Unit = js.native
  /**
    * Gets list of Refunds of a Transfer
    * @param transferId
    * @param options
    */
  def getRefunds(
    data: String,
    callback: js.Function1[/* data */ WithResponse[js.Array[RefundData]], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def getRefunds(
    data: String,
    callback: js.Function1[/* data */ js.Array[RefundData], Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Gets list of Refunds of a Transfer
    * @param transferId
    * @param options
    */
  def getRefunds(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[RefundData]]] = js.native
  def getRefunds(data: String, options: MethodOptionWithoutResponse): js.Promise[js.Array[RefundData]] = js.native
  /**
    * Gets list of Refunds of a Transfer
    * @param transferId
    * @param options
    */
  @JSName("getRefunds")
  var getRefunds_Original: MethodOverload[String, js.Array[RefundData]] = js.native
  
  /**
    * Get transfer
    * @param transferId
    * @param options
    */
  @JSName("get")
  var get_Original: MethodOverload[String, TransferData] = js.native
}
