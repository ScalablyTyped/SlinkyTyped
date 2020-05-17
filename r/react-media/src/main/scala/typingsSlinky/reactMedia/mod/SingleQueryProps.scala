package typingsSlinky.reactMedia.mod

import org.scalajs.dom.raw.Window
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-media.react-media.BaseProps & {  query  :react-media.react-media.MediaQueryValue,   defaultMatches ? :boolean,   children ? :(matches : boolean): react.react.ReactNode | react.react.ReactNode, onChange ? (matches : boolean): void} */
@js.native
trait SingleQueryProps extends js.Object {
  var children: js.UndefOr[(js.Function1[/* matches */ Boolean, TagMod[Any]]) | TagMod[Any]] = js.native
  var defaultMatches: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[js.Function1[/* matches */ Boolean, Unit]] = js.native
  var query: MediaQueryValue = js.native
  var render: js.UndefOr[js.Function0[TagMod[Any]]] = js.native
  var targetWindow: js.UndefOr[Window] = js.native
}

object SingleQueryProps {
  @scala.inline
  def apply(query: MediaQueryValue): SingleQueryProps = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleQueryProps]
  }
  @scala.inline
  implicit class SingleQueryPropsOps[Self <: SingleQueryProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuery(value: MediaQueryValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenFunction1(value: /* matches */ Boolean => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildren(value: (js.Function1[/* matches */ Boolean, TagMod[Any]]) | TagMod[Any]): Self = {
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
    @scala.inline
    def withDefaultMatches(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMatches")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* matches */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetWindow(value: Window): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetWindow")(js.undefined)
        ret
    }
  }
  
}

