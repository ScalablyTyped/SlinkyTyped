package typingsSlinky.handsontable.mod.Handsontable

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

/* Inlined {[ P in keyof handsontable.handsontable.Handsontable.Hooks.Events ]: std.Array<handsontable.handsontable.Handsontable.Hooks.Events[P]>} */
@js.native
trait Bucket extends js.Object {
  var afterAddChild: js.Array[
    js.UndefOr[
      js.Function3[
        /* parent */ RowObject, 
        /* element */ RowObject | Unit, 
        /* index */ Double | Unit, 
        Unit
      ]
    ]
  ] = js.native
  var afterBeginEditing: js.Array[js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]] = js.native
  var afterCellMetaReset: js.Array[js.UndefOr[js.Function0[Unit]]] = js.native
  var afterChange: js.Array[
    js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
    ]
  ] = js.native
  var afterChangesObserved: js.Array[js.UndefOr[js.Function0[Unit]]] = js.native
  var afterColumnMove: js.Array[
    js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
  ] = js.native
  var afterColumnResize: js.Array[
    js.UndefOr[
      js.Function3[/* currentColumn */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
    ]
  ] = js.native
  var afterColumnSort: js.Array[
    js.UndefOr[
      js.Function2[
        /* currentSortConfig */ js.Array[Config], 
        /* destinationSortConfigs */ js.Array[Config], 
        Unit
      ]
    ]
  ] = js.native
  var afterContextMenuDefaultOptions: js.Array[
    js.UndefOr[
      js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
    ]
  ] = js.native
  var afterContextMenuHide: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]] = js.native
  var afterContextMenuShow: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]] = js.native
  var afterCopy: js.Array[
    js.UndefOr[
      js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
    ]
  ] = js.native
  var afterCopyLimit: js.Array[
    js.UndefOr[
      js.Function4[
        /* selectedRows */ Double, 
        /* selectedColumnds */ Double, 
        /* copyRowsLimit */ Double, 
        /* copyColumnsLimit */ Double, 
        Unit
      ]
    ]
  ] = js.native
  var afterCreateCol: js.Array[
    js.UndefOr[
      js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
    ]
  ] = js.native
  var afterCreateRow: js.Array[
    js.UndefOr[
      js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
    ]
  ] = js.native
  var afterCut: js.Array[
    js.UndefOr[
      js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
    ]
  ] = js.native
  var afterDeselect: js.Array[js.UndefOr[js.Function0[Unit]]] = js.native
  var afterDestroy: js.Array[js.UndefOr[js.Function0[Unit]]] = js.native
  var afterDetachChild: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]] = js.native
  var afterDocumentKeyDown: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]] = js.native
  var afterDrawSelection: js.Array[
    js.UndefOr[
      js.Function4[
        /* currentRow */ Double, 
        /* currentColumn */ Double, 
        /* cornersOfSelection */ js.Array[Double], 
        /* layerLevel */ Double | Unit, 
        String | Unit
      ]
    ]
  ] = js.native
  var afterDropdownMenuDefaultOptions: js.Array[
    js.UndefOr[
      js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
    ]
  ] = js.native
  var afterDropdownMenuHide: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]] = js.native
  var afterDropdownMenuShow: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]] = js.native
  var afterFilter: js.Array[js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]] = js.native
  var afterGetCellMeta: js.Array[
    js.UndefOr[
      js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
    ]
  ] = js.native
  var afterGetColHeader: js.Array[
    js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
  ] = js.native
  var afterGetColumnHeaderRenderers: js.Array[
    js.UndefOr[
      js.Function1[
        /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
        Unit
      ]
    ]
  ] = js.native
  var afterGetRowHeader: js.Array[
    js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
  ] = js.native
  var afterGetRowHeaderRenderers: js.Array[
    js.UndefOr[
      js.Function1[
        /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
        Unit
      ]
    ]
  ] = js.native
  var afterHideColumns: js.Array[
    js.UndefOr[
      js.Function4[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ]
  ] = js.native
  var afterHideRows: js.Array[
    js.UndefOr[
      js.Function4[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ]
  ] = js.native
  var afterInit: js.Array[js.UndefOr[js.Function0[Unit]]] = js.native
  var afterLanguageChange: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]] = js.native
  var afterListen: js.Array[js.UndefOr[js.Function0[Unit]]] = js.native
  var afterLoadData: js.Array[js.UndefOr[js.Function1[/* initialLoad */ Boolean, Unit]]] = js.native
  var afterMergeCells: js.Array[
    js.UndefOr[
      js.Function3[/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
    ]
  ] = js.native
  var afterModifyTransformEnd: js.Array[
    js.UndefOr[
      js.Function3[
        /* coords */ CellCoords, 
        /* rowTransformDir */ `-1` | `0`, 
        /* colTransformDir */ `-1` | `0`, 
        Unit
      ]
    ]
  ] = js.native
  var afterModifyTransformStart: js.Array[
    js.UndefOr[
      js.Function3[
        /* coords */ CellCoords, 
        /* rowTransformDir */ `-1` | `0`, 
        /* colTransformDir */ `-1` | `0`, 
        Unit
      ]
    ]
  ] = js.native
  var afterMomentumScroll: js.Array[js.UndefOr[js.Function0[Unit]]] = js.native
  var afterOnCellContextMenu: js.Array[
    js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ] = js.native
  var afterOnCellCornerDblClick: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]] = js.native
  var afterOnCellCornerMouseDown: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]] = js.native
  var afterOnCellMouseDown: js.Array[
    js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ] = js.native
  var afterOnCellMouseOut: js.Array[
    js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ] = js.native
  var afterOnCellMouseOver: js.Array[
    js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ] = js.native
  var afterOnCellMouseUp: js.Array[
    js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ] = js.native
  var afterPaste: js.Array[
    js.UndefOr[
      js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
    ]
  ] = js.native
  var afterPluginsInitialized: js.Array[js.UndefOr[js.Function0[Unit]]] = js.native
  var afterRedo: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]] = js.native
  var afterRefreshDimensions: js.Array[
    js.UndefOr[
      js.Function3[
        /* previousDimensions */ js.Object, 
        /* currentDimensions */ js.Object, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ]
  ] = js.native
  var afterRemoveCellMeta: js.Array[
    js.UndefOr[
      js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
    ]
  ] = js.native
  var afterRemoveCol: js.Array[
    js.UndefOr[
      js.Function4[
        /* index */ Double, 
        /* amount */ Double, 
        /* physicalColumns */ js.Array[Double], 
        /* source */ js.UndefOr[ChangeSource], 
        Unit
      ]
    ]
  ] = js.native
  var afterRemoveRow: js.Array[
    js.UndefOr[
      js.Function4[
        /* index */ Double, 
        /* amount */ Double, 
        /* physicalColumns */ js.Array[Double], 
        /* source */ js.UndefOr[ChangeSource], 
        Unit
      ]
    ]
  ] = js.native
  var afterRender: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]] = js.native
  var afterRenderer: js.Array[
    js.UndefOr[
      js.Function6[
        /* TD */ HTMLTableCellElement, 
        /* row */ Double, 
        /* col */ Double, 
        /* prop */ String | Double, 
        /* value */ String, 
        /* cellProperties */ CellProperties, 
        Unit
      ]
    ]
  ] = js.native
  var afterRowMove: js.Array[js.UndefOr[js.Function2[/* startRow */ Double, /* endRow */ Double, Unit]]] = js.native
  var afterRowResize: js.Array[
    js.UndefOr[
      js.Function3[/* currentRow */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
    ]
  ] = js.native
  var afterScrollHorizontally: js.Array[js.UndefOr[js.Function0[Unit]]] = js.native
  var afterScrollVertically: js.Array[js.UndefOr[js.Function0[Unit]]] = js.native
  var afterSelection: js.Array[
    js.UndefOr[
      js.Function6[
        /* row */ Double, 
        /* column */ Double, 
        /* row2 */ Double, 
        /* column2 */ Double, 
        /* preventScrolling */ Value, 
        /* selectionLayerLevel */ Double, 
        Unit
      ]
    ]
  ] = js.native
  var afterSelectionByProp: js.Array[
    js.UndefOr[
      js.Function6[
        /* row */ Double, 
        /* prop */ String, 
        /* row2 */ Double, 
        /* prop2 */ String, 
        /* preventScrolling */ Value, 
        /* selectionLayerLevel */ Double, 
        Unit
      ]
    ]
  ] = js.native
  var afterSelectionEnd: js.Array[
    js.UndefOr[
      js.Function5[
        /* row */ Double, 
        /* column */ Double, 
        /* row2 */ Double, 
        /* column2 */ Double, 
        /* selectionLayerLevel */ Double, 
        Unit
      ]
    ]
  ] = js.native
  var afterSelectionEndByProp: js.Array[
    js.UndefOr[
      js.Function5[
        /* row */ Double, 
        /* prop */ String, 
        /* row2 */ Double, 
        /* prop2 */ String, 
        /* selectionLayerLevel */ Double, 
        Unit
      ]
    ]
  ] = js.native
  var afterSetCellMeta: js.Array[
    js.UndefOr[
      js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ _, Unit]
    ]
  ] = js.native
  var afterSetDataAtCell: js.Array[
    js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
    ]
  ] = js.native
  var afterSetDataAtRowProp: js.Array[
    js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
    ]
  ] = js.native
  var afterTrimRow: js.Array[
    js.UndefOr[
      js.Function4[
        /* currentTrimConfig */ js.Array[Double], 
        /* destinationTrimConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ]
  ] = js.native
  var afterUndo: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]] = js.native
  var afterUnhideColumns: js.Array[
    js.UndefOr[
      js.Function4[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ]
  ] = js.native
  var afterUnhideRows: js.Array[
    js.UndefOr[
      js.Function4[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ]
  ] = js.native
  var afterUnlisten: js.Array[js.UndefOr[js.Function0[Unit]]] = js.native
  var afterUnmergeCells: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]] = js.native
  var afterUntrimRow: js.Array[
    js.UndefOr[
      js.Function4[
        /* currentTrimConfig */ js.Array[Double], 
        /* destinationTrimConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ]
  ] = js.native
  var afterUpdateSettings: js.Array[js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]] = js.native
  var afterValidate: js.Array[
    js.UndefOr[
      js.Function5[
        /* isValid */ Boolean, 
        /* value */ CellValue, 
        /* row */ Double, 
        /* prop */ String | Double, 
        /* source */ ChangeSource, 
        Unit | Boolean
      ]
    ]
  ] = js.native
  var afterViewportColumnCalculatorOverride: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]] = js.native
  var afterViewportRowCalculatorOverride: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]] = js.native
  var beforeAddChild: js.Array[
    js.UndefOr[
      js.Function3[
        /* parent */ RowObject, 
        /* element */ RowObject | Unit, 
        /* index */ Double | Unit, 
        Unit
      ]
    ]
  ] = js.native
  var beforeAutofill: js.Array[
    js.UndefOr[
      js.Function3[
        /* start */ CellCoords, 
        /* end */ CellCoords, 
        /* data */ js.Array[js.Array[CellValue]], 
        Unit
      ]
    ]
  ] = js.native
  var beforeAutofillInsidePopulate: js.Array[
    js.UndefOr[
      js.Function4[
        /* index */ CellCoords, 
        /* direction */ up | down | left | right, 
        /* input */ js.Array[js.Array[CellValue]], 
        /* deltas */ js.Array[_], 
        Unit
      ]
    ]
  ] = js.native
  var beforeCellAlignment: js.Array[
    js.UndefOr[
      js.Function4[
        /* stateBefore */ NumberDictionary[js.Array[String]], 
        /* range */ js.Array[CellRange], 
        /* type */ horizontal | vertical, 
        /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
        Unit
      ]
    ]
  ] = js.native
  var beforeChange: js.Array[
    js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
    ]
  ] = js.native
  var beforeChangeRender: js.Array[
    js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
    ]
  ] = js.native
  var beforeColumnMove: js.Array[
    js.UndefOr[
      js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit | Boolean]
    ]
  ] = js.native
  var beforeColumnResize: js.Array[
    js.UndefOr[
      js.Function3[
        /* currentColumn */ Double, 
        /* newSize */ Double, 
        /* isDoubleClick */ Boolean, 
        Unit | Double
      ]
    ]
  ] = js.native
  var beforeColumnSort: js.Array[
    js.UndefOr[
      js.Function2[
        /* currentSortConfig */ js.Array[Config], 
        /* destinationSortConfigs */ js.Array[Config], 
        Unit | Boolean
      ]
    ]
  ] = js.native
  var beforeContextMenuSetItems: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]] = js.native
  var beforeContextMenuShow: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]] = js.native
  var beforeCopy: js.Array[
    js.UndefOr[
      js.Function2[
        /* data */ js.Array[js.Array[CellValue]], 
        /* coords */ js.Array[RangeType], 
        Unit | Boolean
      ]
    ]
  ] = js.native
  var beforeCreateCol: js.Array[
    js.UndefOr[
      js.Function3[
        /* index */ Double, 
        /* amount */ Double, 
        /* source */ js.UndefOr[ChangeSource], 
        Unit | Boolean
      ]
    ]
  ] = js.native
  var beforeCreateRow: js.Array[
    js.UndefOr[
      js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
    ]
  ] = js.native
  var beforeCut: js.Array[
    js.UndefOr[
      js.Function2[
        /* data */ js.Array[js.Array[CellValue]], 
        /* coords */ js.Array[RangeType], 
        Unit | Boolean
      ]
    ]
  ] = js.native
  var beforeDetachChild: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]] = js.native
  var beforeDrawBorders: js.Array[
    js.UndefOr[
      js.Function2[
        /* corners */ js.Array[Double], 
        /* borderClassName */ js.UndefOr[current | area | highlight], 
        Unit
      ]
    ]
  ] = js.native
  var beforeDropdownMenuSetItems: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]] = js.native
  var beforeDropdownMenuShow: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]] = js.native
  var beforeFilter: js.Array[
    js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
  ] = js.native
  var beforeGetCellMeta: js.Array[
    js.UndefOr[
      js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
    ]
  ] = js.native
  var beforeHideColumns: js.Array[
    js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ] = js.native
  var beforeHideRows: js.Array[
    js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ] = js.native
  var beforeInit: js.Array[js.UndefOr[js.Function0[Unit]]] = js.native
  var beforeInitWalkontable: js.Array[js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]] = js.native
  var beforeKeyDown: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]] = js.native
  var beforeLanguageChange: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]] = js.native
  var beforeMergeCells: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]] = js.native
  var beforeOnCellContextMenu: js.Array[
    js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ] = js.native
  var beforeOnCellMouseDown: js.Array[
    js.UndefOr[
      js.Function4[
        /* event */ MouseEvent, 
        /* coords */ CellCoords, 
        /* TD */ HTMLTableCellElement, 
        /* controller */ SelectionController, 
        Unit
      ]
    ]
  ] = js.native
  var beforeOnCellMouseOut: js.Array[
    js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ] = js.native
  var beforeOnCellMouseOver: js.Array[
    js.UndefOr[
      js.Function4[
        /* event */ MouseEvent, 
        /* coords */ CellCoords, 
        /* TD */ HTMLTableCellElement, 
        /* controller */ SelectionController, 
        Unit
      ]
    ]
  ] = js.native
  var beforeOnCellMouseUp: js.Array[
    js.UndefOr[
      js.Function4[
        /* event */ MouseEvent, 
        /* coords */ CellCoords, 
        /* TD */ HTMLTableCellElement, 
        /* controller */ SelectionController, 
        Unit
      ]
    ]
  ] = js.native
  var beforePaste: js.Array[
    js.UndefOr[
      js.Function2[
        /* data */ js.Array[js.Array[CellValue]], 
        /* coords */ js.Array[RangeType], 
        Unit | Boolean
      ]
    ]
  ] = js.native
  var beforeRedo: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]] = js.native
  var beforeRefreshDimensions: js.Array[
    js.UndefOr[
      js.Function3[
        /* previousDimensions */ js.Object, 
        /* currentDimensions */ js.Object, 
        /* actionPossible */ Boolean, 
        Boolean | Unit
      ]
    ]
  ] = js.native
  var beforeRemoveCellClassNames: js.Array[js.UndefOr[js.Function0[js.Array[String] | Unit]]] = js.native
  var beforeRemoveCellMeta: js.Array[
    js.UndefOr[
      js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
    ]
  ] = js.native
  var beforeRemoveCol: js.Array[
    js.UndefOr[
      js.Function4[
        /* index */ Double, 
        /* amount */ Double, 
        /* physicalColumns */ js.Array[Double], 
        /* source */ js.UndefOr[ChangeSource], 
        Unit
      ]
    ]
  ] = js.native
  var beforeRemoveRow: js.Array[
    js.UndefOr[
      js.Function4[
        /* index */ Double, 
        /* amount */ Double, 
        /* physicalColumns */ js.Array[Double], 
        /* source */ js.UndefOr[ChangeSource], 
        Unit
      ]
    ]
  ] = js.native
  var beforeRender: js.Array[
    js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
  ] = js.native
  var beforeRenderer: js.Array[
    js.UndefOr[
      js.Function6[
        /* TD */ HTMLTableCellElement, 
        /* row */ Double, 
        /* col */ Double, 
        /* prop */ String | Double, 
        /* value */ CellValue, 
        /* cellProperties */ CellProperties, 
        Unit
      ]
    ]
  ] = js.native
  var beforeRowMove: js.Array[
    js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
  ] = js.native
  var beforeRowResize: js.Array[
    js.UndefOr[
      js.Function3[
        /* currentRow */ Double, 
        /* newSize */ Double, 
        /* isDoubleClick */ Boolean, 
        Double | Unit
      ]
    ]
  ] = js.native
  var beforeSetRangeEnd: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]] = js.native
  var beforeSetRangeStart: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]] = js.native
  var beforeSetRangeStartOnly: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]] = js.native
  var beforeStretchingColumnWidth: js.Array[
    js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
  ] = js.native
  var beforeTouchScroll: js.Array[js.UndefOr[js.Function0[Unit]]] = js.native
  var beforeTrimRow: js.Array[
    js.UndefOr[
      js.Function3[
        /* currentTrimConfig */ js.Array[Double], 
        /* destinationTrimConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ] = js.native
  var beforeUndo: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]] = js.native
  var beforeUnhideColumns: js.Array[
    js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ] = js.native
  var beforeUnhideRows: js.Array[
    js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ] = js.native
  var beforeUnmergeCells: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]] = js.native
  var beforeUntrimRow: js.Array[
    js.UndefOr[
      js.Function3[
        /* currentTrimConfig */ js.Array[Double], 
        /* destinationTrimConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ] = js.native
  var beforeValidate: js.Array[
    js.UndefOr[
      js.Function4[
        /* value */ CellValue, 
        /* row */ Double, 
        /* prop */ String | Double, 
        /* source */ js.UndefOr[ChangeSource], 
        Unit
      ]
    ]
  ] = js.native
  var beforeValueRender: js.Array[
    js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
  ] = js.native
  var construct: js.Array[js.UndefOr[js.Function0[Unit]]] = js.native
  var hiddenColumn: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]] = js.native
  var hiddenRow: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]] = js.native
  var init: js.Array[js.UndefOr[js.Function0[Unit]]] = js.native
  var modifyAutofillRange: js.Array[
    js.UndefOr[
      js.Function2[
        /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
        /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
        Unit
      ]
    ]
  ] = js.native
  var modifyCol: js.Array[js.UndefOr[js.Function1[/* col */ Double, Unit]]] = js.native
  var modifyColHeader: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]] = js.native
  var modifyColWidth: js.Array[js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]]] = js.native
  var modifyColumnHeaderHeight: js.Array[js.UndefOr[js.Function0[Unit]]] = js.native
  var modifyCopyableRange: js.Array[js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]] = js.native
  var modifyData: js.Array[
    js.UndefOr[
      js.Function4[
        /* row */ Double, 
        /* column */ Double, 
        /* valueHolder */ ValueCellValue, 
        /* ioMode */ get | set, 
        Unit
      ]
    ]
  ] = js.native
  var modifyGetCellCoords: js.Array[
    js.UndefOr[
      js.Function3[
        /* row */ Double, 
        /* column */ Double, 
        /* topmost */ Boolean, 
        Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
      ]
    ]
  ] = js.native
  var modifyRow: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]] = js.native
  var modifyRowData: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]] = js.native
  var modifyRowHeader: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]] = js.native
  var modifyRowHeaderWidth: js.Array[js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]] = js.native
  var modifyRowHeight: js.Array[js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]] = js.native
  var modifyRowSourceData: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]] = js.native
  var modifyTransformEnd: js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]] = js.native
  var modifyTransformStart: js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]] = js.native
  var persistentStateLoad: js.Array[
    js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
  ] = js.native
  var persistentStateReset: js.Array[js.UndefOr[js.Function1[/* key */ String, Unit]]] = js.native
  var persistentStateSave: js.Array[js.UndefOr[js.Function2[/* key */ String, /* value */ _, Unit]]] = js.native
  var skipLengthCache: js.Array[js.UndefOr[js.Function1[/* delay */ Double, Unit]]] = js.native
  var unmodifyCol: js.Array[js.UndefOr[js.Function1[/* col */ Double, Unit]]] = js.native
  var unmodifyRow: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]] = js.native
}

object Bucket {
  @scala.inline
  implicit class BucketOps[Self <: Bucket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterAddChild(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* parent */ RowObject, 
              /* element */ RowObject | Unit, 
              /* index */ Double | Unit, 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterAddChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterBeginEditing(value: js.Array[js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBeginEditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterCellMetaReset(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCellMetaReset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterChange(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterChangesObserved(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterChangesObserved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterColumnMove(
      value: js.Array[
          js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterColumnMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterColumnResize(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* currentColumn */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterColumnResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterColumnSort(
      value: js.Array[
          js.UndefOr[
            js.Function2[
              /* currentSortConfig */ js.Array[Config], 
              /* destinationSortConfigs */ js.Array[Config], 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterColumnSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterContextMenuDefaultOptions(
      value: js.Array[
          js.UndefOr[
            js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterContextMenuDefaultOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterContextMenuHide(value: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterContextMenuHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterContextMenuShow(value: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterContextMenuShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterCopy(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCopy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterCopyLimit(
      value: js.Array[
          js.UndefOr[
            js.Function4[
              /* selectedRows */ Double, 
              /* selectedColumnds */ Double, 
              /* copyRowsLimit */ Double, 
              /* copyColumnsLimit */ Double, 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCopyLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterCreateCol(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCreateCol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterCreateRow(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCreateRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterCut(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterDeselect(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDeselect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterDestroy(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDestroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterDetachChild(value: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDetachChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterDocumentKeyDown(value: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDocumentKeyDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterDrawSelection(
      value: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentRow */ Double, 
              /* currentColumn */ Double, 
              /* cornersOfSelection */ js.Array[Double], 
              /* layerLevel */ Double | Unit, 
              String | Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDrawSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterDropdownMenuDefaultOptions(
      value: js.Array[
          js.UndefOr[
            js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDropdownMenuDefaultOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterDropdownMenuHide(value: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDropdownMenuHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterDropdownMenuShow(value: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDropdownMenuShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterFilter(value: js.Array[js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterGetCellMeta(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGetCellMeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterGetColHeader(
      value: js.Array[
          js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGetColHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterGetColumnHeaderRenderers(
      value: js.Array[
          js.UndefOr[
            js.Function1[
              /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGetColumnHeaderRenderers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterGetRowHeader(
      value: js.Array[
          js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGetRowHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterGetRowHeaderRenderers(
      value: js.Array[
          js.UndefOr[
            js.Function1[
              /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGetRowHeaderRenderers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterHideColumns(
      value: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              /* stateChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterHideColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterHideRows(
      value: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              /* stateChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterHideRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterInit(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterLanguageChange(value: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLanguageChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterListen(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterListen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterLoadData(value: js.Array[js.UndefOr[js.Function1[/* initialLoad */ Boolean, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLoadData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterMergeCells(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterMergeCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterModifyTransformEnd(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* coords */ CellCoords, 
              /* rowTransformDir */ `-1` | `0`, 
              /* colTransformDir */ `-1` | `0`, 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterModifyTransformEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterModifyTransformStart(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* coords */ CellCoords, 
              /* rowTransformDir */ `-1` | `0`, 
              /* colTransformDir */ `-1` | `0`, 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterModifyTransformStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterMomentumScroll(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterMomentumScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterOnCellContextMenu(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOnCellContextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterOnCellCornerDblClick(value: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOnCellCornerDblClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterOnCellCornerMouseDown(value: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOnCellCornerMouseDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterOnCellMouseDown(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOnCellMouseDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterOnCellMouseOut(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOnCellMouseOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterOnCellMouseOver(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOnCellMouseOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterOnCellMouseUp(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOnCellMouseUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterPaste(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterPluginsInitialized(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPluginsInitialized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterRedo(value: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRedo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterRefreshDimensions(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* previousDimensions */ js.Object, 
              /* currentDimensions */ js.Object, 
              /* stateChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRefreshDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterRemoveCellMeta(
      value: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRemoveCellMeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterRemoveCol(
      value: js.Array[
          js.UndefOr[
            js.Function4[
              /* index */ Double, 
              /* amount */ Double, 
              /* physicalColumns */ js.Array[Double], 
              /* source */ js.UndefOr[ChangeSource], 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRemoveCol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterRemoveRow(
      value: js.Array[
          js.UndefOr[
            js.Function4[
              /* index */ Double, 
              /* amount */ Double, 
              /* physicalColumns */ js.Array[Double], 
              /* source */ js.UndefOr[ChangeSource], 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRemoveRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterRender(value: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterRenderer(
      value: js.Array[
          js.UndefOr[
            js.Function6[
              /* TD */ HTMLTableCellElement, 
              /* row */ Double, 
              /* col */ Double, 
              /* prop */ String | Double, 
              /* value */ String, 
              /* cellProperties */ CellProperties, 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterRowMove(value: js.Array[js.UndefOr[js.Function2[/* startRow */ Double, /* endRow */ Double, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRowMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterRowResize(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* currentRow */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRowResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterScrollHorizontally(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterScrollHorizontally")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterScrollVertically(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterScrollVertically")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterSelection(
      value: js.Array[
          js.UndefOr[
            js.Function6[
              /* row */ Double, 
              /* column */ Double, 
              /* row2 */ Double, 
              /* column2 */ Double, 
              /* preventScrolling */ Value, 
              /* selectionLayerLevel */ Double, 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterSelectionByProp(
      value: js.Array[
          js.UndefOr[
            js.Function6[
              /* row */ Double, 
              /* prop */ String, 
              /* row2 */ Double, 
              /* prop2 */ String, 
              /* preventScrolling */ Value, 
              /* selectionLayerLevel */ Double, 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelectionByProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterSelectionEnd(
      value: js.Array[
          js.UndefOr[
            js.Function5[
              /* row */ Double, 
              /* column */ Double, 
              /* row2 */ Double, 
              /* column2 */ Double, 
              /* selectionLayerLevel */ Double, 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelectionEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterSelectionEndByProp(
      value: js.Array[
          js.UndefOr[
            js.Function5[
              /* row */ Double, 
              /* prop */ String, 
              /* row2 */ Double, 
              /* prop2 */ String, 
              /* selectionLayerLevel */ Double, 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelectionEndByProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterSetCellMeta(
      value: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ _, Unit]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSetCellMeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterSetDataAtCell(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSetDataAtCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterSetDataAtRowProp(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSetDataAtRowProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterTrimRow(
      value: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentTrimConfig */ js.Array[Double], 
              /* destinationTrimConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              /* stateChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterTrimRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterUndo(value: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUndo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterUnhideColumns(
      value: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              /* stateChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUnhideColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterUnhideRows(
      value: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              /* stateChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUnhideRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterUnlisten(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUnlisten")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterUnmergeCells(value: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUnmergeCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterUntrimRow(
      value: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentTrimConfig */ js.Array[Double], 
              /* destinationTrimConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              /* stateChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUntrimRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterUpdateSettings(value: js.Array[js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUpdateSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterValidate(
      value: js.Array[
          js.UndefOr[
            js.Function5[
              /* isValid */ Boolean, 
              /* value */ CellValue, 
              /* row */ Double, 
              /* prop */ String | Double, 
              /* source */ ChangeSource, 
              Unit | Boolean
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterValidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterViewportColumnCalculatorOverride(value: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterViewportColumnCalculatorOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterViewportRowCalculatorOverride(value: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterViewportRowCalculatorOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeAddChild(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* parent */ RowObject, 
              /* element */ RowObject | Unit, 
              /* index */ Double | Unit, 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAddChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeAutofill(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* start */ CellCoords, 
              /* end */ CellCoords, 
              /* data */ js.Array[js.Array[CellValue]], 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAutofill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeAutofillInsidePopulate(
      value: js.Array[
          js.UndefOr[
            js.Function4[
              /* index */ CellCoords, 
              /* direction */ up | down | left | right, 
              /* input */ js.Array[js.Array[CellValue]], 
              /* deltas */ js.Array[_], 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAutofillInsidePopulate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeCellAlignment(
      value: js.Array[
          js.UndefOr[
            js.Function4[
              /* stateBefore */ NumberDictionary[js.Array[String]], 
              /* range */ js.Array[CellRange], 
              /* type */ horizontal | vertical, 
              /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCellAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeChange(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeChangeRender(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeChangeRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeColumnMove(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit | Boolean]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeColumnMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeColumnResize(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentColumn */ Double, 
              /* newSize */ Double, 
              /* isDoubleClick */ Boolean, 
              Unit | Double
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeColumnResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeColumnSort(
      value: js.Array[
          js.UndefOr[
            js.Function2[
              /* currentSortConfig */ js.Array[Config], 
              /* destinationSortConfigs */ js.Array[Config], 
              Unit | Boolean
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeColumnSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeContextMenuSetItems(value: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeContextMenuSetItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeContextMenuShow(value: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeContextMenuShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeCopy(
      value: js.Array[
          js.UndefOr[
            js.Function2[
              /* data */ js.Array[js.Array[CellValue]], 
              /* coords */ js.Array[RangeType], 
              Unit | Boolean
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCopy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeCreateCol(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* index */ Double, 
              /* amount */ Double, 
              /* source */ js.UndefOr[ChangeSource], 
              Unit | Boolean
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCreateCol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeCreateRow(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCreateRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeCut(
      value: js.Array[
          js.UndefOr[
            js.Function2[
              /* data */ js.Array[js.Array[CellValue]], 
              /* coords */ js.Array[RangeType], 
              Unit | Boolean
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeDetachChild(value: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDetachChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeDrawBorders(
      value: js.Array[
          js.UndefOr[
            js.Function2[
              /* corners */ js.Array[Double], 
              /* borderClassName */ js.UndefOr[current | area | highlight], 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDrawBorders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeDropdownMenuSetItems(value: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDropdownMenuSetItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeDropdownMenuShow(value: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDropdownMenuShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeFilter(
      value: js.Array[
          js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeGetCellMeta(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeGetCellMeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeHideColumns(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeHideColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeHideRows(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeHideRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeInit(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeInitWalkontable(value: js.Array[js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInitWalkontable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeKeyDown(value: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeKeyDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeLanguageChange(value: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLanguageChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeMergeCells(value: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeMergeCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeOnCellContextMenu(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeOnCellContextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeOnCellMouseDown(
      value: js.Array[
          js.UndefOr[
            js.Function4[
              /* event */ MouseEvent, 
              /* coords */ CellCoords, 
              /* TD */ HTMLTableCellElement, 
              /* controller */ SelectionController, 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeOnCellMouseDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeOnCellMouseOut(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeOnCellMouseOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeOnCellMouseOver(
      value: js.Array[
          js.UndefOr[
            js.Function4[
              /* event */ MouseEvent, 
              /* coords */ CellCoords, 
              /* TD */ HTMLTableCellElement, 
              /* controller */ SelectionController, 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeOnCellMouseOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeOnCellMouseUp(
      value: js.Array[
          js.UndefOr[
            js.Function4[
              /* event */ MouseEvent, 
              /* coords */ CellCoords, 
              /* TD */ HTMLTableCellElement, 
              /* controller */ SelectionController, 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeOnCellMouseUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforePaste(
      value: js.Array[
          js.UndefOr[
            js.Function2[
              /* data */ js.Array[js.Array[CellValue]], 
              /* coords */ js.Array[RangeType], 
              Unit | Boolean
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeRedo(value: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRedo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeRefreshDimensions(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* previousDimensions */ js.Object, 
              /* currentDimensions */ js.Object, 
              /* actionPossible */ Boolean, 
              Boolean | Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRefreshDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeRemoveCellClassNames(value: js.Array[js.UndefOr[js.Function0[js.Array[String] | Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRemoveCellClassNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeRemoveCellMeta(
      value: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRemoveCellMeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeRemoveCol(
      value: js.Array[
          js.UndefOr[
            js.Function4[
              /* index */ Double, 
              /* amount */ Double, 
              /* physicalColumns */ js.Array[Double], 
              /* source */ js.UndefOr[ChangeSource], 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRemoveCol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeRemoveRow(
      value: js.Array[
          js.UndefOr[
            js.Function4[
              /* index */ Double, 
              /* amount */ Double, 
              /* physicalColumns */ js.Array[Double], 
              /* source */ js.UndefOr[ChangeSource], 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRemoveRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeRender(
      value: js.Array[
          js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeRenderer(
      value: js.Array[
          js.UndefOr[
            js.Function6[
              /* TD */ HTMLTableCellElement, 
              /* row */ Double, 
              /* col */ Double, 
              /* prop */ String | Double, 
              /* value */ CellValue, 
              /* cellProperties */ CellProperties, 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeRowMove(
      value: js.Array[
          js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRowMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeRowResize(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentRow */ Double, 
              /* newSize */ Double, 
              /* isDoubleClick */ Boolean, 
              Double | Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRowResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeSetRangeEnd(value: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSetRangeEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeSetRangeStart(value: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSetRangeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeSetRangeStartOnly(value: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSetRangeStartOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeStretchingColumnWidth(
      value: js.Array[
          js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeStretchingColumnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeTouchScroll(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeTouchScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeTrimRow(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentTrimConfig */ js.Array[Double], 
              /* destinationTrimConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeTrimRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeUndo(value: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUndo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeUnhideColumns(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUnhideColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeUnhideRows(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUnhideRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeUnmergeCells(value: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUnmergeCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeUntrimRow(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentTrimConfig */ js.Array[Double], 
              /* destinationTrimConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUntrimRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeValidate(
      value: js.Array[
          js.UndefOr[
            js.Function4[
              /* value */ CellValue, 
              /* row */ Double, 
              /* prop */ String | Double, 
              /* source */ js.UndefOr[ChangeSource], 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeValidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeValueRender(
      value: js.Array[
          js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeValueRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstruct(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("construct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHiddenColumn(value: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHiddenRow(value: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInit(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifyAutofillRange(
      value: js.Array[
          js.UndefOr[
            js.Function2[
              /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
              /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyAutofillRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifyCol(value: js.Array[js.UndefOr[js.Function1[/* col */ Double, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyCol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifyColHeader(value: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyColHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifyColWidth(value: js.Array[js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyColWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifyColumnHeaderHeight(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyColumnHeaderHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifyCopyableRange(value: js.Array[js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyCopyableRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifyData(
      value: js.Array[
          js.UndefOr[
            js.Function4[
              /* row */ Double, 
              /* column */ Double, 
              /* valueHolder */ ValueCellValue, 
              /* ioMode */ get | set, 
              Unit
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifyGetCellCoords(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* row */ Double, 
              /* column */ Double, 
              /* topmost */ Boolean, 
              Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyGetCellCoords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifyRow(value: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifyRowData(value: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyRowData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifyRowHeader(value: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyRowHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifyRowHeaderWidth(value: js.Array[js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyRowHeaderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifyRowHeight(value: js.Array[js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifyRowSourceData(value: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyRowSourceData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifyTransformEnd(value: js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyTransformEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifyTransformStart(value: js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyTransformStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersistentStateLoad(
      value: js.Array[
          js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentStateLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersistentStateReset(value: js.Array[js.UndefOr[js.Function1[/* key */ String, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentStateReset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersistentStateSave(value: js.Array[js.UndefOr[js.Function2[/* key */ String, /* value */ _, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentStateSave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipLengthCache(value: js.Array[js.UndefOr[js.Function1[/* delay */ Double, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLengthCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnmodifyCol(value: js.Array[js.UndefOr[js.Function1[/* col */ Double, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmodifyCol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnmodifyRow(value: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmodifyRow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

