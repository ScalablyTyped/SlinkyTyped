package typingsSlinky.jupyterlabCoreutils.statedbMod.StateDB

import typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.clear
import typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.remove
import typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.save
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A state database change.
  */
trait Change extends js.Object {
  /**
    * The key of the database item that was changed.
    *
    * #### Notes
    * This field is set to `null` for global changes (i.e. `clear`).
    */
  var id: String | Null
  /**
    * The type of change.
    */
  var `type`: clear | remove | save
}

object Change {
  @scala.inline
  def apply(`type`: clear | remove | save, id: String = null): Change = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
}

