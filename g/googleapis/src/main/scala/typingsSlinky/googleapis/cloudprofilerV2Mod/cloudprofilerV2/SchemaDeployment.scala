package typingsSlinky.googleapis.cloudprofilerV2Mod.cloudprofilerV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deployment contains the deployment identification information.
  */
@js.native
trait SchemaDeployment extends js.Object {
  
  /**
    * Labels identify the deployment within the user universe and same target.
    * Validation regex for label names: `^[a-z0-9]([a-z0-9-]{0,61}[a-z0-9])?$`.
    * Value for an individual label must be &lt;= 512 bytes, the total size of
    * all label names and values must be &lt;= 1024 bytes.  Label named
    * &quot;language&quot; can be used to record the programming language of
    * the profiled deployment. The standard choices for the value include
    * &quot;java&quot;, &quot;go&quot;, &quot;python&quot;, &quot;ruby&quot;,
    * &quot;nodejs&quot;, &quot;php&quot;, &quot;dotnet&quot;.  For deployments
    * running on Google Cloud Platform, &quot;zone&quot; or &quot;region&quot;
    * label should be present describing the deployment location. An example of
    * a zone is &quot;us-central1-a&quot;, an example of a region is
    * &quot;us-central1&quot; or &quot;us-central&quot;.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Project ID is the ID of a cloud project. Validation regex:
    * `^a-z{4,61}[a-z0-9]$`.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * Target is the service name used to group related deployments: * Service
    * name for GAE Flex / Standard. * Cluster and container name for GKE. *
    * User-specified string for direct GCE profiling (e.g. Java). * Job name
    * for Dataflow. Validation regex: `^[a-z]([-a-z0-9_.]{0,253}[a-z0-9])?$`.
    */
  var target: js.UndefOr[String] = js.native
}
object SchemaDeployment {
  
  @scala.inline
  def apply(): SchemaDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeployment]
  }
  
  @scala.inline
  implicit class SchemaDeploymentOps[Self <: SchemaDeployment] (val x: Self) extends AnyVal {
    
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
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
