package typingsSlinky.figma.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportMixin extends js.Object {
  var exportSettings: js.Array[ExportSettings] = js.native
  def exportAsync(): js.Promise[js.typedarray.Uint8Array] = js.native
  def exportAsync(settings: ExportSettings): js.Promise[js.typedarray.Uint8Array] = js.native
}

