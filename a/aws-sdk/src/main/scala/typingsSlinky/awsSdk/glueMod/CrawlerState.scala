package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.READY
  - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
  - typingsSlinky.awsSdk.awsSdkStrings.STOPPING
  - java.lang.String
*/
trait CrawlerState extends js.Object

object CrawlerState {
  @scala.inline
  def READY: typingsSlinky.awsSdk.awsSdkStrings.READY = "READY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.READY]
  @scala.inline
  def RUNNING: typingsSlinky.awsSdk.awsSdkStrings.RUNNING = "RUNNING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RUNNING]
  @scala.inline
  def STOPPING: typingsSlinky.awsSdk.awsSdkStrings.STOPPING = "STOPPING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STOPPING]
  @scala.inline
  implicit def apply(value: String): CrawlerState = value.asInstanceOf[CrawlerState]
}

