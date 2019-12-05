package typingsSlinky.ejDotWebDotAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterType extends js.Object

@JSGlobal("ej.Grid.FilterType")
@js.native
object FilterType extends js.Object {
  ///Specifies the filter type as excel.
  @js.native
  sealed trait Excel
    extends typingsSlinky.ejDotWebDotAll.ej.Grid.FilterType
  
  ///Specifies the filter type as menu.
  @js.native
  sealed trait Menu
    extends typingsSlinky.ejDotWebDotAll.ej.Grid.FilterType
  
  /* 1 */ val Excel: typingsSlinky.ejDotWebDotAll.ej.Grid.FilterType.Excel with Double = js.native
  /* 0 */ val Menu: typingsSlinky.ejDotWebDotAll.ej.Grid.FilterType.Menu with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.ejDotWebDotAll.ej.Grid.FilterType with Double] = js.native
}

