package typingsSlinky.reactJsonView.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InteractionProps extends js.Object {
  /**
    * The existing subtree of the JSON tree.
    */
  var existing_src: js.Object = js.native
  /**
    * The original value of the entry that is interacted with.
    */
  var existing_value: js.Object | String | Double | Boolean | Null = js.native
  /**
    * The key of the entry that is interacted with.
    */
  var name: String | Null = js.native
  /**
    * List of keys.
    */
  var namespace: js.Array[String | Null] = js.native
  /**
    * The updated value of the entry that is interacted with.
    */
  var new_value: js.UndefOr[js.Object | String | Double | Boolean | Null] = js.native
  /**
    * The updated subtree of the JSON tree.
    */
  var updated_src: js.Object = js.native
}

object InteractionProps {
  @scala.inline
  def apply(existing_src: js.Object, namespace: js.Array[String | Null], updated_src: js.Object): InteractionProps = {
    val __obj = js.Dynamic.literal(existing_src = existing_src.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], updated_src = updated_src.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionProps]
  }
  @scala.inline
  implicit class InteractionPropsOps[Self <: InteractionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExisting_src(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("existing_src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: js.Array[String | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated_src(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExisting_value(value: js.Object | String | Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("existing_value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExisting_valueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("existing_value")(null)
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
    @scala.inline
    def withNew_value(value: js.Object | String | Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_value: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_value")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_valueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_value")(null)
        ret
    }
  }
  
}

