package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayersListItem extends js.Object {
  /**
    * The newest version of the layer.
    */
  var LatestMatchingVersion: js.UndefOr[LayerVersionsListItem] = js.native
  /**
    * The Amazon Resource Name (ARN) of the function layer.
    */
  var LayerArn: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.LayerArn] = js.native
  /**
    * The name of the layer.
    */
  var LayerName: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.LayerName] = js.native
}

object LayersListItem {
  @scala.inline
  def apply(): LayersListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersListItem]
  }
  @scala.inline
  implicit class LayersListItemOps[Self <: LayersListItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLatestMatchingVersion(value: LayerVersionsListItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestMatchingVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestMatchingVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestMatchingVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerArn(value: LayerArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayerArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayerArn")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerName(value: LayerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayerName")(js.undefined)
        ret
    }
  }
  
}

