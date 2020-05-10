package typingsSlinky.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPair extends js.Object {
  var activeContacts: js.Any = js.native
  var bodyA: Body = js.native
  var bodyB: Body = js.native
  var contacts: js.Any = js.native
  var friction: Double = js.native
  var frictionStatic: Double = js.native
  var id: Double = js.native
  var inverseMass: Double = js.native
  var isActive: Boolean = js.native
  var restitution: Double = js.native
  var separation: Double = js.native
  var slop: Double = js.native
  var timeCreated: Double = js.native
  var timeUpdated: Double = js.native
}

object IPair {
  @scala.inline
  def apply(
    activeContacts: js.Any,
    bodyA: Body,
    bodyB: Body,
    contacts: js.Any,
    friction: Double,
    frictionStatic: Double,
    id: Double,
    inverseMass: Double,
    isActive: Boolean,
    restitution: Double,
    separation: Double,
    slop: Double,
    timeCreated: Double,
    timeUpdated: Double
  ): IPair = {
    val __obj = js.Dynamic.literal(activeContacts = activeContacts.asInstanceOf[js.Any], bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], contacts = contacts.asInstanceOf[js.Any], friction = friction.asInstanceOf[js.Any], frictionStatic = frictionStatic.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inverseMass = inverseMass.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], restitution = restitution.asInstanceOf[js.Any], separation = separation.asInstanceOf[js.Any], slop = slop.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeUpdated = timeUpdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPair]
  }
  @scala.inline
  implicit class IPairOps[Self <: IPair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveContacts(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeContacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyA(value: Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyB(value: Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContacts(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFriction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrictionStatic(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionStatic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInverseMass(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverseMass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestitution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restitution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeparation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeUpdated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeUpdated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

