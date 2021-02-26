package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Effect extends StObject {
  
  var effect: typingsSlinky.babylonjs.effectMod.Effect = js.native
  
  var subMesh: Nullable[typingsSlinky.babylonjs.subMeshMod.SubMesh] = js.native
}
object Effect {
  
  @scala.inline
  def apply(effect: typingsSlinky.babylonjs.effectMod.Effect): Effect = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Effect]
  }
  
  @scala.inline
  implicit class EffectMutableBuilder[Self <: Effect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffect(value: typingsSlinky.babylonjs.effectMod.Effect): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubMesh(value: Nullable[typingsSlinky.babylonjs.subMeshMod.SubMesh]): Self = StObject.set(x, "subMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubMeshNull: Self = StObject.set(x, "subMesh", null)
  }
}
