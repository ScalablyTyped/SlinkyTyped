package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Guest OS features.
  */
@js.native
trait SchemaGuestOsFeature extends js.Object {
  /**
    * The ID of a supported feature. Read  Enabling guest operating system
    * features to see a list of available options.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaGuestOsFeature {
  @scala.inline
  def apply(): SchemaGuestOsFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGuestOsFeature]
  }
  @scala.inline
  implicit class SchemaGuestOsFeatureOps[Self <: SchemaGuestOsFeature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

