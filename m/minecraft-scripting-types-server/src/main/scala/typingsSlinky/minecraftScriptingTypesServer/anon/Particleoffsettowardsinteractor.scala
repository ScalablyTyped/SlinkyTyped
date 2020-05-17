package typingsSlinky.minecraftScriptingTypesServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Particleoffsettowardsinteractor extends js.Object {
  /**
    * Whether or not the particle will appear closer to who performed the interaction
    * @default false
    */
  var particle_offset_towards_interactor: Boolean = js.native
  /**
    * The type of particle that will be spawned
    */
  var particle_type: String = js.native
  /**
    * Will offset the particle this amount in the y direction
    * @default 0.0
    */
  var particle_y_offset: Double = js.native
}

object Particleoffsettowardsinteractor {
  @scala.inline
  def apply(particle_offset_towards_interactor: Boolean, particle_type: String, particle_y_offset: Double): Particleoffsettowardsinteractor = {
    val __obj = js.Dynamic.literal(particle_offset_towards_interactor = particle_offset_towards_interactor.asInstanceOf[js.Any], particle_type = particle_type.asInstanceOf[js.Any], particle_y_offset = particle_y_offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Particleoffsettowardsinteractor]
  }
  @scala.inline
  implicit class ParticleoffsettowardsinteractorOps[Self <: Particleoffsettowardsinteractor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParticle_offset_towards_interactor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("particle_offset_towards_interactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParticle_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("particle_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParticle_y_offset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("particle_y_offset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

