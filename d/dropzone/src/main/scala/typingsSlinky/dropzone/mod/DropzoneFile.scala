package typingsSlinky.dropzone.mod

import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.dropzone.mod.global.HTMLElement
import typingsSlinky.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropzoneFile extends File {
  
  var accepted: Boolean = js.native
  
  var dataURL: js.UndefOr[String] = js.native
  
  var previewElement: HTMLElement = js.native
  
  var previewTemplate: HTMLElement = js.native
  
  var previewsContainer: HTMLElement = js.native
  
  var status: String = js.native
  
  var upload: js.UndefOr[DropzoneFileUpload] = js.native
  
  var xhr: js.UndefOr[XMLHttpRequest] = js.native
}
