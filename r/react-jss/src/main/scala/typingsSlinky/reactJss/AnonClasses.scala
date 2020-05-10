package typingsSlinky.reactJss

import typingsSlinky.jss.mod.Classes
import typingsSlinky.jss.mod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClasses[S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */, ClassNames /* <: String | Double | js.Symbol */] extends js.Object {
  var classes: Classes[ClassNames | (/* keyof std.ReturnType<S> */ String)] = js.native
}

object AnonClasses {
  @scala.inline
  def apply[S, ClassNames](classes: Classes[ClassNames | (/* keyof std.ReturnType<S> */ String)]): AnonClasses[S, ClassNames] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClasses[S, ClassNames]]
  }
  @scala.inline
  implicit class AnonClassesOps[Self[s, classnames] <: AnonClasses[s, classnames], S, ClassNames] (val x: Self[S, ClassNames]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S, ClassNames] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S, ClassNames]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[S, ClassNames]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[S, ClassNames]) with Other]
    @scala.inline
    def withClasses(value: Classes[ClassNames | (/* keyof std.ReturnType<S> */ String)]): Self[S, ClassNames] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

