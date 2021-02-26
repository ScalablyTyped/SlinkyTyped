package typingsSlinky.reactDndHtml5Backend

import org.scalajs.dom.raw.DataTransfer
import typingsSlinky.reactDndHtml5Backend.nativeDragSourceMod.NativeDragSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDragSourcesMod {
  
  @JSImport("react-dnd-html5-backend/lib/NativeDragSources", "createNativeDragSource")
  @js.native
  def createNativeDragSource(`type`: String): NativeDragSource = js.native
  @JSImport("react-dnd-html5-backend/lib/NativeDragSources", "createNativeDragSource")
  @js.native
  def createNativeDragSource(`type`: String, dataTransfer: DataTransfer): NativeDragSource = js.native
  
  @JSImport("react-dnd-html5-backend/lib/NativeDragSources", "matchNativeItemType")
  @js.native
  def matchNativeItemType(): String | Null = js.native
  @JSImport("react-dnd-html5-backend/lib/NativeDragSources", "matchNativeItemType")
  @js.native
  def matchNativeItemType(dataTransfer: DataTransfer): String | Null = js.native
}
