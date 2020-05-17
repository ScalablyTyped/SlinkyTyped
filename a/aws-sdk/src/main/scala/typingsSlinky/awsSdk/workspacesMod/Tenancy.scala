package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.DEDICATED
  - typingsSlinky.awsSdk.awsSdkStrings.SHARED
  - java.lang.String
*/
trait Tenancy extends js.Object

object Tenancy {
  @scala.inline
  def DEDICATED: typingsSlinky.awsSdk.awsSdkStrings.DEDICATED = "DEDICATED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DEDICATED]
  @scala.inline
  def SHARED: typingsSlinky.awsSdk.awsSdkStrings.SHARED = "SHARED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SHARED]
  @scala.inline
  implicit def apply(value: String): Tenancy = value.asInstanceOf[Tenancy]
}

