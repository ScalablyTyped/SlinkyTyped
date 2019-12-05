package typingsSlinky.ejDotWebDotAll.ej.ColorPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ModelType extends js.Object

@JSGlobal("ej.ColorPicker.ModelType")
@js.native
object ModelType extends js.Object {
  ///support palette type mode in color picker.
  @js.native
  sealed trait Palette extends ModelType
  
  ///support palette type mode in color picker.
  @js.native
  sealed trait Picker extends ModelType
  
  /* 0 */ val Palette: typingsSlinky.ejDotWebDotAll.ej.ColorPicker.ModelType.Palette with Double = js.native
  /* 1 */ val Picker: typingsSlinky.ejDotWebDotAll.ej.ColorPicker.ModelType.Picker with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModelType with Double] = js.native
}

