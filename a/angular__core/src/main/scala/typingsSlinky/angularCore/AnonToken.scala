package typingsSlinky.angularCore

import typingsSlinky.angularCore.angularCoreStrings.any
import typingsSlinky.angularCore.angularCoreStrings.root
import typingsSlinky.angularCore.r3SymbolsMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonToken[T] extends js.Object {
  var providedIn: js.UndefOr[Type[_] | root | any | Null] = js.native
  var token: js.Any = js.native
  def factory(): T = js.native
}

object AnonToken {
  @scala.inline
  def apply[T](factory: () => T, token: js.Any): AnonToken[T] = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory), token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonToken[T]]
  }
  @scala.inline
  implicit class AnonTokenOps[Self[t] <: AnonToken[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFactory(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToken(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvidedIn(value: Type[_] | root | any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providedIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvidedIn: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providedIn")(js.undefined)
        ret
    }
    @scala.inline
    def withProvidedInNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providedIn")(null)
        ret
    }
  }
  
}

