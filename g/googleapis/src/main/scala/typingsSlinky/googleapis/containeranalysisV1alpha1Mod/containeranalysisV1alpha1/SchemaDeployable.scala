package typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An artifact that can be deployed in some runtime.
  */
@js.native
trait SchemaDeployable extends js.Object {
  /**
    * Resource URI for the artifact being deployed.
    */
  var resourceUri: js.UndefOr[js.Array[String]] = js.native
}

object SchemaDeployable {
  @scala.inline
  def apply(): SchemaDeployable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeployable]
  }
  @scala.inline
  implicit class SchemaDeployableOps[Self <: SchemaDeployable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceUri(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceUri")(js.undefined)
        ret
    }
  }
  
}

