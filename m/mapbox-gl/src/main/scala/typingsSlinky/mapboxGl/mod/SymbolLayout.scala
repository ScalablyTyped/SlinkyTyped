package typingsSlinky.mapboxGl.mod

import typingsSlinky.mapboxGl.mapboxGlStrings.`line-center`
import typingsSlinky.mapboxGl.mapboxGlStrings.`viewport-y`
import typingsSlinky.mapboxGl.mapboxGlStrings.auto
import typingsSlinky.mapboxGl.mapboxGlStrings.both
import typingsSlinky.mapboxGl.mapboxGlStrings.center
import typingsSlinky.mapboxGl.mapboxGlStrings.height
import typingsSlinky.mapboxGl.mapboxGlStrings.horizontal
import typingsSlinky.mapboxGl.mapboxGlStrings.left
import typingsSlinky.mapboxGl.mapboxGlStrings.line
import typingsSlinky.mapboxGl.mapboxGlStrings.lowercase
import typingsSlinky.mapboxGl.mapboxGlStrings.map
import typingsSlinky.mapboxGl.mapboxGlStrings.none
import typingsSlinky.mapboxGl.mapboxGlStrings.point
import typingsSlinky.mapboxGl.mapboxGlStrings.right
import typingsSlinky.mapboxGl.mapboxGlStrings.source_
import typingsSlinky.mapboxGl.mapboxGlStrings.uppercase
import typingsSlinky.mapboxGl.mapboxGlStrings.vertical
import typingsSlinky.mapboxGl.mapboxGlStrings.viewport
import typingsSlinky.mapboxGl.mapboxGlStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SymbolLayout
  extends Layout
     with _AnyLayout {
  
  var `icon-allow-overlap`: js.UndefOr[Boolean | StyleFunction | Expression] = js.native
  
  var `icon-anchor`: js.UndefOr[Anchor | StyleFunction | Expression] = js.native
  
  var `icon-ignore-placement`: js.UndefOr[Boolean] = js.native
  
  var `icon-image`: js.UndefOr[String | StyleFunction | Expression] = js.native
  
  var `icon-keep-upright`: js.UndefOr[Boolean] = js.native
  
  var `icon-offset`: js.UndefOr[js.Array[Double] | StyleFunction | Expression] = js.native
  
  var `icon-optional`: js.UndefOr[Boolean] = js.native
  
  var `icon-padding`: js.UndefOr[Double | Expression] = js.native
  
  var `icon-pitch-alignment`: js.UndefOr[map | viewport | auto] = js.native
  
  var `icon-rotate`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  
  var `icon-rotation-alignment`: js.UndefOr[map | viewport | auto] = js.native
  
  var `icon-size`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  
  var `icon-text-fit`: js.UndefOr[none | both | width | height] = js.native
  
  var `icon-text-fit-padding`: js.UndefOr[js.Array[Double] | Expression] = js.native
  
  var `symbol-avoid-edges`: js.UndefOr[Boolean] = js.native
  
  var `symbol-placement`: js.UndefOr[point | line | `line-center`] = js.native
  
  var `symbol-sort-key`: js.UndefOr[Double | Expression] = js.native
  
  var `symbol-spacing`: js.UndefOr[Double | Expression] = js.native
  
  var `symbol-z-order`: js.UndefOr[`viewport-y` | source_] = js.native
  
  var `text-allow-overlap`: js.UndefOr[Boolean] = js.native
  
  var `text-anchor`: js.UndefOr[Anchor | StyleFunction | Expression] = js.native
  
  var `text-field`: js.UndefOr[String | StyleFunction | Expression] = js.native
  
  var `text-font`: js.UndefOr[String | js.Array[String] | Expression] = js.native
  
  var `text-ignore-placement`: js.UndefOr[Boolean] = js.native
  
  var `text-justify`: js.UndefOr[left | center | right | Expression] = js.native
  
  var `text-keep-upright`: js.UndefOr[Boolean] = js.native
  
  var `text-letter-spacing`: js.UndefOr[Double | Expression] = js.native
  
  var `text-line-height`: js.UndefOr[Double | Expression] = js.native
  
  var `text-max-angle`: js.UndefOr[Double | Expression] = js.native
  
  var `text-max-width`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  
  var `text-offset`: js.UndefOr[js.Array[Double] | Expression] = js.native
  
  var `text-optional`: js.UndefOr[Boolean] = js.native
  
  var `text-padding`: js.UndefOr[Double | Expression] = js.native
  
  var `text-pitch-alignment`: js.UndefOr[map | viewport | auto] = js.native
  
  var `text-radial-offset`: js.UndefOr[Double | Expression] = js.native
  
  var `text-rotate`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  
  var `text-rotation-alignment`: js.UndefOr[map | viewport | auto] = js.native
  
  var `text-size`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  
  var `text-transform`: js.UndefOr[none | uppercase | lowercase | StyleFunction | Expression] = js.native
  
  var `text-variable-anchor`: js.UndefOr[js.Array[Anchor]] = js.native
  
  var `text-writing-mode`: js.UndefOr[js.Array[horizontal | vertical]] = js.native
}
object SymbolLayout {
  
  @scala.inline
  def apply(): SymbolLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SymbolLayout]
  }
  
  @scala.inline
  implicit class SymbolLayoutMutableBuilder[Self <: SymbolLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setIcon-allow-overlap`(value: Boolean | StyleFunction | Expression): Self = StObject.set(x, "icon-allow-overlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIcon-allow-overlapUndefined`: Self = StObject.set(x, "icon-allow-overlap", js.undefined)
    
    @scala.inline
    def `setIcon-anchor`(value: Anchor | StyleFunction | Expression): Self = StObject.set(x, "icon-anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIcon-anchorUndefined`: Self = StObject.set(x, "icon-anchor", js.undefined)
    
    @scala.inline
    def `setIcon-ignore-placement`(value: Boolean): Self = StObject.set(x, "icon-ignore-placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIcon-ignore-placementUndefined`: Self = StObject.set(x, "icon-ignore-placement", js.undefined)
    
    @scala.inline
    def `setIcon-image`(value: String | StyleFunction | Expression): Self = StObject.set(x, "icon-image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIcon-imageUndefined`: Self = StObject.set(x, "icon-image", js.undefined)
    
    @scala.inline
    def `setIcon-keep-upright`(value: Boolean): Self = StObject.set(x, "icon-keep-upright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIcon-keep-uprightUndefined`: Self = StObject.set(x, "icon-keep-upright", js.undefined)
    
    @scala.inline
    def `setIcon-offset`(value: js.Array[Double] | StyleFunction | Expression): Self = StObject.set(x, "icon-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIcon-offsetUndefined`: Self = StObject.set(x, "icon-offset", js.undefined)
    
    @scala.inline
    def `setIcon-offsetVarargs`(value: Double*): Self = StObject.set(x, "icon-offset", js.Array(value :_*))
    
    @scala.inline
    def `setIcon-optional`(value: Boolean): Self = StObject.set(x, "icon-optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIcon-optionalUndefined`: Self = StObject.set(x, "icon-optional", js.undefined)
    
    @scala.inline
    def `setIcon-padding`(value: Double | Expression): Self = StObject.set(x, "icon-padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIcon-paddingUndefined`: Self = StObject.set(x, "icon-padding", js.undefined)
    
    @scala.inline
    def `setIcon-pitch-alignment`(value: map | viewport | auto): Self = StObject.set(x, "icon-pitch-alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIcon-pitch-alignmentUndefined`: Self = StObject.set(x, "icon-pitch-alignment", js.undefined)
    
    @scala.inline
    def `setIcon-rotate`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "icon-rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIcon-rotateUndefined`: Self = StObject.set(x, "icon-rotate", js.undefined)
    
    @scala.inline
    def `setIcon-rotation-alignment`(value: map | viewport | auto): Self = StObject.set(x, "icon-rotation-alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIcon-rotation-alignmentUndefined`: Self = StObject.set(x, "icon-rotation-alignment", js.undefined)
    
    @scala.inline
    def `setIcon-size`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "icon-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIcon-sizeUndefined`: Self = StObject.set(x, "icon-size", js.undefined)
    
    @scala.inline
    def `setIcon-text-fit`(value: none | both | width | height): Self = StObject.set(x, "icon-text-fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIcon-text-fit-padding`(value: js.Array[Double] | Expression): Self = StObject.set(x, "icon-text-fit-padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIcon-text-fit-paddingUndefined`: Self = StObject.set(x, "icon-text-fit-padding", js.undefined)
    
    @scala.inline
    def `setIcon-text-fit-paddingVarargs`(value: Double*): Self = StObject.set(x, "icon-text-fit-padding", js.Array(value :_*))
    
    @scala.inline
    def `setIcon-text-fitUndefined`: Self = StObject.set(x, "icon-text-fit", js.undefined)
    
    @scala.inline
    def `setSymbol-avoid-edges`(value: Boolean): Self = StObject.set(x, "symbol-avoid-edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSymbol-avoid-edgesUndefined`: Self = StObject.set(x, "symbol-avoid-edges", js.undefined)
    
    @scala.inline
    def `setSymbol-placement`(value: point | line | `line-center`): Self = StObject.set(x, "symbol-placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSymbol-placementUndefined`: Self = StObject.set(x, "symbol-placement", js.undefined)
    
    @scala.inline
    def `setSymbol-sort-key`(value: Double | Expression): Self = StObject.set(x, "symbol-sort-key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSymbol-sort-keyUndefined`: Self = StObject.set(x, "symbol-sort-key", js.undefined)
    
    @scala.inline
    def `setSymbol-spacing`(value: Double | Expression): Self = StObject.set(x, "symbol-spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSymbol-spacingUndefined`: Self = StObject.set(x, "symbol-spacing", js.undefined)
    
    @scala.inline
    def `setSymbol-z-order`(value: `viewport-y` | source_): Self = StObject.set(x, "symbol-z-order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSymbol-z-orderUndefined`: Self = StObject.set(x, "symbol-z-order", js.undefined)
    
    @scala.inline
    def `setText-allow-overlap`(value: Boolean): Self = StObject.set(x, "text-allow-overlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-allow-overlapUndefined`: Self = StObject.set(x, "text-allow-overlap", js.undefined)
    
    @scala.inline
    def `setText-anchor`(value: Anchor | StyleFunction | Expression): Self = StObject.set(x, "text-anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-anchorUndefined`: Self = StObject.set(x, "text-anchor", js.undefined)
    
    @scala.inline
    def `setText-field`(value: String | StyleFunction | Expression): Self = StObject.set(x, "text-field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-fieldUndefined`: Self = StObject.set(x, "text-field", js.undefined)
    
    @scala.inline
    def `setText-font`(value: String | js.Array[String] | Expression): Self = StObject.set(x, "text-font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-fontUndefined`: Self = StObject.set(x, "text-font", js.undefined)
    
    @scala.inline
    def `setText-fontVarargs`(value: String*): Self = StObject.set(x, "text-font", js.Array(value :_*))
    
    @scala.inline
    def `setText-ignore-placement`(value: Boolean): Self = StObject.set(x, "text-ignore-placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-ignore-placementUndefined`: Self = StObject.set(x, "text-ignore-placement", js.undefined)
    
    @scala.inline
    def `setText-justify`(value: left | center | right | Expression): Self = StObject.set(x, "text-justify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-justifyUndefined`: Self = StObject.set(x, "text-justify", js.undefined)
    
    @scala.inline
    def `setText-keep-upright`(value: Boolean): Self = StObject.set(x, "text-keep-upright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-keep-uprightUndefined`: Self = StObject.set(x, "text-keep-upright", js.undefined)
    
    @scala.inline
    def `setText-letter-spacing`(value: Double | Expression): Self = StObject.set(x, "text-letter-spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-letter-spacingUndefined`: Self = StObject.set(x, "text-letter-spacing", js.undefined)
    
    @scala.inline
    def `setText-line-height`(value: Double | Expression): Self = StObject.set(x, "text-line-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-line-heightUndefined`: Self = StObject.set(x, "text-line-height", js.undefined)
    
    @scala.inline
    def `setText-max-angle`(value: Double | Expression): Self = StObject.set(x, "text-max-angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-max-angleUndefined`: Self = StObject.set(x, "text-max-angle", js.undefined)
    
    @scala.inline
    def `setText-max-width`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "text-max-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-max-widthUndefined`: Self = StObject.set(x, "text-max-width", js.undefined)
    
    @scala.inline
    def `setText-offset`(value: js.Array[Double] | Expression): Self = StObject.set(x, "text-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-offsetUndefined`: Self = StObject.set(x, "text-offset", js.undefined)
    
    @scala.inline
    def `setText-offsetVarargs`(value: Double*): Self = StObject.set(x, "text-offset", js.Array(value :_*))
    
    @scala.inline
    def `setText-optional`(value: Boolean): Self = StObject.set(x, "text-optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-optionalUndefined`: Self = StObject.set(x, "text-optional", js.undefined)
    
    @scala.inline
    def `setText-padding`(value: Double | Expression): Self = StObject.set(x, "text-padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-paddingUndefined`: Self = StObject.set(x, "text-padding", js.undefined)
    
    @scala.inline
    def `setText-pitch-alignment`(value: map | viewport | auto): Self = StObject.set(x, "text-pitch-alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-pitch-alignmentUndefined`: Self = StObject.set(x, "text-pitch-alignment", js.undefined)
    
    @scala.inline
    def `setText-radial-offset`(value: Double | Expression): Self = StObject.set(x, "text-radial-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-radial-offsetUndefined`: Self = StObject.set(x, "text-radial-offset", js.undefined)
    
    @scala.inline
    def `setText-rotate`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "text-rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-rotateUndefined`: Self = StObject.set(x, "text-rotate", js.undefined)
    
    @scala.inline
    def `setText-rotation-alignment`(value: map | viewport | auto): Self = StObject.set(x, "text-rotation-alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-rotation-alignmentUndefined`: Self = StObject.set(x, "text-rotation-alignment", js.undefined)
    
    @scala.inline
    def `setText-size`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "text-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-sizeUndefined`: Self = StObject.set(x, "text-size", js.undefined)
    
    @scala.inline
    def `setText-transform`(value: none | uppercase | lowercase | StyleFunction | Expression): Self = StObject.set(x, "text-transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-transformUndefined`: Self = StObject.set(x, "text-transform", js.undefined)
    
    @scala.inline
    def `setText-variable-anchor`(value: js.Array[Anchor]): Self = StObject.set(x, "text-variable-anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-variable-anchorUndefined`: Self = StObject.set(x, "text-variable-anchor", js.undefined)
    
    @scala.inline
    def `setText-variable-anchorVarargs`(value: Anchor*): Self = StObject.set(x, "text-variable-anchor", js.Array(value :_*))
    
    @scala.inline
    def `setText-writing-mode`(value: js.Array[horizontal | vertical]): Self = StObject.set(x, "text-writing-mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-writing-modeUndefined`: Self = StObject.set(x, "text-writing-mode", js.undefined)
    
    @scala.inline
    def `setText-writing-modeVarargs`(value: (horizontal | vertical)*): Self = StObject.set(x, "text-writing-mode", js.Array(value :_*))
  }
}
