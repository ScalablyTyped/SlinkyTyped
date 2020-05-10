package typingsSlinky.azure.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleInstance extends js.Object {
  var endpoints: StringDictionary[RoleInstanceEndpoint] = js.native
  var faultDomain: String = js.native
  var id: String = js.native
  var updateDomain: String = js.native
}

object RoleInstance {
  @scala.inline
  def apply(
    endpoints: StringDictionary[RoleInstanceEndpoint],
    faultDomain: String,
    id: String,
    updateDomain: String
  ): RoleInstance = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], faultDomain = faultDomain.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updateDomain = updateDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleInstance]
  }
  @scala.inline
  implicit class RoleInstanceOps[Self <: RoleInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoints(value: StringDictionary[RoleInstanceEndpoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFaultDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faultDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDomain")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

