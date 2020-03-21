package typingsSlinky.mangopay2NodejsSdk.mod.client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MARKETPLACE
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FRANCHISE
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
*/
trait BusinessType extends js.Object

object BusinessType {
  @scala.inline
  def CROWDFUNDING: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING = this.cast("CROWDFUNDING")
  @scala.inline
  def FRANCHISE: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FRANCHISE = this.cast("FRANCHISE")
  @scala.inline
  def MARKETPLACE: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MARKETPLACE = this.cast("MARKETPLACE")
  @scala.inline
  def OTHER: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER = this.cast("OTHER")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

