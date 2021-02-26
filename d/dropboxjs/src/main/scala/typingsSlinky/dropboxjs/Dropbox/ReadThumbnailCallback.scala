package typingsSlinky.dropboxjs.Dropbox

import org.scalajs.dom.raw.Blob
import typingsSlinky.dropboxjs.Dropbox.File.Stat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadThumbnailCallback extends StObject {
  
  def apply(err: ApiError, imageData: String, stat: Stat): Unit = js.native
  def apply(err: ApiError, imageData: Blob, stat: Stat): Unit = js.native
}
