package typingsSlinky.pulumiAws.outputMod.codepipeline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebhookFilter extends js.Object {
  
  /**
    * The [JSON path](https://github.com/json-path/JsonPath) to filter on.
    */
  var jsonPath: String = js.native
  
  /**
    * The value to match on (e.g. `refs/heads/{Branch}`). See [AWS docs](https://docs.aws.amazon.com/codepipeline/latest/APIReference/API_WebhookFilterRule.html) for details.
    */
  var matchEquals: String = js.native
}
object WebhookFilter {
  
  @scala.inline
  def apply(jsonPath: String, matchEquals: String): WebhookFilter = {
    val __obj = js.Dynamic.literal(jsonPath = jsonPath.asInstanceOf[js.Any], matchEquals = matchEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookFilter]
  }
  
  @scala.inline
  implicit class WebhookFilterOps[Self <: WebhookFilter] (val x: Self) extends AnyVal {
    
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
    def setJsonPath(value: String): Self = this.set("jsonPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchEquals(value: String): Self = this.set("matchEquals", value.asInstanceOf[js.Any])
  }
}
