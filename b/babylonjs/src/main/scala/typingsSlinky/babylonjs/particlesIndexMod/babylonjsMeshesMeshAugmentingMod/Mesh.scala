package typingsSlinky.babylonjs.particlesIndexMod.babylonjsMeshesMeshAugmentingMod

import typingsSlinky.babylonjs.iparticlesystemMod.IParticleSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mesh extends js.Object {
  /**
    * Returns an array populated with IParticleSystem objects whose the mesh is the emitter
    * @returns an array of IParticleSystem
    */
  def getEmittedParticleSystems(): js.Array[IParticleSystem] = js.native
  /**
    * Returns an array populated with IParticleSystem objects whose the mesh or its children are the emitter
    * @returns an array of IParticleSystem
    */
  def getHierarchyEmittedParticleSystems(): js.Array[IParticleSystem] = js.native
}

object Mesh {
  @scala.inline
  def apply(
    getEmittedParticleSystems: () => js.Array[IParticleSystem],
    getHierarchyEmittedParticleSystems: () => js.Array[IParticleSystem]
  ): Mesh = {
    val __obj = js.Dynamic.literal(getEmittedParticleSystems = js.Any.fromFunction0(getEmittedParticleSystems), getHierarchyEmittedParticleSystems = js.Any.fromFunction0(getHierarchyEmittedParticleSystems))
    __obj.asInstanceOf[Mesh]
  }
  @scala.inline
  implicit class MeshOps[Self <: Mesh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetEmittedParticleSystems(value: () => js.Array[IParticleSystem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEmittedParticleSystems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHierarchyEmittedParticleSystems(value: () => js.Array[IParticleSystem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHierarchyEmittedParticleSystems")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

