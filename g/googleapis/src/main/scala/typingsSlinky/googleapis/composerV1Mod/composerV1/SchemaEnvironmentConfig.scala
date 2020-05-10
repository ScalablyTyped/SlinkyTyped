package typingsSlinky.googleapis.composerV1Mod.composerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration information for an environment.
  */
@js.native
trait SchemaEnvironmentConfig extends js.Object {
  /**
    * Output only. The URI of the Apache Airflow Web UI hosted within this
    * environment (see [Airflow web
    * interface](/composer/docs/how-to/accessing/airflow-web-interface)).
    */
  var airflowUri: js.UndefOr[String] = js.native
  /**
    * Output only. The Cloud Storage prefix of the DAGs for this environment.
    * Although Cloud Storage objects reside in a flat namespace, a hierarchical
    * file tree can be simulated using &quot;/&quot;-delimited object name
    * prefixes. DAG objects for this environment reside in a simulated
    * directory with the given prefix.
    */
  var dagGcsPrefix: js.UndefOr[String] = js.native
  /**
    * Output only. The Kubernetes Engine cluster used to run this environment.
    */
  var gkeCluster: js.UndefOr[String] = js.native
  /**
    * The configuration used for the Kubernetes Engine cluster.
    */
  var nodeConfig: js.UndefOr[SchemaNodeConfig] = js.native
  /**
    * The number of nodes in the Kubernetes Engine cluster that will be used to
    * run this environment.
    */
  var nodeCount: js.UndefOr[Double] = js.native
  /**
    * The configuration settings for software inside the environment.
    */
  var softwareConfig: js.UndefOr[SchemaSoftwareConfig] = js.native
}

object SchemaEnvironmentConfig {
  @scala.inline
  def apply(): SchemaEnvironmentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvironmentConfig]
  }
  @scala.inline
  implicit class SchemaEnvironmentConfigOps[Self <: SchemaEnvironmentConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAirflowUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("airflowUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAirflowUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("airflowUri")(js.undefined)
        ret
    }
    @scala.inline
    def withDagGcsPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dagGcsPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDagGcsPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dagGcsPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withGkeCluster(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gkeCluster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGkeCluster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gkeCluster")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeConfig(value: SchemaNodeConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSoftwareConfig(value: SchemaSoftwareConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softwareConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoftwareConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softwareConfig")(js.undefined)
        ret
    }
  }
  
}

