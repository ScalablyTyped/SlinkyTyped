package typingsSlinky.qlikEngineapi.EngineAPI

import typingsSlinky.qlikEngineapi.AnonQIsDesktop
import typingsSlinky.qlikEngineapi.AnonQPathSeparator
import typingsSlinky.qlikEngineapi.AnonQUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQConfig extends js.Object {
  var qFeatures: AnonQIsDesktop
  var qServices: js.Array[AnonQUrl]
  var qSystemProperties: AnonQPathSeparator
}

object IQConfig {
  @scala.inline
  def apply(qFeatures: AnonQIsDesktop, qServices: js.Array[AnonQUrl], qSystemProperties: AnonQPathSeparator): IQConfig = {
    val __obj = js.Dynamic.literal(qFeatures = qFeatures.asInstanceOf[js.Any], qServices = qServices.asInstanceOf[js.Any], qSystemProperties = qSystemProperties.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IQConfig]
  }
}

