package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Basetree extends js.Object {
  var base_tree: Type = js.native
  var owner: Required = js.native
  var repo: Required = js.native
  var tree: Required = js.native
  @JSName("tree[].content")
  var `tree[]Dotcontent`: Type = js.native
  @JSName("tree[].mode")
  var `tree[]Dotmode`: Enum = js.native
  @JSName("tree[].path")
  var `tree[]Dotpath`: Type = js.native
  @JSName("tree[].sha")
  var `tree[]Dotsha`: AllowNull = js.native
  @JSName("tree[].type")
  var `tree[]Dottype`: Enum = js.native
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
  @scala.inline
  implicit class BasetreeOps[Self <: Basetree] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase_tree(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base_tree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTree(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withTree[]Dotcontent`(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree[].content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withTree[]Dotmode`(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree[].mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withTree[]Dotpath`(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree[].path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withTree[]Dotsha`(value: AllowNull): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree[].sha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withTree[]Dottype`(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree[].type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

