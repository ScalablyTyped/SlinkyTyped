package typingsSlinky.jsonSchemaMergeAllof

import typingsSlinky.jsonSchemaMergeAllof.jsonSchemaMergeAllofBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIgnoreAdditionalProperties extends js.Object {
  var ignoreAdditionalProperties: `true` = js.native
}

object AnonIgnoreAdditionalProperties {
  @scala.inline
  def apply(ignoreAdditionalProperties: `true`): AnonIgnoreAdditionalProperties = {
    val __obj = js.Dynamic.literal(ignoreAdditionalProperties = ignoreAdditionalProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIgnoreAdditionalProperties]
  }
  @scala.inline
  implicit class AnonIgnoreAdditionalPropertiesOps[Self <: AnonIgnoreAdditionalProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreAdditionalProperties(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreAdditionalProperties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

