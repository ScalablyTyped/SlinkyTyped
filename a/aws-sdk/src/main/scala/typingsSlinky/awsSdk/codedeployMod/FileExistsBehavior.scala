package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.DISALLOW
  - typingsSlinky.awsSdk.awsSdkStrings.OVERWRITE
  - typingsSlinky.awsSdk.awsSdkStrings.RETAIN
  - java.lang.String
*/
trait FileExistsBehavior extends js.Object

object FileExistsBehavior {
  @scala.inline
  def DISALLOW: typingsSlinky.awsSdk.awsSdkStrings.DISALLOW = "DISALLOW".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DISALLOW]
  @scala.inline
  def OVERWRITE: typingsSlinky.awsSdk.awsSdkStrings.OVERWRITE = "OVERWRITE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OVERWRITE]
  @scala.inline
  def RETAIN: typingsSlinky.awsSdk.awsSdkStrings.RETAIN = "RETAIN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RETAIN]
  @scala.inline
  implicit def apply(value: String): FileExistsBehavior = value.asInstanceOf[FileExistsBehavior]
}

