package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dynamic and Image Tag Settings.
  */
@js.native
trait SchemaTagSettings extends js.Object {
  /**
    * Whether dynamic floodlight tags are enabled.
    */
  var dynamicTagEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether image tags are enabled.
    */
  var imageTagEnabled: js.UndefOr[Boolean] = js.native
}

object SchemaTagSettings {
  @scala.inline
  def apply(): SchemaTagSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTagSettings]
  }
  @scala.inline
  implicit class SchemaTagSettingsOps[Self <: SchemaTagSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDynamicTagEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicTagEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicTagEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicTagEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withImageTagEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTagEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageTagEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTagEnabled")(js.undefined)
        ret
    }
  }
  
}

