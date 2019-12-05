package typingsSlinky.ejDotWebDotAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait headerOption extends js.Object

@JSGlobal("ej.headerOption")
@js.native
object headerOption extends js.Object {
  @js.native
  sealed trait row extends headerOption
  
  @js.native
  sealed trait tHead extends headerOption
  
  /* 0 */ val row: typingsSlinky.ejDotWebDotAll.ej.headerOption.row with Double = js.native
  /* 1 */ val tHead: typingsSlinky.ejDotWebDotAll.ej.headerOption.tHead with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[headerOption with Double] = js.native
}

