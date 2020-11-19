package typingsSlinky.officeUiFabricReact.indexMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.officeUiFabricReact.directionalHintMod.DirectionalHint
import typingsSlinky.officeUiFabricReact.positioningPositioningMod.IElementPosition
import typingsSlinky.officeUiFabricReact.positioningPositioningMod.IElementPositionInfo
import typingsSlinky.officeUiFabricReact.positioningTypesMod.ICalloutBeakPositionedInfo
import typingsSlinky.officeUiFabricReact.positioningTypesMod.IPositionDirectionalHintData
import typingsSlinky.officeUiFabricReact.positioningTypesMod.IPositionedData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/utilities/positioning/index", "__positioningTestPackage")
@js.native
object positioningTestPackage extends js.Object {
  
  var _calculateActualBeakWidthInPixels: js.Function1[/* beakWidth */ Double, Double] = js.native
  
  var _finalizeBeakPosition: js.Function3[
    /* elementPosition */ IElementPosition, 
    /* positionedBeak */ typingsSlinky.officeUiFabricReact.positioningPositioningMod.Rectangle, 
    /* bounds */ js.UndefOr[typingsSlinky.officeUiFabricReact.positioningPositioningMod.Rectangle], 
    ICalloutBeakPositionedInfo
  ] = js.native
  
  var _finalizePositionData: js.Function5[
    /* positionedElement */ IElementPosition, 
    /* hostElement */ HTMLElement, 
    /* bounds */ js.UndefOr[typingsSlinky.officeUiFabricReact.positioningPositioningMod.Rectangle], 
    /* coverTarget */ js.UndefOr[Boolean], 
    /* doNotFinalizeReturnEdge */ js.UndefOr[Boolean], 
    IPositionedData
  ] = js.native
  
  var _getMaxHeightFromTargetRectangle: js.Function5[
    /* targetRectangle */ typingsSlinky.officeUiFabricReact.positioningPositioningMod.Rectangle, 
    /* targetEdge */ DirectionalHint, 
    /* gapSpace */ Double, 
    /* bounds */ typingsSlinky.officeUiFabricReact.positioningPositioningMod.Rectangle, 
    /* coverTarget */ js.UndefOr[Boolean], 
    Double
  ] = js.native
  
  var _getPositionData: js.Function3[
    /* directionalHint */ js.UndefOr[DirectionalHint], 
    /* directionalHintForRTL */ js.UndefOr[DirectionalHint], 
    /* previousPositions */ js.UndefOr[IPositionDirectionalHintData], 
    IPositionDirectionalHintData
  ] = js.native
  
  var _positionBeak: js.Function2[
    /* beakWidth */ Double, 
    /* elementPosition */ IElementPositionInfo, 
    typingsSlinky.officeUiFabricReact.positioningPositioningMod.Rectangle
  ] = js.native
  
  var _positionElementWithinBounds: js.Function7[
    /* elementToPosition */ typingsSlinky.officeUiFabricReact.positioningPositioningMod.Rectangle, 
    /* target */ typingsSlinky.officeUiFabricReact.positioningPositioningMod.Rectangle, 
    /* bounding */ typingsSlinky.officeUiFabricReact.positioningPositioningMod.Rectangle, 
    /* positionData */ IPositionDirectionalHintData, 
    /* gap */ Double, 
    /* directionalHintFixed */ js.UndefOr[Boolean], 
    /* coverTarget */ js.UndefOr[Boolean], 
    IElementPosition
  ] = js.native
}
