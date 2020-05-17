package typingsSlinky.ariClient.anon

import typingsSlinky.ariClient.mod.Containers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fields extends js.Object {
  var configClass: String = js.native
  var fields: js.UndefOr[Containers] = js.native
  var id: String = js.native
  var objectType: String = js.native
}

object Fields {
  @scala.inline
  def apply(configClass: String, id: String, objectType: String): Fields = {
    val __obj = js.Dynamic.literal(configClass = configClass.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
  @scala.inline
  implicit class FieldsOps[Self <: Fields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: Containers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
  }
  
}

