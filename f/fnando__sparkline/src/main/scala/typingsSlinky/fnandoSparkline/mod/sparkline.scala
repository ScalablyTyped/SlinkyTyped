package typingsSlinky.fnandoSparkline.mod

import org.scalajs.dom.raw.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fnando/sparkline", "sparkline")
@js.native
object sparkline extends js.Object {
  
  def apply[TEntry /* <: SparklineNativeEntry */](svg: SVGSVGElement, entries: js.Array[TEntry]): String = js.native
  def apply[TEntry /* <: SparklineNativeEntry */](svg: SVGSVGElement, entries: js.Array[TEntry], options: SparklineNativeOptions[TEntry]): String = js.native
  def apply[TEntry](svg: SVGSVGElement, entries: js.Array[TEntry], options: SparklineNonNativeOptions[TEntry]): String = js.native
}
