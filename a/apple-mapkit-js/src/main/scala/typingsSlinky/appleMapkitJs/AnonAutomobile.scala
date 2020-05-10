package typingsSlinky.appleMapkitJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAutomobile extends js.Object {
  /**
    * A constant identifying the mode of transportation as driving.
    */
  val Automobile: String = js.native
  /**
    * A constant identifying the mode of transportation as walking.
    */
  val Walking: String = js.native
}

object AnonAutomobile {
  @scala.inline
  def apply(Automobile: String, Walking: String): AnonAutomobile = {
    val __obj = js.Dynamic.literal(Automobile = Automobile.asInstanceOf[js.Any], Walking = Walking.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutomobile]
  }
  @scala.inline
  implicit class AnonAutomobileOps[Self <: AnonAutomobile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomobile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Automobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWalking(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Walking")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

