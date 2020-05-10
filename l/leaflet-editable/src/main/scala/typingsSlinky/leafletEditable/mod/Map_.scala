package typingsSlinky.leafletEditable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Map_ extends js.Object {
  /**
    * Options to pass to L.Editable when instanciating.
    */
  var editOptions: EditOptions = js.native
  /**
    * L.Editable plugin instance.
    */
  var editTools: Editable = js.native
  /**
    * Whether to create a L.Editable instance at map init or not.
    */
  var editable: Boolean = js.native
}

object Map_ {
  @scala.inline
  def apply(editOptions: EditOptions, editTools: Editable, editable: Boolean): Map_ = {
    val __obj = js.Dynamic.literal(editOptions = editOptions.asInstanceOf[js.Any], editTools = editTools.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map_]
  }
  @scala.inline
  implicit class Map_Ops[Self <: Map_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEditOptions(value: EditOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditTools(value: Editable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editTools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

