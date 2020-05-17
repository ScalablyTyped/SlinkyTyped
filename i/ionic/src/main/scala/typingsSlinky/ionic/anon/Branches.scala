package typingsSlinky.ionic.anon

import typingsSlinky.ionic.definitionsMod.AssociationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Branches extends js.Object {
  var branches: js.Array[String] = js.native
  var repoId: Double = js.native
  var `type`: AssociationType = js.native
}

object Branches {
  @scala.inline
  def apply(branches: js.Array[String], repoId: Double, `type`: AssociationType): Branches = {
    val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], repoId = repoId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Branches]
  }
  @scala.inline
  implicit class BranchesOps[Self <: Branches] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBranches(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepoId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repoId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: AssociationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

