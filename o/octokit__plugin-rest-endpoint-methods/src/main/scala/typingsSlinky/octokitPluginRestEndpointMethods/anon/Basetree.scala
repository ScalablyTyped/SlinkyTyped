package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Basetree extends js.Object {
  var base_tree: Type
  var owner: Required
  var repo: Required
  var tree: Required
  @JSName("tree[].content")
  var `tree[]Dotcontent`: Type
  @JSName("tree[].mode")
  var `tree[]Dotmode`: Enum
  @JSName("tree[].path")
  var `tree[]Dotpath`: Type
  @JSName("tree[].sha")
  var `tree[]Dotsha`: AllowNull
  @JSName("tree[].type")
  var `tree[]Dottype`: Enum
}

object Basetree {
  @scala.inline
  def apply(
    base_tree: Type,
    owner: Required,
    repo: Required,
    tree: Required,
    `tree[]Dotcontent`: Type,
    `tree[]Dotmode`: Enum,
    `tree[]Dotpath`: Type,
    `tree[]Dotsha`: AllowNull,
    `tree[]Dottype`: Enum
  ): Basetree = {
    val __obj = js.Dynamic.literal(base_tree = base_tree.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.updateDynamic("tree[].content")(`tree[]Dotcontent`.asInstanceOf[js.Any])
    __obj.updateDynamic("tree[].mode")(`tree[]Dotmode`.asInstanceOf[js.Any])
    __obj.updateDynamic("tree[].path")(`tree[]Dotpath`.asInstanceOf[js.Any])
    __obj.updateDynamic("tree[].sha")(`tree[]Dotsha`.asInstanceOf[js.Any])
    __obj.updateDynamic("tree[].type")(`tree[]Dottype`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Basetree]
  }
}

