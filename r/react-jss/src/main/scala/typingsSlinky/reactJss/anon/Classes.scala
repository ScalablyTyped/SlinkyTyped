package typingsSlinky.reactJss.anon

import typingsSlinky.jss.mod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Classes[S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */, ClassNames /* <: String | Double | js.Symbol */] extends js.Object {
  var classes: typingsSlinky.jss.mod.Classes[ClassNames | (/* keyof std.ReturnType<S> */ String)] = js.native
}

object Classes {
  @scala.inline
  def apply[S, ClassNames](classes: typingsSlinky.jss.mod.Classes[ClassNames | (/* keyof std.ReturnType<S> */ String)]): Classes[S, ClassNames] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classes[S, ClassNames]]
  }
  @scala.inline
  implicit class ClassesOps[Self[s, classnames] <: Classes[s, classnames], S, ClassNames] (val x: Self[S, ClassNames]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S, ClassNames] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S, ClassNames]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[S, ClassNames]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[S, ClassNames]) with Other]
    @scala.inline
    def withClasses(value: typingsSlinky.jss.mod.Classes[ClassNames | (/* keyof std.ReturnType<S> */ String)]): Self[S, ClassNames] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

