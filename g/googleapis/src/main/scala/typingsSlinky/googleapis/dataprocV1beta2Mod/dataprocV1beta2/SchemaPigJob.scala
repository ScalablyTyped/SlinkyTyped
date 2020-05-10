package typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Cloud Dataproc job for running Apache Pig (https://pig.apache.org/)
  * queries on YARN.
  */
@js.native
trait SchemaPigJob extends js.Object {
  /**
    * Optional. Whether to continue executing queries if a query fails. The
    * default value is false. Setting to true can be useful when executing
    * independent parallel queries.
    */
  var continueOnFailure: js.UndefOr[Boolean] = js.native
  /**
    * Optional. HCFS URIs of jar files to add to the CLASSPATH of the Pig
    * Client and Hadoop MapReduce (MR) tasks. Can contain Pig UDFs.
    */
  var jarFileUris: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. The runtime log config for job execution.
    */
  var loggingConfig: js.UndefOr[SchemaLoggingConfig] = js.native
  /**
    * Optional. A mapping of property names to values, used to configure Pig.
    * Properties that conflict with values set by the Cloud Dataproc API may be
    * overwritten. Can include properties set in /etc/hadoop/conf/ *-site.xml,
    * /etc/pig/conf/pig.properties, and classes in user code.
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The HCFS URI of the script that contains the Pig queries.
    */
  var queryFileUri: js.UndefOr[String] = js.native
  /**
    * A list of queries.
    */
  var queryList: js.UndefOr[SchemaQueryList] = js.native
  /**
    * Optional. Mapping of query variable names to values (equivalent to the
    * Pig command: name=[value]).
    */
  var scriptVariables: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaPigJob {
  @scala.inline
  def apply(): SchemaPigJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPigJob]
  }
  @scala.inline
  implicit class SchemaPigJobOps[Self <: SchemaPigJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContinueOnFailure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueOnFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinueOnFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueOnFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withJarFileUris(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jarFileUris")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJarFileUris: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jarFileUris")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggingConfig(value: SchemaLoggingConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggingConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryFileUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryFileUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryFileUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryFileUri")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryList(value: SchemaQueryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryList")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptVariables(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptVariables")(js.undefined)
        ret
    }
  }
  
}

