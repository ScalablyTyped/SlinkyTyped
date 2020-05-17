package typingsSlinky.jointjs.mod.highlighters

import org.scalajs.dom.raw.SVGElement
import typingsSlinky.jointjs.mod.dia.CellView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericHighlighter[K /* <: HighlighterType */] extends js.Object {
  def highlight(cellView: CellView, magnetEl: SVGElement): Unit = js.native
  def highlight(cellView: CellView, magnetEl: SVGElement, opt: GenericHighlighterArguments[K]): Unit = js.native
  def unhighlight(cellView: CellView, magnetEl: SVGElement): Unit = js.native
  def unhighlight(cellView: CellView, magnetEl: SVGElement, opt: GenericHighlighterArguments[K]): Unit = js.native
}

