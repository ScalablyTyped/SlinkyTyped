package typingsSlinky.hapiHapi.anon

import typingsSlinky.hapiCatbox.mod.ClientOptions
import typingsSlinky.hapiCatbox.mod.EnginePrototype
import typingsSlinky.hapiHapi.mod.CacheProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constructor[T /* <: ClientOptions */] extends CacheProvider[T] {
  var constructor: EnginePrototype[_] = js.native
  var options: js.UndefOr[T] = js.native
}

object Constructor {
  @scala.inline
  def apply[T](constructor: EnginePrototype[_]): Constructor[T] = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constructor[T]]
  }
  @scala.inline
  implicit class ConstructorOps[Self[t] <: Constructor[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withConstructor(value: EnginePrototype[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

