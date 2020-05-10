package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestRepositoryTriggersInput extends js.Object {
  /**
    * The name of the repository in which to test the triggers.
    */
  var repositoryName: RepositoryName = js.native
  /**
    * The list of triggers to test.
    */
  var triggers: RepositoryTriggersList = js.native
}

object TestRepositoryTriggersInput {
  @scala.inline
  def apply(repositoryName: RepositoryName, triggers: RepositoryTriggersList): TestRepositoryTriggersInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRepositoryTriggersInput]
  }
  @scala.inline
  implicit class TestRepositoryTriggersInputOps[Self <: TestRepositoryTriggersInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRepositoryName(value: RepositoryName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggers(value: RepositoryTriggersList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

