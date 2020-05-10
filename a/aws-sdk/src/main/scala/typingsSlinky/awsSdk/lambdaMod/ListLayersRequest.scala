package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLayersRequest extends js.Object {
  /**
    * A runtime identifier. For example, go1.x.
    */
  var CompatibleRuntime: js.UndefOr[Runtime] = js.native
  /**
    * A pagination token returned by a previous call.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of layers to return.
    */
  var MaxItems: js.UndefOr[MaxLayerListItems] = js.native
}

object ListLayersRequest {
  @scala.inline
  def apply(): ListLayersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLayersRequest]
  }
  @scala.inline
  implicit class ListLayersRequestOps[Self <: ListLayersRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

