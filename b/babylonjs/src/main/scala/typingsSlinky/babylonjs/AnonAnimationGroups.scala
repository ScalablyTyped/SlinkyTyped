package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh
import typingsSlinky.babylonjs.animationGroupMod.AnimationGroup
import typingsSlinky.babylonjs.iparticlesystemMod.IParticleSystem
import typingsSlinky.babylonjs.skeletonMod.Skeleton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnimationGroups extends js.Object {
  var animationGroups: js.Array[AnimationGroup] = js.native
  var meshes: js.Array[AbstractMesh] = js.native
  var particleSystems: js.Array[IParticleSystem] = js.native
  var skeletons: js.Array[Skeleton] = js.native
}

object AnonAnimationGroups {
  @scala.inline
  def apply(
    animationGroups: js.Array[AnimationGroup],
    meshes: js.Array[AbstractMesh],
    particleSystems: js.Array[IParticleSystem],
    skeletons: js.Array[Skeleton]
  ): AnonAnimationGroups = {
    val __obj = js.Dynamic.literal(animationGroups = animationGroups.asInstanceOf[js.Any], meshes = meshes.asInstanceOf[js.Any], particleSystems = particleSystems.asInstanceOf[js.Any], skeletons = skeletons.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimationGroups]
  }
  @scala.inline
  implicit class AnonAnimationGroupsOps[Self <: AnonAnimationGroups] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationGroups(value: js.Array[AnimationGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeshes(value: js.Array[AbstractMesh]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meshes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParticleSystems(value: js.Array[IParticleSystem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("particleSystems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkeletons(value: js.Array[Skeleton]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skeletons")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

