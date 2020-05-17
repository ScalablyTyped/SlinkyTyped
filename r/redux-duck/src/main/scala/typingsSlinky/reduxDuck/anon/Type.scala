package typingsSlinky.reduxDuck.anon

import typingsSlinky.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type[T /* <: String with (/* import warning: importer.ImportType#apply Failed type conversion: AppAction['type'] */ js.Any) */, AppAction /* <: Action[_] */] extends js.Object {
  var `type`: T = js.native
}

object Type {
  @scala.inline
  def apply[T, AppAction](`type`: T): Type[T, AppAction] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[T, AppAction]]
  }
  @scala.inline
  implicit class TypeOps[Self[t, appaction] <: Type[t, appaction], T, AppAction] (val x: Self[T, AppAction]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, AppAction] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, AppAction]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, AppAction]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, AppAction]) with Other]
    @scala.inline
    def withType(value: T): Self[T, AppAction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

