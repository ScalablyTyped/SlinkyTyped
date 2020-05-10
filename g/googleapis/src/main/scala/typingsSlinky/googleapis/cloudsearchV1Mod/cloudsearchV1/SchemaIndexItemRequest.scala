package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaIndexItemRequest extends js.Object {
  /**
    * Name of connector making this call. &lt;br /&gt;Format:
    * datasources/{source_id}/connectors/{ID}
    */
  var connectorName: js.UndefOr[String] = js.native
  /**
    * Common debug options.
    */
  var debugOptions: js.UndefOr[SchemaDebugOptions] = js.native
  var indexItemOptions: js.UndefOr[SchemaIndexItemOptions] = js.native
  /**
    * Name of the item.  Format: datasources/{source_id}/items/{item_id}
    */
  var item: js.UndefOr[SchemaItem] = js.native
  /**
    * Required. The RequestMode for this request.
    */
  var mode: js.UndefOr[String] = js.native
}

object SchemaIndexItemRequest {
  @scala.inline
  def apply(): SchemaIndexItemRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIndexItemRequest]
  }
  @scala.inline
  implicit class SchemaIndexItemRequestOps[Self <: SchemaIndexItemRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectorName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorName")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugOptions(value: SchemaDebugOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexItemOptions(value: SchemaIndexItemOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexItemOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexItemOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexItemOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withItem(value: SchemaItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
  }
  
}

