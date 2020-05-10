package typingsSlinky.ariClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResource extends js.Object {
  var resource: String = js.native
  var tech: String = js.native
}

object AnonResource {
  @scala.inline
  def apply(resource: String, tech: String): AnonResource = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], tech = tech.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResource]
  }
  @scala.inline
  implicit class AnonResourceOps[Self <: AnonResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTech(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tech")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

