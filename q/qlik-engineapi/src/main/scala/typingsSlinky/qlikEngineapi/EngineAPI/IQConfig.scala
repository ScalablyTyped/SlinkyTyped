package typingsSlinky.qlikEngineapi.EngineAPI

import typingsSlinky.qlikEngineapi.AnonQIsDesktop
import typingsSlinky.qlikEngineapi.AnonQPathSeparator
import typingsSlinky.qlikEngineapi.AnonQUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQConfig extends js.Object {
  var qFeatures: AnonQIsDesktop = js.native
  var qServices: js.Array[AnonQUrl] = js.native
  var qSystemProperties: AnonQPathSeparator = js.native
}

object IQConfig {
  @scala.inline
  def apply(qFeatures: AnonQIsDesktop, qServices: js.Array[AnonQUrl], qSystemProperties: AnonQPathSeparator): IQConfig = {
    val __obj = js.Dynamic.literal(qFeatures = qFeatures.asInstanceOf[js.Any], qServices = qServices.asInstanceOf[js.Any], qSystemProperties = qSystemProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQConfig]
  }
  @scala.inline
  implicit class IQConfigOps[Self <: IQConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQFeatures(value: AnonQIsDesktop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQServices(value: js.Array[AnonQUrl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSystemProperties(value: AnonQPathSeparator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSystemProperties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

