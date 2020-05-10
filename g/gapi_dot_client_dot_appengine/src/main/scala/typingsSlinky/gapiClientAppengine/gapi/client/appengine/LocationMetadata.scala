package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationMetadata extends js.Object {
  /** App Engine Flexible Environment is available in the given location.@OutputOnly */
  var flexibleEnvironmentAvailable: js.UndefOr[Boolean] = js.native
  /** App Engine Standard Environment is available in the given location.@OutputOnly */
  var standardEnvironmentAvailable: js.UndefOr[Boolean] = js.native
}

object LocationMetadata {
  @scala.inline
  def apply(): LocationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationMetadata]
  }
  @scala.inline
  implicit class LocationMetadataOps[Self <: LocationMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlexibleEnvironmentAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexibleEnvironmentAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexibleEnvironmentAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexibleEnvironmentAvailable")(js.undefined)
        ret
    }
    @scala.inline
    def withStandardEnvironmentAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardEnvironmentAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardEnvironmentAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardEnvironmentAvailable")(js.undefined)
        ret
    }
  }
  
}

