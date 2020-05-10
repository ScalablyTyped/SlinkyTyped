package typingsSlinky.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A configuration object for a native BigQuery connector. Return this object from getData()
  * for Data Studio to query BigQuery for the connector.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var types = cc.BigQueryParameterType;
  *
  *     var bqConfig = cc.newBigQueryConfig()
  *       .setBillingProjectId('billingProjectId')
  *       .setQuery('queryString')
  *       .setUseStandardSql(true)
  *       .setAccessToken('accessToken')
  *       .addQueryParameter('dob', types.STRING, '01011990')
  *       .build();
  */
@js.native
trait BigQueryConfig extends js.Object {
  def addQueryParameter(name: String, `type`: BigQueryParameterType, value: String): BigQueryConfig = js.native
  def build(): Config = js.native
  def printJson(): String = js.native
  def setAccessToken(accessToken: String): BigQueryConfig = js.native
  def setBillingProjectId(billingProjectId: String): BigQueryConfig = js.native
  def setQuery(query: String): BigQueryConfig = js.native
  def setUseStandardSql(useStandardSql: Boolean): BigQueryConfig = js.native
}

object BigQueryConfig {
  @scala.inline
  def apply(
    addQueryParameter: (String, BigQueryParameterType, String) => BigQueryConfig,
    build: () => Config,
    printJson: () => String,
    setAccessToken: String => BigQueryConfig,
    setBillingProjectId: String => BigQueryConfig,
    setQuery: String => BigQueryConfig,
    setUseStandardSql: Boolean => BigQueryConfig
  ): BigQueryConfig = {
    val __obj = js.Dynamic.literal(addQueryParameter = js.Any.fromFunction3(addQueryParameter), build = js.Any.fromFunction0(build), printJson = js.Any.fromFunction0(printJson), setAccessToken = js.Any.fromFunction1(setAccessToken), setBillingProjectId = js.Any.fromFunction1(setBillingProjectId), setQuery = js.Any.fromFunction1(setQuery), setUseStandardSql = js.Any.fromFunction1(setUseStandardSql))
    __obj.asInstanceOf[BigQueryConfig]
  }
  @scala.inline
  implicit class BigQueryConfigOps[Self <: BigQueryConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddQueryParameter(value: (String, BigQueryParameterType, String) => BigQueryConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addQueryParameter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withBuild(value: () => Config): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrintJson(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printJson")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetAccessToken(value: String => BigQueryConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAccessToken")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetBillingProjectId(value: String => BigQueryConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBillingProjectId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetQuery(value: String => BigQueryConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setQuery")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetUseStandardSql(value: Boolean => BigQueryConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseStandardSql")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

