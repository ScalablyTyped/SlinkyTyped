package typingsSlinky.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Temporal asset. In addition to the asset, the temporal asset includes the
  * status of the asset and valid from and to time of it.
  */
@js.native
trait SchemaTemporalAsset extends js.Object {
  /**
    * Asset.
    */
  var asset: js.UndefOr[SchemaAsset] = js.native
  /**
    * If the asset is deleted or not.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * The time window when the asset data and state was observed.
    */
  var window: js.UndefOr[SchemaTimeWindow] = js.native
}

object SchemaTemporalAsset {
  @scala.inline
  def apply(): SchemaTemporalAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTemporalAsset]
  }
  @scala.inline
  implicit class SchemaTemporalAssetOps[Self <: SchemaTemporalAsset] (val x: Self) extends AnyVal {
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
    def withDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(js.undefined)
        ret
    }
    @scala.inline
    def withWindow(value: SchemaTimeWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(js.undefined)
        ret
    }
  }
  
}

