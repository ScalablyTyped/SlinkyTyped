package typingsSlinky.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Representation of a single script deployment.
  */
@js.native
trait SchemaDeployment extends js.Object {
  /**
    * The deployment configuration.
    */
  var deploymentConfig: js.UndefOr[SchemaDeploymentConfig] = js.native
  /**
    * The deployment ID for this deployment.
    */
  var deploymentId: js.UndefOr[String] = js.native
  /**
    * The deployment&#39;s entry points.
    */
  var entryPoints: js.UndefOr[js.Array[SchemaEntryPoint]] = js.native
  /**
    * Last modified date time stamp.
    */
  var updateTime: js.UndefOr[String] = js.native
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
    def withDeploymentConfig(value: SchemaDeploymentConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentId")(js.undefined)
        ret
    }
    @scala.inline
    def withEntryPoints(value: js.Array[SchemaEntryPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntryPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
  }
  
}

