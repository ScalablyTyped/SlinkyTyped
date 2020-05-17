package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.LOG
  - typingsSlinky.awsSdk.awsSdkStrings.DELETE_FROM_DATABASE
  - typingsSlinky.awsSdk.awsSdkStrings.DEPRECATE_IN_DATABASE
  - java.lang.String
*/
trait DeleteBehavior extends js.Object

object DeleteBehavior {
  @scala.inline
  def LOG: typingsSlinky.awsSdk.awsSdkStrings.LOG = "LOG".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.LOG]
  @scala.inline
  def DELETE_FROM_DATABASE: typingsSlinky.awsSdk.awsSdkStrings.DELETE_FROM_DATABASE = "DELETE_FROM_DATABASE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETE_FROM_DATABASE]
  @scala.inline
  def DEPRECATE_IN_DATABASE: typingsSlinky.awsSdk.awsSdkStrings.DEPRECATE_IN_DATABASE = "DEPRECATE_IN_DATABASE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DEPRECATE_IN_DATABASE]
  @scala.inline
  implicit def apply(value: String): DeleteBehavior = value.asInstanceOf[DeleteBehavior]
}

