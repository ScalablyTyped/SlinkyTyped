package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Random
  - typingsSlinky.awsSdk.awsSdkStrings.ByLogStream
  - java.lang.String
*/
trait Distribution extends js.Object

object Distribution {
  @scala.inline
  def Random: typingsSlinky.awsSdk.awsSdkStrings.Random = "Random".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Random]
  @scala.inline
  def ByLogStream: typingsSlinky.awsSdk.awsSdkStrings.ByLogStream = "ByLogStream".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ByLogStream]
  @scala.inline
  implicit def apply(value: String): Distribution = value.asInstanceOf[Distribution]
}

