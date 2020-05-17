package typingsSlinky.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Female
  - typingsSlinky.awsSdk.awsSdkStrings.Male
  - java.lang.String
*/
trait Gender extends js.Object

object Gender {
  @scala.inline
  def Female: typingsSlinky.awsSdk.awsSdkStrings.Female = "Female".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Female]
  @scala.inline
  def Male: typingsSlinky.awsSdk.awsSdkStrings.Male = "Male".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Male]
  @scala.inline
  implicit def apply(value: String): Gender = value.asInstanceOf[Gender]
}

