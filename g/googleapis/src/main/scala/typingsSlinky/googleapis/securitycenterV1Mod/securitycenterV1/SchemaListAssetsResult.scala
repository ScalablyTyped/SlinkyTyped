package typingsSlinky.googleapis.securitycenterV1Mod.securitycenterV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result containing the Asset and its State.
  */
@js.native
trait SchemaListAssetsResult extends js.Object {
  /**
    * Asset matching the search request.
    */
  var asset: js.UndefOr[SchemaAsset] = js.native
  /**
    * State change of the asset between the points in time.
    */
  var stateChange: js.UndefOr[String] = js.native
}

object SchemaListAssetsResult {
  @scala.inline
  def apply(): SchemaListAssetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAssetsResult]
  }
  @scala.inline
  implicit class SchemaListAssetsResultOps[Self <: SchemaListAssetsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsset(value: SchemaAsset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asset")(js.undefined)
        ret
    }
    @scala.inline
    def withStateChange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChange")(js.undefined)
        ret
    }
  }
  
}

