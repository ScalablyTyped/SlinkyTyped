package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.kinesisanalyticsv2Mod.Blob
  - java.lang.String
*/
trait ZipFileContent extends js.Object

object ZipFileContent {
  @scala.inline
  implicit def apply(value: Blob): ZipFileContent = value.asInstanceOf[ZipFileContent]
  @scala.inline
  implicit def apply(value: Buffer): ZipFileContent = value.asInstanceOf[ZipFileContent]
  @scala.inline
  implicit def apply(value: String): ZipFileContent = value.asInstanceOf[ZipFileContent]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): ZipFileContent = value.asInstanceOf[ZipFileContent]
}

