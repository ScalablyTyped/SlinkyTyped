package typingsSlinky.pulumiAws.getLayerVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLayerVersionArgs extends js.Object {
  /**
    * Specific runtime the layer version must support. Conflicts with `version`. If specified, the latest available layer version supporting the provided runtime will be used.
    */
  val compatibleRuntime: js.UndefOr[String] = js.native
  /**
    * Name of the lambda layer.
    */
  val layerName: String = js.native
  /**
    * Specific layer version. Conflicts with `compatibleRuntime`. If omitted, the latest available layer version will be used.
    */
  val version: js.UndefOr[Double] = js.native
}

object GetLayerVersionArgs {
  @scala.inline
  def apply(layerName: String): GetLayerVersionArgs = {
    val __obj = js.Dynamic.literal(layerName = layerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLayerVersionArgs]
  }
  @scala.inline
  implicit class GetLayerVersionArgsOps[Self <: GetLayerVersionArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompatibleRuntime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatibleRuntime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompatibleRuntime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatibleRuntime")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

