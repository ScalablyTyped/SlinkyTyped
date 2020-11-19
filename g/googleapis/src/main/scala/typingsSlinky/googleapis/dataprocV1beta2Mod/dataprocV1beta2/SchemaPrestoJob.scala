package typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Cloud Dataproc job for running Presto (https://prestosql.io/) queries
  */
@js.native
trait SchemaPrestoJob extends js.Object {
  
  /**
    * Optional. Presto client tags to attach to this query
    */
  var clientTags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. Whether to continue executing queries if a query fails. The
    * default value is false. Setting to true can be useful when executing
    * independent parallel queries.
    */
  var continueOnFailure: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. The runtime log config for job execution.
    */
  var loggingConfig: js.UndefOr[SchemaLoggingConfig] = js.native
  
  /**
    * Optional. The format in which query output will be displayed. See the
    * Presto documentation for supported output formats
    */
  var outputFormat: js.UndefOr[String] = js.native
  
  /**
    * Optional. A mapping of property names to values. Used to set Presto
    * session properties
    * (https://prestodb.io/docs/current/sql/set-session.html) Equivalent to
    * using the --session flag in the Presto CLI
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The HCFS URI of the script that contains SQL queries.
    */
  var queryFileUri: js.UndefOr[String] = js.native
  
  /**
    * A list of queries.
    */
  var queryList: js.UndefOr[SchemaQueryList] = js.native
}
object SchemaPrestoJob {
  
  @scala.inline
  def apply(): SchemaPrestoJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrestoJob]
  }
  
  @scala.inline
  implicit class SchemaPrestoJobOps[Self <: SchemaPrestoJob] (val x: Self) extends AnyVal {
    
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
    def setClientTagsVarargs(value: String*): Self = this.set("clientTags", js.Array(value :_*))
    
    @scala.inline
    def setClientTags(value: js.Array[String]): Self = this.set("clientTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientTags: Self = this.set("clientTags", js.undefined)
    
    @scala.inline
    def setContinueOnFailure(value: Boolean): Self = this.set("continueOnFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinueOnFailure: Self = this.set("continueOnFailure", js.undefined)
    
    @scala.inline
    def setLoggingConfig(value: SchemaLoggingConfig): Self = this.set("loggingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggingConfig: Self = this.set("loggingConfig", js.undefined)
    
    @scala.inline
    def setOutputFormat(value: String): Self = this.set("outputFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputFormat: Self = this.set("outputFormat", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[String]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setQueryFileUri(value: String): Self = this.set("queryFileUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryFileUri: Self = this.set("queryFileUri", js.undefined)
    
    @scala.inline
    def setQueryList(value: SchemaQueryList): Self = this.set("queryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryList: Self = this.set("queryList", js.undefined)
  }
}
