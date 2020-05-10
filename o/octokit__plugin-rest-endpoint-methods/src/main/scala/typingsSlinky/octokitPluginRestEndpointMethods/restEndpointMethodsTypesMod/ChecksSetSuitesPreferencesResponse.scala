package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChecksSetSuitesPreferencesResponse extends js.Object {
  var preferences: ChecksSetSuitesPreferencesResponsePreferences = js.native
  var repository: ChecksSetSuitesPreferencesResponseRepository = js.native
}

object ChecksSetSuitesPreferencesResponse {
  @scala.inline
  def apply(
    preferences: ChecksSetSuitesPreferencesResponsePreferences,
    repository: ChecksSetSuitesPreferencesResponseRepository
  ): ChecksSetSuitesPreferencesResponse = {
    val __obj = js.Dynamic.literal(preferences = preferences.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksSetSuitesPreferencesResponse]
  }
  @scala.inline
  implicit class ChecksSetSuitesPreferencesResponseOps[Self <: ChecksSetSuitesPreferencesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreferences(value: ChecksSetSuitesPreferencesResponsePreferences): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepository(value: ChecksSetSuitesPreferencesResponseRepository): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

