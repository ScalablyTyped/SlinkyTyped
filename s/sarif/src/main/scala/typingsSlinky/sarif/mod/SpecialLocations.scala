package typingsSlinky.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecialLocations extends js.Object {
  /**
    * Provides a suggestion to SARIF consumers to display file paths relative to the specified location.
    */
  var displayBase: js.UndefOr[ArtifactLocation] = js.native
  /**
    * Key/value pairs that provide additional information about the special locations.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
}

object SpecialLocations {
  @scala.inline
  def apply(): SpecialLocations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecialLocations]
  }
  @scala.inline
  implicit class SpecialLocationsOps[Self <: SpecialLocations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayBase(value: ArtifactLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayBase")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: PropertyBag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
  }
  
}

