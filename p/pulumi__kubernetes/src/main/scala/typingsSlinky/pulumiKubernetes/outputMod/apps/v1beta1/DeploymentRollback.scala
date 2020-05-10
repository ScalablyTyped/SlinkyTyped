package typingsSlinky.pulumiKubernetes.outputMod.apps.v1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED. DeploymentRollback stores the information required to rollback a deployment.
  */
@js.native
trait DeploymentRollback extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: String = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: String = js.native
  /**
    * Required: This must match the Name of a deployment.
    */
  val name: String = js.native
  /**
    * The config of this deployment rollback.
    */
  val rollbackTo: RollbackConfig = js.native
  /**
    * The annotations to be updated to a deployment
    */
  val updatedAnnotations: StringDictionary[String] = js.native
}

object DeploymentRollback {
  @scala.inline
  def apply(
    apiVersion: String,
    kind: String,
    name: String,
    rollbackTo: RollbackConfig,
    updatedAnnotations: StringDictionary[String]
  ): DeploymentRollback = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rollbackTo = rollbackTo.asInstanceOf[js.Any], updatedAnnotations = updatedAnnotations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentRollback]
  }
  @scala.inline
  implicit class DeploymentRollbackOps[Self <: DeploymentRollback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRollbackTo(value: RollbackConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollbackTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedAnnotations(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedAnnotations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

