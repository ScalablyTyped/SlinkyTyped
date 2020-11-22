package typingsSlinky.rcUpload.interfaceMod

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.std.ProgressEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadProgressEvent extends ProgressEvent[EventTarget] {
  
  var percent: Double = js.native
}
