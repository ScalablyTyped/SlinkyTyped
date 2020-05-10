package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaResourceGroupReference extends js.Object {
  /**
    * A URI referencing one of the instance groups or network endpoint groups
    * listed in the backend service.
    */
  var group: js.UndefOr[String] = js.native
}

object SchemaResourceGroupReference {
  @scala.inline
  def apply(): SchemaResourceGroupReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceGroupReference]
  }
  @scala.inline
  implicit class SchemaResourceGroupReferenceOps[Self <: SchemaResourceGroupReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
  }
  
}

