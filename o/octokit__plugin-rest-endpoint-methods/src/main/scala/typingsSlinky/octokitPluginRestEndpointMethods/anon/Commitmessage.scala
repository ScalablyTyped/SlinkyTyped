package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commitmessage extends js.Object {
  var commit_message: Type
  var commit_title: Type
  var merge_method: Enum
  var number: Alias
  var owner: Required
  var pull_number: Required
  var repo: Required
  var sha: Type
}

object Commitmessage {
  @scala.inline
  def apply(
    commit_message: Type,
    commit_title: Type,
    merge_method: Enum,
    number: Alias,
    owner: Required,
    pull_number: Required,
    repo: Required,
    sha: Type
  ): Commitmessage = {
    val __obj = js.Dynamic.literal(commit_message = commit_message.asInstanceOf[js.Any], commit_title = commit_title.asInstanceOf[js.Any], merge_method = merge_method.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commitmessage]
  }
}

