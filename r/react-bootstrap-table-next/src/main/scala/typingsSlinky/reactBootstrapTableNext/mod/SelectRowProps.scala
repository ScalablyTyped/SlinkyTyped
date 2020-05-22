package typingsSlinky.reactBootstrapTableNext.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactBootstrapTableNext.anon.Checked
import typingsSlinky.reactBootstrapTableNext.anon.Disabled
import typingsSlinky.reactBootstrapTableNext.anon.Indeterminate
import typingsSlinky.reactBootstrapTableNext.reactBootstrapTableNextStrings.left
import typingsSlinky.reactBootstrapTableNext.reactBootstrapTableNextStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectRowProps[T] extends js.Object {
  var bgColor: js.UndefOr[String] = js.undefined
  var classes: js.UndefOr[(js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[String]]) | String] = js.undefined
  var clickToEdit: js.UndefOr[Boolean] = js.undefined
  var clickToExpand: js.UndefOr[Boolean] = js.undefined
  var clickToSelect: js.UndefOr[Boolean] = js.undefined
  var headerColumnStyle: js.UndefOr[
    (js.Function1[/* status */ TableCheckboxStatus, js.UndefOr[CSSProperties]]) | CSSProperties
  ] = js.undefined
  var hideSelectAll: js.UndefOr[Boolean] = js.undefined
  var hideSelectColumn: js.UndefOr[Boolean] = js.undefined
  var mode: RowSelectionType
  var nonSelectable: js.UndefOr[js.Array[Double]] = js.undefined
  var nonSelectableClasses: js.UndefOr[(js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[String]]) | String] = js.undefined
  var nonSelectableStyle: js.UndefOr[
    (js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[CSSProperties]]) | CSSProperties
  ] = js.undefined
  var onSelect: js.UndefOr[
    js.Function4[
      /* row */ T, 
      /* isSelected */ Boolean, 
      /* rowIndex */ Double, 
      /* e */ SyntheticEvent[Event, Element], 
      Unit | Boolean
    ]
  ] = js.undefined
  /**
    * This callback function will be called when select/unselect all and it only work when you configure selectRow.mode as checkbox.
    */
  var onSelectAll: js.UndefOr[
    js.Function3[
      /* isSelect */ Boolean, 
      /* rows */ js.Array[T], 
      /* e */ SyntheticEvent[Event, Element], 
      Unit | js.Array[Double]
    ]
  ] = js.undefined
  var selectColumnPosition: js.UndefOr[left | right] = js.undefined
  var selectColumnStyle: js.UndefOr[(js.Function1[/* props */ Disabled, js.UndefOr[CSSProperties]]) | CSSProperties] = js.undefined
  var selected: js.UndefOr[js.Array[Double | String]] = js.undefined
  var selectionHeaderRenderer: js.UndefOr[js.Function1[/* options */ Indeterminate, ReactElement]] = js.undefined
  var selectionRenderer: js.UndefOr[js.Function1[/* options */ Checked, ReactElement]] = js.undefined
  var style: js.UndefOr[
    (js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[CSSProperties]]) | CSSProperties
  ] = js.undefined
}

object SelectRowProps {
  @scala.inline
  def apply[T](
    mode: RowSelectionType,
    bgColor: String = null,
    classes: (js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[String]]) | String = null,
    clickToEdit: js.UndefOr[Boolean] = js.undefined,
    clickToExpand: js.UndefOr[Boolean] = js.undefined,
    clickToSelect: js.UndefOr[Boolean] = js.undefined,
    headerColumnStyle: (js.Function1[/* status */ TableCheckboxStatus, js.UndefOr[CSSProperties]]) | CSSProperties = null,
    hideSelectAll: js.UndefOr[Boolean] = js.undefined,
    hideSelectColumn: js.UndefOr[Boolean] = js.undefined,
    nonSelectable: js.Array[Double] = null,
    nonSelectableClasses: (js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[String]]) | String = null,
    nonSelectableStyle: (js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[CSSProperties]]) | CSSProperties = null,
    onSelect: (/* row */ T, /* isSelected */ Boolean, /* rowIndex */ Double, /* e */ SyntheticEvent[Event, Element]) => Unit | Boolean = null,
    onSelectAll: (/* isSelect */ Boolean, /* rows */ js.Array[T], /* e */ SyntheticEvent[Event, Element]) => Unit | js.Array[Double] = null,
    selectColumnPosition: left | right = null,
    selectColumnStyle: (js.Function1[/* props */ Disabled, js.UndefOr[CSSProperties]]) | CSSProperties = null,
    selected: js.Array[Double | String] = null,
    selectionHeaderRenderer: /* options */ Indeterminate => ReactElement = null,
    selectionRenderer: /* options */ Checked => ReactElement = null,
    style: (js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[CSSProperties]]) | CSSProperties = null
  ): SelectRowProps[T] = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(clickToEdit)) __obj.updateDynamic("clickToEdit")(clickToEdit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clickToExpand)) __obj.updateDynamic("clickToExpand")(clickToExpand.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clickToSelect)) __obj.updateDynamic("clickToSelect")(clickToSelect.get.asInstanceOf[js.Any])
    if (headerColumnStyle != null) __obj.updateDynamic("headerColumnStyle")(headerColumnStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(hideSelectAll)) __obj.updateDynamic("hideSelectAll")(hideSelectAll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideSelectColumn)) __obj.updateDynamic("hideSelectColumn")(hideSelectColumn.get.asInstanceOf[js.Any])
    if (nonSelectable != null) __obj.updateDynamic("nonSelectable")(nonSelectable.asInstanceOf[js.Any])
    if (nonSelectableClasses != null) __obj.updateDynamic("nonSelectableClasses")(nonSelectableClasses.asInstanceOf[js.Any])
    if (nonSelectableStyle != null) __obj.updateDynamic("nonSelectableStyle")(nonSelectableStyle.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction4(onSelect))
    if (onSelectAll != null) __obj.updateDynamic("onSelectAll")(js.Any.fromFunction3(onSelectAll))
    if (selectColumnPosition != null) __obj.updateDynamic("selectColumnPosition")(selectColumnPosition.asInstanceOf[js.Any])
    if (selectColumnStyle != null) __obj.updateDynamic("selectColumnStyle")(selectColumnStyle.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (selectionHeaderRenderer != null) __obj.updateDynamic("selectionHeaderRenderer")(js.Any.fromFunction1(selectionHeaderRenderer))
    if (selectionRenderer != null) __obj.updateDynamic("selectionRenderer")(js.Any.fromFunction1(selectionRenderer))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectRowProps[T]]
  }
}

