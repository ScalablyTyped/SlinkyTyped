package typingsSlinky.jupyterlabServices.contentsMod.Contents

import typingsSlinky.jupyterlabServices.anon.PartialIModel
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.`new`
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.delete
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.rename
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.save
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The change args for a file change.
  */
@js.native
trait IChangedArgs extends js.Object {
  /**
    * The old contents.
    */
  var newValue: PartialIModel | Null = js.native
  /**
    * The new contents.
    */
  var oldValue: PartialIModel | Null = js.native
  /**
    * The type of change.
    */
  var `type`: `new` | delete | rename | save = js.native
}

object IChangedArgs {
  @scala.inline
  def apply(`type`: `new` | delete | rename | save): IChangedArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangedArgs]
  }
  @scala.inline
  implicit class IChangedArgsOps[Self <: IChangedArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: `new` | delete | rename | save): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewValue(value: PartialIModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(null)
        ret
    }
    @scala.inline
    def withOldValue(value: PartialIModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValue")(null)
        ret
    }
  }
  
}

