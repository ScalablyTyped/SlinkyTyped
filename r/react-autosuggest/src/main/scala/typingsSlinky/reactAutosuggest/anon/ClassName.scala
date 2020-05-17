package typingsSlinky.reactAutosuggest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassName extends js.Object {
  var className: String = js.native
  var id: String = js.native
  var key: String = js.native
  var ref: js.Any = js.native
  var role: String = js.native
}

object ClassName {
  @scala.inline
  def apply(className: String, id: String, key: String, ref: js.Any, role: String): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
  @scala.inline
  implicit class ClassNameOps[Self <: ClassName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRef(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

