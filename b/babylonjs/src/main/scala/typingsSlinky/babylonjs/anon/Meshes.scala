package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.BABYLON.AbstractMesh
import typingsSlinky.babylonjs.BABYLON.AnimationGroup
import typingsSlinky.babylonjs.BABYLON.IParticleSystem
import typingsSlinky.babylonjs.BABYLON.Skeleton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Meshes extends js.Object {
  var animationGroups: js.Array[AnimationGroup]
  var meshes: js.Array[AbstractMesh]
  var particleSystems: js.Array[IParticleSystem]
  var skeletons: js.Array[Skeleton]
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
}

