package typingsSlinky.gsap.gsap

import typingsSlinky.gsap.gsapStrings.both
import typingsSlinky.gsap.gsapStrings.in
import typingsSlinky.gsap.gsapStrings.none
import typingsSlinky.gsap.gsapStrings.out
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoughEaseConfig extends StObject {
  
  var clamp: js.UndefOr[Boolean] = js.native
  
  var points: js.UndefOr[Double] = js.native
  
  var randomize: js.UndefOr[Boolean] = js.native
  
  var strength: js.UndefOr[Double] = js.native
  
  var taper: js.UndefOr[in | out | both | none] = js.native
  
  var template: js.UndefOr[Ease] = js.native
}
object RoughEaseConfig {
  
  @scala.inline
  def apply(): RoughEaseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoughEaseConfig]
  }
  
  @scala.inline
  implicit class RoughEaseConfigMutableBuilder[Self <: RoughEaseConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClamp(value: Boolean): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClampUndefined: Self = StObject.set(x, "clamp", js.undefined)
    
    @scala.inline
    def setPoints(value: Double): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    @scala.inline
    def setRandomize(value: Boolean): Self = StObject.set(x, "randomize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRandomizeUndefined: Self = StObject.set(x, "randomize", js.undefined)
    
    @scala.inline
    def setStrength(value: Double): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrengthUndefined: Self = StObject.set(x, "strength", js.undefined)
    
    @scala.inline
    def setTaper(value: in | out | both | none): Self = StObject.set(x, "taper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaperUndefined: Self = StObject.set(x, "taper", js.undefined)
    
    @scala.inline
    def setTemplate(value: Ease): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
