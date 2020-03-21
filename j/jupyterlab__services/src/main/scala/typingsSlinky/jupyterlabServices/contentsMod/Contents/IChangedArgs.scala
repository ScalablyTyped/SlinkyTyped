package typingsSlinky.jupyterlabServices.contentsMod.Contents

import typingsSlinky.jupyterlabServices.PartialIModel
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
trait IChangedArgs extends js.Object {
  /**
    * The old contents.
    */
  var newValue: PartialIModel | Null
  /**
    * The new contents.
    */
  var oldValue: PartialIModel | Null
  /**
    * The type of change.
    */
  var `type`: `new` | delete | rename | save
}

object IChangedArgs {
  @scala.inline
  def apply(
    `type`: `new` | delete | rename | save,
    newValue: PartialIModel = null,
    oldValue: PartialIModel = null
  ): IChangedArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangedArgs]
  }
}

