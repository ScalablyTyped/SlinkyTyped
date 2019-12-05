package typingsSlinky.atKeystonejsFileDashAdapters.atKeystonejsFileDashAdaptersMod

import typingsSlinky.atKeystonejsFileDashAdapters.Anon_Filename
import typingsSlinky.atKeystonejsFileDashAdapters.Anon_FilenameId
import typingsSlinky.atKeystonejsFileDashAdapters.Anon_FilenameString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@keystonejs/file-adapters", "LocalFileAdapter")
@js.native
class LocalFileAdapter protected () extends js.Object {
  def this(options: LocalFileAdapterConfig) = this()
  def publicUrl(params: Anon_FilenameString): String = js.native
  def save(params: Anon_Filename): js.Promise[Anon_FilenameId] = js.native
}

