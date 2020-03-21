package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAndroidpublisher.AnonEndTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoidedpurchasesResource extends js.Object {
  /** Lists the purchases that were cancelled, refunded or charged-back. */
  def list(request: AnonEndTime): Request_[VoidedPurchasesListResponse]
}

object VoidedpurchasesResource {
  @scala.inline
  def apply(list: AnonEndTime => Request_[VoidedPurchasesListResponse]): VoidedpurchasesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[VoidedpurchasesResource]
  }
}

