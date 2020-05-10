package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrgsGetResponsePlan extends js.Object {
  var filled_seats: js.UndefOr[Double] = js.native
  var name: String = js.native
  var private_repos: Double = js.native
  var seats: js.UndefOr[Double] = js.native
  var space: Double = js.native
}

object OrgsGetResponsePlan {
  @scala.inline
  def apply(name: String, private_repos: Double, space: Double): OrgsGetResponsePlan = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], private_repos = private_repos.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsGetResponsePlan]
  }
  @scala.inline
  implicit class OrgsGetResponsePlanOps[Self <: OrgsGetResponsePlan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivate_repos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private_repos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilled_seats(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filled_seats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilled_seats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filled_seats")(js.undefined)
        ret
    }
    @scala.inline
    def withSeats(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seats")(js.undefined)
        ret
    }
  }
  
}

