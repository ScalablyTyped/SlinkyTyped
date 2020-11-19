package typingsSlinky.ejWebAll.ej.ColorPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Palette extends js.Object
@JSGlobal("ej.ColorPicker.Palette")
@js.native
object Palette extends js.Object {
  
  ///used to show the basic palette
  @js.native
  sealed trait BasicPalette extends Palette
  
  ///used to show the custompalette
  @js.native
  sealed trait CustomPalette extends Palette
}
