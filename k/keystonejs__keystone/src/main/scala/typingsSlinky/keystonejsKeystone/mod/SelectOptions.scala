package typingsSlinky.keystonejsKeystone.mod

import typingsSlinky.keystonejsFields.mod.FieldType
import typingsSlinky.keystonejsKeystone.anon.Label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.keystonejsKeystone.mod.AllFieldsOptions because Already inherited */ @js.native
trait SelectOptions extends BaseFieldOptions {
  // TODO: use a named type
  var options: String | (js.Array[Label | String]) = js.native
}

object SelectOptions {
  @scala.inline
  def apply(options: String | (js.Array[Label | String]), `type`: FieldType): SelectOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectOptions]
  }
  @scala.inline
  implicit class SelectOptionsOps[Self <: SelectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: String | (js.Array[Label | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

