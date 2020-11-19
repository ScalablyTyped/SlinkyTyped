package typingsSlinky.keystonejsFileAdapters.mod

import typingsSlinky.keystonejsFileAdapters.anon.Filename
import typingsSlinky.keystonejsFileAdapters.anon.FilenameId
import typingsSlinky.keystonejsFileAdapters.anon.FilenameString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@keystonejs/file-adapters", "LocalFileAdapter")
@js.native
class LocalFileAdapter protected () extends js.Object {
  def this(options: LocalFileAdapterConfig) = this()
  
  def publicUrl(params: FilenameString): String = js.native
  
  def save(params: Filename): js.Promise[FilenameId] = js.native
}
