package typingsSlinky.loopback.anon

import typingsSlinky.loopback.mod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessType extends js.Object {
  var accessType: String = js.native
  var id: js.Any = js.native
  var model: String | Model = js.native
  var principals: js.Array[_] = js.native
  var property: String = js.native
}

object AccessType {
  @scala.inline
  def apply(accessType: String, id: js.Any, model: String | Model, principals: js.Array[_], property: String): AccessType = {
    val __obj = js.Dynamic.literal(accessType = accessType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], principals = principals.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessType]
  }
  @scala.inline
  implicit class AccessTypeOps[Self <: AccessType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: String | Model): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrincipals(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

