package typingsSlinky.atLoadableComponent.atLoadableComponentMod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultImportedComponent[P] extends js.Object {
  var default: ReactComponentClass[P]
}

object DefaultImportedComponent {
  @scala.inline
  def apply[P](default: ReactComponentClass[P]): DefaultImportedComponent[P] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefaultImportedComponent[P]]
  }
}

