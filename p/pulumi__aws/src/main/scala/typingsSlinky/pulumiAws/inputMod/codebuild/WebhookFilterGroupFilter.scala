package typingsSlinky.pulumiAws.inputMod.codebuild

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebhookFilterGroupFilter extends js.Object {
  
  /**
    * If set to `true`, the specified filter does *not* trigger a build. Defaults to `false`.
    */
  var excludeMatchedPattern: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * For a filter that uses `EVENT` type, a comma-separated string that specifies one event: `PUSH`, `PULL_REQUEST_CREATED`, `PULL_REQUEST_UPDATED`, `PULL_REQUEST_REOPENED`. `PULL_REQUEST_MERGED` works with GitHub & GitHub Enterprise only. For a filter that uses any of the other filter types, a regular expression.
    */
  var pattern: Input[String] = js.native
  
  /**
    * The webhook filter group's type. Valid values for this parameter are: `EVENT`, `BASE_REF`, `HEAD_REF`, `ACTOR_ACCOUNT_ID`, `FILE_PATH`, `COMMIT_MESSAGE`. At least one filter group must specify `EVENT` as its type.
    */
  var `type`: Input[String] = js.native
}
object WebhookFilterGroupFilter {
  
  @scala.inline
  def apply(pattern: Input[String], `type`: Input[String]): WebhookFilterGroupFilter = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookFilterGroupFilter]
  }
  
  @scala.inline
  implicit class WebhookFilterGroupFilterOps[Self <: WebhookFilterGroupFilter] (val x: Self) extends AnyVal {
    
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
    def setPattern(value: Input[String]): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeMatchedPattern(value: Input[Boolean]): Self = this.set("excludeMatchedPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeMatchedPattern: Self = this.set("excludeMatchedPattern", js.undefined)
  }
}
