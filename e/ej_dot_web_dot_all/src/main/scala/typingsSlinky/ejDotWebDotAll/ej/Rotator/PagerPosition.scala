package typingsSlinky.ejDotWebDotAll.ej.Rotator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PagerPosition extends js.Object

@JSGlobal("ej.Rotator.PagerPosition")
@js.native
object PagerPosition extends js.Object {
  ///string
  @js.native
  sealed trait BottomLeft extends PagerPosition
  
  ///string
  @js.native
  sealed trait BottomRight extends PagerPosition
  
  ///string
  @js.native
  sealed trait Outside extends PagerPosition
  
  ///string
  @js.native
  sealed trait TopCenter extends PagerPosition
  
  ///string
  @js.native
  sealed trait TopLeft extends PagerPosition
  
  ///string
  @js.native
  sealed trait TopRight extends PagerPosition
  
  /* 0 */ val BottomLeft: typingsSlinky.ejDotWebDotAll.ej.Rotator.PagerPosition.BottomLeft with Double = js.native
  /* 1 */ val BottomRight: typingsSlinky.ejDotWebDotAll.ej.Rotator.PagerPosition.BottomRight with Double = js.native
  /* 2 */ val Outside: typingsSlinky.ejDotWebDotAll.ej.Rotator.PagerPosition.Outside with Double = js.native
  /* 3 */ val TopCenter: typingsSlinky.ejDotWebDotAll.ej.Rotator.PagerPosition.TopCenter with Double = js.native
  /* 4 */ val TopLeft: typingsSlinky.ejDotWebDotAll.ej.Rotator.PagerPosition.TopLeft with Double = js.native
  /* 5 */ val TopRight: typingsSlinky.ejDotWebDotAll.ej.Rotator.PagerPosition.TopRight with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PagerPosition with Double] = js.native
}

