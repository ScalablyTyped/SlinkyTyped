package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh
import typingsSlinky.babylonjs.boneMod.Bone
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BendAxis extends StObject {
  
  var bendAxis: js.UndefOr[Vector3] = js.native
  
  var maxAngle: js.UndefOr[Double] = js.native
  
  var poleAngle: js.UndefOr[Double] = js.native
  
  var poleTargetBone: js.UndefOr[Bone] = js.native
  
  var poleTargetLocalOffset: js.UndefOr[Vector3] = js.native
  
  var poleTargetMesh: js.UndefOr[AbstractMesh] = js.native
  
  var slerpAmount: js.UndefOr[Double] = js.native
  
  var targetMesh: js.UndefOr[AbstractMesh] = js.native
}
object BendAxis {
  
  @scala.inline
  def apply(): BendAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BendAxis]
  }
  
  @scala.inline
  implicit class BendAxisMutableBuilder[Self <: BendAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBendAxis(value: Vector3): Self = StObject.set(x, "bendAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBendAxisUndefined: Self = StObject.set(x, "bendAxis", js.undefined)
    
    @scala.inline
    def setMaxAngle(value: Double): Self = StObject.set(x, "maxAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAngleUndefined: Self = StObject.set(x, "maxAngle", js.undefined)
    
    @scala.inline
    def setPoleAngle(value: Double): Self = StObject.set(x, "poleAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoleAngleUndefined: Self = StObject.set(x, "poleAngle", js.undefined)
    
    @scala.inline
    def setPoleTargetBone(value: Bone): Self = StObject.set(x, "poleTargetBone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoleTargetBoneUndefined: Self = StObject.set(x, "poleTargetBone", js.undefined)
    
    @scala.inline
    def setPoleTargetLocalOffset(value: Vector3): Self = StObject.set(x, "poleTargetLocalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoleTargetLocalOffsetUndefined: Self = StObject.set(x, "poleTargetLocalOffset", js.undefined)
    
    @scala.inline
    def setPoleTargetMesh(value: AbstractMesh): Self = StObject.set(x, "poleTargetMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoleTargetMeshUndefined: Self = StObject.set(x, "poleTargetMesh", js.undefined)
    
    @scala.inline
    def setSlerpAmount(value: Double): Self = StObject.set(x, "slerpAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlerpAmountUndefined: Self = StObject.set(x, "slerpAmount", js.undefined)
    
    @scala.inline
    def setTargetMesh(value: AbstractMesh): Self = StObject.set(x, "targetMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetMeshUndefined: Self = StObject.set(x, "targetMesh", js.undefined)
  }
}
