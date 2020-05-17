package typingsSlinky.reactTransitionGroup.anon

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictprop
  extends /* prop */ StringDictionary[js.Any] {
  var childFactory: js.UndefOr[js.Function1[/* child */ ReactElement, ReactElement]] = js.native
  var children: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.native
}

object Dictprop {
  @scala.inline
  def apply(): Dictprop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictprop]
  }
  @scala.inline
  implicit class DictpropOps[Self <: Dictprop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildFactory(value: /* child */ ReactElement => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childFactory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChildFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childFactory")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: ReactElement | js.Array[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
  }
  
}

