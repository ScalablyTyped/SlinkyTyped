package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLayerVersionsRequest extends js.Object {
  /**
    * A runtime identifier. For example, go1.x.
    */
  var CompatibleRuntime: js.UndefOr[Runtime] = js.native
  /**
    * The name or Amazon Resource Name (ARN) of the layer.
    */
  var LayerName: typingsSlinky.awsSdk.lambdaMod.LayerName = js.native
  /**
    * A pagination token returned by a previous call.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of versions to return.
    */
  var MaxItems: js.UndefOr[MaxLayerListItems] = js.native
}

object ListLayerVersionsRequest {
  @scala.inline
  def apply(LayerName: LayerName): ListLayerVersionsRequest = {
    val __obj = js.Dynamic.literal(LayerName = LayerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLayerVersionsRequest]
  }
  @scala.inline
  implicit class ListLayerVersionsRequestOps[Self <: ListLayerVersionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayerName(value: LayerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompatibleRuntime(value: Runtime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompatibleRuntime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompatibleRuntime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompatibleRuntime")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxItems(value: MaxLayerListItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxItems")(js.undefined)
        ret
    }
  }
  
}

