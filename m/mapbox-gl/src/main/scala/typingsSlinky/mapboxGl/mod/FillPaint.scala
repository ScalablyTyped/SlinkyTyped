package typingsSlinky.mapboxGl.mod

import typingsSlinky.mapboxGl.mapboxGlStrings.map
import typingsSlinky.mapboxGl.mapboxGlStrings.viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FillPaint extends AnyPaint {
  
  var `fill-antialias`: js.UndefOr[Boolean | Expression] = js.native
  
  var `fill-color`: js.UndefOr[String | StyleFunction | Expression] = js.native
  
  var `fill-color-transition`: js.UndefOr[Transition] = js.native
  
  var `fill-opacity`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  
  var `fill-opacity-transition`: js.UndefOr[Transition] = js.native
  
  var `fill-outline-color`: js.UndefOr[String | StyleFunction | Expression] = js.native
  
  var `fill-outline-color-transition`: js.UndefOr[Transition] = js.native
  
  var `fill-pattern`: js.UndefOr[String | Expression] = js.native
  
  var `fill-pattern-transition`: js.UndefOr[Transition] = js.native
  
  var `fill-translate`: js.UndefOr[js.Array[Double]] = js.native
  
  var `fill-translate-anchor`: js.UndefOr[map | viewport] = js.native
  
  var `fill-translate-transition`: js.UndefOr[Transition] = js.native
}
object FillPaint {
  
  @scala.inline
  def apply(): FillPaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillPaint]
  }
  
  @scala.inline
  implicit class FillPaintMutableBuilder[Self <: FillPaint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setFill-antialias`(value: Boolean | Expression): Self = StObject.set(x, "fill-antialias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-antialiasUndefined`: Self = StObject.set(x, "fill-antialias", js.undefined)
    
    @scala.inline
    def `setFill-color`(value: String | StyleFunction | Expression): Self = StObject.set(x, "fill-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-color-transition`(value: Transition): Self = StObject.set(x, "fill-color-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-color-transitionUndefined`: Self = StObject.set(x, "fill-color-transition", js.undefined)
    
    @scala.inline
    def `setFill-colorUndefined`: Self = StObject.set(x, "fill-color", js.undefined)
    
    @scala.inline
    def `setFill-opacity`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "fill-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-opacity-transition`(value: Transition): Self = StObject.set(x, "fill-opacity-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-opacity-transitionUndefined`: Self = StObject.set(x, "fill-opacity-transition", js.undefined)
    
    @scala.inline
    def `setFill-opacityUndefined`: Self = StObject.set(x, "fill-opacity", js.undefined)
    
    @scala.inline
    def `setFill-outline-color`(value: String | StyleFunction | Expression): Self = StObject.set(x, "fill-outline-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-outline-color-transition`(value: Transition): Self = StObject.set(x, "fill-outline-color-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-outline-color-transitionUndefined`: Self = StObject.set(x, "fill-outline-color-transition", js.undefined)
    
    @scala.inline
    def `setFill-outline-colorUndefined`: Self = StObject.set(x, "fill-outline-color", js.undefined)
    
    @scala.inline
    def `setFill-pattern`(value: String | Expression): Self = StObject.set(x, "fill-pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-pattern-transition`(value: Transition): Self = StObject.set(x, "fill-pattern-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-pattern-transitionUndefined`: Self = StObject.set(x, "fill-pattern-transition", js.undefined)
    
    @scala.inline
    def `setFill-patternUndefined`: Self = StObject.set(x, "fill-pattern", js.undefined)
    
    @scala.inline
    def `setFill-translate`(value: js.Array[Double]): Self = StObject.set(x, "fill-translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-translate-anchor`(value: map | viewport): Self = StObject.set(x, "fill-translate-anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-translate-anchorUndefined`: Self = StObject.set(x, "fill-translate-anchor", js.undefined)
    
    @scala.inline
    def `setFill-translate-transition`(value: Transition): Self = StObject.set(x, "fill-translate-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-translate-transitionUndefined`: Self = StObject.set(x, "fill-translate-transition", js.undefined)
    
    @scala.inline
    def `setFill-translateUndefined`: Self = StObject.set(x, "fill-translate", js.undefined)
    
    @scala.inline
    def `setFill-translateVarargs`(value: Double*): Self = StObject.set(x, "fill-translate", js.Array(value :_*))
  }
}
