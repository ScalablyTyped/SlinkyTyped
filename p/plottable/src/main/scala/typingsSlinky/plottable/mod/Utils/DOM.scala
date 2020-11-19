package typingsSlinky.plottable.mod.Utils

import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGRect
import typingsSlinky.d3Selection.mod.Selection_
import typingsSlinky.plottable.anon.Left
import typingsSlinky.plottable.interfacesMod.IEntityBounds
import typingsSlinky.plottable.interfacesMod.Range
import typingsSlinky.plottable.interfacesMod.SimpleSelection
import typingsSlinky.plottable.mathUtilsMod.ICssTransformMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable", "Utils.DOM")
@js.native
object DOM extends js.Object {
  
  var SCREEN_REFRESH_RATE_MILLISECONDS: Double = js.native
  
  def clientRectInside(innerClientRect: ClientRect, outerClientRect: ClientRect): Boolean = js.native
  
  def clientRectsOverlap(clientRectA: ClientRect, clientRectB: ClientRect): Boolean = js.native
  
  def contains(parent: Element, child: Element): Boolean = js.native
  
  def elementBBox(element: SimpleSelection[_]): SVGRect = js.native
  
  def elementHeight(elementOrSelection: Selection_[Element, _, _, _]): Double = js.native
  def elementHeight(elementOrSelection: Element): Double = js.native
  
  def elementWidth(elementOrSelection: Selection_[Element, _, _, _]): Double = js.native
  def elementWidth(elementOrSelection: Element): Double = js.native
  
  def entityBounds(element: Element): IEntityBounds = js.native
  
  def expandRect(rect: ClientRect, amount: Double): Left = js.native
  
  def getElementTransform(elem: Element): ICssTransformMatrix | Null = js.native
  
  def getHtmlElementAncestors(elem: Element): js.Array[HTMLElement] = js.native
  
  def getRotate(el: SimpleSelection[_]): Double = js.native
  
  def getScaleValues(el: SimpleSelection[_]): js.Tuple2[Double, Double] = js.native
  
  def getTranslateValues(el: SimpleSelection[_]): js.Tuple2[Double, Double] = js.native
  
  def intersectsBBox(xValOrRange: Double, yValOrRange: Double, bbox: SVGRect): Boolean = js.native
  def intersectsBBox(xValOrRange: Double, yValOrRange: Double, bbox: SVGRect, tolerance: Double): Boolean = js.native
  def intersectsBBox(xValOrRange: Double, yValOrRange: Range, bbox: SVGRect): Boolean = js.native
  def intersectsBBox(xValOrRange: Double, yValOrRange: Range, bbox: SVGRect, tolerance: Double): Boolean = js.native
  def intersectsBBox(xValOrRange: Range, yValOrRange: Double, bbox: SVGRect): Boolean = js.native
  def intersectsBBox(xValOrRange: Range, yValOrRange: Double, bbox: SVGRect, tolerance: Double): Boolean = js.native
  def intersectsBBox(xValOrRange: Range, yValOrRange: Range, bbox: SVGRect): Boolean = js.native
  def intersectsBBox(xValOrRange: Range, yValOrRange: Range, bbox: SVGRect, tolerance: Double): Boolean = js.native
  
  def requestAnimationFramePolyfill(callback: js.Function0[Unit]): Unit = js.native
}
