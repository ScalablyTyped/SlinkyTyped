package typingsSlinky.imageDashThumbnail.imageDashThumbnailMod

import typingsSlinky.imageDashThumbnail.Anon_Base64
import typingsSlinky.imageDashThumbnail.Anon_Buffer
import typingsSlinky.imageDashThumbnail.Anon_Uri
import typingsSlinky.node.Buffer
import typingsSlinky.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("image-thumbnail", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(src: String): js.Promise[Buffer] = js.native
  def apply(src: String, options: Anon_Buffer with Options): js.Promise[Buffer] = js.native
  def apply(src: String, options: Anon_Base64 with Options): js.Promise[String] = js.native
  def apply(src: Anon_Uri): js.Promise[Buffer] = js.native
  def apply(src: Anon_Uri, options: Anon_Base64 with Options): js.Promise[String] = js.native
  def apply(src: Anon_Uri, options: Anon_Buffer with Options): js.Promise[Buffer] = js.native
  def apply(src: Buffer): js.Promise[Buffer] = js.native
  def apply(src: Buffer, options: Anon_Buffer with Options): js.Promise[Buffer] = js.native
  def apply(src: Buffer, options: Anon_Base64 with Options): js.Promise[String] = js.native
  def apply(src: ReadStream): js.Promise[Buffer] = js.native
  def apply(src: ReadStream, options: Anon_Base64 with Options): js.Promise[String] = js.native
  def apply(src: ReadStream, options: Anon_Buffer with Options): js.Promise[Buffer] = js.native
}

