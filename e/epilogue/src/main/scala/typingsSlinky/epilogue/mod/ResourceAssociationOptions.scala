package typingsSlinky.epilogue.mod

import typingsSlinky.sequelize.mod.AssociationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceAssociationOptions extends AssociationOptions {
  var removeForeignKeys: Boolean = js.native
}

object ResourceAssociationOptions {
  @scala.inline
  def apply(removeForeignKeys: Boolean): ResourceAssociationOptions = {
    val __obj = js.Dynamic.literal(removeForeignKeys = removeForeignKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceAssociationOptions]
  }
  @scala.inline
  implicit class ResourceAssociationOptionsOps[Self <: ResourceAssociationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoveForeignKeys(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeForeignKeys")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

