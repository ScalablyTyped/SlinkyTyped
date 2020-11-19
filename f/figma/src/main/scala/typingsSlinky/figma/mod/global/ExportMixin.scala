package typingsSlinky.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportMixin extends js.Object {
  
  def exportAsync(): js.Promise[js.typedarray.Uint8Array] = js.native
  def exportAsync(settings: ExportSettings): js.Promise[js.typedarray.Uint8Array] = js.native
  
  var exportSettings: js.Array[ExportSettings] = js.native
}
