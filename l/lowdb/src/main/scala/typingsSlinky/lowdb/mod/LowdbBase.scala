package typingsSlinky.lowdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LowdbBase[SchemaT] extends js.Object {
  def getState(): SchemaT = js.native
  def setState(state: SchemaT): this.type = js.native
}

object LowdbBase {
  @scala.inline
  def apply[SchemaT](getState: () => SchemaT, setState: SchemaT => LowdbBase[SchemaT]): LowdbBase[SchemaT] = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), setState = js.Any.fromFunction1(setState))
    __obj.asInstanceOf[LowdbBase[SchemaT]]
  }
  @scala.inline
  implicit class LowdbBaseOps[Self[schemat] <: LowdbBase[schemat], SchemaT] (val x: Self[SchemaT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[SchemaT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[SchemaT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[SchemaT] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[SchemaT] with Other]
    @scala.inline
    def withGetState(value: () => SchemaT): Self[SchemaT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetState(value: SchemaT => LowdbBase[SchemaT]): Self[SchemaT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setState")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

