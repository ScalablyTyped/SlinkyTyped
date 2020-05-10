package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAppObjectPrototype[P /* <: IGenericObjectProperties */, O /* <: IGenericObject */] extends js.Object {
  def createObject(qProp: P): js.Promise[O] = js.native
  def createSessionObject(qProp: P): js.Promise[O] = js.native
}

object IAppObjectPrototype {
  @scala.inline
  def apply[P, O](createObject: P => js.Promise[O], createSessionObject: P => js.Promise[O]): IAppObjectPrototype[P, O] = {
    val __obj = js.Dynamic.literal(createObject = js.Any.fromFunction1(createObject), createSessionObject = js.Any.fromFunction1(createSessionObject))
    __obj.asInstanceOf[IAppObjectPrototype[P, O]]
  }
  @scala.inline
  implicit class IAppObjectPrototypeOps[Self[p, o] <: IAppObjectPrototype[p, o], P, O] (val x: Self[P, O]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P, O] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P, O]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[P, O]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[P, O]) with Other]
    @scala.inline
    def withCreateObject(value: P => js.Promise[O]): Self[P, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createObject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateSessionObject(value: P => js.Promise[O]): Self[P, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSessionObject")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

