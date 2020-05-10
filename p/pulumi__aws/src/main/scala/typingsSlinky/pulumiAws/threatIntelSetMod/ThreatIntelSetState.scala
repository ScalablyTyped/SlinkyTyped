package typingsSlinky.pulumiAws.threatIntelSetMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreatIntelSetState extends js.Object {
  /**
    * Specifies whether GuardDuty is to start using the uploaded ThreatIntelSet.
    */
  val activate: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The detector ID of the GuardDuty.
    */
  val detectorId: js.UndefOr[Input[String]] = js.native
  /**
    * The format of the file that contains the ThreatIntelSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
    */
  val format: js.UndefOr[Input[String]] = js.native
  /**
    * The URI of the file that contains the ThreatIntelSet.
    */
  val location: js.UndefOr[Input[String]] = js.native
  /**
    * The friendly name to identify the ThreatIntelSet.
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object ThreatIntelSetState {
  @scala.inline
  def apply(): ThreatIntelSetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreatIntelSetState]
  }
  @scala.inline
  implicit class ThreatIntelSetStateOps[Self <: ThreatIntelSetState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivate(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectorId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorId")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

