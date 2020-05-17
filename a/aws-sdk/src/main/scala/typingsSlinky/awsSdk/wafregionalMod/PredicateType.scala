package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.IPMatch
  - typingsSlinky.awsSdk.awsSdkStrings.ByteMatch
  - typingsSlinky.awsSdk.awsSdkStrings.SqlInjectionMatch
  - typingsSlinky.awsSdk.awsSdkStrings.GeoMatch
  - typingsSlinky.awsSdk.awsSdkStrings.SizeConstraint
  - typingsSlinky.awsSdk.awsSdkStrings.XssMatch
  - typingsSlinky.awsSdk.awsSdkStrings.RegexMatch
  - java.lang.String
*/
trait PredicateType extends js.Object

object PredicateType {
  @scala.inline
  def IPMatch: typingsSlinky.awsSdk.awsSdkStrings.IPMatch = "IPMatch".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IPMatch]
  @scala.inline
  def ByteMatch: typingsSlinky.awsSdk.awsSdkStrings.ByteMatch = "ByteMatch".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ByteMatch]
  @scala.inline
  def SqlInjectionMatch: typingsSlinky.awsSdk.awsSdkStrings.SqlInjectionMatch = "SqlInjectionMatch".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SqlInjectionMatch]
  @scala.inline
  def GeoMatch: typingsSlinky.awsSdk.awsSdkStrings.GeoMatch = "GeoMatch".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.GeoMatch]
  @scala.inline
  def SizeConstraint: typingsSlinky.awsSdk.awsSdkStrings.SizeConstraint = "SizeConstraint".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SizeConstraint]
  @scala.inline
  def XssMatch: typingsSlinky.awsSdk.awsSdkStrings.XssMatch = "XssMatch".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.XssMatch]
  @scala.inline
  def RegexMatch: typingsSlinky.awsSdk.awsSdkStrings.RegexMatch = "RegexMatch".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RegexMatch]
  @scala.inline
  implicit def apply(value: String): PredicateType = value.asInstanceOf[PredicateType]
}

