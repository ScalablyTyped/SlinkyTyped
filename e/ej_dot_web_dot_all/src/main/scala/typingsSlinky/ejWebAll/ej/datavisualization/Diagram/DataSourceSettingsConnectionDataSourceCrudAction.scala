package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceSettingsConnectionDataSourceCrudAction extends js.Object {
  /** Specifies the create method which is used to get the connectors to be added from client side to the server side
    * @Default {null}
    */
  var create: js.UndefOr[String] = js.native
  /** Specifies the destroy method which is used to get the deleted items data from client side to the server side
    * @Default {null}
    */
  var destroy: js.UndefOr[String] = js.native
  /** Specifies the read method which is used to get the data from client side to the server side
    * @Default {null}
    */
  var read: js.UndefOr[String] = js.native
  /** Specifies the update method which is used to get the updated connectors from client side to the server side
    * @Default {null}
    */
  var update: js.UndefOr[String] = js.native
}

object DataSourceSettingsConnectionDataSourceCrudAction {
  @scala.inline
  def apply(): DataSourceSettingsConnectionDataSourceCrudAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSettingsConnectionDataSourceCrudAction]
  }
  @scala.inline
  implicit class DataSourceSettingsConnectionDataSourceCrudActionOps[Self <: DataSourceSettingsConnectionDataSourceCrudAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withRead(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

