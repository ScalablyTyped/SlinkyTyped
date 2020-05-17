package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.S3
  - typingsSlinky.awsSdk.awsSdkStrings.SHAREPOINT
  - typingsSlinky.awsSdk.awsSdkStrings.DATABASE
  - java.lang.String
*/
trait DataSourceType extends js.Object

object DataSourceType {
  @scala.inline
  def S3: typingsSlinky.awsSdk.awsSdkStrings.S3 = "S3".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.S3]
  @scala.inline
  def SHAREPOINT: typingsSlinky.awsSdk.awsSdkStrings.SHAREPOINT = "SHAREPOINT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SHAREPOINT]
  @scala.inline
  def DATABASE: typingsSlinky.awsSdk.awsSdkStrings.DATABASE = "DATABASE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DATABASE]
  @scala.inline
  implicit def apply(value: java.lang.String): DataSourceType = value.asInstanceOf[DataSourceType]
}

