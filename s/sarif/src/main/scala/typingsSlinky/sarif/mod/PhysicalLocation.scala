package typingsSlinky.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhysicalLocation extends js.Object {
  /**
    * The address of the location.
    */
  var address: js.UndefOr[Address] = js.native
  /**
    * The location of the artifact.
    */
  var artifactLocation: js.UndefOr[ArtifactLocation] = js.native
  /**
    * Specifies a portion of the artifact that encloses the region. Allows a viewer to display additional context
    * around the region.
    */
  var contextRegion: js.UndefOr[Region] = js.native
  /**
    * Key/value pairs that provide additional information about the physical location.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * Specifies a portion of the artifact.
    */
  var region: js.UndefOr[Region] = js.native
}

object PhysicalLocation {
  @scala.inline
  def apply(): PhysicalLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicalLocation]
  }
  @scala.inline
  implicit class PhysicalLocationOps[Self <: PhysicalLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withArtifactLocation(value: ArtifactLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtifactLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withContextRegion(value: Region): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextRegion")(js.undefined)
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
    @scala.inline
    def withRegion(value: Region): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
  }
  
}

