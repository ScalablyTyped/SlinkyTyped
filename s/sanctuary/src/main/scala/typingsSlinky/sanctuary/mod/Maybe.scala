package typingsSlinky.sanctuary.mod

import typingsSlinky.sanctuary.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Maybe[A] extends js.Object {
  var constructor: Type = js.native
}

object Maybe {
  @scala.inline
  def apply[A](constructor: Type): Maybe[A] = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maybe[A]]
  }
  @scala.inline
  implicit class MaybeOps[Self[a] <: Maybe[a], A] (val x: Self[A]) extends AnyVal {
    @scala.inline
    def duplicate: Self[A] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[A]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[A] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[A] with Other]
    @scala.inline
    def withConstructor(value: Type): Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

