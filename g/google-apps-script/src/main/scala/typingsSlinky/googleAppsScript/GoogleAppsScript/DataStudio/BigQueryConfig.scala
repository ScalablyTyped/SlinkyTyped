package typingsSlinky.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddQueryParameter(value: (String, BigQueryParameterType, String) => BigQueryConfig): Self = this.set("addQueryParameter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBuild(value: () => Config): Self = this.set("build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrintJson(value: () => String): Self = this.set("printJson", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAccessToken(value: String => BigQueryConfig): Self = this.set("setAccessToken", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBillingProjectId(value: String => BigQueryConfig): Self = this.set("setBillingProjectId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetQuery(value: String => BigQueryConfig): Self = this.set("setQuery", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUseStandardSql(value: Boolean => BigQueryConfig): Self = this.set("setUseStandardSql", js.Any.fromFunction1(value))
  }
}
