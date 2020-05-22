package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comments extends js.Object {
  var body: Type
  var comments: Type
  @JSName("comments[].body")
  var `comments[]Dotbody`: Required
  @JSName("comments[].path")
  var `comments[]Dotpath`: Required
  @JSName("comments[].position")
  var `comments[]Dotposition`: Required
  var commit_id: Type
  var event: Enum
  var number: Alias
  var owner: Required
  var pull_number: Required
  var repo: Required
}

object Comments {
  @scala.inline
  def apply(
    body: Type,
    comments: Type,
    `comments[]Dotbody`: Required,
    `comments[]Dotpath`: Required,
    `comments[]Dotposition`: Required,
    commit_id: Type,
    event: Enum,
    number: Alias,
    owner: Required,
    pull_number: Required,
    repo: Required
  ): Comments = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.updateDynamic("comments[].body")(`comments[]Dotbody`.asInstanceOf[js.Any])
    __obj.updateDynamic("comments[].path")(`comments[]Dotpath`.asInstanceOf[js.Any])
    __obj.updateDynamic("comments[].position")(`comments[]Dotposition`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comments]
  }
}

