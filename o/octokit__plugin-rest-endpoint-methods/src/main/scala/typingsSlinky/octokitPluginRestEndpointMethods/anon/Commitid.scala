package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commitid extends js.Object {
  var body: Required
  var commit_id: Required
  var in_reply_to: DeprecatedDescription
  var line: Type
  var number: Alias
  var owner: Required
  var path: Required
  var position: Type
  var pull_number: Required
  var repo: Required
  var side: Enum
  var start_line: Type
  var start_side: Enum
}

object Commitid {
  @scala.inline
  def apply(
    body: Required,
    commit_id: Required,
    in_reply_to: DeprecatedDescription,
    line: Type,
    number: Alias,
    owner: Required,
    path: Required,
    position: Type,
    pull_number: Required,
    repo: Required,
    side: Enum,
    start_line: Type,
    start_side: Enum
  ): Commitid = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], in_reply_to = in_reply_to.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any], start_line = start_line.asInstanceOf[js.Any], start_side = start_side.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commitid]
  }
}

