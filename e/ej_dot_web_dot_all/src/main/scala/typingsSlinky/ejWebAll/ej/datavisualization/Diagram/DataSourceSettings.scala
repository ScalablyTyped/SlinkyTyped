package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceSettings extends js.Object {
  /** Defines the data source either as a collection of objects or as an instance of ej.DataManager
    * @Default {null}
    */
  var connectionDataSource: js.UndefOr[DataSourceSettingsConnectionDataSource] = js.native
  /** Specifies the method name which is used to get the updated data from client side to the server side
    * @Default {null}
    */
  var crudAction: js.UndefOr[DataSourceSettingsCrudAction] = js.native
  /** Specifies the custom fields to get the updated data from client side to the server side
    * @Default {[]}
    */
  var customFields: js.UndefOr[js.Array[_]] = js.native
  /** Defines the data source either as a collection of objects or as an instance of ej.DataManager
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /** Sets the unique id of the data source items
    */
  var id: js.UndefOr[String] = js.native
  /** Defines the parent id of the data source item
    * @Default {''}
    */
  var parent: js.UndefOr[String] = js.native
  /** Describes query to retrieve a set of data from the specified datasource
    * @Default {null}
    */
  var query: js.UndefOr[String] = js.native
  /** Sets the unique id of the root data source item
    */
  var root: js.UndefOr[String] = js.native
  /** Describes the name of the table on which the specified query has to be executed
    * @Default {null}
    */
  var tableName: js.UndefOr[String] = js.native
}

object DataSourceSettings {
  @scala.inline
  def apply(): DataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSettings]
  }
  @scala.inline
  implicit class DataSourceSettingsOps[Self <: DataSourceSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionDataSource(value: DataSourceSettingsConnectionDataSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionDataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionDataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withCrudAction(value: DataSourceSettingsCrudAction): Self = {
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
    def withDataSource(value: js.Any): Self = {
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
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(js.undefined)
        ret
    }
  }
  
}

