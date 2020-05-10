package typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cluster that is managed by the workflow.
  */
@js.native
trait SchemaManagedCluster extends js.Object {
  /**
    * Required. The cluster name prefix. A unique cluster name will be formed
    * by appending a random suffix.The name must contain only lower-case
    * letters (a-z), numbers (0-9), and hyphens (-). Must begin with a letter.
    * Cannot begin or end with hyphen. Must consist of between 2 and 35
    * characters.
    */
  var clusterName: js.UndefOr[String] = js.native
  /**
    * Required. The cluster configuration.
    */
  var config: js.UndefOr[SchemaClusterConfig] = js.native
  /**
    * Optional. The labels to associate with this cluster.Label keys must be
    * between 1 and 63 characters long, and must conform to the following PCRE
    * regular expression: \p{Ll}\p{Lo}{0,62}Label values must be between 1 and
    * 63 characters long, and must conform to the following PCRE regular
    * expression: \p{Ll}\p{Lo}\p{N}_-{0,63}No more than 32 labels can be
    * associated with a given cluster.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaManagedCluster {
  @scala.inline
  def apply(): SchemaManagedCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedCluster]
  }
  @scala.inline
  implicit class SchemaManagedClusterOps[Self <: SchemaManagedCluster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterName")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: SchemaClusterConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
  }
  
}

