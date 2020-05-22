package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tagname extends js.Object {
  var body: Type
  var draft: Type
  var name: Type
  var owner: Required
  var prerelease: Type
  var release_id: Required
  var repo: Required
  var tag_name: Type
  var target_commitish: Type
}

object Tagname {
  @scala.inline
  def apply(
    body: Type,
    draft: Type,
    name: Type,
    owner: Required,
    prerelease: Type,
    release_id: Required,
    repo: Required,
    tag_name: Type,
    target_commitish: Type
  ): Tagname = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], prerelease = prerelease.asInstanceOf[js.Any], release_id = release_id.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tag_name = tag_name.asInstanceOf[js.Any], target_commitish = target_commitish.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tagname]
  }
}

