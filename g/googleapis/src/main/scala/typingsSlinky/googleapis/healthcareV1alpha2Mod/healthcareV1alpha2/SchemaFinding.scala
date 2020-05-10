package typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFinding extends js.Object {
  /**
    * Zero-based ending index of the found text, exclusively.
    */
  var end: js.UndefOr[String] = js.native
  /**
    * The type of information stored in this text range (e.g. HumanName,
    * BirthDate, Address, etc.)
    */
  var infoType: js.UndefOr[String] = js.native
  /**
    * Zero-based starting index of the found text, inclusively.
    */
  var start: js.UndefOr[String] = js.native
}

object SchemaFinding {
  @scala.inline
  def apply(): SchemaFinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFinding]
  }
  @scala.inline
  implicit class SchemaFindingOps[Self <: SchemaFinding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withInfoType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoType")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

