package typingsSlinky.ejDotWebDotAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

@JSGlobal("ej.Ribbon.Type")
@js.native
object Type extends js.Object {
  ///Specifies the button control
  @js.native
  sealed trait Button
    extends typingsSlinky.ejDotWebDotAll.ej.Ribbon.Type
  
  ///To append external element's
  @js.native
  sealed trait Custom
    extends typingsSlinky.ejDotWebDotAll.ej.Ribbon.Type
  
  ///Specifies the dropDown
  @js.native
  sealed trait DropDownList
    extends typingsSlinky.ejDotWebDotAll.ej.Ribbon.Type
  
  ///Specifies the ribbon gallery
  @js.native
  sealed trait Gallery
    extends typingsSlinky.ejDotWebDotAll.ej.Ribbon.Type
  
  ///Specifies the split button
  @js.native
  sealed trait SplitButton
    extends typingsSlinky.ejDotWebDotAll.ej.Ribbon.Type
  
  ///Specifies the toggle button
  @js.native
  sealed trait ToggleButton
    extends typingsSlinky.ejDotWebDotAll.ej.Ribbon.Type
  
  /* 0 */ val Button: typingsSlinky.ejDotWebDotAll.ej.Ribbon.Type.Button with Double = js.native
  /* 3 */ val Custom: typingsSlinky.ejDotWebDotAll.ej.Ribbon.Type.Custom with Double = js.native
  /* 2 */ val DropDownList: typingsSlinky.ejDotWebDotAll.ej.Ribbon.Type.DropDownList with Double = js.native
  /* 5 */ val Gallery: typingsSlinky.ejDotWebDotAll.ej.Ribbon.Type.Gallery with Double = js.native
  /* 1 */ val SplitButton: typingsSlinky.ejDotWebDotAll.ej.Ribbon.Type.SplitButton with Double = js.native
  /* 4 */ val ToggleButton: typingsSlinky.ejDotWebDotAll.ej.Ribbon.Type.ToggleButton with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.ejDotWebDotAll.ej.Ribbon.Type with Double] = js.native
}

