package typingsSlinky.reactBootstrapTableNext.mod

import org.scalajs.dom.raw.Element
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactBootstrapTableNext.AnonChecked
import typingsSlinky.reactBootstrapTableNext.reactBootstrapTableNextStrings.left
import typingsSlinky.reactBootstrapTableNext.reactBootstrapTableNextStrings.right
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectRowProps[T] extends js.Object {
  var bgColor: js.UndefOr[String] = js.native
  var classes: js.UndefOr[(js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[String]]) | String] = js.native
  var clickToEdit: js.UndefOr[Boolean] = js.native
  var clickToExpand: js.UndefOr[Boolean] = js.native
  var clickToSelect: js.UndefOr[Boolean] = js.native
  var headerColumnStyle: js.UndefOr[
    (js.Function1[/* status */ TableCheckboxStatus, js.UndefOr[CSSProperties]]) | CSSProperties
  ] = js.native
  var hideSelectAll: js.UndefOr[Boolean] = js.native
  var hideSelectColumn: js.UndefOr[Boolean] = js.native
  var mode: RowSelectionType = js.native
  var nonSelectable: js.UndefOr[js.Array[Double]] = js.native
  var nonSelectableClasses: js.UndefOr[(js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[String]]) | String] = js.native
  var nonSelectableStyle: js.UndefOr[
    (js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[CSSProperties]]) | CSSProperties
  ] = js.native
  var onSelect: js.UndefOr[
    js.Function4[
      /* row */ T, 
      /* isSelected */ Boolean, 
      /* rowIndex */ Double, 
      /* e */ SyntheticEvent[Event_, Element], 
      Unit | Boolean
    ]
  ] = js.native
  /**
    * This callback function will be called when select/unselect all and it only work when you configure selectRow.mode as checkbox.
    */
  var onSelectAll: js.UndefOr[
    js.Function3[
      /* isSelect */ Boolean, 
      /* rows */ js.Array[T], 
      /* e */ SyntheticEvent[Event_, Element], 
      Unit | js.Array[Double]
    ]
  ] = js.native
  var selectColumnPosition: js.UndefOr[left | right] = js.native
  var selectColumnStyle: js.UndefOr[
    (js.Function1[/* props */ AnonChecked, js.UndefOr[CSSProperties]]) | CSSProperties
  ] = js.native
  var selected: js.UndefOr[js.Array[Double | String]] = js.native
  var selectionHeaderRenderer: js.UndefOr[ReactElement] = js.native
  var selectionRenderer: js.UndefOr[ReactElement] = js.native
  var style: js.UndefOr[
    (js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[CSSProperties]]) | CSSProperties
  ] = js.native
}

object SelectRowProps {
  @scala.inline
  def apply[T](mode: RowSelectionType): SelectRowProps[T] = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectRowProps[T]]
  }
  @scala.inline
  implicit class SelectRowPropsOps[Self[t] <: SelectRowProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withMode(value: RowSelectionType): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgColor(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgColor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgColor")(js.undefined)
        ret
    }
    @scala.inline
    def withClassesFunction2(value: (/* row */ T, /* rowIndex */ Double) => js.UndefOr[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClasses(value: (js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[String]]) | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withClickToEdit(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickToEdit: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withClickToExpand(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToExpand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickToExpand: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withClickToSelect(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickToSelect: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderColumnStyleFunction1(value: /* status */ TableCheckboxStatus => js.UndefOr[CSSProperties]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerColumnStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeaderColumnStyle(value: (js.Function1[/* status */ TableCheckboxStatus, js.UndefOr[CSSProperties]]) | CSSProperties): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerColumnStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderColumnStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerColumnStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHideSelectAll(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSelectAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideSelectAll: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSelectAll")(js.undefined)
        ret
    }
    @scala.inline
    def withHideSelectColumn(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSelectColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideSelectColumn: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSelectColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withNonSelectable(value: js.Array[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonSelectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonSelectable: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonSelectable")(js.undefined)
        ret
    }
    @scala.inline
    def withNonSelectableClassesFunction2(value: (/* row */ T, /* rowIndex */ Double) => js.UndefOr[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonSelectableClasses")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNonSelectableClasses(value: (js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[String]]) | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonSelectableClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonSelectableClasses: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonSelectableClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withNonSelectableStyleFunction2(value: (/* row */ T, /* rowIndex */ Double) => js.UndefOr[CSSProperties]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonSelectableStyle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNonSelectableStyle(
      value: (js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[CSSProperties]]) | CSSProperties
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonSelectableStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonSelectableStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonSelectableStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(
      value: (/* row */ T, /* isSelected */ Boolean, /* rowIndex */ Double, /* e */ SyntheticEvent[Event_, Element]) => Unit | Boolean
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectAll(
      value: (/* isSelect */ Boolean, /* rows */ js.Array[T], /* e */ SyntheticEvent[Event_, Element]) => Unit | js.Array[Double]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectAll")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnSelectAll: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectAll")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectColumnPosition(value: left | right): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectColumnPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectColumnPosition: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectColumnPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectColumnStyleFunction1(value: /* props */ AnonChecked => js.UndefOr[CSSProperties]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectColumnStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectColumnStyle(value: (js.Function1[/* props */ AnonChecked, js.UndefOr[CSSProperties]]) | CSSProperties): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectColumnStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectColumnStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectColumnStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: js.Array[Double | String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionHeaderRenderer(value: ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionHeaderRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionHeaderRenderer: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionHeaderRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionRenderer(value: ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionRenderer: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleFunction2(value: (/* row */ T, /* rowIndex */ Double) => js.UndefOr[CSSProperties]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStyle(
      value: (js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[CSSProperties]]) | CSSProperties
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

