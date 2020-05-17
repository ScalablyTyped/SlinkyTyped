package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.JDBC
  - typingsSlinky.awsSdk.awsSdkStrings.SFTP
  - java.lang.String
*/
trait ConnectionType extends js.Object

object ConnectionType {
  @scala.inline
  def JDBC: typingsSlinky.awsSdk.awsSdkStrings.JDBC = "JDBC".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.JDBC]
  @scala.inline
  def SFTP: typingsSlinky.awsSdk.awsSdkStrings.SFTP = "SFTP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SFTP]
  @scala.inline
  implicit def apply(value: String): ConnectionType = value.asInstanceOf[ConnectionType]
}

