package typingsSlinky.ejDotWebDotAll.ej.datavisualization.Sunburst

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstTheme extends js.Object

@JSGlobal("ej.datavisualization.Sunburst.SunburstTheme")
@js.native
object SunburstTheme extends js.Object {
  //string
  @js.native
  sealed trait FlatDark extends SunburstTheme
  
  //string
  @js.native
  sealed trait FlatLight extends SunburstTheme
  
  /* 1 */ val FlatDark: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Sunburst.SunburstTheme.FlatDark with Double = js.native
  /* 0 */ val FlatLight: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Sunburst.SunburstTheme.FlatLight with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SunburstTheme with Double] = js.native
}

