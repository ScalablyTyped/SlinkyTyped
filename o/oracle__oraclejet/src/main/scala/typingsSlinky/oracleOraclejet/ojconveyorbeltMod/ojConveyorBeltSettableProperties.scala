package typingsSlinky.oracleOraclejet.ojconveyorbeltMod

import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.horizontal
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojConveyorBeltSettableProperties extends baseComponentSettableProperties {
  var contentParent: String | Null = js.native
  var orientation: horizontal | vertical = js.native
}

object ojConveyorBeltSettableProperties {
  @scala.inline
  def apply(orientation: horizontal | vertical): ojConveyorBeltSettableProperties = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojConveyorBeltSettableProperties]
  }
  @scala.inline
  implicit class ojConveyorBeltSettablePropertiesOps[Self <: ojConveyorBeltSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrientation(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentParentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentParent")(null)
        ret
    }
  }
  
}

