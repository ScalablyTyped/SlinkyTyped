package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.DirectPut
  - typingsSlinky.awsSdk.awsSdkStrings.KinesisStreamAsSource
  - java.lang.String
*/
trait DeliveryStreamType extends js.Object

object DeliveryStreamType {
  @scala.inline
  def DirectPut: typingsSlinky.awsSdk.awsSdkStrings.DirectPut = "DirectPut".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DirectPut]
  @scala.inline
  def KinesisStreamAsSource: typingsSlinky.awsSdk.awsSdkStrings.KinesisStreamAsSource = "KinesisStreamAsSource".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.KinesisStreamAsSource]
  @scala.inline
  implicit def apply(value: String): DeliveryStreamType = value.asInstanceOf[DeliveryStreamType]
}

