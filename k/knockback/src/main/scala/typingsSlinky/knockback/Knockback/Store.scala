package typingsSlinky.knockback.Knockback

import typingsSlinky.backbone.mod.Model
import typingsSlinky.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store extends Destroyable {
  def clear(): js.Any = js.native
  def findOrCreate(obj: Model, options: StoreOptions): js.Any = js.native
  def register(obj: Model, observable: KnockoutObservable[_], options: StoreOptions): js.Any = js.native
}

object Store {
  @scala.inline
  def apply(
    clear: () => js.Any,
    destroy: () => js.Any,
    findOrCreate: (Model, StoreOptions) => js.Any,
    register: (Model, KnockoutObservable[_], StoreOptions) => js.Any
  ): Store = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), destroy = js.Any.fromFunction0(destroy), findOrCreate = js.Any.fromFunction2(findOrCreate), register = js.Any.fromFunction3(register))
    __obj.asInstanceOf[Store]
  }
  @scala.inline
  implicit class StoreOps[Self <: Store] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFindOrCreate(value: (Model, StoreOptions) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findOrCreate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegister(value: (Model, KnockoutObservable[_], StoreOptions) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

