package typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The builder for BigQueryDataSourceSpecBuilder.
  */
@js.native
trait BigQueryDataSourceSpecBuilder extends js.Object {
  def build(): DataSourceSpec = js.native
  def copy(): DataSourceSpecBuilder = js.native
  def getParameters(): js.Array[DataSourceParameter] = js.native
  def getProjectId(): String = js.native
  def getRawQuery(): String = js.native
  def getType(): DataSourceType = js.native
  def removeAllParameters(): BigQueryDataSourceSpecBuilder = js.native
  def removeParameter(parameterName: String): BigQueryDataSourceSpecBuilder = js.native
  def setParameterFromCell(parameterName: String, sourceCell: String): BigQueryDataSourceSpecBuilder = js.native
  def setProjectId(projectId: String): BigQueryDataSourceSpecBuilder = js.native
  def setRawQuery(rawQuery: String): BigQueryDataSourceSpecBuilder = js.native
}

object BigQueryDataSourceSpecBuilder {
  @scala.inline
  def apply(
    build: () => DataSourceSpec,
    copy: () => DataSourceSpecBuilder,
    getParameters: () => js.Array[DataSourceParameter],
    getProjectId: () => String,
    getRawQuery: () => String,
    getType: () => DataSourceType,
    removeAllParameters: () => BigQueryDataSourceSpecBuilder,
    removeParameter: String => BigQueryDataSourceSpecBuilder,
    setParameterFromCell: (String, String) => BigQueryDataSourceSpecBuilder,
    setProjectId: String => BigQueryDataSourceSpecBuilder,
    setRawQuery: String => BigQueryDataSourceSpecBuilder
  ): BigQueryDataSourceSpecBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), copy = js.Any.fromFunction0(copy), getParameters = js.Any.fromFunction0(getParameters), getProjectId = js.Any.fromFunction0(getProjectId), getRawQuery = js.Any.fromFunction0(getRawQuery), getType = js.Any.fromFunction0(getType), removeAllParameters = js.Any.fromFunction0(removeAllParameters), removeParameter = js.Any.fromFunction1(removeParameter), setParameterFromCell = js.Any.fromFunction2(setParameterFromCell), setProjectId = js.Any.fromFunction1(setProjectId), setRawQuery = js.Any.fromFunction1(setRawQuery))
    __obj.asInstanceOf[BigQueryDataSourceSpecBuilder]
  }
  @scala.inline
  implicit class BigQueryDataSourceSpecBuilderOps[Self <: BigQueryDataSourceSpecBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withRemoveAllParameters(value: () => BigQueryDataSourceSpecBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAllParameters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveParameter(value: String => BigQueryDataSourceSpecBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeParameter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetParameterFromCell(value: (String, String) => BigQueryDataSourceSpecBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParameterFromCell")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetProjectId(value: String => BigQueryDataSourceSpecBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProjectId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRawQuery(value: String => BigQueryDataSourceSpecBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRawQuery")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

