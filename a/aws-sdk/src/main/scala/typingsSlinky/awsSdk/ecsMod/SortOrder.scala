package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ASC
  - typingsSlinky.awsSdk.awsSdkStrings.DESC
  - java.lang.String
*/
trait SortOrder extends js.Object

object SortOrder {
  @scala.inline
  def ASC: typingsSlinky.awsSdk.awsSdkStrings.ASC = "ASC".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ASC]
  @scala.inline
  def DESC: typingsSlinky.awsSdk.awsSdkStrings.DESC = "DESC".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DESC]
  @scala.inline
  implicit def apply(value: java.lang.String): SortOrder = value.asInstanceOf[SortOrder]
}

