package typingsSlinky.keystonejsKeystone.mod

import typingsSlinky.keystonejsFields.mod.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.keystonejsKeystone.mod.AllFieldsOptions because Already inherited */ @js.native
trait OEmbedOptions extends BaseFieldOptions {
  var adapter: js.Any = js.native
}

object OEmbedOptions {
  @scala.inline
  def apply(adapter: js.Any, `type`: FieldType): OEmbedOptions = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OEmbedOptions]
  }
  @scala.inline
  implicit class OEmbedOptionsOps[Self <: OEmbedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdapter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

