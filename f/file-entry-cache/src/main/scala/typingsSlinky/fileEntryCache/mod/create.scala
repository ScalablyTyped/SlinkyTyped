package typingsSlinky.fileEntryCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("file-entry-cache", "create")
@js.native
object create extends js.Object {
  
  def apply(cacheName: String): FileEntryCache = js.native
  def apply(cacheName: String, directory: js.UndefOr[scala.Nothing], usecheckSum: Boolean): FileEntryCache = js.native
  def apply(cacheName: String, directory: String): FileEntryCache = js.native
  def apply(cacheName: String, directory: String, usecheckSum: Boolean): FileEntryCache = js.native
}
