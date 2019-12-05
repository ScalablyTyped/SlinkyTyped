package typingsSlinky.atJupyterlabServices.libContentsMod.Contents

import typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.`new`
import typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.delete
import typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.rename
import typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.save
import typingsSlinky.std.Partial
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
  var newValue: Partial[IModel] | Null
  /**
    * The new contents.
    */
  var oldValue: Partial[IModel] | Null
  /**
    * The type of change.
    */
  var `type`: `new` | delete | rename | save
}

object IChangedArgs {
  @scala.inline
  def apply(
    `type`: `new` | delete | rename | save,
    newValue: Partial[IModel] = null,
    oldValue: Partial[IModel] = null
  ): IChangedArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangedArgs]
  }
}

