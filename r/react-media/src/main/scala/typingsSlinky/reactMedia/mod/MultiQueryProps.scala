package typingsSlinky.reactMedia.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.std.Partial
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-media.react-media.BaseProps & {  queries  :Queries,   defaultMatches ? :std.Partial<react-media.react-media.QueryResults<Queries>>,   children ? :(matches : react-media.react-media.QueryResults<Queries>): react.react.ReactNode | react.react.ReactNode, onChange ? (matches : react-media.react-media.QueryResults<Queries>): void} */
@js.native
trait MultiQueryProps[Queries] extends js.Object {
  var children: js.UndefOr[(js.Function1[/* matches */ QueryResults[Queries], TagMod[Any]]) | TagMod[Any]] = js.native
  var defaultMatches: js.UndefOr[Partial[QueryResults[Queries]]] = js.native
  var onChange: js.UndefOr[js.Function1[/* matches */ QueryResults[Queries], Unit]] = js.native
  var queries: Queries = js.native
  var render: js.UndefOr[js.Function0[TagMod[Any]]] = js.native
  var targetWindow: js.UndefOr[Window_] = js.native
}

object MultiQueryProps {
  @scala.inline
  def apply[Queries](queries: Queries): MultiQueryProps[Queries] = {
    val __obj = js.Dynamic.literal(queries = queries.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiQueryProps[Queries]]
  }
  @scala.inline
  implicit class MultiQueryPropsOps[Self[queries] <: MultiQueryProps[queries], Queries] (val x: Self[Queries]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Queries] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Queries]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Queries] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Queries] with Other]
    @scala.inline
    def withQueries(value: Queries): Self[Queries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self[Queries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenFunction1(value: /* matches */ QueryResults[Queries] => TagMod[Any]): Self[Queries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildren(value: (js.Function1[/* matches */ QueryResults[Queries], TagMod[Any]]) | TagMod[Any]): Self[Queries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[Queries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultMatches(value: Partial[QueryResults[Queries]]): Self[Queries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultMatches: Self[Queries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMatches")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* matches */ QueryResults[Queries] => Unit): Self[Queries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self[Queries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: () => TagMod[Any]): Self[Queries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRender: Self[Queries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetWindow(value: Window_): Self[Queries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetWindow: Self[Queries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetWindow")(js.undefined)
        ret
    }
  }
  
}

