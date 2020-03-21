package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.Plussign1
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.`-1`
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.confused
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.eyes
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.heart
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.hooray
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.laugh
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.rocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsCreateForIssueParamsDeprecatedNumber extends js.Object {
  /**
    * The [reaction type](https://developer.github.com/v3/reactions/#reaction-types) to add to the issue.
    */
  var content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes
  /**
    * @deprecated "number" parameter renamed to "issue_number"
    */
  var number: Double
  var owner: String
  var repo: String
}

object ReactionsCreateForIssueParamsDeprecatedNumber {
  @scala.inline
  def apply(
    content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes,
    number: Double,
    owner: String,
    repo: String
  ): ReactionsCreateForIssueParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReactionsCreateForIssueParamsDeprecatedNumber]
  }
}

