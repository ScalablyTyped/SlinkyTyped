package typingsSlinky.reactMedia.mod

import org.scalajs.dom.raw.Window
import slinky.core.TagMod
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-media.react-media.BaseProps & {  queries  :Queries,   defaultMatches ? :std.Partial<react-media.react-media.QueryResults<Queries>>,   children ? :(matches : react-media.react-media.QueryResults<Queries>): react.react.ReactNode | react.react.ReactNode, onChange ? (matches : react-media.react-media.QueryResults<Queries>): void} */
trait MultiQueryProps[Queries] extends js.Object {
  var children: js.UndefOr[(js.Function1[/* matches */ QueryResults[Queries], TagMod[Any]]) | TagMod[Any]] = js.undefined
  var defaultMatches: js.UndefOr[Partial[QueryResults[Queries]]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* matches */ QueryResults[Queries], Unit]] = js.undefined
  var queries: Queries
  var render: js.UndefOr[js.Function0[TagMod[Any]]] = js.undefined
  var targetWindow: js.UndefOr[Window] = js.undefined
}

object MultiQueryProps {
  @scala.inline
  def apply[Queries](
    queries: Queries,
    children: (js.Function1[/* matches */ QueryResults[Queries], TagMod[Any]]) | TagMod[Any] = null,
    defaultMatches: Partial[QueryResults[Queries]] = null,
    onChange: /* matches */ QueryResults[Queries] => Unit = null,
    render: () => TagMod[Any] = null,
    targetWindow: Window = null
  ): MultiQueryProps[Queries] = {
    val __obj = js.Dynamic.literal(queries = queries.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (defaultMatches != null) __obj.updateDynamic("defaultMatches")(defaultMatches.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction0(render))
    if (targetWindow != null) __obj.updateDynamic("targetWindow")(targetWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiQueryProps[Queries]]
  }
}

