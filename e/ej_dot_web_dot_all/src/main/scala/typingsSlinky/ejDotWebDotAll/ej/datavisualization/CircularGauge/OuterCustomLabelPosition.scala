package typingsSlinky.ejDotWebDotAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OuterCustomLabelPosition extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.OuterCustomLabelPosition")
@js.native
object OuterCustomLabelPosition extends js.Object {
  //string
  @js.native
  sealed trait Bottom extends OuterCustomLabelPosition
  
  //string
  @js.native
  sealed trait Left extends OuterCustomLabelPosition
  
  //string
  @js.native
  sealed trait Right extends OuterCustomLabelPosition
  
  //string
  @js.native
  sealed trait Top extends OuterCustomLabelPosition
  
  /* 1 */ val Bottom: typingsSlinky.ejDotWebDotAll.ej.datavisualization.CircularGauge.OuterCustomLabelPosition.Bottom with Double = js.native
  /* 3 */ val Left: typingsSlinky.ejDotWebDotAll.ej.datavisualization.CircularGauge.OuterCustomLabelPosition.Left with Double = js.native
  /* 2 */ val Right: typingsSlinky.ejDotWebDotAll.ej.datavisualization.CircularGauge.OuterCustomLabelPosition.Right with Double = js.native
  /* 0 */ val Top: typingsSlinky.ejDotWebDotAll.ej.datavisualization.CircularGauge.OuterCustomLabelPosition.Top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OuterCustomLabelPosition with Double] = js.native
}

