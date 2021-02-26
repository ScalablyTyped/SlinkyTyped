package typingsSlinky.chartJs.mod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("chart.js", "Chart")
@js.native
class ChartCls protected ()
  extends typingsSlinky.chartJs.mod.Chart {
  def this(context: String, options: ChartConfiguration) = this()
  def this(context: CanvasRenderingContext2D, options: ChartConfiguration) = this()
  def this(context: HTMLCanvasElement, options: ChartConfiguration) = this()
  def this(context: ArrayLike[CanvasRenderingContext2D | HTMLCanvasElement], options: ChartConfiguration) = this()
}
