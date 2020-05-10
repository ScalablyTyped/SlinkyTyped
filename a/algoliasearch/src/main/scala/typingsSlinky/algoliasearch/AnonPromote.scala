package typingsSlinky.algoliasearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPromote extends js.Object {
  var params: js.UndefOr[AnonAutomaticFacetFilters] = js.native
  /**
    * Objects to promote as hits. Each object must contain the following fields
    */
  var promote: js.UndefOr[js.Array[AnonObjectID]] = js.native
  /**
    *  Custom JSON object that will be appended to the userData array in the response.
    * This object is not interpreted by the API. It is limited to 1kB of minified JSON.
    */
  var userData: js.UndefOr[js.Object] = js.native
}

object AnonPromote {
  @scala.inline
  def apply(): AnonPromote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonPromote]
  }
  @scala.inline
  implicit class AnonPromoteOps[Self <: AnonPromote] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParams(value: AnonAutomaticFacetFilters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withPromote(value: js.Array[AnonObjectID]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promote")(js.undefined)
        ret
    }
    @scala.inline
    def withUserData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(js.undefined)
        ret
    }
  }
  
}

