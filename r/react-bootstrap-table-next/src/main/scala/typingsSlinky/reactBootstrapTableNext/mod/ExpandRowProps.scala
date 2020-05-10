package typingsSlinky.reactBootstrapTableNext.mod

import org.scalajs.dom.raw.Element
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.reactBootstrapTableNext.reactBootstrapTableNextStrings.left
import typingsSlinky.reactBootstrapTableNext.reactBootstrapTableNextStrings.right
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpandRowProps[T] extends js.Object {
  var className: String | (js.Function3[/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double, String]) = js.native
  var expandByColumnOnly: js.UndefOr[Boolean] = js.native
  var expandColumnPosition: left | right = js.native
  var expandColumnRenderer: ReactElement = js.native
  var expandHeaderColumnRenderer: ReactElement = js.native
  var expanded: js.UndefOr[js.Array[Double]] = js.native
  var nonExpandable: js.Array[Double] = js.native
  var onExpand: js.UndefOr[
    js.Function4[
      /* row */ T, 
      /* isExpand */ Boolean, 
      /* rowIndex */ Double, 
      /* e */ SyntheticEvent[Event_, Element], 
      Unit
    ]
  ] = js.native
  var onlyOneExpanding: js.UndefOr[Boolean] = js.native
  var showExpandColumn: js.UndefOr[Boolean] = js.native
  def onExpandAll(isExpandAll: Boolean, results: js.Array[Double], e: SyntheticEvent[Event_, Element]): Unit = js.native
  def renderer(row: T, rowIndex: Double): ReactElement = js.native
}

object ExpandRowProps {
  @scala.inline
  def apply[T](
    className: String | (js.Function3[/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double, String]),
    expandColumnPosition: left | right,
    expandColumnRenderer: ReactElement,
    expandHeaderColumnRenderer: ReactElement,
    nonExpandable: js.Array[Double],
    onExpandAll: (Boolean, js.Array[Double], SyntheticEvent[Event_, Element]) => Unit,
    renderer: (T, Double) => ReactElement
  ): ExpandRowProps[T] = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], expandColumnPosition = expandColumnPosition.asInstanceOf[js.Any], expandColumnRenderer = expandColumnRenderer.asInstanceOf[js.Any], expandHeaderColumnRenderer = expandHeaderColumnRenderer.asInstanceOf[js.Any], nonExpandable = nonExpandable.asInstanceOf[js.Any], onExpandAll = js.Any.fromFunction3(onExpandAll), renderer = js.Any.fromFunction2(renderer))
    __obj.asInstanceOf[ExpandRowProps[T]]
  }
  @scala.inline
  implicit class ExpandRowPropsOps[Self[t] <: ExpandRowProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withClassNameFunction3(value: (/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double) => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withClassName(value: String | (js.Function3[/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double, String])): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandColumnPosition(value: left | right): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandColumnPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandColumnRenderer(value: ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandColumnRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandHeaderColumnRenderer(value: ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandHeaderColumnRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonExpandable(value: js.Array[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonExpandable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnExpandAll(value: (Boolean, js.Array[Double], SyntheticEvent[Event_, Element]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpandAll")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRenderer(value: (T, Double) => ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withExpandByColumnOnly(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandByColumnOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandByColumnOnly: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandByColumnOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withExpanded(value: js.Array[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpanded: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExpand(
      value: (/* row */ T, /* isExpand */ Boolean, /* rowIndex */ Double, /* e */ SyntheticEvent[Event_, Element]) => Unit
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpand")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnExpand: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyOneExpanding(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyOneExpanding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyOneExpanding: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyOneExpanding")(js.undefined)
        ret
    }
    @scala.inline
    def withShowExpandColumn(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showExpandColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowExpandColumn: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showExpandColumn")(js.undefined)
        ret
    }
  }
  
}

