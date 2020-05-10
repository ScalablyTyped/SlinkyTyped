package typingsSlinky.awsSdkClientDynamodbNode.typesEndpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoint extends js.Object {
  /**
    * _String shape
    */
  var Address: String = js.native
  /**
    * _Long shape
    */
  var CachePeriodInMinutes: Double = js.native
}

object Endpoint {
  @scala.inline
  def apply(Address: String, CachePeriodInMinutes: Double): Endpoint = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], CachePeriodInMinutes = CachePeriodInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
  @scala.inline
  implicit class EndpointOps[Self <: Endpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCachePeriodInMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CachePeriodInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

