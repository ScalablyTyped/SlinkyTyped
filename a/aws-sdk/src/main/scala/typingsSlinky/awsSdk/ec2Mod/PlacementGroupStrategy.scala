package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.cluster_
  - typingsSlinky.awsSdk.awsSdkStrings.partition
  - typingsSlinky.awsSdk.awsSdkStrings.spread
  - java.lang.String
*/
trait PlacementGroupStrategy extends js.Object

object PlacementGroupStrategy {
  @scala.inline
  def cluster_ : typingsSlinky.awsSdk.awsSdkStrings.cluster_ = "cluster".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.cluster_]
  @scala.inline
  def partition: typingsSlinky.awsSdk.awsSdkStrings.partition = "partition".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.partition]
  @scala.inline
  def spread: typingsSlinky.awsSdk.awsSdkStrings.spread = "spread".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.spread]
  @scala.inline
  implicit def apply(value: java.lang.String): PlacementGroupStrategy = value.asInstanceOf[PlacementGroupStrategy]
}

