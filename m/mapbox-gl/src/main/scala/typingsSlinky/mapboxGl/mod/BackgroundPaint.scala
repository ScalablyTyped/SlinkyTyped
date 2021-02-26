package typingsSlinky.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundPaint extends AnyPaint {
  
  var `background-color`: js.UndefOr[String | Expression] = js.native
  
  var `background-color-transition`: js.UndefOr[Transition] = js.native
  
  var `background-opacity`: js.UndefOr[Double | Expression] = js.native
  
  var `background-opacity-transition`: js.UndefOr[Transition] = js.native
  
  var `background-pattern`: js.UndefOr[String] = js.native
  
  var `background-pattern-transition`: js.UndefOr[Transition] = js.native
}
object BackgroundPaint {
  
  @scala.inline
  def apply(): BackgroundPaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundPaint]
  }
  
  @scala.inline
  implicit class BackgroundPaintMutableBuilder[Self <: BackgroundPaint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setBackground-color`(value: String | Expression): Self = StObject.set(x, "background-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-color-transition`(value: Transition): Self = StObject.set(x, "background-color-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-color-transitionUndefined`: Self = StObject.set(x, "background-color-transition", js.undefined)
    
    @scala.inline
    def `setBackground-colorUndefined`: Self = StObject.set(x, "background-color", js.undefined)
    
    @scala.inline
    def `setBackground-opacity`(value: Double | Expression): Self = StObject.set(x, "background-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-opacity-transition`(value: Transition): Self = StObject.set(x, "background-opacity-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-opacity-transitionUndefined`: Self = StObject.set(x, "background-opacity-transition", js.undefined)
    
    @scala.inline
    def `setBackground-opacityUndefined`: Self = StObject.set(x, "background-opacity", js.undefined)
    
    @scala.inline
    def `setBackground-pattern`(value: String): Self = StObject.set(x, "background-pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-pattern-transition`(value: Transition): Self = StObject.set(x, "background-pattern-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-pattern-transitionUndefined`: Self = StObject.set(x, "background-pattern-transition", js.undefined)
    
    @scala.inline
    def `setBackground-patternUndefined`: Self = StObject.set(x, "background-pattern", js.undefined)
  }
}
