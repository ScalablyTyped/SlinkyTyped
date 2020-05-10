package typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The builder for DataSourceSpec. To create a specification for certain type, use as...() method. To create a new builder, use SpreadsheetApp.newDataSourceSpec(). To use the specification, see DataSourceTable.
  *
  * This examples show how to build a BigQuery data source specification.
  *
  *     var spec = SpreadsheetApp.newDataSourceSpec()
  *                .asBigQuery()
  *                .setProjectId('big_query_project')
  *                .setRawQuery('select @FIELD from table limit @LIMIT')
  *                .setParameterFromCell('FIELD', 'Sheet1!A1')
  *                .setParameterFromCell('LIMIT', 'namedRangeCell')
  *                .build();
  */
@js.native
trait DataSourceSpecBuilder extends js.Object {
  def asBigQuery(): BigQueryDataSourceSpecBuilder = js.native
  def build(): DataSourceSpec = js.native
  def copy(): DataSourceSpecBuilder = js.native
  def getParameters(): js.Array[DataSourceParameter] = js.native
  def getType(): DataSourceType = js.native
  def removeAllParameters(): DataSourceSpecBuilder = js.native
  def removeParameter(parameterName: String): DataSourceSpecBuilder = js.native
  def setParameterFromCell(parameterName: String, sourceCell: String): DataSourceSpecBuilder = js.native
}

object DataSourceSpecBuilder {
  @scala.inline
  def apply(
    asBigQuery: () => BigQueryDataSourceSpecBuilder,
    build: () => DataSourceSpec,
    copy: () => DataSourceSpecBuilder,
    getParameters: () => js.Array[DataSourceParameter],
    getType: () => DataSourceType,
    removeAllParameters: () => DataSourceSpecBuilder,
    removeParameter: String => DataSourceSpecBuilder,
    setParameterFromCell: (String, String) => DataSourceSpecBuilder
  ): DataSourceSpecBuilder = {
    val __obj = js.Dynamic.literal(asBigQuery = js.Any.fromFunction0(asBigQuery), build = js.Any.fromFunction0(build), copy = js.Any.fromFunction0(copy), getParameters = js.Any.fromFunction0(getParameters), getType = js.Any.fromFunction0(getType), removeAllParameters = js.Any.fromFunction0(removeAllParameters), removeParameter = js.Any.fromFunction1(removeParameter), setParameterFromCell = js.Any.fromFunction2(setParameterFromCell))
    __obj.asInstanceOf[DataSourceSpecBuilder]
  }
  @scala.inline
  implicit class DataSourceSpecBuilderOps[Self <: DataSourceSpecBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsBigQuery(value: () => BigQueryDataSourceSpecBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asBigQuery")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBuild(value: () => DataSourceSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction0(value))
        ret
    }
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
    def withGetType(value: () => DataSourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveAllParameters(value: () => DataSourceSpecBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAllParameters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveParameter(value: String => DataSourceSpecBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeParameter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetParameterFromCell(value: (String, String) => DataSourceSpecBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParameterFromCell")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

