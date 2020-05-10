package typingsSlinky.azdata.mod

import typingsSlinky.azdata.FormComponentlayoutFormIt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormComponentGroup extends js.Object {
  /**
  		 * The form components to display in the group along with optional layouts for each item
  		 */
  var components: js.Array[FormComponentlayoutFormIt] = js.native
  /**
  		 * The title of the group, displayed above its components
  		 */
  var title: String = js.native
}

object FormComponentGroup {
  @scala.inline
  def apply(components: js.Array[FormComponentlayoutFormIt], title: String): FormComponentGroup = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormComponentGroup]
  }
  @scala.inline
  implicit class FormComponentGroupOps[Self <: FormComponentGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponents(value: js.Array[FormComponentlayoutFormIt]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

