package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PUBLIC
  - typingsSlinky.awsSdk.awsSdkStrings.PRIVATE
  - typingsSlinky.awsSdk.awsSdkStrings.SHARED
  - java.lang.String
*/
trait VisibilityType extends js.Object

object VisibilityType {
  @scala.inline
  def PUBLIC: typingsSlinky.awsSdk.awsSdkStrings.PUBLIC = "PUBLIC".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PUBLIC]
  @scala.inline
  def PRIVATE: typingsSlinky.awsSdk.awsSdkStrings.PRIVATE = "PRIVATE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PRIVATE]
  @scala.inline
  def SHARED: typingsSlinky.awsSdk.awsSdkStrings.SHARED = "SHARED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SHARED]
  @scala.inline
  implicit def apply(value: java.lang.String): VisibilityType = value.asInstanceOf[VisibilityType]
}

