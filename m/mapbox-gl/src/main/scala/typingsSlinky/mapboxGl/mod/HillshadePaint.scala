package typingsSlinky.mapboxGl.mod

import typingsSlinky.mapboxGl.mapboxGlStrings.map
import typingsSlinky.mapboxGl.mapboxGlStrings.viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HillshadePaint extends AnyPaint {
  
  var `hillshade-accent-color`: js.UndefOr[String | Expression] = js.native
  
  var `hillshade-accent-color-transition`: js.UndefOr[Transition] = js.native
  
  var `hillshade-exaggeration`: js.UndefOr[Double | Expression] = js.native
  
  var `hillshade-exaggeration-transition`: js.UndefOr[Transition] = js.native
  
  var `hillshade-highlight-color`: js.UndefOr[String | Expression] = js.native
  
  var `hillshade-highlight-color-transition`: js.UndefOr[Transition] = js.native
  
  var `hillshade-illumination-anchor`: js.UndefOr[map | viewport] = js.native
  
  var `hillshade-illumination-direction`: js.UndefOr[Double | Expression] = js.native
  
  var `hillshade-shadow-color`: js.UndefOr[String | Expression] = js.native
  
  var `hillshade-shadow-color-transition`: js.UndefOr[Transition] = js.native
}
object HillshadePaint {
  
  @scala.inline
  def apply(): HillshadePaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HillshadePaint]
  }
  
  @scala.inline
  implicit class HillshadePaintMutableBuilder[Self <: HillshadePaint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setHillshade-accent-color`(value: String | Expression): Self = StObject.set(x, "hillshade-accent-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHillshade-accent-color-transition`(value: Transition): Self = StObject.set(x, "hillshade-accent-color-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHillshade-accent-color-transitionUndefined`: Self = StObject.set(x, "hillshade-accent-color-transition", js.undefined)
    
    @scala.inline
    def `setHillshade-accent-colorUndefined`: Self = StObject.set(x, "hillshade-accent-color", js.undefined)
    
    @scala.inline
    def `setHillshade-exaggeration`(value: Double | Expression): Self = StObject.set(x, "hillshade-exaggeration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHillshade-exaggeration-transition`(value: Transition): Self = StObject.set(x, "hillshade-exaggeration-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHillshade-exaggeration-transitionUndefined`: Self = StObject.set(x, "hillshade-exaggeration-transition", js.undefined)
    
    @scala.inline
    def `setHillshade-exaggerationUndefined`: Self = StObject.set(x, "hillshade-exaggeration", js.undefined)
    
    @scala.inline
    def `setHillshade-highlight-color`(value: String | Expression): Self = StObject.set(x, "hillshade-highlight-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHillshade-highlight-color-transition`(value: Transition): Self = StObject.set(x, "hillshade-highlight-color-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHillshade-highlight-color-transitionUndefined`: Self = StObject.set(x, "hillshade-highlight-color-transition", js.undefined)
    
    @scala.inline
    def `setHillshade-highlight-colorUndefined`: Self = StObject.set(x, "hillshade-highlight-color", js.undefined)
    
    @scala.inline
    def `setHillshade-illumination-anchor`(value: map | viewport): Self = StObject.set(x, "hillshade-illumination-anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHillshade-illumination-anchorUndefined`: Self = StObject.set(x, "hillshade-illumination-anchor", js.undefined)
    
    @scala.inline
    def `setHillshade-illumination-direction`(value: Double | Expression): Self = StObject.set(x, "hillshade-illumination-direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHillshade-illumination-directionUndefined`: Self = StObject.set(x, "hillshade-illumination-direction", js.undefined)
    
    @scala.inline
    def `setHillshade-shadow-color`(value: String | Expression): Self = StObject.set(x, "hillshade-shadow-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHillshade-shadow-color-transition`(value: Transition): Self = StObject.set(x, "hillshade-shadow-color-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHillshade-shadow-color-transitionUndefined`: Self = StObject.set(x, "hillshade-shadow-color-transition", js.undefined)
    
    @scala.inline
    def `setHillshade-shadow-colorUndefined`: Self = StObject.set(x, "hillshade-shadow-color", js.undefined)
  }
}
