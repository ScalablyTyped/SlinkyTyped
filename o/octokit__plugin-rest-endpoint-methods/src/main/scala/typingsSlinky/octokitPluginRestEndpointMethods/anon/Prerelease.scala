package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Prerelease extends js.Object {
  var body: Type
  var draft: Type
  var name: Type
  var owner: Required
  var prerelease: Type
  var repo: Required
  var tag_name: Required
  var target_commitish: Type
}

object Prerelease {
  @scala.inline
  def apply(
    body: Type,
    draft: Type,
    name: Type,
    owner: Required,
    prerelease: Type,
    repo: Required,
    tag_name: Required,
    target_commitish: Type
  ): Prerelease = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], prerelease = prerelease.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tag_name = tag_name.asInstanceOf[js.Any], target_commitish = target_commitish.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prerelease]
  }
}

