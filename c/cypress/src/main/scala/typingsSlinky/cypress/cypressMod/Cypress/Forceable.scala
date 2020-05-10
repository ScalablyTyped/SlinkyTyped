package typingsSlinky.cypress.cypressMod.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to force an event, skipping Actionability check
  * @see https://docs.cypress.io/guides/core-concepts/interacting-with-elements.html#Actionability
  */
@js.native
trait Forceable extends js.Object {
  /**
    * Forces the action, disables waiting for actionability
    *
    * @default false
    */
  var force: Boolean = js.native
}

object Forceable {
  @scala.inline
  def apply(force: Boolean): Forceable = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[Forceable]
  }
  @scala.inline
  implicit class ForceableOps[Self <: Forceable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

