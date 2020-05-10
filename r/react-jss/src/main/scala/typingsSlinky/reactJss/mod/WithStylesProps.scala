package typingsSlinky.reactJss.mod

import typingsSlinky.jss.mod.Classes
import typingsSlinky.jss.mod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithStylesProps[S /* <: Styles[String] | (js.Function1[/* theme */ js.Any, Styles[String]]) */] extends js.Object {
  var classes: Classes[/* keyof S */ String] = js.native
}

object WithStylesProps {
  @scala.inline
  def apply[S](classes: Classes[/* keyof S */ String]): WithStylesProps[S] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithStylesProps[S]]
  }
  @scala.inline
  implicit class WithStylesPropsOps[Self[s] <: WithStylesProps[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withClasses(value: Classes[/* keyof S */ String]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

