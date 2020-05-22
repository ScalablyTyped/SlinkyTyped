package typingsSlinky.rbx.anon

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsReactType extends js.Object {
  var as: ReactComponentClass[_]
}

object AsReactType {
  @scala.inline
  def apply(as: ReactComponentClass[_]): AsReactType = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsReactType]
  }
}

