package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StageDeclaration extends js.Object {
  /**
    * The actions included in a stage.
    */
  var actions: StageActionDeclarationList = js.native
  /**
    * Reserved for future use.
    */
  var blockers: js.UndefOr[StageBlockerDeclarationList] = js.native
  /**
    * The name of the stage.
    */
  var name: StageName = js.native
}

object StageDeclaration {
  @scala.inline
  def apply(actions: StageActionDeclarationList, name: StageName): StageDeclaration = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StageDeclaration]
  }
  @scala.inline
  implicit class StageDeclarationOps[Self <: StageDeclaration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: StageActionDeclarationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: StageName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockers(value: StageBlockerDeclarationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockers")(js.undefined)
        ret
    }
  }
  
}

