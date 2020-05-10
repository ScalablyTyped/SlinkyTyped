package typingsSlinky.keystonejsKeystone.mod

import typingsSlinky.keystonejsFields.mod.FieldType
import typingsSlinky.keystonejsKeystone.keystonejsKeystoneStrings.ID
import typingsSlinky.keystonejsKeystone.keystonejsKeystoneStrings.Int
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.keystonejsKeystone.mod.AllFieldsOptions because Already inherited */ @js.native
trait AutoIncrementOptions extends BaseFieldOptions {
  var gqlType: js.UndefOr[Int | ID] = js.native
}

object AutoIncrementOptions {
  @scala.inline
  def apply(`type`: FieldType): AutoIncrementOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoIncrementOptions]
  }
  @scala.inline
  implicit class AutoIncrementOptionsOps[Self <: AutoIncrementOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGqlType(value: Int | ID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gqlType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGqlType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gqlType")(js.undefined)
        ret
    }
  }
  
}

