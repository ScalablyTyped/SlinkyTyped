package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceSettingsConnectionDataSource extends js.Object {
  /** Specifies the method name which is used to get updated connectors from client side to the server side
    * @Default {null}
    */
  var crudAction: js.UndefOr[DataSourceSettingsConnectionDataSourceCrudAction] = js.native
  /** Specifies the custom fields to get the updated data from client side to the server side
    * @Default {[]}
    */
  var customFields: js.UndefOr[js.Array[_]] = js.native
  /** Sets the datasource for the connection datasource settings items.
    * @Default {null}
    */
  var dataSource: js.UndefOr[String] = js.native
  /** Sets the unique id of the connection data source item
    * @Default {null}
    */
  var id: js.UndefOr[String] = js.native
  /** Sets the source node of the connection data source item
    * @Default {null}
    */
  var sourceNode: js.UndefOr[String] = js.native
  /** Sets the sourcePointX value of the connection data source item
    * @Default {null}
    */
  var sourcePointX: js.UndefOr[String] = js.native
  /** Sets the sourcePointY value of the connection data source item
    * @Default {null}
    */
  var sourcePointY: js.UndefOr[String] = js.native
  /** Sets the target node of the connection data source item
    * @Default {null}
    */
  var targetNode: js.UndefOr[String] = js.native
  /** Sets the targetPoint-x value of the connection data source item
    * @Default {null}
    */
  var targetPointX: js.UndefOr[String] = js.native
  /** Sets the targetPoint-y value of the connection data source item
    * @Default {null}
    */
  var targetPointY: js.UndefOr[String] = js.native
}

object DataSourceSettingsConnectionDataSource {
  @scala.inline
  def apply(): DataSourceSettingsConnectionDataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSettingsConnectionDataSource]
  }
  @scala.inline
  implicit class DataSourceSettingsConnectionDataSourceOps[Self <: DataSourceSettingsConnectionDataSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrudAction(value: DataSourceSettingsConnectionDataSourceCrudAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crudAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrudAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crudAction")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomFields(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFields")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceNode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceNode")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcePointX(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePointX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcePointX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePointX")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcePointY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePointY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcePointY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePointY")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetNode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetNode")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetPointX(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPointX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetPointX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPointX")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetPointY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPointY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetPointY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPointY")(js.undefined)
        ret
    }
  }
  
}

