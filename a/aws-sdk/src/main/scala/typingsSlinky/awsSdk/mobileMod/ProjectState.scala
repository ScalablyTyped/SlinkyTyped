package typingsSlinky.awsSdk.mobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.NORMAL
  - typingsSlinky.awsSdk.awsSdkStrings.SYNCING
  - typingsSlinky.awsSdk.awsSdkStrings.IMPORTING
  - java.lang.String
*/
trait ProjectState extends js.Object

object ProjectState {
  @scala.inline
  def NORMAL: typingsSlinky.awsSdk.awsSdkStrings.NORMAL = "NORMAL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NORMAL]
  @scala.inline
  def SYNCING: typingsSlinky.awsSdk.awsSdkStrings.SYNCING = "SYNCING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SYNCING]
  @scala.inline
  def IMPORTING: typingsSlinky.awsSdk.awsSdkStrings.IMPORTING = "IMPORTING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IMPORTING]
  @scala.inline
  implicit def apply(value: String): ProjectState = value.asInstanceOf[ProjectState]
}

