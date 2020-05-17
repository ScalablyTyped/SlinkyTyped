package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.default_
  - typingsSlinky.awsSdk.awsSdkStrings.dedicated_
  - typingsSlinky.awsSdk.awsSdkStrings.host_
  - java.lang.String
*/
trait Tenancy extends js.Object

object Tenancy {
  @scala.inline
  def default_ : typingsSlinky.awsSdk.awsSdkStrings.default_ = "default".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.default_]
  @scala.inline
  def dedicated_ : typingsSlinky.awsSdk.awsSdkStrings.dedicated_ = "dedicated".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.dedicated_]
  @scala.inline
  def host_ : typingsSlinky.awsSdk.awsSdkStrings.host_ = "host".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.host_]
  @scala.inline
  implicit def apply(value: java.lang.String): Tenancy = value.asInstanceOf[Tenancy]
}

