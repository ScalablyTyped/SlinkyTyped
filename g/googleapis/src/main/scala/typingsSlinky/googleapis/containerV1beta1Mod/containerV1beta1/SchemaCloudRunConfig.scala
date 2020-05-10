package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration options for the Cloud Run feature.
  */
@js.native
trait SchemaCloudRunConfig extends js.Object {
  /**
    * Whether Cloud Run addon is enabled for this cluster.
    */
  var disabled: js.UndefOr[Boolean] = js.native
}

object SchemaCloudRunConfig {
  @scala.inline
  def apply(): SchemaCloudRunConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudRunConfig]
  }
  @scala.inline
  implicit class SchemaCloudRunConfigOps[Self <: SchemaCloudRunConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
  }
  
}

