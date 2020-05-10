package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBasetree extends js.Object {
  var base_tree: AnonType = js.native
  var owner: AnonRequired = js.native
  var repo: AnonRequired = js.native
  var tree: AnonRequired = js.native
  @JSName("tree[].content")
  var `tree[]Dotcontent`: AnonType = js.native
  @JSName("tree[].mode")
  var `tree[]Dotmode`: AnonEnum = js.native
  @JSName("tree[].path")
  var `tree[]Dotpath`: AnonType = js.native
  @JSName("tree[].sha")
  var `tree[]Dotsha`: AnonAllowNull = js.native
  @JSName("tree[].type")
  var `tree[]Dottype`: AnonEnum = js.native
}

object AnonBasetree {
  @scala.inline
  def apply(
    base_tree: AnonType,
    owner: AnonRequired,
    repo: AnonRequired,
    tree: AnonRequired,
    `tree[]Dotcontent`: AnonType,
    `tree[]Dotmode`: AnonEnum,
    `tree[]Dotpath`: AnonType,
    `tree[]Dotsha`: AnonAllowNull,
    `tree[]Dottype`: AnonEnum
  ): AnonBasetree = {
    val __obj = js.Dynamic.literal(base_tree = base_tree.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.updateDynamic("tree[].content")(`tree[]Dotcontent`.asInstanceOf[js.Any])
    __obj.updateDynamic("tree[].mode")(`tree[]Dotmode`.asInstanceOf[js.Any])
    __obj.updateDynamic("tree[].path")(`tree[]Dotpath`.asInstanceOf[js.Any])
    __obj.updateDynamic("tree[].sha")(`tree[]Dotsha`.asInstanceOf[js.Any])
    __obj.updateDynamic("tree[].type")(`tree[]Dottype`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBasetree]
  }
  @scala.inline
  implicit class AnonBasetreeOps[Self <: AnonBasetree] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase_tree(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base_tree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTree(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withTree[]Dotcontent`(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree[].content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withTree[]Dotmode`(value: AnonEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree[].mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withTree[]Dotpath`(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree[].path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withTree[]Dotsha`(value: AnonAllowNull): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree[].sha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withTree[]Dottype`(value: AnonEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree[].type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

