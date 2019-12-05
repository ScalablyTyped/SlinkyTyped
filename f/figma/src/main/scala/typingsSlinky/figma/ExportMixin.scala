package typingsSlinky.figma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportMixin extends js.Object {
  var exportSettings: js.Array[ExportSettings] = js.native
  def exportAsync(): js.Promise[scala.scalajs.js.typedarray.Uint8Array] = js.native
  def exportAsync(settings: ExportSettings): js.Promise[scala.scalajs.js.typedarray.Uint8Array] = js.native
}

