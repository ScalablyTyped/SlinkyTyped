package typingsSlinky.googleProtobuf.apiPbMod.Method

import typingsSlinky.googleProtobuf.typePbMod.Syntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var name: String = js.native
  
  var optionsList: js.Array[typingsSlinky.googleProtobuf.typePbMod.Option.AsObject] = js.native
  
  var requestStreaming: Boolean = js.native
  
  var requestTypeUrl: String = js.native
  
  var responseStreaming: Boolean = js.native
  
  var responseTypeUrl: String = js.native
  
  var syntax: Syntax = js.native
}
object AsObject {
  
  @scala.inline
  def apply(
    name: String,
    optionsList: js.Array[typingsSlinky.googleProtobuf.typePbMod.Option.AsObject],
    requestStreaming: Boolean,
    requestTypeUrl: String,
    responseStreaming: Boolean,
    responseTypeUrl: String,
    syntax: Syntax
  ): AsObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], optionsList = optionsList.asInstanceOf[js.Any], requestStreaming = requestStreaming.asInstanceOf[js.Any], requestTypeUrl = requestTypeUrl.asInstanceOf[js.Any], responseStreaming = responseStreaming.asInstanceOf[js.Any], responseTypeUrl = responseTypeUrl.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsListVarargs(value: typingsSlinky.googleProtobuf.typePbMod.Option.AsObject*): Self = this.set("optionsList", js.Array(value :_*))
    
    @scala.inline
    def setOptionsList(value: js.Array[typingsSlinky.googleProtobuf.typePbMod.Option.AsObject]): Self = this.set("optionsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestStreaming(value: Boolean): Self = this.set("requestStreaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTypeUrl(value: String): Self = this.set("requestTypeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseStreaming(value: Boolean): Self = this.set("responseStreaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTypeUrl(value: String): Self = this.set("responseTypeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntax(value: Syntax): Self = this.set("syntax", value.asInstanceOf[js.Any])
  }
}
