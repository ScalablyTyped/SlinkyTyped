package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative Settings
  */
@js.native
trait SchemaCreativeSettings extends js.Object {
  /**
    * Header text for iFrames for this site. Must be less than or equal to 2000
    * characters long.
    */
  var iFrameFooter: js.UndefOr[String] = js.native
  /**
    * Header text for iFrames for this site. Must be less than or equal to 2000
    * characters long.
    */
  var iFrameHeader: js.UndefOr[String] = js.native
}

object SchemaCreativeSettings {
  @scala.inline
  def apply(): SchemaCreativeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeSettings]
  }
  @scala.inline
  implicit class SchemaCreativeSettingsOps[Self <: SchemaCreativeSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIFrameFooter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iFrameFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIFrameFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iFrameFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withIFrameHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iFrameHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIFrameHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iFrameHeader")(js.undefined)
        ret
    }
  }
  
}

