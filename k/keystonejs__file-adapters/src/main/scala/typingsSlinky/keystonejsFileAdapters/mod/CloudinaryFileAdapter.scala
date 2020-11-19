package typingsSlinky.keystonejsFileAdapters.mod

import typingsSlinky.keystonejsFileAdapters.anon.Filename
import typingsSlinky.keystonejsFileAdapters.anon.FilenameId
import typingsSlinky.keystonejsFileAdapters.anon.FilenameString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@keystonejs/file-adapters", "CloudinaryFileAdapter")
@js.native
class CloudinaryFileAdapter protected () extends js.Object {
  def this(options: CloudinaryFileAdapterConfig) = this()
  
  def publicUrl(params: FilenameString): String = js.native
  
  def save(params: Filename): js.Promise[FilenameId] = js.native
}
