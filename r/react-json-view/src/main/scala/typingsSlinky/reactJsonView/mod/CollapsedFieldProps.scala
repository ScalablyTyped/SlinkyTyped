package typingsSlinky.reactJsonView.mod

import typingsSlinky.reactJsonView.reactJsonViewStrings.`object`
import typingsSlinky.reactJsonView.reactJsonViewStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollapsedFieldProps extends js.Object {
  /**
    * The name of the entry.
    */
  var name: String | Null = js.native
  /**
    * The scopes above the current entry.
    */
  var namespace: js.Array[String | Null] = js.native
  /**
    * The corresponding JSON subtree.
    */
  var src: js.Object = js.native
  /**
    * The type of src. Can only be "array" or "object".
    */
  var `type`: array | `object` = js.native
}

object CollapsedFieldProps {
  @scala.inline
  def apply(namespace: js.Array[String | Null], src: js.Object, `type`: array | `object`): CollapsedFieldProps = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapsedFieldProps]
  }
  @scala.inline
  implicit class CollapsedFieldPropsOps[Self <: CollapsedFieldProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamespace(value: js.Array[String | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrc(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: array | `object`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(null)
        ret
    }
  }
  
}

