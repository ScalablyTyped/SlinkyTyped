package typingsSlinky.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlendMixin extends StObject {
  
  var blendMode: BlendMode = js.native
  
  var effectStyleId: String = js.native
  
  var effects: js.Array[Effect] = js.native
  
  var isMask: Boolean = js.native
  
  var opacity: Double = js.native
}
object BlendMixin {
  
  @scala.inline
  def apply(
    blendMode: BlendMode,
    effectStyleId: String,
    effects: js.Array[Effect],
    isMask: Boolean,
    opacity: Double
  ): BlendMixin = {
    val __obj = js.Dynamic.literal(blendMode = blendMode.asInstanceOf[js.Any], effectStyleId = effectStyleId.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], isMask = isMask.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlendMixin]
  }
  
  @scala.inline
  implicit class BlendMixinMutableBuilder[Self <: BlendMixin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlendMode(value: BlendMode): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectStyleId(value: String): Self = StObject.set(x, "effectStyleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffects(value: js.Array[Effect]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectsVarargs(value: Effect*): Self = StObject.set(x, "effects", js.Array(value :_*))
    
    @scala.inline
    def setIsMask(value: Boolean): Self = StObject.set(x, "isMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
  }
}
