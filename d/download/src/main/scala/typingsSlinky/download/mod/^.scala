package typingsSlinky.download.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("download", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(url: String): js.Promise[Buffer] with WritableStream with ReadableStream = js.native
  def apply(url: String, destination: js.UndefOr[scala.Nothing], options: DownloadOptions): js.Promise[Buffer] with WritableStream with ReadableStream = js.native
  def apply(url: String, destination: String): js.Promise[Buffer] with WritableStream with ReadableStream = js.native
  def apply(url: String, destination: String, options: DownloadOptions): js.Promise[Buffer] with WritableStream with ReadableStream = js.native
}
