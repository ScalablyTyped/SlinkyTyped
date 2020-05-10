package typingsSlinky.mangopay2NodejsSdk.mod.mandate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * - "CREATED" - the mandate has been created
  * - "SUBMITTED" - the mandate has been submitted to the banks and you can now do payments with this mandate
  * - "ACTIVE" - the mandate is active and has been accepted by the banks and/or successfully used in a payment
  * - "FAILED" - the mandate has failed for a variety of reasons and is no longer available for payments
  */
/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.ValueOf<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.IMandateStatus> */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUBMITTED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ACTIVE
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED
*/
trait MandateStatus extends js.Object

object MandateStatus {
  @scala.inline
  def ACTIVE: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ACTIVE]
  @scala.inline
  def CREATED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED = "CREATED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED]
  @scala.inline
  def FAILED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED]
  @scala.inline
  def SUBMITTED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUBMITTED = "SUBMITTED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUBMITTED]
}

