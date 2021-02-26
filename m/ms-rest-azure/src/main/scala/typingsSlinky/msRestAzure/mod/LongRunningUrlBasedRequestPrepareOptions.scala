package typingsSlinky.msRestAzure.mod

import typingsSlinky.msRest.mod.Mapper
import typingsSlinky.msRest.mod.UrlBasedRequestPrepareOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class LongRunningUrlBasedRequestPrepareOptionsMutableBuilder[Self <: LongRunningUrlBasedRequestPrepareOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeserializationMapperForTerminalResponse(value: Mapper): Self = StObject.set(x, "deserializationMapperForTerminalResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeserializationMapperForTerminalResponseUndefined: Self = StObject.set(x, "deserializationMapperForTerminalResponse", js.undefined)
  }
}
