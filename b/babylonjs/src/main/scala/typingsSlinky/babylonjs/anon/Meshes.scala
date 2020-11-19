package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.BABYLON.AbstractMesh
import typingsSlinky.babylonjs.BABYLON.AnimationGroup
import typingsSlinky.babylonjs.BABYLON.IParticleSystem
import typingsSlinky.babylonjs.BABYLON.Skeleton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Meshes extends js.Object {
  
  var animationGroups: js.Array[AnimationGroup] = js.native
  
  var meshes: js.Array[AbstractMesh] = js.native
  
  var particleSystems: js.Array[IParticleSystem] = js.native
  
  var skeletons: js.Array[Skeleton] = js.native
}
object Meshes {
  
  @scala.inline
  def apply(
    animationGroups: js.Array[AnimationGroup],
    meshes: js.Array[AbstractMesh],
    particleSystems: js.Array[IParticleSystem],
    skeletons: js.Array[Skeleton]
  ): Meshes = {
    val __obj = js.Dynamic.literal(animationGroups = animationGroups.asInstanceOf[js.Any], meshes = meshes.asInstanceOf[js.Any], particleSystems = particleSystems.asInstanceOf[js.Any], skeletons = skeletons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meshes]
  }
  
  @scala.inline
  implicit class MeshesOps[Self <: Meshes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnimationGroupsVarargs(value: AnimationGroup*): Self = this.set("animationGroups", js.Array(value :_*))
    
    @scala.inline
    def setAnimationGroups(value: js.Array[AnimationGroup]): Self = this.set("animationGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshesVarargs(value: AbstractMesh*): Self = this.set("meshes", js.Array(value :_*))
    
    @scala.inline
    def setMeshes(value: js.Array[AbstractMesh]): Self = this.set("meshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticleSystemsVarargs(value: IParticleSystem*): Self = this.set("particleSystems", js.Array(value :_*))
    
    @scala.inline
    def setParticleSystems(value: js.Array[IParticleSystem]): Self = this.set("particleSystems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkeletonsVarargs(value: Skeleton*): Self = this.set("skeletons", js.Array(value :_*))
    
    @scala.inline
    def setSkeletons(value: js.Array[Skeleton]): Self = this.set("skeletons", value.asInstanceOf[js.Any])
  }
}
