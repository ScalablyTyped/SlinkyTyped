package typingsSlinky.reduxOrm

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.reduxOrm.modelMod.AnyModel
import typingsSlinky.reduxOrm.modelMod.IdType
import typingsSlinky.reduxOrm.modelMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetId[M /* <: Model[Instantiable0[AnyModel], _] */] extends js.Object {
  def getId(): IdType[M] = js.native
}

object AnonGetId {
  @scala.inline
  def apply[M](getId: () => IdType[M]): AnonGetId[M] = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId))
    __obj.asInstanceOf[AnonGetId[M]]
  }
  @scala.inline
  implicit class AnonGetIdOps[Self[m] <: AnonGetId[m], M] (val x: Self[M]) extends AnyVal {
    @scala.inline
    def duplicate: Self[M] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[M]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[M] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[M] with Other]
    @scala.inline
    def withGetId(value: () => IdType[M]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

