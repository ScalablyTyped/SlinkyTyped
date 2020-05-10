package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputDestination extends js.Object {
  /**
    * User-specified id. This is used in an output group or an output.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * Destination settings for a MediaPackage output; one destination for both encoders.
    */
  var MediaPackageSettings: js.UndefOr[listOfMediaPackageOutputDestinationSettings] = js.native
  /**
    * Destination settings for a Multiplex output; one destination for both encoders.
    */
  var MultiplexSettings: js.UndefOr[MultiplexProgramChannelDestinationSettings] = js.native
  /**
    * Destination settings for a standard output; one destination for each redundant encoder.
    */
  var Settings: js.UndefOr[listOfOutputDestinationSettings] = js.native
}

object OutputDestination {
  @scala.inline
  def apply(): OutputDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputDestination]
  }
  @scala.inline
  implicit class OutputDestinationOps[Self <: OutputDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaPackageSettings(value: listOfMediaPackageOutputDestinationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaPackageSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaPackageSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaPackageSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiplexSettings(value: MultiplexProgramChannelDestinationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiplexSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiplexSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiplexSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSettings(value: listOfOutputDestinationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Settings")(js.undefined)
        ret
    }
  }
  
}

