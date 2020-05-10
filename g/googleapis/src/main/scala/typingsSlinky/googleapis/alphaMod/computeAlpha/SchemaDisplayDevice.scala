package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of Display Device options
  */
@js.native
trait SchemaDisplayDevice extends js.Object {
  /**
    * Defines whether the instance has Display enabled.
    */
  var enableDisplay: js.UndefOr[Boolean] = js.native
}

object SchemaDisplayDevice {
  @scala.inline
  def apply(): SchemaDisplayDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisplayDevice]
  }
  @scala.inline
  implicit class SchemaDisplayDeviceOps[Self <: SchemaDisplayDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableDisplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDisplay")(js.undefined)
        ret
    }
  }
  
}

