package typingsSlinky.googleapis.tpuV1alpha1Mod.tpuV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSchedulingConfig extends js.Object {
  var preemptible: js.UndefOr[Boolean] = js.native
}

object SchemaSchedulingConfig {
  @scala.inline
  def apply(): SchemaSchedulingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchedulingConfig]
  }
  @scala.inline
  implicit class SchemaSchedulingConfigOps[Self <: SchemaSchedulingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreemptible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preemptible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreemptible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preemptible")(js.undefined)
        ret
    }
  }
  
}

