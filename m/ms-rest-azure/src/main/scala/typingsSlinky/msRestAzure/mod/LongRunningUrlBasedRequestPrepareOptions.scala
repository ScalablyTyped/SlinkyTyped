package typingsSlinky.msRestAzure.mod

import typingsSlinky.msRest.mod.Mapper
import typingsSlinky.msRest.mod.UrlBasedRequestPrepareOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LongRunningUrlBasedRequestPrepareOptions extends UrlBasedRequestPrepareOptions {
  var deserializationMapperForTerminalResponse: js.UndefOr[Mapper] = js.native
}

object LongRunningUrlBasedRequestPrepareOptions {
  @scala.inline
  def apply(deserializationMapper: Mapper, method: String, serializationMapper: Mapper, url: String): LongRunningUrlBasedRequestPrepareOptions = {
    val __obj = js.Dynamic.literal(deserializationMapper = deserializationMapper.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], serializationMapper = serializationMapper.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongRunningUrlBasedRequestPrepareOptions]
  }
  @scala.inline
  implicit class LongRunningUrlBasedRequestPrepareOptionsOps[Self <: LongRunningUrlBasedRequestPrepareOptions] (val x: Self) extends AnyVal {
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

