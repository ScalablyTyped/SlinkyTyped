package typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access the existing BigQuery data source specification. To create a new data source
  * specification, use SpreadsheetApp.newDataSourceSpec().
  */
@js.native
trait BigQueryDataSourceSpec extends js.Object {
  def copy(): DataSourceSpecBuilder = js.native
  def getParameters(): js.Array[DataSourceParameter] = js.native
  def getProjectId(): String = js.native
  def getRawQuery(): String = js.native
  def getType(): DataSourceType = js.native
}

object BigQueryDataSourceSpec {
  @scala.inline
  def apply(
    copy: () => DataSourceSpecBuilder,
    getParameters: () => js.Array[DataSourceParameter],
    getProjectId: () => String,
    getRawQuery: () => String,
    getType: () => DataSourceType
  ): BigQueryDataSourceSpec = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getParameters = js.Any.fromFunction0(getParameters), getProjectId = js.Any.fromFunction0(getProjectId), getRawQuery = js.Any.fromFunction0(getRawQuery), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[BigQueryDataSourceSpec]
  }
  @scala.inline
  implicit class BigQueryDataSourceSpecOps[Self <: BigQueryDataSourceSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopy(value: () => DataSourceSpecBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParameters(value: () => js.Array[DataSourceParameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParameters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetProjectId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProjectId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRawQuery(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRawQuery")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => DataSourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

