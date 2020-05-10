package typingsSlinky.msRestAzure.mod

import typingsSlinky.msRest.mod.Mapper
import typingsSlinky.msRest.mod.PathTemplateBasedRequestPrepareOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LongRunningPathTemplateBasedRequestPrepareOptions extends PathTemplateBasedRequestPrepareOptions {
  var deserializationMapperForTerminalResponse: js.UndefOr[Mapper] = js.native
}

object LongRunningPathTemplateBasedRequestPrepareOptions {
  @scala.inline
  def apply(deserializationMapper: Mapper, method: String, pathTemplate: String, serializationMapper: Mapper): LongRunningPathTemplateBasedRequestPrepareOptions = {
    val __obj = js.Dynamic.literal(deserializationMapper = deserializationMapper.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], pathTemplate = pathTemplate.asInstanceOf[js.Any], serializationMapper = serializationMapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongRunningPathTemplateBasedRequestPrepareOptions]
  }
  @scala.inline
  implicit class LongRunningPathTemplateBasedRequestPrepareOptionsOps[Self <: LongRunningPathTemplateBasedRequestPrepareOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeserializationMapperForTerminalResponse(value: Mapper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserializationMapperForTerminalResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeserializationMapperForTerminalResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserializationMapperForTerminalResponse")(js.undefined)
        ret
    }
  }
  
}

