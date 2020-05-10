package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRepositoryNameInput extends js.Object {
  /**
    * The new name for the repository.
    */
  var newName: RepositoryName = js.native
  /**
    * The current name of the repository.
    */
  var oldName: RepositoryName = js.native
}

object UpdateRepositoryNameInput {
  @scala.inline
  def apply(newName: RepositoryName, oldName: RepositoryName): UpdateRepositoryNameInput = {
    val __obj = js.Dynamic.literal(newName = newName.asInstanceOf[js.Any], oldName = oldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRepositoryNameInput]
  }
  @scala.inline
  implicit class UpdateRepositoryNameInputOps[Self <: UpdateRepositoryNameInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewName(value: RepositoryName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldName(value: RepositoryName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

