package typingsSlinky.keystonejsFileAdapters.mod

import typingsSlinky.keystonejsFileAdapters.AnonFilename
import typingsSlinky.keystonejsFileAdapters.AnonFilenameId
import typingsSlinky.keystonejsFileAdapters.AnonFilenameString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@keystonejs/file-adapters", "LocalFileAdapter")
@js.native
class LocalFileAdapter protected () extends js.Object {
  def this(options: LocalFileAdapterConfig) = this()
  def publicUrl(params: AnonFilenameString): String = js.native
  def save(params: AnonFilename): js.Promise[AnonFilenameId] = js.native
}

