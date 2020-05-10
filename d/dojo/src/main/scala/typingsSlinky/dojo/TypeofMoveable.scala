package typingsSlinky.dojo

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.dojo.dojo.dnd.Moveable.MoveableArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofMoveable extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/dnd/Moveable.__MoveableArgs.html
    *
    *
    */
  var __MoveableArgs: Instantiable0[MoveableArgs] = js.native
}

object TypeofMoveable {
  @scala.inline
  def apply(__MoveableArgs: Instantiable0[MoveableArgs]): TypeofMoveable = {
    val __obj = js.Dynamic.literal(__MoveableArgs = __MoveableArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofMoveable]
  }
  @scala.inline
  implicit class TypeofMoveableOps[Self <: TypeofMoveable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__MoveableArgs(value: Instantiable0[MoveableArgs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__MoveableArgs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

