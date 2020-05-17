package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SERIALIZABLE
  - typingsSlinky.awsSdk.awsSdkStrings.EVENTUAL
  - java.lang.String
*/
trait ConsistencyLevel extends js.Object

object ConsistencyLevel {
  @scala.inline
  def SERIALIZABLE: typingsSlinky.awsSdk.awsSdkStrings.SERIALIZABLE = "SERIALIZABLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SERIALIZABLE]
  @scala.inline
  def EVENTUAL: typingsSlinky.awsSdk.awsSdkStrings.EVENTUAL = "EVENTUAL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EVENTUAL]
  @scala.inline
  implicit def apply(value: String): ConsistencyLevel = value.asInstanceOf[ConsistencyLevel]
}

