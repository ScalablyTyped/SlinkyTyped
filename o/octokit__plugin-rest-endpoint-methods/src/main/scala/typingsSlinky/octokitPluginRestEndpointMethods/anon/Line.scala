package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Line extends js.Object {
  var body: Required
  var commit_sha: Required
  var line: Type
  var owner: Required
  var path: Type
  var position: Type
  var repo: Required
  var sha: Alias
}

object Line {
  @scala.inline
  def apply(
    body: Required,
    commit_sha: Required,
    line: Type,
    owner: Required,
    path: Type,
    position: Type,
    repo: Required,
    sha: Alias
  ): Line = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], commit_sha = commit_sha.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
}

