package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PositionFunction extends js.Object {
  var positionFunction: js.UndefOr[js.Any] = js.native
  var storage: js.UndefOr[js.Array[js.Any]] = js.native
  var vertexFunction: js.UndefOr[js.Any] = js.native
}

object PositionFunction {
  @scala.inline
  def apply(): PositionFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionFunction]
  }
  @scala.inline
  implicit class PositionFunctionOps[Self <: PositionFunction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPositionFunction(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withStorage(value: js.Array[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(js.undefined)
        ret
    }
    @scala.inline
    def withVertexFunction(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertexFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexFunction")(js.undefined)
        ret
    }
  }
  
}

