package typingsSlinky.gapiClientDataproc.gapi.client.dataproc

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HiveJob extends js.Object {
  /**
    * Optional. Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent
    * parallel queries.
    */
  var continueOnFailure: js.UndefOr[Boolean] = js.native
  /** Optional. HCFS URIs of jar files to add to the CLASSPATH of the Hive server and Hadoop MapReduce (MR) tasks. Can contain Hive SerDes and UDFs. */
  var jarFileUris: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. A mapping of property names and values, used to configure Hive. Properties that conflict with values set by the Cloud Dataproc API may be
    * overwritten. Can include properties set in /etc/hadoop/conf/&#42;-site.xml, /etc/hive/conf/hive-site.xml, and classes in user code.
    */
  var properties: js.UndefOr[Record[String, String]] = js.native
  /** The HCFS URI of the script that contains Hive queries. */
  var queryFileUri: js.UndefOr[String] = js.native
  /** A list of queries. */
  var queryList: js.UndefOr[QueryList] = js.native
  /** Optional. Mapping of query variable names to values (equivalent to the Hive command: SET name="value";). */
  var scriptVariables: js.UndefOr[Record[String, String]] = js.native
}

object HiveJob {
  @scala.inline
  def apply(): HiveJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HiveJob]
  }
  @scala.inline
  implicit class HiveJobOps[Self <: HiveJob] (val x: Self) extends AnyVal {
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
    def withProperties(value: Record[String, String]): Self = {
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
    def withQueryList(value: QueryList): Self = {
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
    def withScriptVariables(value: Record[String, String]): Self = {
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

