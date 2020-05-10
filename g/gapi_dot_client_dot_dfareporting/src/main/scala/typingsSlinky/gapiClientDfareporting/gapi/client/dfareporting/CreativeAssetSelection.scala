package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeAssetSelection extends js.Object {
  /**
    * A creativeAssets[].id. This should refer to one of the parent assets in this creative, and will be served if none of the rules match. This is a
    * required field.
    */
  var defaultAssetId: js.UndefOr[String] = js.native
  /**
    * Rules determine which asset will be served to a viewer. Rules will be evaluated in the order in which they are stored in this list. This list must
    * contain at least one rule. Applicable to INSTREAM_VIDEO creatives.
    */
  var rules: js.UndefOr[js.Array[Rule]] = js.native
}

object CreativeAssetSelection {
  @scala.inline
  def apply(): CreativeAssetSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeAssetSelection]
  }
  @scala.inline
  implicit class CreativeAssetSelectionOps[Self <: CreativeAssetSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultAssetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAssetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultAssetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAssetId")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: js.Array[Rule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
  }
  
}

