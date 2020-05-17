package typingsSlinky.handsontable.mod.Handsontable.Hooks

import org.scalablytyped.runtime.NumberDictionary
import org.scalajs.dom.raw.HTMLTableCellElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.handsontable.anon.SkipRender
import typingsSlinky.handsontable.anon.Value
import typingsSlinky.handsontable.anon.ValueAny
import typingsSlinky.handsontable.anon.ValueCellValue
import typingsSlinky.handsontable.handsontableNumbers.`-1`
import typingsSlinky.handsontable.handsontableNumbers.`0`
import typingsSlinky.handsontable.handsontableStrings.area
import typingsSlinky.handsontable.handsontableStrings.current
import typingsSlinky.handsontable.handsontableStrings.down
import typingsSlinky.handsontable.handsontableStrings.get
import typingsSlinky.handsontable.handsontableStrings.highlight
import typingsSlinky.handsontable.handsontableStrings.horizontal
import typingsSlinky.handsontable.handsontableStrings.htBottom
import typingsSlinky.handsontable.handsontableStrings.htCenter
import typingsSlinky.handsontable.handsontableStrings.htJustify
import typingsSlinky.handsontable.handsontableStrings.htLeft
import typingsSlinky.handsontable.handsontableStrings.htMiddle
import typingsSlinky.handsontable.handsontableStrings.htRight
import typingsSlinky.handsontable.handsontableStrings.htTop
import typingsSlinky.handsontable.handsontableStrings.left
import typingsSlinky.handsontable.handsontableStrings.right
import typingsSlinky.handsontable.handsontableStrings.set
import typingsSlinky.handsontable.handsontableStrings.up
import typingsSlinky.handsontable.handsontableStrings.vertical
import typingsSlinky.handsontable.mod.Handsontable.CellChange
import typingsSlinky.handsontable.mod.Handsontable.CellProperties
import typingsSlinky.handsontable.mod.Handsontable.CellValue
import typingsSlinky.handsontable.mod.Handsontable.ChangeSource
import typingsSlinky.handsontable.mod.Handsontable.GridSettings
import typingsSlinky.handsontable.mod.Handsontable.RowObject
import typingsSlinky.handsontable.mod.Handsontable.SelectionController
import typingsSlinky.handsontable.mod.Handsontable.ViewportColumnsCalculator
import typingsSlinky.handsontable.mod.Handsontable.columnSorting.Config
import typingsSlinky.handsontable.mod.Handsontable.contextMenu.MenuItemConfig
import typingsSlinky.handsontable.mod.Handsontable.contextMenu.PredefinedMenuItemKey
import typingsSlinky.handsontable.mod.Handsontable.mergeCells.Settings
import typingsSlinky.handsontable.mod.Handsontable.plugins.ContextMenu
import typingsSlinky.handsontable.mod.Handsontable.plugins.DropdownMenu
import typingsSlinky.handsontable.mod.Handsontable.plugins.FiltersPlugin.ColumnConditions
import typingsSlinky.handsontable.mod.Handsontable.plugins.RangeType
import typingsSlinky.handsontable.mod.Handsontable.plugins.UndoRedoAction
import typingsSlinky.handsontable.mod.Handsontable.wot.CellCoords
import typingsSlinky.handsontable.mod.Handsontable.wot.CellRange
import typingsSlinky.std.HTMLTableHeaderCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Events extends js.Object {
  var afterAddChild: js.UndefOr[
    js.Function3[
      /* parent */ RowObject, 
      /* element */ RowObject | Unit, 
      /* index */ Double | Unit, 
      Unit
    ]
  ] = js.native
  var afterBeginEditing: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.native
  var afterCellMetaReset: js.UndefOr[js.Function0[Unit]] = js.native
  var afterChange: js.UndefOr[
    js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
  ] = js.native
  var afterChangesObserved: js.UndefOr[js.Function0[Unit]] = js.native
  var afterColumnMove: js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]] = js.native
  var afterColumnResize: js.UndefOr[
    js.Function3[/* currentColumn */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
  ] = js.native
  var afterColumnSort: js.UndefOr[
    js.Function2[
      /* currentSortConfig */ js.Array[Config], 
      /* destinationSortConfigs */ js.Array[Config], 
      Unit
    ]
  ] = js.native
  var afterContextMenuDefaultOptions: js.UndefOr[
    js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
  ] = js.native
  var afterContextMenuHide: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]] = js.native
  var afterContextMenuShow: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]] = js.native
  var afterCopy: js.UndefOr[
    js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
  ] = js.native
  var afterCopyLimit: js.UndefOr[
    js.Function4[
      /* selectedRows */ Double, 
      /* selectedColumnds */ Double, 
      /* copyRowsLimit */ Double, 
      /* copyColumnsLimit */ Double, 
      Unit
    ]
  ] = js.native
  var afterCreateCol: js.UndefOr[
    js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
  ] = js.native
  var afterCreateRow: js.UndefOr[
    js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
  ] = js.native
  var afterCut: js.UndefOr[
    js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
  ] = js.native
  var afterDeselect: js.UndefOr[js.Function0[Unit]] = js.native
  var afterDestroy: js.UndefOr[js.Function0[Unit]] = js.native
  var afterDetachChild: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]] = js.native
  var afterDocumentKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.native
  var afterDrawSelection: js.UndefOr[
    js.Function4[
      /* currentRow */ Double, 
      /* currentColumn */ Double, 
      /* cornersOfSelection */ js.Array[Double], 
      /* layerLevel */ Double | Unit, 
      String | Unit
    ]
  ] = js.native
  var afterDropdownMenuDefaultOptions: js.UndefOr[
    js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
  ] = js.native
  var afterDropdownMenuHide: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]] = js.native
  var afterDropdownMenuShow: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]] = js.native
  var afterFilter: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]] = js.native
  var afterGetCellMeta: js.UndefOr[
    js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
  ] = js.native
  var afterGetColHeader: js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]] = js.native
  var afterGetColumnHeaderRenderers: js.UndefOr[
    js.Function1[
      /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
      Unit
    ]
  ] = js.native
  var afterGetRowHeader: js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]] = js.native
  var afterGetRowHeaderRenderers: js.UndefOr[
    js.Function1[
      /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
      Unit
    ]
  ] = js.native
  var afterHideColumns: js.UndefOr[
    js.Function4[
      /* currentHideConfig */ js.Array[Double], 
      /* destinationHideConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      /* stateChanged */ Boolean, 
      Unit
    ]
  ] = js.native
  var afterHideRows: js.UndefOr[
    js.Function4[
      /* currentHideConfig */ js.Array[Double], 
      /* destinationHideConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      /* stateChanged */ Boolean, 
      Unit
    ]
  ] = js.native
  var afterInit: js.UndefOr[js.Function0[Unit]] = js.native
  var afterLanguageChange: js.UndefOr[js.Function1[/* languageCode */ String, Unit]] = js.native
  var afterListen: js.UndefOr[js.Function0[Unit]] = js.native
  var afterLoadData: js.UndefOr[js.Function1[/* initialLoad */ Boolean, Unit]] = js.native
  var afterMergeCells: js.UndefOr[
    js.Function3[/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
  ] = js.native
  var afterModifyTransformEnd: js.UndefOr[
    js.Function3[
      /* coords */ CellCoords, 
      /* rowTransformDir */ `-1` | `0`, 
      /* colTransformDir */ `-1` | `0`, 
      Unit
    ]
  ] = js.native
  var afterModifyTransformStart: js.UndefOr[
    js.Function3[
      /* coords */ CellCoords, 
      /* rowTransformDir */ `-1` | `0`, 
      /* colTransformDir */ `-1` | `0`, 
      Unit
    ]
  ] = js.native
  var afterMomentumScroll: js.UndefOr[js.Function0[Unit]] = js.native
  var afterOnCellContextMenu: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
  ] = js.native
  var afterOnCellCornerDblClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var afterOnCellCornerMouseDown: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var afterOnCellMouseDown: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
  ] = js.native
  var afterOnCellMouseOut: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
  ] = js.native
  var afterOnCellMouseOver: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
  ] = js.native
  var afterOnCellMouseUp: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
  ] = js.native
  var afterPaste: js.UndefOr[
    js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
  ] = js.native
  var afterPluginsInitialized: js.UndefOr[js.Function0[Unit]] = js.native
  var afterRedo: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]] = js.native
  var afterRefreshDimensions: js.UndefOr[
    js.Function3[
      /* previousDimensions */ js.Object, 
      /* currentDimensions */ js.Object, 
      /* stateChanged */ Boolean, 
      Unit
    ]
  ] = js.native
  var afterRemoveCellMeta: js.UndefOr[
    js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any, Unit]
  ] = js.native
  var afterRemoveCol: js.UndefOr[
    js.Function4[
      /* index */ Double, 
      /* amount */ Double, 
      /* physicalColumns */ js.Array[Double], 
      /* source */ js.UndefOr[ChangeSource], 
      Unit
    ]
  ] = js.native
  var afterRemoveRow: js.UndefOr[
    js.Function4[
      /* index */ Double, 
      /* amount */ Double, 
      /* physicalColumns */ js.Array[Double], 
      /* source */ js.UndefOr[ChangeSource], 
      Unit
    ]
  ] = js.native
  var afterRender: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]] = js.native
  var afterRenderer: js.UndefOr[
    js.Function6[
      /* TD */ HTMLTableCellElement, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      /* value */ String, 
      /* cellProperties */ CellProperties, 
      Unit
    ]
  ] = js.native
  var afterRowMove: js.UndefOr[js.Function2[/* startRow */ Double, /* endRow */ Double, Unit]] = js.native
  var afterRowResize: js.UndefOr[
    js.Function3[/* currentRow */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
  ] = js.native
  var afterScrollHorizontally: js.UndefOr[js.Function0[Unit]] = js.native
  var afterScrollVertically: js.UndefOr[js.Function0[Unit]] = js.native
  var afterSelection: js.UndefOr[
    js.Function6[
      /* row */ Double, 
      /* column */ Double, 
      /* row2 */ Double, 
      /* column2 */ Double, 
      /* preventScrolling */ Value, 
      /* selectionLayerLevel */ Double, 
      Unit
    ]
  ] = js.native
  var afterSelectionByProp: js.UndefOr[
    js.Function6[
      /* row */ Double, 
      /* prop */ String, 
      /* row2 */ Double, 
      /* prop2 */ String, 
      /* preventScrolling */ Value, 
      /* selectionLayerLevel */ Double, 
      Unit
    ]
  ] = js.native
  var afterSelectionEnd: js.UndefOr[
    js.Function5[
      /* row */ Double, 
      /* column */ Double, 
      /* row2 */ Double, 
      /* column2 */ Double, 
      /* selectionLayerLevel */ Double, 
      Unit
    ]
  ] = js.native
  var afterSelectionEndByProp: js.UndefOr[
    js.Function5[
      /* row */ Double, 
      /* prop */ String, 
      /* row2 */ Double, 
      /* prop2 */ String, 
      /* selectionLayerLevel */ Double, 
      Unit
    ]
  ] = js.native
  var afterSetCellMeta: js.UndefOr[
    js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ js.Any, Unit]
  ] = js.native
  var afterSetDataAtCell: js.UndefOr[
    js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
  ] = js.native
  var afterSetDataAtRowProp: js.UndefOr[
    js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
  ] = js.native
  var afterTrimRow: js.UndefOr[
    js.Function4[
      /* currentTrimConfig */ js.Array[Double], 
      /* destinationTrimConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      /* stateChanged */ Boolean, 
      Unit
    ]
  ] = js.native
  var afterUndo: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]] = js.native
  var afterUnhideColumns: js.UndefOr[
    js.Function4[
      /* currentHideConfig */ js.Array[Double], 
      /* destinationHideConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      /* stateChanged */ Boolean, 
      Unit
    ]
  ] = js.native
  var afterUnhideRows: js.UndefOr[
    js.Function4[
      /* currentHideConfig */ js.Array[Double], 
      /* destinationHideConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      /* stateChanged */ Boolean, 
      Unit
    ]
  ] = js.native
  var afterUnlisten: js.UndefOr[js.Function0[Unit]] = js.native
  var afterUnmergeCells: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]] = js.native
  var afterUntrimRow: js.UndefOr[
    js.Function4[
      /* currentTrimConfig */ js.Array[Double], 
      /* destinationTrimConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      /* stateChanged */ Boolean, 
      Unit
    ]
  ] = js.native
  var afterUpdateSettings: js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]] = js.native
  var afterValidate: js.UndefOr[
    js.Function5[
      /* isValid */ Boolean, 
      /* value */ CellValue, 
      /* row */ Double, 
      /* prop */ String | Double, 
      /* source */ ChangeSource, 
      Unit | Boolean
    ]
  ] = js.native
  var afterViewportColumnCalculatorOverride: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]] = js.native
  var afterViewportRowCalculatorOverride: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]] = js.native
  var beforeAddChild: js.UndefOr[
    js.Function3[
      /* parent */ RowObject, 
      /* element */ RowObject | Unit, 
      /* index */ Double | Unit, 
      Unit
    ]
  ] = js.native
  var beforeAutofill: js.UndefOr[
    js.Function3[
      /* start */ CellCoords, 
      /* end */ CellCoords, 
      /* data */ js.Array[js.Array[CellValue]], 
      Unit
    ]
  ] = js.native
  var beforeAutofillInsidePopulate: js.UndefOr[
    js.Function4[
      /* index */ CellCoords, 
      /* direction */ up | down | left | right, 
      /* input */ js.Array[js.Array[CellValue]], 
      /* deltas */ js.Array[_], 
      Unit
    ]
  ] = js.native
  var beforeCellAlignment: js.UndefOr[
    js.Function4[
      /* stateBefore */ NumberDictionary[js.Array[String]], 
      /* range */ js.Array[CellRange], 
      /* type */ horizontal | vertical, 
      /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
      Unit
    ]
  ] = js.native
  var beforeChange: js.UndefOr[
    js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
  ] = js.native
  var beforeChangeRender: js.UndefOr[
    js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
  ] = js.native
  var beforeColumnMove: js.UndefOr[
    js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit | Boolean]
  ] = js.native
  var beforeColumnResize: js.UndefOr[
    js.Function3[
      /* currentColumn */ Double, 
      /* newSize */ Double, 
      /* isDoubleClick */ Boolean, 
      Unit | Double
    ]
  ] = js.native
  var beforeColumnSort: js.UndefOr[
    js.Function2[
      /* currentSortConfig */ js.Array[Config], 
      /* destinationSortConfigs */ js.Array[Config], 
      Unit | Boolean
    ]
  ] = js.native
  var beforeContextMenuSetItems: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]] = js.native
  var beforeContextMenuShow: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]] = js.native
  var beforeCopy: js.UndefOr[
    js.Function2[
      /* data */ js.Array[js.Array[CellValue]], 
      /* coords */ js.Array[RangeType], 
      Unit | Boolean
    ]
  ] = js.native
  var beforeCreateCol: js.UndefOr[
    js.Function3[
      /* index */ Double, 
      /* amount */ Double, 
      /* source */ js.UndefOr[ChangeSource], 
      Unit | Boolean
    ]
  ] = js.native
  var beforeCreateRow: js.UndefOr[
    js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
  ] = js.native
  var beforeCut: js.UndefOr[
    js.Function2[
      /* data */ js.Array[js.Array[CellValue]], 
      /* coords */ js.Array[RangeType], 
      Unit | Boolean
    ]
  ] = js.native
  var beforeDetachChild: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]] = js.native
  var beforeDrawBorders: js.UndefOr[
    js.Function2[
      /* corners */ js.Array[Double], 
      /* borderClassName */ js.UndefOr[current | area | highlight], 
      Unit
    ]
  ] = js.native
  var beforeDropdownMenuSetItems: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]] = js.native
  var beforeDropdownMenuShow: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]] = js.native
  var beforeFilter: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]] = js.native
  var beforeGetCellMeta: js.UndefOr[
    js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
  ] = js.native
  var beforeHideColumns: js.UndefOr[
    js.Function3[
      /* currentHideConfig */ js.Array[Double], 
      /* destinationHideConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      Unit
    ]
  ] = js.native
  var beforeHideRows: js.UndefOr[
    js.Function3[
      /* currentHideConfig */ js.Array[Double], 
      /* destinationHideConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      Unit
    ]
  ] = js.native
  var beforeInit: js.UndefOr[js.Function0[Unit]] = js.native
  var beforeInitWalkontable: js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]] = js.native
  var beforeKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.native
  var beforeLanguageChange: js.UndefOr[js.Function1[/* languageCode */ String, Unit]] = js.native
  var beforeMergeCells: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]] = js.native
  var beforeOnCellContextMenu: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
  ] = js.native
  var beforeOnCellMouseDown: js.UndefOr[
    js.Function4[
      /* event */ MouseEvent, 
      /* coords */ CellCoords, 
      /* TD */ HTMLTableCellElement, 
      /* controller */ SelectionController, 
      Unit
    ]
  ] = js.native
  var beforeOnCellMouseOut: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
  ] = js.native
  var beforeOnCellMouseOver: js.UndefOr[
    js.Function4[
      /* event */ MouseEvent, 
      /* coords */ CellCoords, 
      /* TD */ HTMLTableCellElement, 
      /* controller */ SelectionController, 
      Unit
    ]
  ] = js.native
  var beforeOnCellMouseUp: js.UndefOr[
    js.Function4[
      /* event */ MouseEvent, 
      /* coords */ CellCoords, 
      /* TD */ HTMLTableCellElement, 
      /* controller */ SelectionController, 
      Unit
    ]
  ] = js.native
  var beforePaste: js.UndefOr[
    js.Function2[
      /* data */ js.Array[js.Array[CellValue]], 
      /* coords */ js.Array[RangeType], 
      Unit | Boolean
    ]
  ] = js.native
  var beforeRedo: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]] = js.native
  var beforeRefreshDimensions: js.UndefOr[
    js.Function3[
      /* previousDimensions */ js.Object, 
      /* currentDimensions */ js.Object, 
      /* actionPossible */ Boolean, 
      Boolean | Unit
    ]
  ] = js.native
  var beforeRemoveCellClassNames: js.UndefOr[js.Function0[js.Array[String] | Unit]] = js.native
  var beforeRemoveCellMeta: js.UndefOr[
    js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any, Unit]
  ] = js.native
  var beforeRemoveCol: js.UndefOr[
    js.Function4[
      /* index */ Double, 
      /* amount */ Double, 
      /* physicalColumns */ js.Array[Double], 
      /* source */ js.UndefOr[ChangeSource], 
      Unit
    ]
  ] = js.native
  var beforeRemoveRow: js.UndefOr[
    js.Function4[
      /* index */ Double, 
      /* amount */ Double, 
      /* physicalColumns */ js.Array[Double], 
      /* source */ js.UndefOr[ChangeSource], 
      Unit
    ]
  ] = js.native
  var beforeRender: js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]] = js.native
  var beforeRenderer: js.UndefOr[
    js.Function6[
      /* TD */ HTMLTableCellElement, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      /* value */ CellValue, 
      /* cellProperties */ CellProperties, 
      Unit
    ]
  ] = js.native
  var beforeRowMove: js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]] = js.native
  var beforeRowResize: js.UndefOr[
    js.Function3[
      /* currentRow */ Double, 
      /* newSize */ Double, 
      /* isDoubleClick */ Boolean, 
      Double | Unit
    ]
  ] = js.native
  var beforeSetRangeEnd: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]] = js.native
  var beforeSetRangeStart: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]] = js.native
  var beforeSetRangeStartOnly: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]] = js.native
  var beforeStretchingColumnWidth: js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]] = js.native
  var beforeTouchScroll: js.UndefOr[js.Function0[Unit]] = js.native
  var beforeTrimRow: js.UndefOr[
    js.Function3[
      /* currentTrimConfig */ js.Array[Double], 
      /* destinationTrimConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      Unit
    ]
  ] = js.native
  var beforeUndo: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]] = js.native
  var beforeUnhideColumns: js.UndefOr[
    js.Function3[
      /* currentHideConfig */ js.Array[Double], 
      /* destinationHideConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      Unit
    ]
  ] = js.native
  var beforeUnhideRows: js.UndefOr[
    js.Function3[
      /* currentHideConfig */ js.Array[Double], 
      /* destinationHideConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      Unit
    ]
  ] = js.native
  var beforeUnmergeCells: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]] = js.native
  var beforeUntrimRow: js.UndefOr[
    js.Function3[
      /* currentTrimConfig */ js.Array[Double], 
      /* destinationTrimConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      Unit
    ]
  ] = js.native
  var beforeValidate: js.UndefOr[
    js.Function4[
      /* value */ CellValue, 
      /* row */ Double, 
      /* prop */ String | Double, 
      /* source */ js.UndefOr[ChangeSource], 
      Unit
    ]
  ] = js.native
  var beforeValueRender: js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]] = js.native
  var construct: js.UndefOr[js.Function0[Unit]] = js.native
  var hiddenColumn: js.UndefOr[js.Function1[/* column */ Double, Unit]] = js.native
  var hiddenRow: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.native
  var init: js.UndefOr[js.Function0[Unit]] = js.native
  var modifyAutofillRange: js.UndefOr[
    js.Function2[
      /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
      /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
      Unit
    ]
  ] = js.native
  var modifyCol: js.UndefOr[js.Function1[/* col */ Double, Unit]] = js.native
  var modifyColHeader: js.UndefOr[js.Function1[/* column */ Double, Unit]] = js.native
  var modifyColWidth: js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]] = js.native
  var modifyColumnHeaderHeight: js.UndefOr[js.Function0[Unit]] = js.native
  var modifyCopyableRange: js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]] = js.native
  var modifyData: js.UndefOr[
    js.Function4[
      /* row */ Double, 
      /* column */ Double, 
      /* valueHolder */ ValueCellValue, 
      /* ioMode */ get | set, 
      Unit
    ]
  ] = js.native
  var modifyGetCellCoords: js.UndefOr[
    js.Function3[
      /* row */ Double, 
      /* column */ Double, 
      /* topmost */ Boolean, 
      Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
    ]
  ] = js.native
  var modifyRow: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.native
  var modifyRowData: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.native
  var modifyRowHeader: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.native
  var modifyRowHeaderWidth: js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]] = js.native
  var modifyRowHeight: js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]] = js.native
  var modifyRowSourceData: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.native
  var modifyTransformEnd: js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]] = js.native
  var modifyTransformStart: js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]] = js.native
  var persistentStateLoad: js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]] = js.native
  var persistentStateReset: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.native
  var persistentStateSave: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, Unit]] = js.native
  var skipLengthCache: js.UndefOr[js.Function1[/* delay */ Double, Unit]] = js.native
  var unmodifyCol: js.UndefOr[js.Function1[/* col */ Double, Unit]] = js.native
  var unmodifyRow: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.native
}

object Events {
  @scala.inline
  def apply(): Events = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Events]
  }
  @scala.inline
  implicit class EventsOps[Self <: Events] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterAddChild(value: (/* parent */ RowObject, /* element */ RowObject | Unit, /* index */ Double | Unit) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterAddChild")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterAddChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterAddChild")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterBeginEditing(value: (/* row */ Double, /* column */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBeginEditing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterBeginEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBeginEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterCellMetaReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCellMetaReset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterCellMetaReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCellMetaReset")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterChange(value: (/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterChange")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterChangesObserved(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterChangesObserved")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterChangesObserved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterChangesObserved")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterColumnMove(value: (/* columns */ js.Array[Double], /* target */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterColumnMove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterColumnMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterColumnMove")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterColumnResize(value: (/* currentColumn */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterColumnResize")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterColumnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterColumnResize")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterColumnSort(
      value: (/* currentSortConfig */ js.Array[Config], /* destinationSortConfigs */ js.Array[Config]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterColumnSort")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterColumnSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterColumnSort")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterContextMenuDefaultOptions(value: /* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterContextMenuDefaultOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterContextMenuDefaultOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterContextMenuDefaultOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterContextMenuHide(value: /* context */ ContextMenu => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterContextMenuHide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterContextMenuHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterContextMenuHide")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterContextMenuShow(value: /* context */ ContextMenu => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterContextMenuShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterContextMenuShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterContextMenuShow")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterCopy(value: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCopy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCopy")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterCopyLimit(
      value: (/* selectedRows */ Double, /* selectedColumnds */ Double, /* copyRowsLimit */ Double, /* copyColumnsLimit */ Double) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCopyLimit")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAfterCopyLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCopyLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterCreateCol(value: (/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCreateCol")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterCreateCol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCreateCol")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterCreateRow(value: (/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCreateRow")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterCreateRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCreateRow")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterCut(value: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCut")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterCut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCut")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterDeselect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDeselect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterDeselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDeselect")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDestroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterDetachChild(value: (/* parent */ RowObject, /* element */ RowObject) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDetachChild")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterDetachChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDetachChild")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterDocumentKeyDown(value: /* event */ KeyboardEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDocumentKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterDocumentKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDocumentKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterDrawSelection(
      value: (/* currentRow */ Double, /* currentColumn */ Double, /* cornersOfSelection */ js.Array[Double], /* layerLevel */ Double | Unit) => String | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDrawSelection")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAfterDrawSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDrawSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterDropdownMenuDefaultOptions(value: /* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDropdownMenuDefaultOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterDropdownMenuDefaultOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDropdownMenuDefaultOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterDropdownMenuHide(value: /* instance */ DropdownMenu => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDropdownMenuHide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterDropdownMenuHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDropdownMenuHide")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterDropdownMenuShow(value: /* instance */ DropdownMenu => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDropdownMenuShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterDropdownMenuShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDropdownMenuShow")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterFilter(value: /* conditionsStack */ js.Array[ColumnConditions] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterGetCellMeta(value: (/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGetCellMeta")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterGetCellMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGetCellMeta")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterGetColHeader(value: (/* col */ Double, /* TH */ HTMLTableHeaderCellElement) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGetColHeader")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterGetColHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGetColHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterGetColumnHeaderRenderers(
      value: /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]] => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGetColumnHeaderRenderers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterGetColumnHeaderRenderers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGetColumnHeaderRenderers")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterGetRowHeader(value: (/* row */ Double, /* TH */ HTMLTableHeaderCellElement) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGetRowHeader")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterGetRowHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGetRowHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterGetRowHeaderRenderers(
      value: /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]] => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGetRowHeaderRenderers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterGetRowHeaderRenderers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGetRowHeaderRenderers")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterHideColumns(
      value: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterHideColumns")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAfterHideColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterHideColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterHideRows(
      value: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterHideRows")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAfterHideRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterHideRows")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInit")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterLanguageChange(value: /* languageCode */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLanguageChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterLanguageChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLanguageChange")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterListen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterListen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterListen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterListen")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterLoadData(value: /* initialLoad */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLoadData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterLoadData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLoadData")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterMergeCells(value: (/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterMergeCells")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterMergeCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterMergeCells")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterModifyTransformEnd(
      value: (/* coords */ CellCoords, /* rowTransformDir */ `-1` | `0`, /* colTransformDir */ `-1` | `0`) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterModifyTransformEnd")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterModifyTransformEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterModifyTransformEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterModifyTransformStart(
      value: (/* coords */ CellCoords, /* rowTransformDir */ `-1` | `0`, /* colTransformDir */ `-1` | `0`) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterModifyTransformStart")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterModifyTransformStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterModifyTransformStart")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterMomentumScroll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterMomentumScroll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterMomentumScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterMomentumScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterOnCellContextMenu(value: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOnCellContextMenu")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterOnCellContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOnCellContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterOnCellCornerDblClick(value: /* event */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOnCellCornerDblClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterOnCellCornerDblClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOnCellCornerDblClick")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterOnCellCornerMouseDown(value: /* event */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOnCellCornerMouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterOnCellCornerMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOnCellCornerMouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterOnCellMouseDown(value: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOnCellMouseDown")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterOnCellMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOnCellMouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterOnCellMouseOut(value: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOnCellMouseOut")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterOnCellMouseOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOnCellMouseOut")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterOnCellMouseOver(value: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOnCellMouseOver")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterOnCellMouseOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOnCellMouseOver")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterOnCellMouseUp(value: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOnCellMouseUp")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterOnCellMouseUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOnCellMouseUp")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterPaste(value: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPaste")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterPluginsInitialized(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPluginsInitialized")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterPluginsInitialized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPluginsInitialized")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterRedo(value: /* action */ UndoRedoAction => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRedo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterRedo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRedo")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterRefreshDimensions(
      value: (/* previousDimensions */ js.Object, /* currentDimensions */ js.Object, /* stateChanged */ Boolean) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRefreshDimensions")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterRefreshDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRefreshDimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterRemoveCellMeta(value: (/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRemoveCellMeta")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAfterRemoveCellMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRemoveCellMeta")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterRemoveCol(
      value: (/* index */ Double, /* amount */ Double, /* physicalColumns */ js.Array[Double], /* source */ js.UndefOr[ChangeSource]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRemoveCol")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAfterRemoveCol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRemoveCol")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterRemoveRow(
      value: (/* index */ Double, /* amount */ Double, /* physicalColumns */ js.Array[Double], /* source */ js.UndefOr[ChangeSource]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRemoveRow")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAfterRemoveRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRemoveRow")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterRender(value: /* isForced */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRender")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterRenderer(
      value: (/* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ String, /* cellProperties */ CellProperties) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRenderer")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutAfterRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterRowMove(value: (/* startRow */ Double, /* endRow */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRowMove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterRowMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRowMove")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterRowResize(value: (/* currentRow */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRowResize")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterRowResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRowResize")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterScrollHorizontally(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterScrollHorizontally")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterScrollHorizontally: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterScrollHorizontally")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterScrollVertically(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterScrollVertically")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterScrollVertically: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterScrollVertically")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterSelection(
      value: (/* row */ Double, /* column */ Double, /* row2 */ Double, /* column2 */ Double, /* preventScrolling */ Value, /* selectionLayerLevel */ Double) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelection")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutAfterSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterSelectionByProp(
      value: (/* row */ Double, /* prop */ String, /* row2 */ Double, /* prop2 */ String, /* preventScrolling */ Value, /* selectionLayerLevel */ Double) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelectionByProp")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutAfterSelectionByProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelectionByProp")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterSelectionEnd(
      value: (/* row */ Double, /* column */ Double, /* row2 */ Double, /* column2 */ Double, /* selectionLayerLevel */ Double) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelectionEnd")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutAfterSelectionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelectionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterSelectionEndByProp(
      value: (/* row */ Double, /* prop */ String, /* row2 */ Double, /* prop2 */ String, /* selectionLayerLevel */ Double) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelectionEndByProp")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutAfterSelectionEndByProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelectionEndByProp")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterSetCellMeta(value: (/* row */ Double, /* col */ Double, /* key */ String, /* value */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSetCellMeta")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAfterSetCellMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSetCellMeta")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterSetDataAtCell(value: (/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSetDataAtCell")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterSetDataAtCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSetDataAtCell")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterSetDataAtRowProp(value: (/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSetDataAtRowProp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterSetDataAtRowProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSetDataAtRowProp")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterTrimRow(
      value: (/* currentTrimConfig */ js.Array[Double], /* destinationTrimConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterTrimRow")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAfterTrimRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterTrimRow")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterUndo(value: /* action */ UndoRedoAction => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUndo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterUndo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUndo")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterUnhideColumns(
      value: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUnhideColumns")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAfterUnhideColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUnhideColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterUnhideRows(
      value: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUnhideRows")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAfterUnhideRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUnhideRows")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterUnlisten(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUnlisten")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterUnlisten: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUnlisten")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterUnmergeCells(value: (/* cellRange */ CellRange, /* auto */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUnmergeCells")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterUnmergeCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUnmergeCells")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterUntrimRow(
      value: (/* currentTrimConfig */ js.Array[Double], /* destinationTrimConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUntrimRow")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAfterUntrimRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUntrimRow")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterUpdateSettings(value: /* newSettings */ GridSettings => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUpdateSettings")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterUpdateSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUpdateSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterValidate(
      value: (/* isValid */ Boolean, /* value */ CellValue, /* row */ Double, /* prop */ String | Double, /* source */ ChangeSource) => Unit | Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterValidate")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutAfterValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterValidate")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterViewportColumnCalculatorOverride(value: /* calc */ ViewportColumnsCalculator => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterViewportColumnCalculatorOverride")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterViewportColumnCalculatorOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterViewportColumnCalculatorOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterViewportRowCalculatorOverride(value: /* calc */ ViewportColumnsCalculator => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterViewportRowCalculatorOverride")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterViewportRowCalculatorOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterViewportRowCalculatorOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeAddChild(value: (/* parent */ RowObject, /* element */ RowObject | Unit, /* index */ Double | Unit) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAddChild")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeAddChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAddChild")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeAutofill(
      value: (/* start */ CellCoords, /* end */ CellCoords, /* data */ js.Array[js.Array[CellValue]]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAutofill")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeAutofill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAutofill")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeAutofillInsidePopulate(
      value: (/* index */ CellCoords, /* direction */ up | down | left | right, /* input */ js.Array[js.Array[CellValue]], /* deltas */ js.Array[_]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAutofillInsidePopulate")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutBeforeAutofillInsidePopulate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAutofillInsidePopulate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeCellAlignment(
      value: (/* stateBefore */ NumberDictionary[js.Array[String]], /* range */ js.Array[CellRange], /* type */ horizontal | vertical, /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCellAlignment")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutBeforeCellAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCellAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeChange(value: (/* changes */ js.Array[CellChange], /* source */ ChangeSource) => Unit | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeChangeRender(value: (/* changes */ js.Array[CellChange], /* source */ ChangeSource) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeChangeRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeChangeRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeChangeRender")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeColumnMove(value: (/* columns */ js.Array[Double], /* target */ Double) => Unit | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeColumnMove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeColumnMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeColumnMove")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeColumnResize(
      value: (/* currentColumn */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean) => Unit | Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeColumnResize")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeColumnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeColumnResize")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeColumnSort(
      value: (/* currentSortConfig */ js.Array[Config], /* destinationSortConfigs */ js.Array[Config]) => Unit | Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeColumnSort")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeColumnSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeColumnSort")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeContextMenuSetItems(value: /* menuItems */ js.Array[MenuItemConfig] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeContextMenuSetItems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeContextMenuSetItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeContextMenuSetItems")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeContextMenuShow(value: /* context */ ContextMenu => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeContextMenuShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeContextMenuShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeContextMenuShow")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeCopy(
      value: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => Unit | Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCopy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCopy")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeCreateCol(
      value: (/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource]) => Unit | Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCreateCol")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeCreateCol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCreateCol")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeCreateRow(value: (/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCreateRow")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeCreateRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCreateRow")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeCut(
      value: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => Unit | Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCut")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeCut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCut")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDetachChild(value: (/* parent */ RowObject, /* element */ RowObject) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDetachChild")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeDetachChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDetachChild")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDrawBorders(
      value: (/* corners */ js.Array[Double], /* borderClassName */ js.UndefOr[current | area | highlight]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDrawBorders")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeDrawBorders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDrawBorders")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDropdownMenuSetItems(value: /* menuItems */ js.Array[MenuItemConfig] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDropdownMenuSetItems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeDropdownMenuSetItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDropdownMenuSetItems")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDropdownMenuShow(value: /* instance */ DropdownMenu => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDropdownMenuShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeDropdownMenuShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDropdownMenuShow")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeFilter(value: /* conditionsStack */ js.Array[ColumnConditions] => Unit | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeGetCellMeta(value: (/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeGetCellMeta")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeGetCellMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeGetCellMeta")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeHideColumns(
      value: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeHideColumns")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeHideColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeHideColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeHideRows(
      value: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeHideRows")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeHideRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeHideRows")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInit")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeInitWalkontable(value: /* walkontableConfig */ js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInitWalkontable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeInitWalkontable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInitWalkontable")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeKeyDown(value: /* event */ KeyboardEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeLanguageChange(value: /* languageCode */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLanguageChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeLanguageChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLanguageChange")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeMergeCells(value: (/* cellRange */ CellRange, /* auto */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeMergeCells")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeMergeCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeMergeCells")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeOnCellContextMenu(value: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeOnCellContextMenu")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeOnCellContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeOnCellContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeOnCellMouseDown(
      value: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, /* controller */ SelectionController) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeOnCellMouseDown")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutBeforeOnCellMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeOnCellMouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeOnCellMouseOut(value: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeOnCellMouseOut")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeOnCellMouseOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeOnCellMouseOut")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeOnCellMouseOver(
      value: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, /* controller */ SelectionController) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeOnCellMouseOver")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutBeforeOnCellMouseOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeOnCellMouseOver")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeOnCellMouseUp(
      value: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, /* controller */ SelectionController) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeOnCellMouseUp")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutBeforeOnCellMouseUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeOnCellMouseUp")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforePaste(
      value: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => Unit | Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePaste")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforePaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePaste")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeRedo(value: /* action */ UndoRedoAction => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRedo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeRedo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRedo")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeRefreshDimensions(
      value: (/* previousDimensions */ js.Object, /* currentDimensions */ js.Object, /* actionPossible */ Boolean) => Boolean | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRefreshDimensions")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeRefreshDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRefreshDimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeRemoveCellClassNames(value: () => js.Array[String] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRemoveCellClassNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeRemoveCellClassNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRemoveCellClassNames")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeRemoveCellMeta(value: (/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRemoveCellMeta")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutBeforeRemoveCellMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRemoveCellMeta")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeRemoveCol(
      value: (/* index */ Double, /* amount */ Double, /* physicalColumns */ js.Array[Double], /* source */ js.UndefOr[ChangeSource]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRemoveCol")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutBeforeRemoveCol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRemoveCol")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeRemoveRow(
      value: (/* index */ Double, /* amount */ Double, /* physicalColumns */ js.Array[Double], /* source */ js.UndefOr[ChangeSource]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRemoveRow")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutBeforeRemoveRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRemoveRow")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeRender(value: (/* isForced */ Boolean, /* skipRender */ SkipRender) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRender")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeRenderer(
      value: (/* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ CellValue, /* cellProperties */ CellProperties) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRenderer")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutBeforeRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeRowMove(value: (/* columns */ js.Array[Double], /* target */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRowMove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeRowMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRowMove")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeRowResize(
      value: (/* currentRow */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean) => Double | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRowResize")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeRowResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRowResize")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSetRangeEnd(value: /* coords */ CellCoords => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSetRangeEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeSetRangeEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSetRangeEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSetRangeStart(value: /* coords */ CellCoords => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSetRangeStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeSetRangeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSetRangeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSetRangeStartOnly(value: /* coords */ CellCoords => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSetRangeStartOnly")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeSetRangeStartOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSetRangeStartOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeStretchingColumnWidth(value: (/* stretchedWidth */ Double, /* column */ Double) => Unit | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeStretchingColumnWidth")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeStretchingColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeStretchingColumnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeTouchScroll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeTouchScroll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeTouchScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeTouchScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeTrimRow(
      value: (/* currentTrimConfig */ js.Array[Double], /* destinationTrimConfig */ js.Array[Double], /* actionPossible */ Boolean) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeTrimRow")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeTrimRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeTrimRow")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeUndo(value: /* action */ UndoRedoAction => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUndo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeUndo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUndo")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeUnhideColumns(
      value: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUnhideColumns")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeUnhideColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUnhideColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeUnhideRows(
      value: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUnhideRows")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeUnhideRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUnhideRows")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeUnmergeCells(value: (/* cellRange */ CellRange, /* auto */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUnmergeCells")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeUnmergeCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUnmergeCells")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeUntrimRow(
      value: (/* currentTrimConfig */ js.Array[Double], /* destinationTrimConfig */ js.Array[Double], /* actionPossible */ Boolean) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUntrimRow")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeUntrimRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUntrimRow")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeValidate(
      value: (/* value */ CellValue, /* row */ Double, /* prop */ String | Double, /* source */ js.UndefOr[ChangeSource]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeValidate")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutBeforeValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeValidate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeValueRender(value: (/* value */ CellValue, /* cellProperties */ CellProperties) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeValueRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeValueRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeValueRender")(js.undefined)
        ret
    }
    @scala.inline
    def withConstruct(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("construct")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutConstruct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("construct")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenColumn(value: /* column */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenColumn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHiddenColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenRow(value: /* row */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenRow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHiddenRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenRow")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyAutofillRange(
      value: (/* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyAutofillRange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModifyAutofillRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyAutofillRange")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyCol(value: /* col */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyCol")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutModifyCol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyCol")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyColHeader(value: /* column */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyColHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutModifyColHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyColHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyColWidth(value: (/* width */ Double, /* col */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyColWidth")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModifyColWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyColWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyColumnHeaderHeight(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyColumnHeaderHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutModifyColumnHeaderHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyColumnHeaderHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyCopyableRange(value: /* copyableRanges */ js.Array[RangeType] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyCopyableRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutModifyCopyableRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyCopyableRange")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyData(
      value: (/* row */ Double, /* column */ Double, /* valueHolder */ ValueCellValue, /* ioMode */ get | set) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyData")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutModifyData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyData")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyGetCellCoords(
      value: (/* row */ Double, /* column */ Double, /* topmost */ Boolean) => Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyGetCellCoords")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutModifyGetCellCoords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyGetCellCoords")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyRow(value: /* row */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyRow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutModifyRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyRow")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyRowData(value: /* row */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyRowData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutModifyRowData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyRowData")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyRowHeader(value: /* row */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyRowHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutModifyRowHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyRowHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyRowHeaderWidth(value: /* rowHeaderWidth */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyRowHeaderWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutModifyRowHeaderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyRowHeaderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyRowHeight(value: (/* height */ Double, /* row */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyRowHeight")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModifyRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyRowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyRowSourceData(value: /* row */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyRowSourceData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutModifyRowSourceData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyRowSourceData")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyTransformEnd(value: /* delta */ CellCoords => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyTransformEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutModifyTransformEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyTransformEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyTransformStart(value: /* delta */ CellCoords => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyTransformStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutModifyTransformStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyTransformStart")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistentStateLoad(value: (/* key */ String, /* valuePlaceholder */ ValueAny) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentStateLoad")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPersistentStateLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentStateLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistentStateReset(value: /* key */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentStateReset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPersistentStateReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentStateReset")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistentStateSave(value: (/* key */ String, /* value */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentStateSave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPersistentStateSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentStateSave")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipLengthCache(value: /* delay */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLengthCache")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSkipLengthCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLengthCache")(js.undefined)
        ret
    }
    @scala.inline
    def withUnmodifyCol(value: /* col */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmodifyCol")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnmodifyCol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmodifyCol")(js.undefined)
        ret
    }
    @scala.inline
    def withUnmodifyRow(value: /* row */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmodifyRow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnmodifyRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmodifyRow")(js.undefined)
        ret
    }
  }
  
}

