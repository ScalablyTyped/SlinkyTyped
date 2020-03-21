package typingsSlinky.reactAvatarEditor.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvatarEditor
  extends Component[AvatarEditorProps, js.Any, js.Any] {
  def getCroppingRect(): CroppedRect = js.native
  def getImage(): HTMLCanvasElement = js.native
  def getImageScaledToCanvas(): HTMLCanvasElement = js.native
}

