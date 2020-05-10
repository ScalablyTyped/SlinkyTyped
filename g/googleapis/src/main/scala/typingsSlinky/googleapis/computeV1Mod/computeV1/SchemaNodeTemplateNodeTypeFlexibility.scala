package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNodeTemplateNodeTypeFlexibility extends js.Object {
  var cpus: js.UndefOr[String] = js.native
  var localSsd: js.UndefOr[String] = js.native
  var memory: js.UndefOr[String] = js.native
}

object SchemaNodeTemplateNodeTypeFlexibility {
  @scala.inline
  def apply(): SchemaNodeTemplateNodeTypeFlexibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeTemplateNodeTypeFlexibility]
  }
  @scala.inline
  implicit class SchemaNodeTemplateNodeTypeFlexibilityOps[Self <: SchemaNodeTemplateNodeTypeFlexibility] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCpus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpus")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalSsd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localSsd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalSsd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localSsd")(js.undefined)
        ret
    }
    @scala.inline
    def withMemory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory")(js.undefined)
        ret
    }
  }
  
}

