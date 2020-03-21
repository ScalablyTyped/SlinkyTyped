package typingsSlinky.reactDndHtml5Backend

import org.scalajs.dom.raw.DataTransfer
import typingsSlinky.reactDndHtml5Backend.nativeDragSourceMod.NativeDragSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd-html5-backend/lib/NativeDragSources", JSImport.Namespace)
@js.native
object nativeDragSourcesMod extends js.Object {
  def createNativeDragSource(`type`: String): NativeDragSource = js.native
  def createNativeDragSource(`type`: String, dataTransfer: DataTransfer): NativeDragSource = js.native
  def matchNativeItemType(): String | Null = js.native
  def matchNativeItemType(dataTransfer: DataTransfer): String | Null = js.native
}

