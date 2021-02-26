package typingsSlinky.reactMdUtils

import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reactMdUtils.reactMdUtilsStrings.height
import typingsSlinky.reactMdUtils.reactMdUtilsStrings.width
import typingsSlinky.reactMdUtils.typesMod.Coords
import typingsSlinky.reactMdUtils.typesMod.FixedPosition
import typingsSlinky.reactMdUtils.typesMod.FixedPositionOptions
import typingsSlinky.reactMdUtils.typesMod.PositionAnchor
import typingsSlinky.std.DOMRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object positioningMod {
  
  @JSImport("@react-md/utils/types/positioning", "ABOVE_CENTER_ANCHOR")
  @js.native
  val ABOVE_CENTER_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "ABOVE_INNER_LEFT_ANCHOR")
  @js.native
  val ABOVE_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "ABOVE_INNER_RIGHT_ANCHOR")
  @js.native
  val ABOVE_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "ABOVE_LEFT_ANCHOR")
  @js.native
  val ABOVE_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "ABOVE_RIGHT_ANCHOR")
  @js.native
  val ABOVE_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "BELOW_CENTER_ANCHOR")
  @js.native
  val BELOW_CENTER_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "BELOW_INNER_LEFT_ANCHOR")
  @js.native
  val BELOW_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "BELOW_INNER_RIGHT_ANCHOR")
  @js.native
  val BELOW_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "BELOW_LEFT_ANCHOR")
  @js.native
  val BELOW_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "BELOW_RIGHT_ANCHOR")
  @js.native
  val BELOW_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "BOTTOM_CENTER_ANCHOR")
  @js.native
  val BOTTOM_CENTER_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "BOTTOM_INNER_LEFT_ANCHOR")
  @js.native
  val BOTTOM_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "BOTTOM_INNER_RIGHT_ANCHOR")
  @js.native
  val BOTTOM_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "BOTTOM_LEFT_ANCHOR")
  @js.native
  val BOTTOM_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "BOTTOM_RIGHT_ANCHOR")
  @js.native
  val BOTTOM_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "CENTER_CENTER_ANCHOR")
  @js.native
  val CENTER_CENTER_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "CENTER_INNER_LEFT_ANCHOR")
  @js.native
  val CENTER_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "CENTER_INNER_RIGHT_ANCHOR")
  @js.native
  val CENTER_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "CENTER_LEFT_ANCHOR")
  @js.native
  val CENTER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "CENTER_RIGHT_ANCHOR")
  @js.native
  val CENTER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "TOP_CENTER_ANCHOR")
  @js.native
  val TOP_CENTER_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "TOP_INNER_LEFT_ANCHOR")
  @js.native
  val TOP_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "TOP_INNER_RIGHT_ANCHOR")
  @js.native
  val TOP_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "TOP_LEFT_ANCHOR")
  @js.native
  val TOP_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "TOP_RIGHT_ANCHOR")
  @js.native
  val TOP_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "findSizingContainer")
  @js.native
  def findSizingContainer(): HTMLElement | Null = js.native
  @JSImport("@react-md/utils/types/positioning", "findSizingContainer")
  @js.native
  def findSizingContainer(el: HTMLElement): HTMLElement | Null = js.native
  
  @JSImport("@react-md/utils/types/positioning", "getElementRect")
  @js.native
  def getElementRect(element: HTMLElement): DOMRect | ClientRect = js.native
  @JSImport("@react-md/utils/types/positioning", "getElementRect")
  @js.native
  def getElementRect(element: HTMLElement, coords: Coords): DOMRect | ClientRect = js.native
  
  @JSImport("@react-md/utils/types/positioning", "getFixedPosition")
  @js.native
  def getFixedPosition(
    hasContainerElementAnchorInitialXInitialYVwMarginVhMarginXMarginYMarginWidthPreventOverlapTransformOriginDisableSwappingDisableVHBounds: FixedPositionOptions
  ): FixedPosition = js.native
  
  @JSImport("@react-md/utils/types/positioning", "getViewportSize")
  @js.native
  def getViewportSize_height(direction: height): Double = js.native
  @JSImport("@react-md/utils/types/positioning", "getViewportSize")
  @js.native
  def getViewportSize_width(direction: width): Double = js.native
}
