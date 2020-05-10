package typingsSlinky.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The information regarding one or more threats that a client submits when
  * checking for matches in threat lists.
  */
@js.native
trait SchemaThreatInfo extends js.Object {
  /**
    * The platform types to be checked.
    */
  var platformTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The threat entries to be checked.
    */
  var threatEntries: js.UndefOr[js.Array[SchemaThreatEntry]] = js.native
  /**
    * The entry types to be checked.
    */
  var threatEntryTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The threat types to be checked.
    */
  var threatTypes: js.UndefOr[js.Array[String]] = js.native
}

object SchemaThreatInfo {
  @scala.inline
  def apply(): SchemaThreatInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThreatInfo]
  }
  @scala.inline
  implicit class SchemaThreatInfoOps[Self <: SchemaThreatInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlatformTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withThreatEntries(value: js.Array[SchemaThreatEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threatEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreatEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threatEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withThreatEntryTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threatEntryTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreatEntryTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threatEntryTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withThreatTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threatTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreatTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threatTypes")(js.undefined)
        ret
    }
  }
  
}

