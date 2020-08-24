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
import typingsSlinky.handsontable.handsontableStrings.afterAddChild
import typingsSlinky.handsontable.handsontableStrings.afterBeginEditing
import typingsSlinky.handsontable.handsontableStrings.afterCellMetaReset
import typingsSlinky.handsontable.handsontableStrings.afterChange
import typingsSlinky.handsontable.handsontableStrings.afterChangesObserved
import typingsSlinky.handsontable.handsontableStrings.afterColumnMove
import typingsSlinky.handsontable.handsontableStrings.afterColumnResize
import typingsSlinky.handsontable.handsontableStrings.afterColumnSort
import typingsSlinky.handsontable.handsontableStrings.afterContextMenuDefaultOptions
import typingsSlinky.handsontable.handsontableStrings.afterContextMenuHide
import typingsSlinky.handsontable.handsontableStrings.afterContextMenuShow
import typingsSlinky.handsontable.handsontableStrings.afterCopy
import typingsSlinky.handsontable.handsontableStrings.afterCopyLimit
import typingsSlinky.handsontable.handsontableStrings.afterCreateCol
import typingsSlinky.handsontable.handsontableStrings.afterCreateRow
import typingsSlinky.handsontable.handsontableStrings.afterCut
import typingsSlinky.handsontable.handsontableStrings.afterDeselect
import typingsSlinky.handsontable.handsontableStrings.afterDestroy
import typingsSlinky.handsontable.handsontableStrings.afterDetachChild
import typingsSlinky.handsontable.handsontableStrings.afterDocumentKeyDown
import typingsSlinky.handsontable.handsontableStrings.afterDrawSelection
import typingsSlinky.handsontable.handsontableStrings.afterDropdownMenuDefaultOptions
import typingsSlinky.handsontable.handsontableStrings.afterDropdownMenuHide
import typingsSlinky.handsontable.handsontableStrings.afterDropdownMenuShow
import typingsSlinky.handsontable.handsontableStrings.afterFilter
import typingsSlinky.handsontable.handsontableStrings.afterGetCellMeta
import typingsSlinky.handsontable.handsontableStrings.afterGetColHeader
import typingsSlinky.handsontable.handsontableStrings.afterGetColumnHeaderRenderers
import typingsSlinky.handsontable.handsontableStrings.afterGetRowHeader
import typingsSlinky.handsontable.handsontableStrings.afterGetRowHeaderRenderers
import typingsSlinky.handsontable.handsontableStrings.afterHideColumns
import typingsSlinky.handsontable.handsontableStrings.afterHideRows
import typingsSlinky.handsontable.handsontableStrings.afterInit
import typingsSlinky.handsontable.handsontableStrings.afterLanguageChange
import typingsSlinky.handsontable.handsontableStrings.afterListen
import typingsSlinky.handsontable.handsontableStrings.afterLoadData
import typingsSlinky.handsontable.handsontableStrings.afterMergeCells
import typingsSlinky.handsontable.handsontableStrings.afterModifyTransformEnd
import typingsSlinky.handsontable.handsontableStrings.afterModifyTransformStart
import typingsSlinky.handsontable.handsontableStrings.afterMomentumScroll
import typingsSlinky.handsontable.handsontableStrings.afterOnCellContextMenu
import typingsSlinky.handsontable.handsontableStrings.afterOnCellCornerDblClick
import typingsSlinky.handsontable.handsontableStrings.afterOnCellCornerMouseDown
import typingsSlinky.handsontable.handsontableStrings.afterOnCellMouseDown
import typingsSlinky.handsontable.handsontableStrings.afterOnCellMouseOut
import typingsSlinky.handsontable.handsontableStrings.afterOnCellMouseOver
import typingsSlinky.handsontable.handsontableStrings.afterOnCellMouseUp
import typingsSlinky.handsontable.handsontableStrings.afterPaste
import typingsSlinky.handsontable.handsontableStrings.afterPluginsInitialized
import typingsSlinky.handsontable.handsontableStrings.afterRedo
import typingsSlinky.handsontable.handsontableStrings.afterRefreshDimensions
import typingsSlinky.handsontable.handsontableStrings.afterRemoveCellMeta
import typingsSlinky.handsontable.handsontableStrings.afterRemoveCol
import typingsSlinky.handsontable.handsontableStrings.afterRemoveRow
import typingsSlinky.handsontable.handsontableStrings.afterRender
import typingsSlinky.handsontable.handsontableStrings.afterRenderer
import typingsSlinky.handsontable.handsontableStrings.afterRowMove
import typingsSlinky.handsontable.handsontableStrings.afterRowResize
import typingsSlinky.handsontable.handsontableStrings.afterScrollHorizontally
import typingsSlinky.handsontable.handsontableStrings.afterScrollVertically
import typingsSlinky.handsontable.handsontableStrings.afterSelection
import typingsSlinky.handsontable.handsontableStrings.afterSelectionByProp
import typingsSlinky.handsontable.handsontableStrings.afterSelectionEnd
import typingsSlinky.handsontable.handsontableStrings.afterSelectionEndByProp
import typingsSlinky.handsontable.handsontableStrings.afterSetCellMeta
import typingsSlinky.handsontable.handsontableStrings.afterSetDataAtCell
import typingsSlinky.handsontable.handsontableStrings.afterSetDataAtRowProp
import typingsSlinky.handsontable.handsontableStrings.afterTrimRow
import typingsSlinky.handsontable.handsontableStrings.afterUndo
import typingsSlinky.handsontable.handsontableStrings.afterUnhideColumns
import typingsSlinky.handsontable.handsontableStrings.afterUnhideRows
import typingsSlinky.handsontable.handsontableStrings.afterUnlisten
import typingsSlinky.handsontable.handsontableStrings.afterUnmergeCells
import typingsSlinky.handsontable.handsontableStrings.afterUntrimRow
import typingsSlinky.handsontable.handsontableStrings.afterUpdateSettings
import typingsSlinky.handsontable.handsontableStrings.afterValidate
import typingsSlinky.handsontable.handsontableStrings.afterViewportColumnCalculatorOverride
import typingsSlinky.handsontable.handsontableStrings.afterViewportRowCalculatorOverride
import typingsSlinky.handsontable.handsontableStrings.area
import typingsSlinky.handsontable.handsontableStrings.beforeAddChild
import typingsSlinky.handsontable.handsontableStrings.beforeAutofill
import typingsSlinky.handsontable.handsontableStrings.beforeAutofillInsidePopulate
import typingsSlinky.handsontable.handsontableStrings.beforeCellAlignment
import typingsSlinky.handsontable.handsontableStrings.beforeChange
import typingsSlinky.handsontable.handsontableStrings.beforeChangeRender
import typingsSlinky.handsontable.handsontableStrings.beforeColumnMove
import typingsSlinky.handsontable.handsontableStrings.beforeColumnResize
import typingsSlinky.handsontable.handsontableStrings.beforeColumnSort
import typingsSlinky.handsontable.handsontableStrings.beforeContextMenuSetItems
import typingsSlinky.handsontable.handsontableStrings.beforeContextMenuShow
import typingsSlinky.handsontable.handsontableStrings.beforeCopy
import typingsSlinky.handsontable.handsontableStrings.beforeCreateCol
import typingsSlinky.handsontable.handsontableStrings.beforeCreateRow
import typingsSlinky.handsontable.handsontableStrings.beforeCut
import typingsSlinky.handsontable.handsontableStrings.beforeDetachChild
import typingsSlinky.handsontable.handsontableStrings.beforeDrawBorders
import typingsSlinky.handsontable.handsontableStrings.beforeDropdownMenuSetItems
import typingsSlinky.handsontable.handsontableStrings.beforeDropdownMenuShow
import typingsSlinky.handsontable.handsontableStrings.beforeFilter
import typingsSlinky.handsontable.handsontableStrings.beforeGetCellMeta
import typingsSlinky.handsontable.handsontableStrings.beforeHideColumns
import typingsSlinky.handsontable.handsontableStrings.beforeHideRows
import typingsSlinky.handsontable.handsontableStrings.beforeInit
import typingsSlinky.handsontable.handsontableStrings.beforeInitWalkontable
import typingsSlinky.handsontable.handsontableStrings.beforeKeyDown
import typingsSlinky.handsontable.handsontableStrings.beforeLanguageChange
import typingsSlinky.handsontable.handsontableStrings.beforeMergeCells
import typingsSlinky.handsontable.handsontableStrings.beforeOnCellContextMenu
import typingsSlinky.handsontable.handsontableStrings.beforeOnCellMouseDown
import typingsSlinky.handsontable.handsontableStrings.beforeOnCellMouseOut
import typingsSlinky.handsontable.handsontableStrings.beforeOnCellMouseOver
import typingsSlinky.handsontable.handsontableStrings.beforeOnCellMouseUp
import typingsSlinky.handsontable.handsontableStrings.beforePaste
import typingsSlinky.handsontable.handsontableStrings.beforeRedo
import typingsSlinky.handsontable.handsontableStrings.beforeRefreshDimensions
import typingsSlinky.handsontable.handsontableStrings.beforeRemoveCellClassNames
import typingsSlinky.handsontable.handsontableStrings.beforeRemoveCellMeta
import typingsSlinky.handsontable.handsontableStrings.beforeRemoveCol
import typingsSlinky.handsontable.handsontableStrings.beforeRemoveRow
import typingsSlinky.handsontable.handsontableStrings.beforeRender
import typingsSlinky.handsontable.handsontableStrings.beforeRenderer
import typingsSlinky.handsontable.handsontableStrings.beforeRowMove
import typingsSlinky.handsontable.handsontableStrings.beforeRowResize
import typingsSlinky.handsontable.handsontableStrings.beforeSetRangeEnd
import typingsSlinky.handsontable.handsontableStrings.beforeSetRangeStart
import typingsSlinky.handsontable.handsontableStrings.beforeSetRangeStartOnly
import typingsSlinky.handsontable.handsontableStrings.beforeStretchingColumnWidth
import typingsSlinky.handsontable.handsontableStrings.beforeTouchScroll
import typingsSlinky.handsontable.handsontableStrings.beforeTrimRow
import typingsSlinky.handsontable.handsontableStrings.beforeUndo
import typingsSlinky.handsontable.handsontableStrings.beforeUnhideColumns
import typingsSlinky.handsontable.handsontableStrings.beforeUnhideRows
import typingsSlinky.handsontable.handsontableStrings.beforeUnmergeCells
import typingsSlinky.handsontable.handsontableStrings.beforeUntrimRow
import typingsSlinky.handsontable.handsontableStrings.beforeValidate
import typingsSlinky.handsontable.handsontableStrings.beforeValueRender
import typingsSlinky.handsontable.handsontableStrings.construct
import typingsSlinky.handsontable.handsontableStrings.current
import typingsSlinky.handsontable.handsontableStrings.down
import typingsSlinky.handsontable.handsontableStrings.get
import typingsSlinky.handsontable.handsontableStrings.hiddenColumn
import typingsSlinky.handsontable.handsontableStrings.hiddenRow
import typingsSlinky.handsontable.handsontableStrings.highlight
import typingsSlinky.handsontable.handsontableStrings.horizontal
import typingsSlinky.handsontable.handsontableStrings.htBottom
import typingsSlinky.handsontable.handsontableStrings.htCenter
import typingsSlinky.handsontable.handsontableStrings.htJustify
import typingsSlinky.handsontable.handsontableStrings.htLeft
import typingsSlinky.handsontable.handsontableStrings.htMiddle
import typingsSlinky.handsontable.handsontableStrings.htRight
import typingsSlinky.handsontable.handsontableStrings.htTop
import typingsSlinky.handsontable.handsontableStrings.init
import typingsSlinky.handsontable.handsontableStrings.left
import typingsSlinky.handsontable.handsontableStrings.modifyAutofillRange
import typingsSlinky.handsontable.handsontableStrings.modifyCol
import typingsSlinky.handsontable.handsontableStrings.modifyColHeader
import typingsSlinky.handsontable.handsontableStrings.modifyColWidth
import typingsSlinky.handsontable.handsontableStrings.modifyColumnHeaderHeight
import typingsSlinky.handsontable.handsontableStrings.modifyCopyableRange
import typingsSlinky.handsontable.handsontableStrings.modifyData
import typingsSlinky.handsontable.handsontableStrings.modifyGetCellCoords
import typingsSlinky.handsontable.handsontableStrings.modifyRow
import typingsSlinky.handsontable.handsontableStrings.modifyRowData
import typingsSlinky.handsontable.handsontableStrings.modifyRowHeader
import typingsSlinky.handsontable.handsontableStrings.modifyRowHeaderWidth
import typingsSlinky.handsontable.handsontableStrings.modifyRowHeight
import typingsSlinky.handsontable.handsontableStrings.modifyRowSourceData
import typingsSlinky.handsontable.handsontableStrings.modifyTransformEnd
import typingsSlinky.handsontable.handsontableStrings.modifyTransformStart
import typingsSlinky.handsontable.handsontableStrings.persistentStateLoad
import typingsSlinky.handsontable.handsontableStrings.persistentStateReset
import typingsSlinky.handsontable.handsontableStrings.persistentStateSave
import typingsSlinky.handsontable.handsontableStrings.right
import typingsSlinky.handsontable.handsontableStrings.set
import typingsSlinky.handsontable.handsontableStrings.skipLengthCache
import typingsSlinky.handsontable.handsontableStrings.unmodifyCol
import typingsSlinky.handsontable.handsontableStrings.unmodifyRow
import typingsSlinky.handsontable.handsontableStrings.up
import typingsSlinky.handsontable.handsontableStrings.vertical
import typingsSlinky.handsontable.mod.Handsontable
import typingsSlinky.handsontable.mod.Handsontable.Bucket
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
trait Methods extends js.Object {
  def add(
    key: afterModifyTransformEnd,
    callback: js.UndefOr[
      js.Function3[
        /* coords */ CellCoords, 
        /* rowTransformDir */ `-1` | `0`, 
        /* colTransformDir */ `-1` | `0`, 
        Unit
      ]
    ]
  ): Methods = js.native
  def add(
    key: afterModifyTransformEnd,
    callback: js.UndefOr[
      js.Function3[
        /* coords */ CellCoords, 
        /* rowTransformDir */ `-1` | `0`, 
        /* colTransformDir */ `-1` | `0`, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  def add(
    key: afterModifyTransformEnd,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* coords */ CellCoords, 
          /* rowTransformDir */ `-1` | `0`, 
          /* colTransformDir */ `-1` | `0`, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  def add(
    key: afterModifyTransformEnd,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* coords */ CellCoords, 
          /* rowTransformDir */ `-1` | `0`, 
          /* colTransformDir */ `-1` | `0`, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  def add(
    key: afterModifyTransformStart,
    callback: js.UndefOr[
      js.Function3[
        /* coords */ CellCoords, 
        /* rowTransformDir */ `-1` | `0`, 
        /* colTransformDir */ `-1` | `0`, 
        Unit
      ]
    ]
  ): Methods = js.native
  def add(
    key: afterModifyTransformStart,
    callback: js.UndefOr[
      js.Function3[
        /* coords */ CellCoords, 
        /* rowTransformDir */ `-1` | `0`, 
        /* colTransformDir */ `-1` | `0`, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  def add(
    key: afterModifyTransformStart,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* coords */ CellCoords, 
          /* rowTransformDir */ `-1` | `0`, 
          /* colTransformDir */ `-1` | `0`, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  def add(
    key: afterModifyTransformStart,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* coords */ CellCoords, 
          /* rowTransformDir */ `-1` | `0`, 
          /* colTransformDir */ `-1` | `0`, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  def add(
    key: beforeAutofillInsidePopulate,
    callback: js.UndefOr[
      js.Function4[
        /* index */ CellCoords, 
        /* direction */ up | down | left | right, 
        /* input */ js.Array[js.Array[CellValue]], 
        /* deltas */ js.Array[_], 
        Unit
      ]
    ]
  ): Methods = js.native
  def add(
    key: beforeAutofillInsidePopulate,
    callback: js.UndefOr[
      js.Function4[
        /* index */ CellCoords, 
        /* direction */ up | down | left | right, 
        /* input */ js.Array[js.Array[CellValue]], 
        /* deltas */ js.Array[_], 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  def add(
    key: beforeAutofillInsidePopulate,
    callback: js.Array[
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
  ): Methods = js.native
  def add(
    key: beforeAutofillInsidePopulate,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* index */ CellCoords, 
          /* direction */ up | down | left | right, 
          /* input */ js.Array[js.Array[CellValue]], 
          /* deltas */ js.Array[_], 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  def add(
    key: beforeCellAlignment,
    callback: js.UndefOr[
      js.Function4[
        /* stateBefore */ NumberDictionary[js.Array[String]], 
        /* range */ js.Array[CellRange], 
        /* type */ horizontal | vertical, 
        /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
        Unit
      ]
    ]
  ): Methods = js.native
  def add(
    key: beforeCellAlignment,
    callback: js.UndefOr[
      js.Function4[
        /* stateBefore */ NumberDictionary[js.Array[String]], 
        /* range */ js.Array[CellRange], 
        /* type */ horizontal | vertical, 
        /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  def add(
    key: beforeCellAlignment,
    callback: js.Array[
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
  ): Methods = js.native
  def add(
    key: beforeCellAlignment,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* stateBefore */ NumberDictionary[js.Array[String]], 
          /* range */ js.Array[CellRange], 
          /* type */ horizontal | vertical, 
          /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  def add(
    key: beforeDrawBorders,
    callback: js.UndefOr[
      js.Function2[
        /* corners */ js.Array[Double], 
        /* borderClassName */ js.UndefOr[current | area | highlight], 
        Unit
      ]
    ]
  ): Methods = js.native
  def add(
    key: beforeDrawBorders,
    callback: js.UndefOr[
      js.Function2[
        /* corners */ js.Array[Double], 
        /* borderClassName */ js.UndefOr[current | area | highlight], 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  def add(
    key: beforeDrawBorders,
    callback: js.Array[
      js.UndefOr[
        js.Function2[
          /* corners */ js.Array[Double], 
          /* borderClassName */ js.UndefOr[current | area | highlight], 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  def add(
    key: beforeDrawBorders,
    callback: js.Array[
      js.UndefOr[
        js.Function2[
          /* corners */ js.Array[Double], 
          /* borderClassName */ js.UndefOr[current | area | highlight], 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  def add(
    key: modifyData,
    callback: js.UndefOr[
      js.Function4[
        /* row */ Double, 
        /* column */ Double, 
        /* valueHolder */ ValueCellValue, 
        /* ioMode */ get | set, 
        Unit
      ]
    ]
  ): Methods = js.native
  def add(
    key: modifyData,
    callback: js.UndefOr[
      js.Function4[
        /* row */ Double, 
        /* column */ Double, 
        /* valueHolder */ ValueCellValue, 
        /* ioMode */ get | set, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  def add(
    key: modifyData,
    callback: js.Array[
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
  ): Methods = js.native
  def add(
    key: modifyData,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* row */ Double, 
          /* column */ Double, 
          /* valueHolder */ ValueCellValue, 
          /* ioMode */ get | set, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterAddChild(
    key: afterAddChild,
    callback: js.UndefOr[
      js.Function3[
        /* parent */ RowObject, 
        /* element */ RowObject | Unit, 
        /* index */ Double | Unit, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterAddChild(
    key: afterAddChild,
    callback: js.UndefOr[
      js.Function3[
        /* parent */ RowObject, 
        /* element */ RowObject | Unit, 
        /* index */ Double | Unit, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterAddChild(
    key: afterAddChild,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* parent */ RowObject, 
          /* element */ RowObject | Unit, 
          /* index */ Double | Unit, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterAddChild(
    key: afterAddChild,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* parent */ RowObject, 
          /* element */ RowObject | Unit, 
          /* index */ Double | Unit, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterBeginEditing(
    key: afterBeginEditing,
    callback: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_afterBeginEditing(
    key: afterBeginEditing,
    callback: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterBeginEditing(
    key: afterBeginEditing,
    callback: js.Array[js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterBeginEditing(
    key: afterBeginEditing,
    callback: js.Array[js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterCellMetaReset(key: afterCellMetaReset, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_afterCellMetaReset(key: afterCellMetaReset, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterCellMetaReset(key: afterCellMetaReset, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_afterCellMetaReset(key: afterCellMetaReset, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterChange(
    key: afterChange,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterChange(
    key: afterChange,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterChange(
    key: afterChange,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterChange(
    key: afterChange,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterChangesObserved(key: afterChangesObserved, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_afterChangesObserved(key: afterChangesObserved, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterChangesObserved(key: afterChangesObserved, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_afterChangesObserved(
    key: afterChangesObserved,
    callback: js.Array[js.UndefOr[js.Function0[Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterColumnMove(
    key: afterColumnMove,
    callback: js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_afterColumnMove(
    key: afterColumnMove,
    callback: js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterColumnMove(
    key: afterColumnMove,
    callback: js.Array[
      js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterColumnMove(
    key: afterColumnMove,
    callback: js.Array[
      js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterColumnResize(
    key: afterColumnResize,
    callback: js.UndefOr[
      js.Function3[/* currentColumn */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterColumnResize(
    key: afterColumnResize,
    callback: js.UndefOr[
      js.Function3[/* currentColumn */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterColumnResize(
    key: afterColumnResize,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* currentColumn */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterColumnResize(
    key: afterColumnResize,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* currentColumn */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterColumnSort(
    key: afterColumnSort,
    callback: js.UndefOr[
      js.Function2[
        /* currentSortConfig */ js.Array[Config], 
        /* destinationSortConfigs */ js.Array[Config], 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterColumnSort(
    key: afterColumnSort,
    callback: js.UndefOr[
      js.Function2[
        /* currentSortConfig */ js.Array[Config], 
        /* destinationSortConfigs */ js.Array[Config], 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterColumnSort(
    key: afterColumnSort,
    callback: js.Array[
      js.UndefOr[
        js.Function2[
          /* currentSortConfig */ js.Array[Config], 
          /* destinationSortConfigs */ js.Array[Config], 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterColumnSort(
    key: afterColumnSort,
    callback: js.Array[
      js.UndefOr[
        js.Function2[
          /* currentSortConfig */ js.Array[Config], 
          /* destinationSortConfigs */ js.Array[Config], 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterContextMenuDefaultOptions(
    key: afterContextMenuDefaultOptions,
    callback: js.UndefOr[
      js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterContextMenuDefaultOptions(
    key: afterContextMenuDefaultOptions,
    callback: js.UndefOr[
      js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterContextMenuDefaultOptions(
    key: afterContextMenuDefaultOptions,
    callback: js.Array[
      js.UndefOr[
        js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterContextMenuDefaultOptions(
    key: afterContextMenuDefaultOptions,
    callback: js.Array[
      js.UndefOr[
        js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterContextMenuHide(key: afterContextMenuHide, callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]): Methods = js.native
  @JSName("add")
  def add_afterContextMenuHide(
    key: afterContextMenuHide,
    callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterContextMenuHide(
    key: afterContextMenuHide,
    callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterContextMenuHide(
    key: afterContextMenuHide,
    callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterContextMenuShow(key: afterContextMenuShow, callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]): Methods = js.native
  @JSName("add")
  def add_afterContextMenuShow(
    key: afterContextMenuShow,
    callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterContextMenuShow(
    key: afterContextMenuShow,
    callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterContextMenuShow(
    key: afterContextMenuShow,
    callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterCopy(
    key: afterCopy,
    callback: js.UndefOr[
      js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterCopy(
    key: afterCopy,
    callback: js.UndefOr[
      js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterCopy(
    key: afterCopy,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterCopy(
    key: afterCopy,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterCopyLimit(
    key: afterCopyLimit,
    callback: js.UndefOr[
      js.Function4[
        /* selectedRows */ Double, 
        /* selectedColumnds */ Double, 
        /* copyRowsLimit */ Double, 
        /* copyColumnsLimit */ Double, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterCopyLimit(
    key: afterCopyLimit,
    callback: js.UndefOr[
      js.Function4[
        /* selectedRows */ Double, 
        /* selectedColumnds */ Double, 
        /* copyRowsLimit */ Double, 
        /* copyColumnsLimit */ Double, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterCopyLimit(
    key: afterCopyLimit,
    callback: js.Array[
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
  ): Methods = js.native
  @JSName("add")
  def add_afterCopyLimit(
    key: afterCopyLimit,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* selectedRows */ Double, 
          /* selectedColumnds */ Double, 
          /* copyRowsLimit */ Double, 
          /* copyColumnsLimit */ Double, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterCreateCol(
    key: afterCreateCol,
    callback: js.UndefOr[
      js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterCreateCol(
    key: afterCreateCol,
    callback: js.UndefOr[
      js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterCreateCol(
    key: afterCreateCol,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterCreateCol(
    key: afterCreateCol,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterCreateRow(
    key: afterCreateRow,
    callback: js.UndefOr[
      js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterCreateRow(
    key: afterCreateRow,
    callback: js.UndefOr[
      js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterCreateRow(
    key: afterCreateRow,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterCreateRow(
    key: afterCreateRow,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterCut(
    key: afterCut,
    callback: js.UndefOr[
      js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterCut(
    key: afterCut,
    callback: js.UndefOr[
      js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterCut(
    key: afterCut,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterCut(
    key: afterCut,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterDeselect(key: afterDeselect, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_afterDeselect(key: afterDeselect, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterDeselect(key: afterDeselect, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_afterDeselect(key: afterDeselect, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterDestroy(key: afterDestroy, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_afterDestroy(key: afterDestroy, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterDestroy(key: afterDestroy, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_afterDestroy(key: afterDestroy, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterDetachChild(
    key: afterDetachChild,
    callback: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_afterDetachChild(
    key: afterDetachChild,
    callback: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterDetachChild(
    key: afterDetachChild,
    callback: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterDetachChild(
    key: afterDetachChild,
    callback: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterDocumentKeyDown(key: afterDocumentKeyDown, callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]): Methods = js.native
  @JSName("add")
  def add_afterDocumentKeyDown(
    key: afterDocumentKeyDown,
    callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterDocumentKeyDown(
    key: afterDocumentKeyDown,
    callback: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterDocumentKeyDown(
    key: afterDocumentKeyDown,
    callback: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterDrawSelection(
    key: afterDrawSelection,
    callback: js.UndefOr[
      js.Function4[
        /* currentRow */ Double, 
        /* currentColumn */ Double, 
        /* cornersOfSelection */ js.Array[Double], 
        /* layerLevel */ Double | Unit, 
        String | Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterDrawSelection(
    key: afterDrawSelection,
    callback: js.UndefOr[
      js.Function4[
        /* currentRow */ Double, 
        /* currentColumn */ Double, 
        /* cornersOfSelection */ js.Array[Double], 
        /* layerLevel */ Double | Unit, 
        String | Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterDrawSelection(
    key: afterDrawSelection,
    callback: js.Array[
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
  ): Methods = js.native
  @JSName("add")
  def add_afterDrawSelection(
    key: afterDrawSelection,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* currentRow */ Double, 
          /* currentColumn */ Double, 
          /* cornersOfSelection */ js.Array[Double], 
          /* layerLevel */ Double | Unit, 
          String | Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterDropdownMenuDefaultOptions(
    key: afterDropdownMenuDefaultOptions,
    callback: js.UndefOr[
      js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterDropdownMenuDefaultOptions(
    key: afterDropdownMenuDefaultOptions,
    callback: js.UndefOr[
      js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterDropdownMenuDefaultOptions(
    key: afterDropdownMenuDefaultOptions,
    callback: js.Array[
      js.UndefOr[
        js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterDropdownMenuDefaultOptions(
    key: afterDropdownMenuDefaultOptions,
    callback: js.Array[
      js.UndefOr[
        js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterDropdownMenuHide(key: afterDropdownMenuHide, callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]): Methods = js.native
  @JSName("add")
  def add_afterDropdownMenuHide(
    key: afterDropdownMenuHide,
    callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterDropdownMenuHide(
    key: afterDropdownMenuHide,
    callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterDropdownMenuHide(
    key: afterDropdownMenuHide,
    callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterDropdownMenuShow(key: afterDropdownMenuShow, callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]): Methods = js.native
  @JSName("add")
  def add_afterDropdownMenuShow(
    key: afterDropdownMenuShow,
    callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterDropdownMenuShow(
    key: afterDropdownMenuShow,
    callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterDropdownMenuShow(
    key: afterDropdownMenuShow,
    callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterFilter(
    key: afterFilter,
    callback: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_afterFilter(
    key: afterFilter,
    callback: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterFilter(
    key: afterFilter,
    callback: js.Array[js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterFilter(
    key: afterFilter,
    callback: js.Array[js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterGetCellMeta(
    key: afterGetCellMeta,
    callback: js.UndefOr[
      js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterGetCellMeta(
    key: afterGetCellMeta,
    callback: js.UndefOr[
      js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterGetCellMeta(
    key: afterGetCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterGetCellMeta(
    key: afterGetCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterGetColHeader(
    key: afterGetColHeader,
    callback: js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_afterGetColHeader(
    key: afterGetColHeader,
    callback: js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterGetColHeader(
    key: afterGetColHeader,
    callback: js.Array[
      js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterGetColHeader(
    key: afterGetColHeader,
    callback: js.Array[
      js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterGetColumnHeaderRenderers(
    key: afterGetColumnHeaderRenderers,
    callback: js.UndefOr[
      js.Function1[
        /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterGetColumnHeaderRenderers(
    key: afterGetColumnHeaderRenderers,
    callback: js.UndefOr[
      js.Function1[
        /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterGetColumnHeaderRenderers(
    key: afterGetColumnHeaderRenderers,
    callback: js.Array[
      js.UndefOr[
        js.Function1[
          /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterGetColumnHeaderRenderers(
    key: afterGetColumnHeaderRenderers,
    callback: js.Array[
      js.UndefOr[
        js.Function1[
          /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterGetRowHeader(
    key: afterGetRowHeader,
    callback: js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_afterGetRowHeader(
    key: afterGetRowHeader,
    callback: js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterGetRowHeader(
    key: afterGetRowHeader,
    callback: js.Array[
      js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterGetRowHeader(
    key: afterGetRowHeader,
    callback: js.Array[
      js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterGetRowHeaderRenderers(
    key: afterGetRowHeaderRenderers,
    callback: js.UndefOr[
      js.Function1[
        /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterGetRowHeaderRenderers(
    key: afterGetRowHeaderRenderers,
    callback: js.UndefOr[
      js.Function1[
        /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterGetRowHeaderRenderers(
    key: afterGetRowHeaderRenderers,
    callback: js.Array[
      js.UndefOr[
        js.Function1[
          /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterGetRowHeaderRenderers(
    key: afterGetRowHeaderRenderers,
    callback: js.Array[
      js.UndefOr[
        js.Function1[
          /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterHideColumns(
    key: afterHideColumns,
    callback: js.UndefOr[
      js.Function4[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterHideColumns(
    key: afterHideColumns,
    callback: js.UndefOr[
      js.Function4[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterHideColumns(
    key: afterHideColumns,
    callback: js.Array[
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
  ): Methods = js.native
  @JSName("add")
  def add_afterHideColumns(
    key: afterHideColumns,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          /* stateChanged */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterHideRows(
    key: afterHideRows,
    callback: js.UndefOr[
      js.Function4[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterHideRows(
    key: afterHideRows,
    callback: js.UndefOr[
      js.Function4[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterHideRows(
    key: afterHideRows,
    callback: js.Array[
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
  ): Methods = js.native
  @JSName("add")
  def add_afterHideRows(
    key: afterHideRows,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          /* stateChanged */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterInit(key: afterInit, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_afterInit(key: afterInit, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterInit(key: afterInit, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_afterInit(key: afterInit, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterLanguageChange(key: afterLanguageChange, callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]]): Methods = js.native
  @JSName("add")
  def add_afterLanguageChange(
    key: afterLanguageChange,
    callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterLanguageChange(
    key: afterLanguageChange,
    callback: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterLanguageChange(
    key: afterLanguageChange,
    callback: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterListen(key: afterListen, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_afterListen(key: afterListen, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterListen(key: afterListen, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_afterListen(key: afterListen, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterLoadData(key: afterLoadData, callback: js.UndefOr[js.Function1[/* initialLoad */ Boolean, Unit]]): Methods = js.native
  @JSName("add")
  def add_afterLoadData(
    key: afterLoadData,
    callback: js.UndefOr[js.Function1[/* initialLoad */ Boolean, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterLoadData(key: afterLoadData, callback: js.Array[js.UndefOr[js.Function1[/* initialLoad */ Boolean, Unit]]]): Methods = js.native
  @JSName("add")
  def add_afterLoadData(
    key: afterLoadData,
    callback: js.Array[js.UndefOr[js.Function1[/* initialLoad */ Boolean, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterMergeCells(
    key: afterMergeCells,
    callback: js.UndefOr[
      js.Function3[/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterMergeCells(
    key: afterMergeCells,
    callback: js.UndefOr[
      js.Function3[/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterMergeCells(
    key: afterMergeCells,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterMergeCells(
    key: afterMergeCells,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterMomentumScroll(key: afterMomentumScroll, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_afterMomentumScroll(key: afterMomentumScroll, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterMomentumScroll(key: afterMomentumScroll, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_afterMomentumScroll(
    key: afterMomentumScroll,
    callback: js.Array[js.UndefOr[js.Function0[Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellContextMenu(
    key: afterOnCellContextMenu,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellContextMenu(
    key: afterOnCellContextMenu,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellContextMenu(
    key: afterOnCellContextMenu,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellContextMenu(
    key: afterOnCellContextMenu,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellCornerDblClick(key: afterOnCellCornerDblClick, callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]): Methods = js.native
  @JSName("add")
  def add_afterOnCellCornerDblClick(
    key: afterOnCellCornerDblClick,
    callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellCornerDblClick(
    key: afterOnCellCornerDblClick,
    callback: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellCornerDblClick(
    key: afterOnCellCornerDblClick,
    callback: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellCornerMouseDown(key: afterOnCellCornerMouseDown, callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]): Methods = js.native
  @JSName("add")
  def add_afterOnCellCornerMouseDown(
    key: afterOnCellCornerMouseDown,
    callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellCornerMouseDown(
    key: afterOnCellCornerMouseDown,
    callback: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellCornerMouseDown(
    key: afterOnCellCornerMouseDown,
    callback: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseDown(
    key: afterOnCellMouseDown,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseDown(
    key: afterOnCellMouseDown,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseDown(
    key: afterOnCellMouseDown,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseDown(
    key: afterOnCellMouseDown,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseOut(
    key: afterOnCellMouseOut,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseOut(
    key: afterOnCellMouseOut,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseOut(
    key: afterOnCellMouseOut,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseOut(
    key: afterOnCellMouseOut,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseOver(
    key: afterOnCellMouseOver,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseOver(
    key: afterOnCellMouseOver,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseOver(
    key: afterOnCellMouseOver,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseOver(
    key: afterOnCellMouseOver,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseUp(
    key: afterOnCellMouseUp,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseUp(
    key: afterOnCellMouseUp,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseUp(
    key: afterOnCellMouseUp,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseUp(
    key: afterOnCellMouseUp,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterPaste(
    key: afterPaste,
    callback: js.UndefOr[
      js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterPaste(
    key: afterPaste,
    callback: js.UndefOr[
      js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterPaste(
    key: afterPaste,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterPaste(
    key: afterPaste,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterPluginsInitialized(key: afterPluginsInitialized, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_afterPluginsInitialized(key: afterPluginsInitialized, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterPluginsInitialized(key: afterPluginsInitialized, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_afterPluginsInitialized(
    key: afterPluginsInitialized,
    callback: js.Array[js.UndefOr[js.Function0[Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRedo(key: afterRedo, callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]): Methods = js.native
  @JSName("add")
  def add_afterRedo(
    key: afterRedo,
    callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRedo(key: afterRedo, callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]): Methods = js.native
  @JSName("add")
  def add_afterRedo(
    key: afterRedo,
    callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRefreshDimensions(
    key: afterRefreshDimensions,
    callback: js.UndefOr[
      js.Function3[
        /* previousDimensions */ js.Object, 
        /* currentDimensions */ js.Object, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterRefreshDimensions(
    key: afterRefreshDimensions,
    callback: js.UndefOr[
      js.Function3[
        /* previousDimensions */ js.Object, 
        /* currentDimensions */ js.Object, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRefreshDimensions(
    key: afterRefreshDimensions,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* previousDimensions */ js.Object, 
          /* currentDimensions */ js.Object, 
          /* stateChanged */ Boolean, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterRefreshDimensions(
    key: afterRefreshDimensions,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* previousDimensions */ js.Object, 
          /* currentDimensions */ js.Object, 
          /* stateChanged */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRemoveCellMeta(
    key: afterRemoveCellMeta,
    callback: js.UndefOr[
      js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterRemoveCellMeta(
    key: afterRemoveCellMeta,
    callback: js.UndefOr[
      js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRemoveCellMeta(
    key: afterRemoveCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterRemoveCellMeta(
    key: afterRemoveCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRemoveCol(
    key: afterRemoveCol,
    callback: js.UndefOr[
      js.Function4[
        /* index */ Double, 
        /* amount */ Double, 
        /* physicalColumns */ js.Array[Double], 
        /* source */ js.UndefOr[ChangeSource], 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterRemoveCol(
    key: afterRemoveCol,
    callback: js.UndefOr[
      js.Function4[
        /* index */ Double, 
        /* amount */ Double, 
        /* physicalColumns */ js.Array[Double], 
        /* source */ js.UndefOr[ChangeSource], 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRemoveCol(
    key: afterRemoveCol,
    callback: js.Array[
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
  ): Methods = js.native
  @JSName("add")
  def add_afterRemoveCol(
    key: afterRemoveCol,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* index */ Double, 
          /* amount */ Double, 
          /* physicalColumns */ js.Array[Double], 
          /* source */ js.UndefOr[ChangeSource], 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRemoveRow(
    key: afterRemoveRow,
    callback: js.UndefOr[
      js.Function4[
        /* index */ Double, 
        /* amount */ Double, 
        /* physicalColumns */ js.Array[Double], 
        /* source */ js.UndefOr[ChangeSource], 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterRemoveRow(
    key: afterRemoveRow,
    callback: js.UndefOr[
      js.Function4[
        /* index */ Double, 
        /* amount */ Double, 
        /* physicalColumns */ js.Array[Double], 
        /* source */ js.UndefOr[ChangeSource], 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRemoveRow(
    key: afterRemoveRow,
    callback: js.Array[
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
  ): Methods = js.native
  @JSName("add")
  def add_afterRemoveRow(
    key: afterRemoveRow,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* index */ Double, 
          /* amount */ Double, 
          /* physicalColumns */ js.Array[Double], 
          /* source */ js.UndefOr[ChangeSource], 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRender(key: afterRender, callback: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]): Methods = js.native
  @JSName("add")
  def add_afterRender(
    key: afterRender,
    callback: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRender(key: afterRender, callback: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]): Methods = js.native
  @JSName("add")
  def add_afterRender(
    key: afterRender,
    callback: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRenderer(
    key: afterRenderer,
    callback: js.UndefOr[
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
  ): Methods = js.native
  @JSName("add")
  def add_afterRenderer(
    key: afterRenderer,
    callback: js.UndefOr[
      js.Function6[
        /* TD */ HTMLTableCellElement, 
        /* row */ Double, 
        /* col */ Double, 
        /* prop */ String | Double, 
        /* value */ String, 
        /* cellProperties */ CellProperties, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRenderer(
    key: afterRenderer,
    callback: js.Array[
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
  ): Methods = js.native
  @JSName("add")
  def add_afterRenderer(
    key: afterRenderer,
    callback: js.Array[
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
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRowMove(
    key: afterRowMove,
    callback: js.UndefOr[js.Function2[/* startRow */ Double, /* endRow */ Double, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_afterRowMove(
    key: afterRowMove,
    callback: js.UndefOr[js.Function2[/* startRow */ Double, /* endRow */ Double, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRowMove(
    key: afterRowMove,
    callback: js.Array[js.UndefOr[js.Function2[/* startRow */ Double, /* endRow */ Double, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterRowMove(
    key: afterRowMove,
    callback: js.Array[js.UndefOr[js.Function2[/* startRow */ Double, /* endRow */ Double, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRowResize(
    key: afterRowResize,
    callback: js.UndefOr[
      js.Function3[/* currentRow */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterRowResize(
    key: afterRowResize,
    callback: js.UndefOr[
      js.Function3[/* currentRow */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRowResize(
    key: afterRowResize,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* currentRow */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterRowResize(
    key: afterRowResize,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* currentRow */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterScrollHorizontally(key: afterScrollHorizontally, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_afterScrollHorizontally(key: afterScrollHorizontally, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterScrollHorizontally(key: afterScrollHorizontally, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_afterScrollHorizontally(
    key: afterScrollHorizontally,
    callback: js.Array[js.UndefOr[js.Function0[Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterScrollVertically(key: afterScrollVertically, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_afterScrollVertically(key: afterScrollVertically, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterScrollVertically(key: afterScrollVertically, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_afterScrollVertically(
    key: afterScrollVertically,
    callback: js.Array[js.UndefOr[js.Function0[Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterSelection(
    key: afterSelection,
    callback: js.UndefOr[
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
  ): Methods = js.native
  @JSName("add")
  def add_afterSelection(
    key: afterSelection,
    callback: js.UndefOr[
      js.Function6[
        /* row */ Double, 
        /* column */ Double, 
        /* row2 */ Double, 
        /* column2 */ Double, 
        /* preventScrolling */ Value, 
        /* selectionLayerLevel */ Double, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterSelection(
    key: afterSelection,
    callback: js.Array[
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
  ): Methods = js.native
  @JSName("add")
  def add_afterSelection(
    key: afterSelection,
    callback: js.Array[
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
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterSelectionByProp(
    key: afterSelectionByProp,
    callback: js.UndefOr[
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
  ): Methods = js.native
  @JSName("add")
  def add_afterSelectionByProp(
    key: afterSelectionByProp,
    callback: js.UndefOr[
      js.Function6[
        /* row */ Double, 
        /* prop */ String, 
        /* row2 */ Double, 
        /* prop2 */ String, 
        /* preventScrolling */ Value, 
        /* selectionLayerLevel */ Double, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterSelectionByProp(
    key: afterSelectionByProp,
    callback: js.Array[
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
  ): Methods = js.native
  @JSName("add")
  def add_afterSelectionByProp(
    key: afterSelectionByProp,
    callback: js.Array[
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
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterSelectionEnd(
    key: afterSelectionEnd,
    callback: js.UndefOr[
      js.Function5[
        /* row */ Double, 
        /* column */ Double, 
        /* row2 */ Double, 
        /* column2 */ Double, 
        /* selectionLayerLevel */ Double, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterSelectionEnd(
    key: afterSelectionEnd,
    callback: js.UndefOr[
      js.Function5[
        /* row */ Double, 
        /* column */ Double, 
        /* row2 */ Double, 
        /* column2 */ Double, 
        /* selectionLayerLevel */ Double, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterSelectionEnd(
    key: afterSelectionEnd,
    callback: js.Array[
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
  ): Methods = js.native
  @JSName("add")
  def add_afterSelectionEnd(
    key: afterSelectionEnd,
    callback: js.Array[
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
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterSelectionEndByProp(
    key: afterSelectionEndByProp,
    callback: js.UndefOr[
      js.Function5[
        /* row */ Double, 
        /* prop */ String, 
        /* row2 */ Double, 
        /* prop2 */ String, 
        /* selectionLayerLevel */ Double, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterSelectionEndByProp(
    key: afterSelectionEndByProp,
    callback: js.UndefOr[
      js.Function5[
        /* row */ Double, 
        /* prop */ String, 
        /* row2 */ Double, 
        /* prop2 */ String, 
        /* selectionLayerLevel */ Double, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterSelectionEndByProp(
    key: afterSelectionEndByProp,
    callback: js.Array[
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
  ): Methods = js.native
  @JSName("add")
  def add_afterSelectionEndByProp(
    key: afterSelectionEndByProp,
    callback: js.Array[
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
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterSetCellMeta(
    key: afterSetCellMeta,
    callback: js.UndefOr[
      js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ js.Any, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterSetCellMeta(
    key: afterSetCellMeta,
    callback: js.UndefOr[
      js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ js.Any, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterSetCellMeta(
    key: afterSetCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterSetCellMeta(
    key: afterSetCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterSetDataAtCell(
    key: afterSetDataAtCell,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterSetDataAtCell(
    key: afterSetDataAtCell,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterSetDataAtCell(
    key: afterSetDataAtCell,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterSetDataAtCell(
    key: afterSetDataAtCell,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterSetDataAtRowProp(
    key: afterSetDataAtRowProp,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterSetDataAtRowProp(
    key: afterSetDataAtRowProp,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterSetDataAtRowProp(
    key: afterSetDataAtRowProp,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterSetDataAtRowProp(
    key: afterSetDataAtRowProp,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterTrimRow(
    key: afterTrimRow,
    callback: js.UndefOr[
      js.Function4[
        /* currentTrimConfig */ js.Array[Double], 
        /* destinationTrimConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterTrimRow(
    key: afterTrimRow,
    callback: js.UndefOr[
      js.Function4[
        /* currentTrimConfig */ js.Array[Double], 
        /* destinationTrimConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterTrimRow(
    key: afterTrimRow,
    callback: js.Array[
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
  ): Methods = js.native
  @JSName("add")
  def add_afterTrimRow(
    key: afterTrimRow,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* currentTrimConfig */ js.Array[Double], 
          /* destinationTrimConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          /* stateChanged */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterUndo(key: afterUndo, callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]): Methods = js.native
  @JSName("add")
  def add_afterUndo(
    key: afterUndo,
    callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterUndo(key: afterUndo, callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]): Methods = js.native
  @JSName("add")
  def add_afterUndo(
    key: afterUndo,
    callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterUnhideColumns(
    key: afterUnhideColumns,
    callback: js.UndefOr[
      js.Function4[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterUnhideColumns(
    key: afterUnhideColumns,
    callback: js.UndefOr[
      js.Function4[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterUnhideColumns(
    key: afterUnhideColumns,
    callback: js.Array[
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
  ): Methods = js.native
  @JSName("add")
  def add_afterUnhideColumns(
    key: afterUnhideColumns,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          /* stateChanged */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterUnhideRows(
    key: afterUnhideRows,
    callback: js.UndefOr[
      js.Function4[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterUnhideRows(
    key: afterUnhideRows,
    callback: js.UndefOr[
      js.Function4[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterUnhideRows(
    key: afterUnhideRows,
    callback: js.Array[
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
  ): Methods = js.native
  @JSName("add")
  def add_afterUnhideRows(
    key: afterUnhideRows,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          /* stateChanged */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterUnlisten(key: afterUnlisten, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_afterUnlisten(key: afterUnlisten, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterUnlisten(key: afterUnlisten, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_afterUnlisten(key: afterUnlisten, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterUnmergeCells(
    key: afterUnmergeCells,
    callback: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_afterUnmergeCells(
    key: afterUnmergeCells,
    callback: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterUnmergeCells(
    key: afterUnmergeCells,
    callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterUnmergeCells(
    key: afterUnmergeCells,
    callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterUntrimRow(
    key: afterUntrimRow,
    callback: js.UndefOr[
      js.Function4[
        /* currentTrimConfig */ js.Array[Double], 
        /* destinationTrimConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterUntrimRow(
    key: afterUntrimRow,
    callback: js.UndefOr[
      js.Function4[
        /* currentTrimConfig */ js.Array[Double], 
        /* destinationTrimConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterUntrimRow(
    key: afterUntrimRow,
    callback: js.Array[
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
  ): Methods = js.native
  @JSName("add")
  def add_afterUntrimRow(
    key: afterUntrimRow,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* currentTrimConfig */ js.Array[Double], 
          /* destinationTrimConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          /* stateChanged */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterUpdateSettings(key: afterUpdateSettings, callback: js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]): Methods = js.native
  @JSName("add")
  def add_afterUpdateSettings(
    key: afterUpdateSettings,
    callback: js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterUpdateSettings(
    key: afterUpdateSettings,
    callback: js.Array[js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterUpdateSettings(
    key: afterUpdateSettings,
    callback: js.Array[js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterValidate(
    key: afterValidate,
    callback: js.UndefOr[
      js.Function5[
        /* isValid */ Boolean, 
        /* value */ CellValue, 
        /* row */ Double, 
        /* prop */ String | Double, 
        /* source */ ChangeSource, 
        Unit | Boolean
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterValidate(
    key: afterValidate,
    callback: js.UndefOr[
      js.Function5[
        /* isValid */ Boolean, 
        /* value */ CellValue, 
        /* row */ Double, 
        /* prop */ String | Double, 
        /* source */ ChangeSource, 
        Unit | Boolean
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterValidate(
    key: afterValidate,
    callback: js.Array[
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
  ): Methods = js.native
  @JSName("add")
  def add_afterValidate(
    key: afterValidate,
    callback: js.Array[
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
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterViewportColumnCalculatorOverride(
    key: afterViewportColumnCalculatorOverride,
    callback: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_afterViewportColumnCalculatorOverride(
    key: afterViewportColumnCalculatorOverride,
    callback: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterViewportColumnCalculatorOverride(
    key: afterViewportColumnCalculatorOverride,
    callback: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterViewportColumnCalculatorOverride(
    key: afterViewportColumnCalculatorOverride,
    callback: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterViewportRowCalculatorOverride(
    key: afterViewportRowCalculatorOverride,
    callback: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_afterViewportRowCalculatorOverride(
    key: afterViewportRowCalculatorOverride,
    callback: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterViewportRowCalculatorOverride(
    key: afterViewportRowCalculatorOverride,
    callback: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterViewportRowCalculatorOverride(
    key: afterViewportRowCalculatorOverride,
    callback: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeAddChild(
    key: beforeAddChild,
    callback: js.UndefOr[
      js.Function3[
        /* parent */ RowObject, 
        /* element */ RowObject | Unit, 
        /* index */ Double | Unit, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeAddChild(
    key: beforeAddChild,
    callback: js.UndefOr[
      js.Function3[
        /* parent */ RowObject, 
        /* element */ RowObject | Unit, 
        /* index */ Double | Unit, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeAddChild(
    key: beforeAddChild,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* parent */ RowObject, 
          /* element */ RowObject | Unit, 
          /* index */ Double | Unit, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeAddChild(
    key: beforeAddChild,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* parent */ RowObject, 
          /* element */ RowObject | Unit, 
          /* index */ Double | Unit, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeAutofill(
    key: beforeAutofill,
    callback: js.UndefOr[
      js.Function3[
        /* start */ CellCoords, 
        /* end */ CellCoords, 
        /* data */ js.Array[js.Array[CellValue]], 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeAutofill(
    key: beforeAutofill,
    callback: js.UndefOr[
      js.Function3[
        /* start */ CellCoords, 
        /* end */ CellCoords, 
        /* data */ js.Array[js.Array[CellValue]], 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeAutofill(
    key: beforeAutofill,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* start */ CellCoords, 
          /* end */ CellCoords, 
          /* data */ js.Array[js.Array[CellValue]], 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeAutofill(
    key: beforeAutofill,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* start */ CellCoords, 
          /* end */ CellCoords, 
          /* data */ js.Array[js.Array[CellValue]], 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeChange(
    key: beforeChange,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeChange(
    key: beforeChange,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeChange(
    key: beforeChange,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeChange(
    key: beforeChange,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeChangeRender(
    key: beforeChangeRender,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeChangeRender(
    key: beforeChangeRender,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeChangeRender(
    key: beforeChangeRender,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeChangeRender(
    key: beforeChangeRender,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeColumnMove(
    key: beforeColumnMove,
    callback: js.UndefOr[
      js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit | Boolean]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeColumnMove(
    key: beforeColumnMove,
    callback: js.UndefOr[
      js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit | Boolean]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeColumnMove(
    key: beforeColumnMove,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit | Boolean]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeColumnMove(
    key: beforeColumnMove,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit | Boolean]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeColumnResize(
    key: beforeColumnResize,
    callback: js.UndefOr[
      js.Function3[
        /* currentColumn */ Double, 
        /* newSize */ Double, 
        /* isDoubleClick */ Boolean, 
        Unit | Double
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeColumnResize(
    key: beforeColumnResize,
    callback: js.UndefOr[
      js.Function3[
        /* currentColumn */ Double, 
        /* newSize */ Double, 
        /* isDoubleClick */ Boolean, 
        Unit | Double
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeColumnResize(
    key: beforeColumnResize,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentColumn */ Double, 
          /* newSize */ Double, 
          /* isDoubleClick */ Boolean, 
          Unit | Double
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeColumnResize(
    key: beforeColumnResize,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentColumn */ Double, 
          /* newSize */ Double, 
          /* isDoubleClick */ Boolean, 
          Unit | Double
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeColumnSort(
    key: beforeColumnSort,
    callback: js.UndefOr[
      js.Function2[
        /* currentSortConfig */ js.Array[Config], 
        /* destinationSortConfigs */ js.Array[Config], 
        Unit | Boolean
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeColumnSort(
    key: beforeColumnSort,
    callback: js.UndefOr[
      js.Function2[
        /* currentSortConfig */ js.Array[Config], 
        /* destinationSortConfigs */ js.Array[Config], 
        Unit | Boolean
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeColumnSort(
    key: beforeColumnSort,
    callback: js.Array[
      js.UndefOr[
        js.Function2[
          /* currentSortConfig */ js.Array[Config], 
          /* destinationSortConfigs */ js.Array[Config], 
          Unit | Boolean
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeColumnSort(
    key: beforeColumnSort,
    callback: js.Array[
      js.UndefOr[
        js.Function2[
          /* currentSortConfig */ js.Array[Config], 
          /* destinationSortConfigs */ js.Array[Config], 
          Unit | Boolean
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeContextMenuSetItems(
    key: beforeContextMenuSetItems,
    callback: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeContextMenuSetItems(
    key: beforeContextMenuSetItems,
    callback: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeContextMenuSetItems(
    key: beforeContextMenuSetItems,
    callback: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeContextMenuSetItems(
    key: beforeContextMenuSetItems,
    callback: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeContextMenuShow(key: beforeContextMenuShow, callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]): Methods = js.native
  @JSName("add")
  def add_beforeContextMenuShow(
    key: beforeContextMenuShow,
    callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeContextMenuShow(
    key: beforeContextMenuShow,
    callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeContextMenuShow(
    key: beforeContextMenuShow,
    callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeCopy(
    key: beforeCopy,
    callback: js.UndefOr[
      js.Function2[
        /* data */ js.Array[js.Array[CellValue]], 
        /* coords */ js.Array[RangeType], 
        Unit | Boolean
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeCopy(
    key: beforeCopy,
    callback: js.UndefOr[
      js.Function2[
        /* data */ js.Array[js.Array[CellValue]], 
        /* coords */ js.Array[RangeType], 
        Unit | Boolean
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeCopy(
    key: beforeCopy,
    callback: js.Array[
      js.UndefOr[
        js.Function2[
          /* data */ js.Array[js.Array[CellValue]], 
          /* coords */ js.Array[RangeType], 
          Unit | Boolean
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeCopy(
    key: beforeCopy,
    callback: js.Array[
      js.UndefOr[
        js.Function2[
          /* data */ js.Array[js.Array[CellValue]], 
          /* coords */ js.Array[RangeType], 
          Unit | Boolean
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeCreateCol(
    key: beforeCreateCol,
    callback: js.UndefOr[
      js.Function3[
        /* index */ Double, 
        /* amount */ Double, 
        /* source */ js.UndefOr[ChangeSource], 
        Unit | Boolean
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeCreateCol(
    key: beforeCreateCol,
    callback: js.UndefOr[
      js.Function3[
        /* index */ Double, 
        /* amount */ Double, 
        /* source */ js.UndefOr[ChangeSource], 
        Unit | Boolean
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeCreateCol(
    key: beforeCreateCol,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* index */ Double, 
          /* amount */ Double, 
          /* source */ js.UndefOr[ChangeSource], 
          Unit | Boolean
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeCreateCol(
    key: beforeCreateCol,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* index */ Double, 
          /* amount */ Double, 
          /* source */ js.UndefOr[ChangeSource], 
          Unit | Boolean
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeCreateRow(
    key: beforeCreateRow,
    callback: js.UndefOr[
      js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeCreateRow(
    key: beforeCreateRow,
    callback: js.UndefOr[
      js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeCreateRow(
    key: beforeCreateRow,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeCreateRow(
    key: beforeCreateRow,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeCut(
    key: beforeCut,
    callback: js.UndefOr[
      js.Function2[
        /* data */ js.Array[js.Array[CellValue]], 
        /* coords */ js.Array[RangeType], 
        Unit | Boolean
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeCut(
    key: beforeCut,
    callback: js.UndefOr[
      js.Function2[
        /* data */ js.Array[js.Array[CellValue]], 
        /* coords */ js.Array[RangeType], 
        Unit | Boolean
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeCut(
    key: beforeCut,
    callback: js.Array[
      js.UndefOr[
        js.Function2[
          /* data */ js.Array[js.Array[CellValue]], 
          /* coords */ js.Array[RangeType], 
          Unit | Boolean
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeCut(
    key: beforeCut,
    callback: js.Array[
      js.UndefOr[
        js.Function2[
          /* data */ js.Array[js.Array[CellValue]], 
          /* coords */ js.Array[RangeType], 
          Unit | Boolean
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeDetachChild(
    key: beforeDetachChild,
    callback: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeDetachChild(
    key: beforeDetachChild,
    callback: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeDetachChild(
    key: beforeDetachChild,
    callback: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeDetachChild(
    key: beforeDetachChild,
    callback: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeDropdownMenuSetItems(
    key: beforeDropdownMenuSetItems,
    callback: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeDropdownMenuSetItems(
    key: beforeDropdownMenuSetItems,
    callback: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeDropdownMenuSetItems(
    key: beforeDropdownMenuSetItems,
    callback: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeDropdownMenuSetItems(
    key: beforeDropdownMenuSetItems,
    callback: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeDropdownMenuShow(key: beforeDropdownMenuShow, callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]): Methods = js.native
  @JSName("add")
  def add_beforeDropdownMenuShow(
    key: beforeDropdownMenuShow,
    callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeDropdownMenuShow(
    key: beforeDropdownMenuShow,
    callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeDropdownMenuShow(
    key: beforeDropdownMenuShow,
    callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeFilter(
    key: beforeFilter,
    callback: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeFilter(
    key: beforeFilter,
    callback: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeFilter(
    key: beforeFilter,
    callback: js.Array[
      js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeFilter(
    key: beforeFilter,
    callback: js.Array[
      js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeGetCellMeta(
    key: beforeGetCellMeta,
    callback: js.UndefOr[
      js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeGetCellMeta(
    key: beforeGetCellMeta,
    callback: js.UndefOr[
      js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeGetCellMeta(
    key: beforeGetCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeGetCellMeta(
    key: beforeGetCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeHideColumns(
    key: beforeHideColumns,
    callback: js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeHideColumns(
    key: beforeHideColumns,
    callback: js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeHideColumns(
    key: beforeHideColumns,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeHideColumns(
    key: beforeHideColumns,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeHideRows(
    key: beforeHideRows,
    callback: js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeHideRows(
    key: beforeHideRows,
    callback: js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeHideRows(
    key: beforeHideRows,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeHideRows(
    key: beforeHideRows,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeInit(key: beforeInit, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_beforeInit(key: beforeInit, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_beforeInit(key: beforeInit, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_beforeInit(key: beforeInit, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_beforeInitWalkontable(
    key: beforeInitWalkontable,
    callback: js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeInitWalkontable(
    key: beforeInitWalkontable,
    callback: js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeInitWalkontable(
    key: beforeInitWalkontable,
    callback: js.Array[js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeInitWalkontable(
    key: beforeInitWalkontable,
    callback: js.Array[js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeKeyDown(key: beforeKeyDown, callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]): Methods = js.native
  @JSName("add")
  def add_beforeKeyDown(
    key: beforeKeyDown,
    callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeKeyDown(key: beforeKeyDown, callback: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]): Methods = js.native
  @JSName("add")
  def add_beforeKeyDown(
    key: beforeKeyDown,
    callback: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeLanguageChange(key: beforeLanguageChange, callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]]): Methods = js.native
  @JSName("add")
  def add_beforeLanguageChange(
    key: beforeLanguageChange,
    callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeLanguageChange(
    key: beforeLanguageChange,
    callback: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeLanguageChange(
    key: beforeLanguageChange,
    callback: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeMergeCells(
    key: beforeMergeCells,
    callback: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeMergeCells(
    key: beforeMergeCells,
    callback: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeMergeCells(
    key: beforeMergeCells,
    callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeMergeCells(
    key: beforeMergeCells,
    callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellContextMenu(
    key: beforeOnCellContextMenu,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellContextMenu(
    key: beforeOnCellContextMenu,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellContextMenu(
    key: beforeOnCellContextMenu,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellContextMenu(
    key: beforeOnCellContextMenu,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseDown(
    key: beforeOnCellMouseDown,
    callback: js.UndefOr[
      js.Function4[
        /* event */ MouseEvent, 
        /* coords */ CellCoords, 
        /* TD */ HTMLTableCellElement, 
        /* controller */ SelectionController, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseDown(
    key: beforeOnCellMouseDown,
    callback: js.UndefOr[
      js.Function4[
        /* event */ MouseEvent, 
        /* coords */ CellCoords, 
        /* TD */ HTMLTableCellElement, 
        /* controller */ SelectionController, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseDown(
    key: beforeOnCellMouseDown,
    callback: js.Array[
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
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseDown(
    key: beforeOnCellMouseDown,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* event */ MouseEvent, 
          /* coords */ CellCoords, 
          /* TD */ HTMLTableCellElement, 
          /* controller */ SelectionController, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseOut(
    key: beforeOnCellMouseOut,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseOut(
    key: beforeOnCellMouseOut,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseOut(
    key: beforeOnCellMouseOut,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseOut(
    key: beforeOnCellMouseOut,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseOver(
    key: beforeOnCellMouseOver,
    callback: js.UndefOr[
      js.Function4[
        /* event */ MouseEvent, 
        /* coords */ CellCoords, 
        /* TD */ HTMLTableCellElement, 
        /* controller */ SelectionController, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseOver(
    key: beforeOnCellMouseOver,
    callback: js.UndefOr[
      js.Function4[
        /* event */ MouseEvent, 
        /* coords */ CellCoords, 
        /* TD */ HTMLTableCellElement, 
        /* controller */ SelectionController, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseOver(
    key: beforeOnCellMouseOver,
    callback: js.Array[
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
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseOver(
    key: beforeOnCellMouseOver,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* event */ MouseEvent, 
          /* coords */ CellCoords, 
          /* TD */ HTMLTableCellElement, 
          /* controller */ SelectionController, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseUp(
    key: beforeOnCellMouseUp,
    callback: js.UndefOr[
      js.Function4[
        /* event */ MouseEvent, 
        /* coords */ CellCoords, 
        /* TD */ HTMLTableCellElement, 
        /* controller */ SelectionController, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseUp(
    key: beforeOnCellMouseUp,
    callback: js.UndefOr[
      js.Function4[
        /* event */ MouseEvent, 
        /* coords */ CellCoords, 
        /* TD */ HTMLTableCellElement, 
        /* controller */ SelectionController, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseUp(
    key: beforeOnCellMouseUp,
    callback: js.Array[
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
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseUp(
    key: beforeOnCellMouseUp,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* event */ MouseEvent, 
          /* coords */ CellCoords, 
          /* TD */ HTMLTableCellElement, 
          /* controller */ SelectionController, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforePaste(
    key: beforePaste,
    callback: js.UndefOr[
      js.Function2[
        /* data */ js.Array[js.Array[CellValue]], 
        /* coords */ js.Array[RangeType], 
        Unit | Boolean
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforePaste(
    key: beforePaste,
    callback: js.UndefOr[
      js.Function2[
        /* data */ js.Array[js.Array[CellValue]], 
        /* coords */ js.Array[RangeType], 
        Unit | Boolean
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforePaste(
    key: beforePaste,
    callback: js.Array[
      js.UndefOr[
        js.Function2[
          /* data */ js.Array[js.Array[CellValue]], 
          /* coords */ js.Array[RangeType], 
          Unit | Boolean
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforePaste(
    key: beforePaste,
    callback: js.Array[
      js.UndefOr[
        js.Function2[
          /* data */ js.Array[js.Array[CellValue]], 
          /* coords */ js.Array[RangeType], 
          Unit | Boolean
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRedo(key: beforeRedo, callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]): Methods = js.native
  @JSName("add")
  def add_beforeRedo(
    key: beforeRedo,
    callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRedo(key: beforeRedo, callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]): Methods = js.native
  @JSName("add")
  def add_beforeRedo(
    key: beforeRedo,
    callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRefreshDimensions(
    key: beforeRefreshDimensions,
    callback: js.UndefOr[
      js.Function3[
        /* previousDimensions */ js.Object, 
        /* currentDimensions */ js.Object, 
        /* actionPossible */ Boolean, 
        Boolean | Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeRefreshDimensions(
    key: beforeRefreshDimensions,
    callback: js.UndefOr[
      js.Function3[
        /* previousDimensions */ js.Object, 
        /* currentDimensions */ js.Object, 
        /* actionPossible */ Boolean, 
        Boolean | Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRefreshDimensions(
    key: beforeRefreshDimensions,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* previousDimensions */ js.Object, 
          /* currentDimensions */ js.Object, 
          /* actionPossible */ Boolean, 
          Boolean | Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeRefreshDimensions(
    key: beforeRefreshDimensions,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* previousDimensions */ js.Object, 
          /* currentDimensions */ js.Object, 
          /* actionPossible */ Boolean, 
          Boolean | Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRemoveCellClassNames(key: beforeRemoveCellClassNames, callback: js.UndefOr[js.Function0[js.Array[String] | Unit]]): Methods = js.native
  @JSName("add")
  def add_beforeRemoveCellClassNames(
    key: beforeRemoveCellClassNames,
    callback: js.UndefOr[js.Function0[js.Array[String] | Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRemoveCellClassNames(
    key: beforeRemoveCellClassNames,
    callback: js.Array[js.UndefOr[js.Function0[js.Array[String] | Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeRemoveCellClassNames(
    key: beforeRemoveCellClassNames,
    callback: js.Array[js.UndefOr[js.Function0[js.Array[String] | Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRemoveCellMeta(
    key: beforeRemoveCellMeta,
    callback: js.UndefOr[
      js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeRemoveCellMeta(
    key: beforeRemoveCellMeta,
    callback: js.UndefOr[
      js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRemoveCellMeta(
    key: beforeRemoveCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeRemoveCellMeta(
    key: beforeRemoveCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRemoveCol(
    key: beforeRemoveCol,
    callback: js.UndefOr[
      js.Function4[
        /* index */ Double, 
        /* amount */ Double, 
        /* physicalColumns */ js.Array[Double], 
        /* source */ js.UndefOr[ChangeSource], 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeRemoveCol(
    key: beforeRemoveCol,
    callback: js.UndefOr[
      js.Function4[
        /* index */ Double, 
        /* amount */ Double, 
        /* physicalColumns */ js.Array[Double], 
        /* source */ js.UndefOr[ChangeSource], 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRemoveCol(
    key: beforeRemoveCol,
    callback: js.Array[
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
  ): Methods = js.native
  @JSName("add")
  def add_beforeRemoveCol(
    key: beforeRemoveCol,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* index */ Double, 
          /* amount */ Double, 
          /* physicalColumns */ js.Array[Double], 
          /* source */ js.UndefOr[ChangeSource], 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRemoveRow(
    key: beforeRemoveRow,
    callback: js.UndefOr[
      js.Function4[
        /* index */ Double, 
        /* amount */ Double, 
        /* physicalColumns */ js.Array[Double], 
        /* source */ js.UndefOr[ChangeSource], 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeRemoveRow(
    key: beforeRemoveRow,
    callback: js.UndefOr[
      js.Function4[
        /* index */ Double, 
        /* amount */ Double, 
        /* physicalColumns */ js.Array[Double], 
        /* source */ js.UndefOr[ChangeSource], 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRemoveRow(
    key: beforeRemoveRow,
    callback: js.Array[
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
  ): Methods = js.native
  @JSName("add")
  def add_beforeRemoveRow(
    key: beforeRemoveRow,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* index */ Double, 
          /* amount */ Double, 
          /* physicalColumns */ js.Array[Double], 
          /* source */ js.UndefOr[ChangeSource], 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRender(
    key: beforeRender,
    callback: js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeRender(
    key: beforeRender,
    callback: js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRender(
    key: beforeRender,
    callback: js.Array[
      js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeRender(
    key: beforeRender,
    callback: js.Array[
      js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRenderer(
    key: beforeRenderer,
    callback: js.UndefOr[
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
  ): Methods = js.native
  @JSName("add")
  def add_beforeRenderer(
    key: beforeRenderer,
    callback: js.UndefOr[
      js.Function6[
        /* TD */ HTMLTableCellElement, 
        /* row */ Double, 
        /* col */ Double, 
        /* prop */ String | Double, 
        /* value */ CellValue, 
        /* cellProperties */ CellProperties, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRenderer(
    key: beforeRenderer,
    callback: js.Array[
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
  ): Methods = js.native
  @JSName("add")
  def add_beforeRenderer(
    key: beforeRenderer,
    callback: js.Array[
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
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRowMove(
    key: beforeRowMove,
    callback: js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeRowMove(
    key: beforeRowMove,
    callback: js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRowMove(
    key: beforeRowMove,
    callback: js.Array[
      js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeRowMove(
    key: beforeRowMove,
    callback: js.Array[
      js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRowResize(
    key: beforeRowResize,
    callback: js.UndefOr[
      js.Function3[
        /* currentRow */ Double, 
        /* newSize */ Double, 
        /* isDoubleClick */ Boolean, 
        Double | Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeRowResize(
    key: beforeRowResize,
    callback: js.UndefOr[
      js.Function3[
        /* currentRow */ Double, 
        /* newSize */ Double, 
        /* isDoubleClick */ Boolean, 
        Double | Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRowResize(
    key: beforeRowResize,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentRow */ Double, 
          /* newSize */ Double, 
          /* isDoubleClick */ Boolean, 
          Double | Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeRowResize(
    key: beforeRowResize,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentRow */ Double, 
          /* newSize */ Double, 
          /* isDoubleClick */ Boolean, 
          Double | Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeSetRangeEnd(key: beforeSetRangeEnd, callback: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]): Methods = js.native
  @JSName("add")
  def add_beforeSetRangeEnd(
    key: beforeSetRangeEnd,
    callback: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeSetRangeEnd(
    key: beforeSetRangeEnd,
    callback: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeSetRangeEnd(
    key: beforeSetRangeEnd,
    callback: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeSetRangeStart(key: beforeSetRangeStart, callback: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]): Methods = js.native
  @JSName("add")
  def add_beforeSetRangeStart(
    key: beforeSetRangeStart,
    callback: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeSetRangeStart(
    key: beforeSetRangeStart,
    callback: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeSetRangeStart(
    key: beforeSetRangeStart,
    callback: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeSetRangeStartOnly(key: beforeSetRangeStartOnly, callback: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]): Methods = js.native
  @JSName("add")
  def add_beforeSetRangeStartOnly(
    key: beforeSetRangeStartOnly,
    callback: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeSetRangeStartOnly(
    key: beforeSetRangeStartOnly,
    callback: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeSetRangeStartOnly(
    key: beforeSetRangeStartOnly,
    callback: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeStretchingColumnWidth(
    key: beforeStretchingColumnWidth,
    callback: js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeStretchingColumnWidth(
    key: beforeStretchingColumnWidth,
    callback: js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeStretchingColumnWidth(
    key: beforeStretchingColumnWidth,
    callback: js.Array[
      js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeStretchingColumnWidth(
    key: beforeStretchingColumnWidth,
    callback: js.Array[
      js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeTouchScroll(key: beforeTouchScroll, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_beforeTouchScroll(key: beforeTouchScroll, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_beforeTouchScroll(key: beforeTouchScroll, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_beforeTouchScroll(key: beforeTouchScroll, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_beforeTrimRow(
    key: beforeTrimRow,
    callback: js.UndefOr[
      js.Function3[
        /* currentTrimConfig */ js.Array[Double], 
        /* destinationTrimConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeTrimRow(
    key: beforeTrimRow,
    callback: js.UndefOr[
      js.Function3[
        /* currentTrimConfig */ js.Array[Double], 
        /* destinationTrimConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeTrimRow(
    key: beforeTrimRow,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentTrimConfig */ js.Array[Double], 
          /* destinationTrimConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeTrimRow(
    key: beforeTrimRow,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentTrimConfig */ js.Array[Double], 
          /* destinationTrimConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeUndo(key: beforeUndo, callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]): Methods = js.native
  @JSName("add")
  def add_beforeUndo(
    key: beforeUndo,
    callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeUndo(key: beforeUndo, callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]): Methods = js.native
  @JSName("add")
  def add_beforeUndo(
    key: beforeUndo,
    callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeUnhideColumns(
    key: beforeUnhideColumns,
    callback: js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeUnhideColumns(
    key: beforeUnhideColumns,
    callback: js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeUnhideColumns(
    key: beforeUnhideColumns,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeUnhideColumns(
    key: beforeUnhideColumns,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeUnhideRows(
    key: beforeUnhideRows,
    callback: js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeUnhideRows(
    key: beforeUnhideRows,
    callback: js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeUnhideRows(
    key: beforeUnhideRows,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeUnhideRows(
    key: beforeUnhideRows,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeUnmergeCells(
    key: beforeUnmergeCells,
    callback: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeUnmergeCells(
    key: beforeUnmergeCells,
    callback: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeUnmergeCells(
    key: beforeUnmergeCells,
    callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeUnmergeCells(
    key: beforeUnmergeCells,
    callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeUntrimRow(
    key: beforeUntrimRow,
    callback: js.UndefOr[
      js.Function3[
        /* currentTrimConfig */ js.Array[Double], 
        /* destinationTrimConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeUntrimRow(
    key: beforeUntrimRow,
    callback: js.UndefOr[
      js.Function3[
        /* currentTrimConfig */ js.Array[Double], 
        /* destinationTrimConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeUntrimRow(
    key: beforeUntrimRow,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentTrimConfig */ js.Array[Double], 
          /* destinationTrimConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeUntrimRow(
    key: beforeUntrimRow,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentTrimConfig */ js.Array[Double], 
          /* destinationTrimConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeValidate(
    key: beforeValidate,
    callback: js.UndefOr[
      js.Function4[
        /* value */ CellValue, 
        /* row */ Double, 
        /* prop */ String | Double, 
        /* source */ js.UndefOr[ChangeSource], 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeValidate(
    key: beforeValidate,
    callback: js.UndefOr[
      js.Function4[
        /* value */ CellValue, 
        /* row */ Double, 
        /* prop */ String | Double, 
        /* source */ js.UndefOr[ChangeSource], 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeValidate(
    key: beforeValidate,
    callback: js.Array[
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
  ): Methods = js.native
  @JSName("add")
  def add_beforeValidate(
    key: beforeValidate,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* value */ CellValue, 
          /* row */ Double, 
          /* prop */ String | Double, 
          /* source */ js.UndefOr[ChangeSource], 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeValueRender(
    key: beforeValueRender,
    callback: js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeValueRender(
    key: beforeValueRender,
    callback: js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeValueRender(
    key: beforeValueRender,
    callback: js.Array[
      js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeValueRender(
    key: beforeValueRender,
    callback: js.Array[
      js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_construct(key: construct, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_construct(key: construct, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_construct(key: construct, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_construct(key: construct, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_hiddenColumn(key: hiddenColumn, callback: js.UndefOr[js.Function1[/* column */ Double, Unit]]): Methods = js.native
  @JSName("add")
  def add_hiddenColumn(
    key: hiddenColumn,
    callback: js.UndefOr[js.Function1[/* column */ Double, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_hiddenColumn(key: hiddenColumn, callback: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]]): Methods = js.native
  @JSName("add")
  def add_hiddenColumn(
    key: hiddenColumn,
    callback: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_hiddenRow(key: hiddenRow, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Methods = js.native
  @JSName("add")
  def add_hiddenRow(key: hiddenRow, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_hiddenRow(key: hiddenRow, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Methods = js.native
  @JSName("add")
  def add_hiddenRow(
    key: hiddenRow,
    callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_init(key: init, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_init(key: init, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_init(key: init, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_init(key: init, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_modifyAutofillRange(
    key: modifyAutofillRange,
    callback: js.UndefOr[
      js.Function2[
        /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
        /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_modifyAutofillRange(
    key: modifyAutofillRange,
    callback: js.UndefOr[
      js.Function2[
        /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
        /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyAutofillRange(
    key: modifyAutofillRange,
    callback: js.Array[
      js.UndefOr[
        js.Function2[
          /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
          /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_modifyAutofillRange(
    key: modifyAutofillRange,
    callback: js.Array[
      js.UndefOr[
        js.Function2[
          /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
          /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyCol(key: modifyCol, callback: js.UndefOr[js.Function1[/* col */ Double, Unit]]): Methods = js.native
  @JSName("add")
  def add_modifyCol(key: modifyCol, callback: js.UndefOr[js.Function1[/* col */ Double, Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_modifyCol(key: modifyCol, callback: js.Array[js.UndefOr[js.Function1[/* col */ Double, Unit]]]): Methods = js.native
  @JSName("add")
  def add_modifyCol(
    key: modifyCol,
    callback: js.Array[js.UndefOr[js.Function1[/* col */ Double, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyColHeader(key: modifyColHeader, callback: js.UndefOr[js.Function1[/* column */ Double, Unit]]): Methods = js.native
  @JSName("add")
  def add_modifyColHeader(
    key: modifyColHeader,
    callback: js.UndefOr[js.Function1[/* column */ Double, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyColHeader(key: modifyColHeader, callback: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]]): Methods = js.native
  @JSName("add")
  def add_modifyColHeader(
    key: modifyColHeader,
    callback: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyColWidth(
    key: modifyColWidth,
    callback: js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_modifyColWidth(
    key: modifyColWidth,
    callback: js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyColWidth(
    key: modifyColWidth,
    callback: js.Array[js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_modifyColWidth(
    key: modifyColWidth,
    callback: js.Array[js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyColumnHeaderHeight(key: modifyColumnHeaderHeight, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_modifyColumnHeaderHeight(key: modifyColumnHeaderHeight, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_modifyColumnHeaderHeight(key: modifyColumnHeaderHeight, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_modifyColumnHeaderHeight(
    key: modifyColumnHeaderHeight,
    callback: js.Array[js.UndefOr[js.Function0[Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyCopyableRange(
    key: modifyCopyableRange,
    callback: js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_modifyCopyableRange(
    key: modifyCopyableRange,
    callback: js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyCopyableRange(
    key: modifyCopyableRange,
    callback: js.Array[js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_modifyCopyableRange(
    key: modifyCopyableRange,
    callback: js.Array[js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyGetCellCoords(
    key: modifyGetCellCoords,
    callback: js.UndefOr[
      js.Function3[
        /* row */ Double, 
        /* column */ Double, 
        /* topmost */ Boolean, 
        Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_modifyGetCellCoords(
    key: modifyGetCellCoords,
    callback: js.UndefOr[
      js.Function3[
        /* row */ Double, 
        /* column */ Double, 
        /* topmost */ Boolean, 
        Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyGetCellCoords(
    key: modifyGetCellCoords,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* row */ Double, 
          /* column */ Double, 
          /* topmost */ Boolean, 
          Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_modifyGetCellCoords(
    key: modifyGetCellCoords,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* row */ Double, 
          /* column */ Double, 
          /* topmost */ Boolean, 
          Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyRow(key: modifyRow, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Methods = js.native
  @JSName("add")
  def add_modifyRow(key: modifyRow, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_modifyRow(key: modifyRow, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Methods = js.native
  @JSName("add")
  def add_modifyRow(
    key: modifyRow,
    callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyRowData(key: modifyRowData, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Methods = js.native
  @JSName("add")
  def add_modifyRowData(
    key: modifyRowData,
    callback: js.UndefOr[js.Function1[/* row */ Double, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyRowData(key: modifyRowData, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Methods = js.native
  @JSName("add")
  def add_modifyRowData(
    key: modifyRowData,
    callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyRowHeader(key: modifyRowHeader, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Methods = js.native
  @JSName("add")
  def add_modifyRowHeader(
    key: modifyRowHeader,
    callback: js.UndefOr[js.Function1[/* row */ Double, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyRowHeader(key: modifyRowHeader, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Methods = js.native
  @JSName("add")
  def add_modifyRowHeader(
    key: modifyRowHeader,
    callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyRowHeaderWidth(key: modifyRowHeaderWidth, callback: js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]): Methods = js.native
  @JSName("add")
  def add_modifyRowHeaderWidth(
    key: modifyRowHeaderWidth,
    callback: js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyRowHeaderWidth(
    key: modifyRowHeaderWidth,
    callback: js.Array[js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_modifyRowHeaderWidth(
    key: modifyRowHeaderWidth,
    callback: js.Array[js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyRowHeight(
    key: modifyRowHeight,
    callback: js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_modifyRowHeight(
    key: modifyRowHeight,
    callback: js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyRowHeight(
    key: modifyRowHeight,
    callback: js.Array[js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_modifyRowHeight(
    key: modifyRowHeight,
    callback: js.Array[js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyRowSourceData(key: modifyRowSourceData, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Methods = js.native
  @JSName("add")
  def add_modifyRowSourceData(
    key: modifyRowSourceData,
    callback: js.UndefOr[js.Function1[/* row */ Double, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyRowSourceData(key: modifyRowSourceData, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Methods = js.native
  @JSName("add")
  def add_modifyRowSourceData(
    key: modifyRowSourceData,
    callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyTransformEnd(key: modifyTransformEnd, callback: js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]): Methods = js.native
  @JSName("add")
  def add_modifyTransformEnd(
    key: modifyTransformEnd,
    callback: js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyTransformEnd(
    key: modifyTransformEnd,
    callback: js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_modifyTransformEnd(
    key: modifyTransformEnd,
    callback: js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyTransformStart(key: modifyTransformStart, callback: js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]): Methods = js.native
  @JSName("add")
  def add_modifyTransformStart(
    key: modifyTransformStart,
    callback: js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyTransformStart(
    key: modifyTransformStart,
    callback: js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_modifyTransformStart(
    key: modifyTransformStart,
    callback: js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_persistentStateLoad(
    key: persistentStateLoad,
    callback: js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_persistentStateLoad(
    key: persistentStateLoad,
    callback: js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_persistentStateLoad(
    key: persistentStateLoad,
    callback: js.Array[
      js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_persistentStateLoad(
    key: persistentStateLoad,
    callback: js.Array[
      js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_persistentStateReset(key: persistentStateReset, callback: js.UndefOr[js.Function1[/* key */ String, Unit]]): Methods = js.native
  @JSName("add")
  def add_persistentStateReset(
    key: persistentStateReset,
    callback: js.UndefOr[js.Function1[/* key */ String, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_persistentStateReset(key: persistentStateReset, callback: js.Array[js.UndefOr[js.Function1[/* key */ String, Unit]]]): Methods = js.native
  @JSName("add")
  def add_persistentStateReset(
    key: persistentStateReset,
    callback: js.Array[js.UndefOr[js.Function1[/* key */ String, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_persistentStateSave(
    key: persistentStateSave,
    callback: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_persistentStateSave(
    key: persistentStateSave,
    callback: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_persistentStateSave(
    key: persistentStateSave,
    callback: js.Array[js.UndefOr[js.Function2[/* key */ String, /* value */ _, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_persistentStateSave(
    key: persistentStateSave,
    callback: js.Array[js.UndefOr[js.Function2[/* key */ String, /* value */ _, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_skipLengthCache(key: skipLengthCache, callback: js.UndefOr[js.Function1[/* delay */ Double, Unit]]): Methods = js.native
  @JSName("add")
  def add_skipLengthCache(
    key: skipLengthCache,
    callback: js.UndefOr[js.Function1[/* delay */ Double, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_skipLengthCache(key: skipLengthCache, callback: js.Array[js.UndefOr[js.Function1[/* delay */ Double, Unit]]]): Methods = js.native
  @JSName("add")
  def add_skipLengthCache(
    key: skipLengthCache,
    callback: js.Array[js.UndefOr[js.Function1[/* delay */ Double, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_unmodifyCol(key: unmodifyCol, callback: js.UndefOr[js.Function1[/* col */ Double, Unit]]): Methods = js.native
  @JSName("add")
  def add_unmodifyCol(
    key: unmodifyCol,
    callback: js.UndefOr[js.Function1[/* col */ Double, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_unmodifyCol(key: unmodifyCol, callback: js.Array[js.UndefOr[js.Function1[/* col */ Double, Unit]]]): Methods = js.native
  @JSName("add")
  def add_unmodifyCol(
    key: unmodifyCol,
    callback: js.Array[js.UndefOr[js.Function1[/* col */ Double, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_unmodifyRow(key: unmodifyRow, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Methods = js.native
  @JSName("add")
  def add_unmodifyRow(
    key: unmodifyRow,
    callback: js.UndefOr[js.Function1[/* row */ Double, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_unmodifyRow(key: unmodifyRow, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Methods = js.native
  @JSName("add")
  def add_unmodifyRow(
    key: unmodifyRow,
    callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]],
    context: Handsontable
  ): Methods = js.native
  def createEmptyBucket(): Bucket = js.native
  def deregister(key: String): Unit = js.native
  def destroy(): Unit = js.native
  def destroy(context: Handsontable): Unit = js.native
  def getBucket(): Bucket = js.native
  def getBucket(context: Handsontable): Bucket = js.native
  def getRegistered(): js.Array[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 161 */ js.Any
  ] = js.native
  def has(key: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 161 */ js.Any): Boolean = js.native
  def has(
    key: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 161 */ js.Any,
    context: Handsontable
  ): Boolean = js.native
  def isRegistered(key: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 161 */ js.Any): Boolean = js.native
  def once(
    key: afterModifyTransformEnd,
    callback: js.UndefOr[
      js.Function3[
        /* coords */ CellCoords, 
        /* rowTransformDir */ `-1` | `0`, 
        /* colTransformDir */ `-1` | `0`, 
        Unit
      ]
    ]
  ): Unit = js.native
  def once(
    key: afterModifyTransformEnd,
    callback: js.UndefOr[
      js.Function3[
        /* coords */ CellCoords, 
        /* rowTransformDir */ `-1` | `0`, 
        /* colTransformDir */ `-1` | `0`, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  def once(
    key: afterModifyTransformEnd,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* coords */ CellCoords, 
          /* rowTransformDir */ `-1` | `0`, 
          /* colTransformDir */ `-1` | `0`, 
          Unit
        ]
      ]
    ]
  ): Unit = js.native
  def once(
    key: afterModifyTransformEnd,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* coords */ CellCoords, 
          /* rowTransformDir */ `-1` | `0`, 
          /* colTransformDir */ `-1` | `0`, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  def once(
    key: afterModifyTransformStart,
    callback: js.UndefOr[
      js.Function3[
        /* coords */ CellCoords, 
        /* rowTransformDir */ `-1` | `0`, 
        /* colTransformDir */ `-1` | `0`, 
        Unit
      ]
    ]
  ): Unit = js.native
  def once(
    key: afterModifyTransformStart,
    callback: js.UndefOr[
      js.Function3[
        /* coords */ CellCoords, 
        /* rowTransformDir */ `-1` | `0`, 
        /* colTransformDir */ `-1` | `0`, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  def once(
    key: afterModifyTransformStart,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* coords */ CellCoords, 
          /* rowTransformDir */ `-1` | `0`, 
          /* colTransformDir */ `-1` | `0`, 
          Unit
        ]
      ]
    ]
  ): Unit = js.native
  def once(
    key: afterModifyTransformStart,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* coords */ CellCoords, 
          /* rowTransformDir */ `-1` | `0`, 
          /* colTransformDir */ `-1` | `0`, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  def once(
    key: beforeAutofillInsidePopulate,
    callback: js.UndefOr[
      js.Function4[
        /* index */ CellCoords, 
        /* direction */ up | down | left | right, 
        /* input */ js.Array[js.Array[CellValue]], 
        /* deltas */ js.Array[_], 
        Unit
      ]
    ]
  ): Unit = js.native
  def once(
    key: beforeAutofillInsidePopulate,
    callback: js.UndefOr[
      js.Function4[
        /* index */ CellCoords, 
        /* direction */ up | down | left | right, 
        /* input */ js.Array[js.Array[CellValue]], 
        /* deltas */ js.Array[_], 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  def once(
    key: beforeAutofillInsidePopulate,
    callback: js.Array[
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
  ): Unit = js.native
  def once(
    key: beforeAutofillInsidePopulate,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* index */ CellCoords, 
          /* direction */ up | down | left | right, 
          /* input */ js.Array[js.Array[CellValue]], 
          /* deltas */ js.Array[_], 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  def once(
    key: beforeCellAlignment,
    callback: js.UndefOr[
      js.Function4[
        /* stateBefore */ NumberDictionary[js.Array[String]], 
        /* range */ js.Array[CellRange], 
        /* type */ horizontal | vertical, 
        /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
        Unit
      ]
    ]
  ): Unit = js.native
  def once(
    key: beforeCellAlignment,
    callback: js.UndefOr[
      js.Function4[
        /* stateBefore */ NumberDictionary[js.Array[String]], 
        /* range */ js.Array[CellRange], 
        /* type */ horizontal | vertical, 
        /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  def once(
    key: beforeCellAlignment,
    callback: js.Array[
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
  ): Unit = js.native
  def once(
    key: beforeCellAlignment,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* stateBefore */ NumberDictionary[js.Array[String]], 
          /* range */ js.Array[CellRange], 
          /* type */ horizontal | vertical, 
          /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  def once(
    key: beforeDrawBorders,
    callback: js.UndefOr[
      js.Function2[
        /* corners */ js.Array[Double], 
        /* borderClassName */ js.UndefOr[current | area | highlight], 
        Unit
      ]
    ]
  ): Unit = js.native
  def once(
    key: beforeDrawBorders,
    callback: js.UndefOr[
      js.Function2[
        /* corners */ js.Array[Double], 
        /* borderClassName */ js.UndefOr[current | area | highlight], 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  def once(
    key: beforeDrawBorders,
    callback: js.Array[
      js.UndefOr[
        js.Function2[
          /* corners */ js.Array[Double], 
          /* borderClassName */ js.UndefOr[current | area | highlight], 
          Unit
        ]
      ]
    ]
  ): Unit = js.native
  def once(
    key: beforeDrawBorders,
    callback: js.Array[
      js.UndefOr[
        js.Function2[
          /* corners */ js.Array[Double], 
          /* borderClassName */ js.UndefOr[current | area | highlight], 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  def once(
    key: modifyData,
    callback: js.UndefOr[
      js.Function4[
        /* row */ Double, 
        /* column */ Double, 
        /* valueHolder */ ValueCellValue, 
        /* ioMode */ get | set, 
        Unit
      ]
    ]
  ): Unit = js.native
  def once(
    key: modifyData,
    callback: js.UndefOr[
      js.Function4[
        /* row */ Double, 
        /* column */ Double, 
        /* valueHolder */ ValueCellValue, 
        /* ioMode */ get | set, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  def once(
    key: modifyData,
    callback: js.Array[
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
  ): Unit = js.native
  def once(
    key: modifyData,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* row */ Double, 
          /* column */ Double, 
          /* valueHolder */ ValueCellValue, 
          /* ioMode */ get | set, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterAddChild(
    key: afterAddChild,
    callback: js.UndefOr[
      js.Function3[
        /* parent */ RowObject, 
        /* element */ RowObject | Unit, 
        /* index */ Double | Unit, 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterAddChild(
    key: afterAddChild,
    callback: js.UndefOr[
      js.Function3[
        /* parent */ RowObject, 
        /* element */ RowObject | Unit, 
        /* index */ Double | Unit, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterAddChild(
    key: afterAddChild,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* parent */ RowObject, 
          /* element */ RowObject | Unit, 
          /* index */ Double | Unit, 
          Unit
        ]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterAddChild(
    key: afterAddChild,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* parent */ RowObject, 
          /* element */ RowObject | Unit, 
          /* index */ Double | Unit, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterBeginEditing(
    key: afterBeginEditing,
    callback: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_afterBeginEditing(
    key: afterBeginEditing,
    callback: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterBeginEditing(
    key: afterBeginEditing,
    callback: js.Array[js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_afterBeginEditing(
    key: afterBeginEditing,
    callback: js.Array[js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterCellMetaReset(key: afterCellMetaReset, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_afterCellMetaReset(key: afterCellMetaReset, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterCellMetaReset(key: afterCellMetaReset, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_afterCellMetaReset(key: afterCellMetaReset, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterChange(
    key: afterChange,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterChange(
    key: afterChange,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterChange(
    key: afterChange,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterChange(
    key: afterChange,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterChangesObserved(key: afterChangesObserved, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_afterChangesObserved(key: afterChangesObserved, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterChangesObserved(key: afterChangesObserved, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_afterChangesObserved(
    key: afterChangesObserved,
    callback: js.Array[js.UndefOr[js.Function0[Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterColumnMove(
    key: afterColumnMove,
    callback: js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_afterColumnMove(
    key: afterColumnMove,
    callback: js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterColumnMove(
    key: afterColumnMove,
    callback: js.Array[
      js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterColumnMove(
    key: afterColumnMove,
    callback: js.Array[
      js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterColumnResize(
    key: afterColumnResize,
    callback: js.UndefOr[
      js.Function3[/* currentColumn */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterColumnResize(
    key: afterColumnResize,
    callback: js.UndefOr[
      js.Function3[/* currentColumn */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterColumnResize(
    key: afterColumnResize,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* currentColumn */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterColumnResize(
    key: afterColumnResize,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* currentColumn */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterColumnSort(
    key: afterColumnSort,
    callback: js.UndefOr[
      js.Function2[
        /* currentSortConfig */ js.Array[Config], 
        /* destinationSortConfigs */ js.Array[Config], 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterColumnSort(
    key: afterColumnSort,
    callback: js.UndefOr[
      js.Function2[
        /* currentSortConfig */ js.Array[Config], 
        /* destinationSortConfigs */ js.Array[Config], 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterColumnSort(
    key: afterColumnSort,
    callback: js.Array[
      js.UndefOr[
        js.Function2[
          /* currentSortConfig */ js.Array[Config], 
          /* destinationSortConfigs */ js.Array[Config], 
          Unit
        ]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterColumnSort(
    key: afterColumnSort,
    callback: js.Array[
      js.UndefOr[
        js.Function2[
          /* currentSortConfig */ js.Array[Config], 
          /* destinationSortConfigs */ js.Array[Config], 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterContextMenuDefaultOptions(
    key: afterContextMenuDefaultOptions,
    callback: js.UndefOr[
      js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterContextMenuDefaultOptions(
    key: afterContextMenuDefaultOptions,
    callback: js.UndefOr[
      js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterContextMenuDefaultOptions(
    key: afterContextMenuDefaultOptions,
    callback: js.Array[
      js.UndefOr[
        js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterContextMenuDefaultOptions(
    key: afterContextMenuDefaultOptions,
    callback: js.Array[
      js.UndefOr[
        js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterContextMenuHide(key: afterContextMenuHide, callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]): Unit = js.native
  @JSName("once")
  def once_afterContextMenuHide(
    key: afterContextMenuHide,
    callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterContextMenuHide(
    key: afterContextMenuHide,
    callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_afterContextMenuHide(
    key: afterContextMenuHide,
    callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterContextMenuShow(key: afterContextMenuShow, callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]): Unit = js.native
  @JSName("once")
  def once_afterContextMenuShow(
    key: afterContextMenuShow,
    callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterContextMenuShow(
    key: afterContextMenuShow,
    callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_afterContextMenuShow(
    key: afterContextMenuShow,
    callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterCopy(
    key: afterCopy,
    callback: js.UndefOr[
      js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterCopy(
    key: afterCopy,
    callback: js.UndefOr[
      js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterCopy(
    key: afterCopy,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterCopy(
    key: afterCopy,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterCopyLimit(
    key: afterCopyLimit,
    callback: js.UndefOr[
      js.Function4[
        /* selectedRows */ Double, 
        /* selectedColumnds */ Double, 
        /* copyRowsLimit */ Double, 
        /* copyColumnsLimit */ Double, 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterCopyLimit(
    key: afterCopyLimit,
    callback: js.UndefOr[
      js.Function4[
        /* selectedRows */ Double, 
        /* selectedColumnds */ Double, 
        /* copyRowsLimit */ Double, 
        /* copyColumnsLimit */ Double, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterCopyLimit(
    key: afterCopyLimit,
    callback: js.Array[
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
  ): Unit = js.native
  @JSName("once")
  def once_afterCopyLimit(
    key: afterCopyLimit,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* selectedRows */ Double, 
          /* selectedColumnds */ Double, 
          /* copyRowsLimit */ Double, 
          /* copyColumnsLimit */ Double, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterCreateCol(
    key: afterCreateCol,
    callback: js.UndefOr[
      js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterCreateCol(
    key: afterCreateCol,
    callback: js.UndefOr[
      js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterCreateCol(
    key: afterCreateCol,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterCreateCol(
    key: afterCreateCol,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterCreateRow(
    key: afterCreateRow,
    callback: js.UndefOr[
      js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterCreateRow(
    key: afterCreateRow,
    callback: js.UndefOr[
      js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterCreateRow(
    key: afterCreateRow,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterCreateRow(
    key: afterCreateRow,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterCut(
    key: afterCut,
    callback: js.UndefOr[
      js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterCut(
    key: afterCut,
    callback: js.UndefOr[
      js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterCut(
    key: afterCut,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterCut(
    key: afterCut,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterDeselect(key: afterDeselect, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_afterDeselect(key: afterDeselect, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterDeselect(key: afterDeselect, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_afterDeselect(key: afterDeselect, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterDestroy(key: afterDestroy, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_afterDestroy(key: afterDestroy, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterDestroy(key: afterDestroy, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_afterDestroy(key: afterDestroy, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterDetachChild(
    key: afterDetachChild,
    callback: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_afterDetachChild(
    key: afterDetachChild,
    callback: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterDetachChild(
    key: afterDetachChild,
    callback: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_afterDetachChild(
    key: afterDetachChild,
    callback: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterDocumentKeyDown(key: afterDocumentKeyDown, callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]): Unit = js.native
  @JSName("once")
  def once_afterDocumentKeyDown(
    key: afterDocumentKeyDown,
    callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterDocumentKeyDown(
    key: afterDocumentKeyDown,
    callback: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_afterDocumentKeyDown(
    key: afterDocumentKeyDown,
    callback: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterDrawSelection(
    key: afterDrawSelection,
    callback: js.UndefOr[
      js.Function4[
        /* currentRow */ Double, 
        /* currentColumn */ Double, 
        /* cornersOfSelection */ js.Array[Double], 
        /* layerLevel */ Double | Unit, 
        String | Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterDrawSelection(
    key: afterDrawSelection,
    callback: js.UndefOr[
      js.Function4[
        /* currentRow */ Double, 
        /* currentColumn */ Double, 
        /* cornersOfSelection */ js.Array[Double], 
        /* layerLevel */ Double | Unit, 
        String | Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterDrawSelection(
    key: afterDrawSelection,
    callback: js.Array[
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
  ): Unit = js.native
  @JSName("once")
  def once_afterDrawSelection(
    key: afterDrawSelection,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* currentRow */ Double, 
          /* currentColumn */ Double, 
          /* cornersOfSelection */ js.Array[Double], 
          /* layerLevel */ Double | Unit, 
          String | Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterDropdownMenuDefaultOptions(
    key: afterDropdownMenuDefaultOptions,
    callback: js.UndefOr[
      js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterDropdownMenuDefaultOptions(
    key: afterDropdownMenuDefaultOptions,
    callback: js.UndefOr[
      js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterDropdownMenuDefaultOptions(
    key: afterDropdownMenuDefaultOptions,
    callback: js.Array[
      js.UndefOr[
        js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterDropdownMenuDefaultOptions(
    key: afterDropdownMenuDefaultOptions,
    callback: js.Array[
      js.UndefOr[
        js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterDropdownMenuHide(key: afterDropdownMenuHide, callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]): Unit = js.native
  @JSName("once")
  def once_afterDropdownMenuHide(
    key: afterDropdownMenuHide,
    callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterDropdownMenuHide(
    key: afterDropdownMenuHide,
    callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_afterDropdownMenuHide(
    key: afterDropdownMenuHide,
    callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterDropdownMenuShow(key: afterDropdownMenuShow, callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]): Unit = js.native
  @JSName("once")
  def once_afterDropdownMenuShow(
    key: afterDropdownMenuShow,
    callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterDropdownMenuShow(
    key: afterDropdownMenuShow,
    callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_afterDropdownMenuShow(
    key: afterDropdownMenuShow,
    callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterFilter(
    key: afterFilter,
    callback: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_afterFilter(
    key: afterFilter,
    callback: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterFilter(
    key: afterFilter,
    callback: js.Array[js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_afterFilter(
    key: afterFilter,
    callback: js.Array[js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterGetCellMeta(
    key: afterGetCellMeta,
    callback: js.UndefOr[
      js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterGetCellMeta(
    key: afterGetCellMeta,
    callback: js.UndefOr[
      js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterGetCellMeta(
    key: afterGetCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterGetCellMeta(
    key: afterGetCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterGetColHeader(
    key: afterGetColHeader,
    callback: js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_afterGetColHeader(
    key: afterGetColHeader,
    callback: js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterGetColHeader(
    key: afterGetColHeader,
    callback: js.Array[
      js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterGetColHeader(
    key: afterGetColHeader,
    callback: js.Array[
      js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterGetColumnHeaderRenderers(
    key: afterGetColumnHeaderRenderers,
    callback: js.UndefOr[
      js.Function1[
        /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterGetColumnHeaderRenderers(
    key: afterGetColumnHeaderRenderers,
    callback: js.UndefOr[
      js.Function1[
        /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterGetColumnHeaderRenderers(
    key: afterGetColumnHeaderRenderers,
    callback: js.Array[
      js.UndefOr[
        js.Function1[
          /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
          Unit
        ]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterGetColumnHeaderRenderers(
    key: afterGetColumnHeaderRenderers,
    callback: js.Array[
      js.UndefOr[
        js.Function1[
          /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterGetRowHeader(
    key: afterGetRowHeader,
    callback: js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_afterGetRowHeader(
    key: afterGetRowHeader,
    callback: js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterGetRowHeader(
    key: afterGetRowHeader,
    callback: js.Array[
      js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterGetRowHeader(
    key: afterGetRowHeader,
    callback: js.Array[
      js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterGetRowHeaderRenderers(
    key: afterGetRowHeaderRenderers,
    callback: js.UndefOr[
      js.Function1[
        /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterGetRowHeaderRenderers(
    key: afterGetRowHeaderRenderers,
    callback: js.UndefOr[
      js.Function1[
        /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterGetRowHeaderRenderers(
    key: afterGetRowHeaderRenderers,
    callback: js.Array[
      js.UndefOr[
        js.Function1[
          /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
          Unit
        ]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterGetRowHeaderRenderers(
    key: afterGetRowHeaderRenderers,
    callback: js.Array[
      js.UndefOr[
        js.Function1[
          /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterHideColumns(
    key: afterHideColumns,
    callback: js.UndefOr[
      js.Function4[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterHideColumns(
    key: afterHideColumns,
    callback: js.UndefOr[
      js.Function4[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterHideColumns(
    key: afterHideColumns,
    callback: js.Array[
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
  ): Unit = js.native
  @JSName("once")
  def once_afterHideColumns(
    key: afterHideColumns,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          /* stateChanged */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterHideRows(
    key: afterHideRows,
    callback: js.UndefOr[
      js.Function4[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterHideRows(
    key: afterHideRows,
    callback: js.UndefOr[
      js.Function4[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterHideRows(
    key: afterHideRows,
    callback: js.Array[
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
  ): Unit = js.native
  @JSName("once")
  def once_afterHideRows(
    key: afterHideRows,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          /* stateChanged */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterInit(key: afterInit, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_afterInit(key: afterInit, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterInit(key: afterInit, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_afterInit(key: afterInit, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterLanguageChange(key: afterLanguageChange, callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]]): Unit = js.native
  @JSName("once")
  def once_afterLanguageChange(
    key: afterLanguageChange,
    callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterLanguageChange(
    key: afterLanguageChange,
    callback: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_afterLanguageChange(
    key: afterLanguageChange,
    callback: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterListen(key: afterListen, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_afterListen(key: afterListen, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterListen(key: afterListen, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_afterListen(key: afterListen, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterLoadData(key: afterLoadData, callback: js.UndefOr[js.Function1[/* initialLoad */ Boolean, Unit]]): Unit = js.native
  @JSName("once")
  def once_afterLoadData(
    key: afterLoadData,
    callback: js.UndefOr[js.Function1[/* initialLoad */ Boolean, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterLoadData(key: afterLoadData, callback: js.Array[js.UndefOr[js.Function1[/* initialLoad */ Boolean, Unit]]]): Unit = js.native
  @JSName("once")
  def once_afterLoadData(
    key: afterLoadData,
    callback: js.Array[js.UndefOr[js.Function1[/* initialLoad */ Boolean, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterMergeCells(
    key: afterMergeCells,
    callback: js.UndefOr[
      js.Function3[/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterMergeCells(
    key: afterMergeCells,
    callback: js.UndefOr[
      js.Function3[/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterMergeCells(
    key: afterMergeCells,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterMergeCells(
    key: afterMergeCells,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterMomentumScroll(key: afterMomentumScroll, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_afterMomentumScroll(key: afterMomentumScroll, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterMomentumScroll(key: afterMomentumScroll, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_afterMomentumScroll(
    key: afterMomentumScroll,
    callback: js.Array[js.UndefOr[js.Function0[Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellContextMenu(
    key: afterOnCellContextMenu,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellContextMenu(
    key: afterOnCellContextMenu,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellContextMenu(
    key: afterOnCellContextMenu,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellContextMenu(
    key: afterOnCellContextMenu,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellCornerDblClick(key: afterOnCellCornerDblClick, callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]): Unit = js.native
  @JSName("once")
  def once_afterOnCellCornerDblClick(
    key: afterOnCellCornerDblClick,
    callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellCornerDblClick(
    key: afterOnCellCornerDblClick,
    callback: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellCornerDblClick(
    key: afterOnCellCornerDblClick,
    callback: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellCornerMouseDown(key: afterOnCellCornerMouseDown, callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]): Unit = js.native
  @JSName("once")
  def once_afterOnCellCornerMouseDown(
    key: afterOnCellCornerMouseDown,
    callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellCornerMouseDown(
    key: afterOnCellCornerMouseDown,
    callback: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellCornerMouseDown(
    key: afterOnCellCornerMouseDown,
    callback: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseDown(
    key: afterOnCellMouseDown,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseDown(
    key: afterOnCellMouseDown,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseDown(
    key: afterOnCellMouseDown,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseDown(
    key: afterOnCellMouseDown,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseOut(
    key: afterOnCellMouseOut,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseOut(
    key: afterOnCellMouseOut,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseOut(
    key: afterOnCellMouseOut,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseOut(
    key: afterOnCellMouseOut,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseOver(
    key: afterOnCellMouseOver,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseOver(
    key: afterOnCellMouseOver,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseOver(
    key: afterOnCellMouseOver,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseOver(
    key: afterOnCellMouseOver,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseUp(
    key: afterOnCellMouseUp,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseUp(
    key: afterOnCellMouseUp,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseUp(
    key: afterOnCellMouseUp,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseUp(
    key: afterOnCellMouseUp,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterPaste(
    key: afterPaste,
    callback: js.UndefOr[
      js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterPaste(
    key: afterPaste,
    callback: js.UndefOr[
      js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterPaste(
    key: afterPaste,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterPaste(
    key: afterPaste,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterPluginsInitialized(key: afterPluginsInitialized, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_afterPluginsInitialized(key: afterPluginsInitialized, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterPluginsInitialized(key: afterPluginsInitialized, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_afterPluginsInitialized(
    key: afterPluginsInitialized,
    callback: js.Array[js.UndefOr[js.Function0[Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterRedo(key: afterRedo, callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]): Unit = js.native
  @JSName("once")
  def once_afterRedo(
    key: afterRedo,
    callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterRedo(key: afterRedo, callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]): Unit = js.native
  @JSName("once")
  def once_afterRedo(
    key: afterRedo,
    callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterRefreshDimensions(
    key: afterRefreshDimensions,
    callback: js.UndefOr[
      js.Function3[
        /* previousDimensions */ js.Object, 
        /* currentDimensions */ js.Object, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterRefreshDimensions(
    key: afterRefreshDimensions,
    callback: js.UndefOr[
      js.Function3[
        /* previousDimensions */ js.Object, 
        /* currentDimensions */ js.Object, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterRefreshDimensions(
    key: afterRefreshDimensions,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* previousDimensions */ js.Object, 
          /* currentDimensions */ js.Object, 
          /* stateChanged */ Boolean, 
          Unit
        ]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterRefreshDimensions(
    key: afterRefreshDimensions,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* previousDimensions */ js.Object, 
          /* currentDimensions */ js.Object, 
          /* stateChanged */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterRemoveCellMeta(
    key: afterRemoveCellMeta,
    callback: js.UndefOr[
      js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterRemoveCellMeta(
    key: afterRemoveCellMeta,
    callback: js.UndefOr[
      js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterRemoveCellMeta(
    key: afterRemoveCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterRemoveCellMeta(
    key: afterRemoveCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterRemoveCol(
    key: afterRemoveCol,
    callback: js.UndefOr[
      js.Function4[
        /* index */ Double, 
        /* amount */ Double, 
        /* physicalColumns */ js.Array[Double], 
        /* source */ js.UndefOr[ChangeSource], 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterRemoveCol(
    key: afterRemoveCol,
    callback: js.UndefOr[
      js.Function4[
        /* index */ Double, 
        /* amount */ Double, 
        /* physicalColumns */ js.Array[Double], 
        /* source */ js.UndefOr[ChangeSource], 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterRemoveCol(
    key: afterRemoveCol,
    callback: js.Array[
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
  ): Unit = js.native
  @JSName("once")
  def once_afterRemoveCol(
    key: afterRemoveCol,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* index */ Double, 
          /* amount */ Double, 
          /* physicalColumns */ js.Array[Double], 
          /* source */ js.UndefOr[ChangeSource], 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterRemoveRow(
    key: afterRemoveRow,
    callback: js.UndefOr[
      js.Function4[
        /* index */ Double, 
        /* amount */ Double, 
        /* physicalColumns */ js.Array[Double], 
        /* source */ js.UndefOr[ChangeSource], 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterRemoveRow(
    key: afterRemoveRow,
    callback: js.UndefOr[
      js.Function4[
        /* index */ Double, 
        /* amount */ Double, 
        /* physicalColumns */ js.Array[Double], 
        /* source */ js.UndefOr[ChangeSource], 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterRemoveRow(
    key: afterRemoveRow,
    callback: js.Array[
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
  ): Unit = js.native
  @JSName("once")
  def once_afterRemoveRow(
    key: afterRemoveRow,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* index */ Double, 
          /* amount */ Double, 
          /* physicalColumns */ js.Array[Double], 
          /* source */ js.UndefOr[ChangeSource], 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterRender(key: afterRender, callback: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]): Unit = js.native
  @JSName("once")
  def once_afterRender(
    key: afterRender,
    callback: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterRender(key: afterRender, callback: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]): Unit = js.native
  @JSName("once")
  def once_afterRender(
    key: afterRender,
    callback: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterRenderer(
    key: afterRenderer,
    callback: js.UndefOr[
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
  ): Unit = js.native
  @JSName("once")
  def once_afterRenderer(
    key: afterRenderer,
    callback: js.UndefOr[
      js.Function6[
        /* TD */ HTMLTableCellElement, 
        /* row */ Double, 
        /* col */ Double, 
        /* prop */ String | Double, 
        /* value */ String, 
        /* cellProperties */ CellProperties, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterRenderer(
    key: afterRenderer,
    callback: js.Array[
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
  ): Unit = js.native
  @JSName("once")
  def once_afterRenderer(
    key: afterRenderer,
    callback: js.Array[
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
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterRowMove(
    key: afterRowMove,
    callback: js.UndefOr[js.Function2[/* startRow */ Double, /* endRow */ Double, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_afterRowMove(
    key: afterRowMove,
    callback: js.UndefOr[js.Function2[/* startRow */ Double, /* endRow */ Double, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterRowMove(
    key: afterRowMove,
    callback: js.Array[js.UndefOr[js.Function2[/* startRow */ Double, /* endRow */ Double, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_afterRowMove(
    key: afterRowMove,
    callback: js.Array[js.UndefOr[js.Function2[/* startRow */ Double, /* endRow */ Double, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterRowResize(
    key: afterRowResize,
    callback: js.UndefOr[
      js.Function3[/* currentRow */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterRowResize(
    key: afterRowResize,
    callback: js.UndefOr[
      js.Function3[/* currentRow */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterRowResize(
    key: afterRowResize,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* currentRow */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterRowResize(
    key: afterRowResize,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* currentRow */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterScrollHorizontally(key: afterScrollHorizontally, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_afterScrollHorizontally(key: afterScrollHorizontally, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterScrollHorizontally(key: afterScrollHorizontally, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_afterScrollHorizontally(
    key: afterScrollHorizontally,
    callback: js.Array[js.UndefOr[js.Function0[Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterScrollVertically(key: afterScrollVertically, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_afterScrollVertically(key: afterScrollVertically, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterScrollVertically(key: afterScrollVertically, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_afterScrollVertically(
    key: afterScrollVertically,
    callback: js.Array[js.UndefOr[js.Function0[Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterSelection(
    key: afterSelection,
    callback: js.UndefOr[
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
  ): Unit = js.native
  @JSName("once")
  def once_afterSelection(
    key: afterSelection,
    callback: js.UndefOr[
      js.Function6[
        /* row */ Double, 
        /* column */ Double, 
        /* row2 */ Double, 
        /* column2 */ Double, 
        /* preventScrolling */ Value, 
        /* selectionLayerLevel */ Double, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterSelection(
    key: afterSelection,
    callback: js.Array[
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
  ): Unit = js.native
  @JSName("once")
  def once_afterSelection(
    key: afterSelection,
    callback: js.Array[
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
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterSelectionByProp(
    key: afterSelectionByProp,
    callback: js.UndefOr[
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
  ): Unit = js.native
  @JSName("once")
  def once_afterSelectionByProp(
    key: afterSelectionByProp,
    callback: js.UndefOr[
      js.Function6[
        /* row */ Double, 
        /* prop */ String, 
        /* row2 */ Double, 
        /* prop2 */ String, 
        /* preventScrolling */ Value, 
        /* selectionLayerLevel */ Double, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterSelectionByProp(
    key: afterSelectionByProp,
    callback: js.Array[
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
  ): Unit = js.native
  @JSName("once")
  def once_afterSelectionByProp(
    key: afterSelectionByProp,
    callback: js.Array[
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
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterSelectionEnd(
    key: afterSelectionEnd,
    callback: js.UndefOr[
      js.Function5[
        /* row */ Double, 
        /* column */ Double, 
        /* row2 */ Double, 
        /* column2 */ Double, 
        /* selectionLayerLevel */ Double, 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterSelectionEnd(
    key: afterSelectionEnd,
    callback: js.UndefOr[
      js.Function5[
        /* row */ Double, 
        /* column */ Double, 
        /* row2 */ Double, 
        /* column2 */ Double, 
        /* selectionLayerLevel */ Double, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterSelectionEnd(
    key: afterSelectionEnd,
    callback: js.Array[
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
  ): Unit = js.native
  @JSName("once")
  def once_afterSelectionEnd(
    key: afterSelectionEnd,
    callback: js.Array[
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
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterSelectionEndByProp(
    key: afterSelectionEndByProp,
    callback: js.UndefOr[
      js.Function5[
        /* row */ Double, 
        /* prop */ String, 
        /* row2 */ Double, 
        /* prop2 */ String, 
        /* selectionLayerLevel */ Double, 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterSelectionEndByProp(
    key: afterSelectionEndByProp,
    callback: js.UndefOr[
      js.Function5[
        /* row */ Double, 
        /* prop */ String, 
        /* row2 */ Double, 
        /* prop2 */ String, 
        /* selectionLayerLevel */ Double, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterSelectionEndByProp(
    key: afterSelectionEndByProp,
    callback: js.Array[
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
  ): Unit = js.native
  @JSName("once")
  def once_afterSelectionEndByProp(
    key: afterSelectionEndByProp,
    callback: js.Array[
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
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterSetCellMeta(
    key: afterSetCellMeta,
    callback: js.UndefOr[
      js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ js.Any, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterSetCellMeta(
    key: afterSetCellMeta,
    callback: js.UndefOr[
      js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ js.Any, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterSetCellMeta(
    key: afterSetCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterSetCellMeta(
    key: afterSetCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterSetDataAtCell(
    key: afterSetDataAtCell,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterSetDataAtCell(
    key: afterSetDataAtCell,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterSetDataAtCell(
    key: afterSetDataAtCell,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterSetDataAtCell(
    key: afterSetDataAtCell,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterSetDataAtRowProp(
    key: afterSetDataAtRowProp,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterSetDataAtRowProp(
    key: afterSetDataAtRowProp,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterSetDataAtRowProp(
    key: afterSetDataAtRowProp,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterSetDataAtRowProp(
    key: afterSetDataAtRowProp,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterTrimRow(
    key: afterTrimRow,
    callback: js.UndefOr[
      js.Function4[
        /* currentTrimConfig */ js.Array[Double], 
        /* destinationTrimConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterTrimRow(
    key: afterTrimRow,
    callback: js.UndefOr[
      js.Function4[
        /* currentTrimConfig */ js.Array[Double], 
        /* destinationTrimConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterTrimRow(
    key: afterTrimRow,
    callback: js.Array[
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
  ): Unit = js.native
  @JSName("once")
  def once_afterTrimRow(
    key: afterTrimRow,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* currentTrimConfig */ js.Array[Double], 
          /* destinationTrimConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          /* stateChanged */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterUndo(key: afterUndo, callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]): Unit = js.native
  @JSName("once")
  def once_afterUndo(
    key: afterUndo,
    callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterUndo(key: afterUndo, callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]): Unit = js.native
  @JSName("once")
  def once_afterUndo(
    key: afterUndo,
    callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterUnhideColumns(
    key: afterUnhideColumns,
    callback: js.UndefOr[
      js.Function4[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterUnhideColumns(
    key: afterUnhideColumns,
    callback: js.UndefOr[
      js.Function4[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterUnhideColumns(
    key: afterUnhideColumns,
    callback: js.Array[
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
  ): Unit = js.native
  @JSName("once")
  def once_afterUnhideColumns(
    key: afterUnhideColumns,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          /* stateChanged */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterUnhideRows(
    key: afterUnhideRows,
    callback: js.UndefOr[
      js.Function4[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterUnhideRows(
    key: afterUnhideRows,
    callback: js.UndefOr[
      js.Function4[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterUnhideRows(
    key: afterUnhideRows,
    callback: js.Array[
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
  ): Unit = js.native
  @JSName("once")
  def once_afterUnhideRows(
    key: afterUnhideRows,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          /* stateChanged */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterUnlisten(key: afterUnlisten, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_afterUnlisten(key: afterUnlisten, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterUnlisten(key: afterUnlisten, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_afterUnlisten(key: afterUnlisten, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterUnmergeCells(
    key: afterUnmergeCells,
    callback: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_afterUnmergeCells(
    key: afterUnmergeCells,
    callback: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterUnmergeCells(
    key: afterUnmergeCells,
    callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_afterUnmergeCells(
    key: afterUnmergeCells,
    callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterUntrimRow(
    key: afterUntrimRow,
    callback: js.UndefOr[
      js.Function4[
        /* currentTrimConfig */ js.Array[Double], 
        /* destinationTrimConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterUntrimRow(
    key: afterUntrimRow,
    callback: js.UndefOr[
      js.Function4[
        /* currentTrimConfig */ js.Array[Double], 
        /* destinationTrimConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterUntrimRow(
    key: afterUntrimRow,
    callback: js.Array[
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
  ): Unit = js.native
  @JSName("once")
  def once_afterUntrimRow(
    key: afterUntrimRow,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* currentTrimConfig */ js.Array[Double], 
          /* destinationTrimConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          /* stateChanged */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterUpdateSettings(key: afterUpdateSettings, callback: js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]): Unit = js.native
  @JSName("once")
  def once_afterUpdateSettings(
    key: afterUpdateSettings,
    callback: js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterUpdateSettings(
    key: afterUpdateSettings,
    callback: js.Array[js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_afterUpdateSettings(
    key: afterUpdateSettings,
    callback: js.Array[js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterValidate(
    key: afterValidate,
    callback: js.UndefOr[
      js.Function5[
        /* isValid */ Boolean, 
        /* value */ CellValue, 
        /* row */ Double, 
        /* prop */ String | Double, 
        /* source */ ChangeSource, 
        Unit | Boolean
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterValidate(
    key: afterValidate,
    callback: js.UndefOr[
      js.Function5[
        /* isValid */ Boolean, 
        /* value */ CellValue, 
        /* row */ Double, 
        /* prop */ String | Double, 
        /* source */ ChangeSource, 
        Unit | Boolean
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterValidate(
    key: afterValidate,
    callback: js.Array[
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
  ): Unit = js.native
  @JSName("once")
  def once_afterValidate(
    key: afterValidate,
    callback: js.Array[
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
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterViewportColumnCalculatorOverride(
    key: afterViewportColumnCalculatorOverride,
    callback: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_afterViewportColumnCalculatorOverride(
    key: afterViewportColumnCalculatorOverride,
    callback: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterViewportColumnCalculatorOverride(
    key: afterViewportColumnCalculatorOverride,
    callback: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_afterViewportColumnCalculatorOverride(
    key: afterViewportColumnCalculatorOverride,
    callback: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterViewportRowCalculatorOverride(
    key: afterViewportRowCalculatorOverride,
    callback: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_afterViewportRowCalculatorOverride(
    key: afterViewportRowCalculatorOverride,
    callback: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterViewportRowCalculatorOverride(
    key: afterViewportRowCalculatorOverride,
    callback: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_afterViewportRowCalculatorOverride(
    key: afterViewportRowCalculatorOverride,
    callback: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeAddChild(
    key: beforeAddChild,
    callback: js.UndefOr[
      js.Function3[
        /* parent */ RowObject, 
        /* element */ RowObject | Unit, 
        /* index */ Double | Unit, 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeAddChild(
    key: beforeAddChild,
    callback: js.UndefOr[
      js.Function3[
        /* parent */ RowObject, 
        /* element */ RowObject | Unit, 
        /* index */ Double | Unit, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeAddChild(
    key: beforeAddChild,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* parent */ RowObject, 
          /* element */ RowObject | Unit, 
          /* index */ Double | Unit, 
          Unit
        ]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeAddChild(
    key: beforeAddChild,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* parent */ RowObject, 
          /* element */ RowObject | Unit, 
          /* index */ Double | Unit, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeAutofill(
    key: beforeAutofill,
    callback: js.UndefOr[
      js.Function3[
        /* start */ CellCoords, 
        /* end */ CellCoords, 
        /* data */ js.Array[js.Array[CellValue]], 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeAutofill(
    key: beforeAutofill,
    callback: js.UndefOr[
      js.Function3[
        /* start */ CellCoords, 
        /* end */ CellCoords, 
        /* data */ js.Array[js.Array[CellValue]], 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeAutofill(
    key: beforeAutofill,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* start */ CellCoords, 
          /* end */ CellCoords, 
          /* data */ js.Array[js.Array[CellValue]], 
          Unit
        ]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeAutofill(
    key: beforeAutofill,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* start */ CellCoords, 
          /* end */ CellCoords, 
          /* data */ js.Array[js.Array[CellValue]], 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeChange(
    key: beforeChange,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeChange(
    key: beforeChange,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeChange(
    key: beforeChange,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeChange(
    key: beforeChange,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeChangeRender(
    key: beforeChangeRender,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeChangeRender(
    key: beforeChangeRender,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeChangeRender(
    key: beforeChangeRender,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeChangeRender(
    key: beforeChangeRender,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeColumnMove(
    key: beforeColumnMove,
    callback: js.UndefOr[
      js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit | Boolean]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeColumnMove(
    key: beforeColumnMove,
    callback: js.UndefOr[
      js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit | Boolean]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeColumnMove(
    key: beforeColumnMove,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit | Boolean]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeColumnMove(
    key: beforeColumnMove,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit | Boolean]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeColumnResize(
    key: beforeColumnResize,
    callback: js.UndefOr[
      js.Function3[
        /* currentColumn */ Double, 
        /* newSize */ Double, 
        /* isDoubleClick */ Boolean, 
        Unit | Double
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeColumnResize(
    key: beforeColumnResize,
    callback: js.UndefOr[
      js.Function3[
        /* currentColumn */ Double, 
        /* newSize */ Double, 
        /* isDoubleClick */ Boolean, 
        Unit | Double
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeColumnResize(
    key: beforeColumnResize,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentColumn */ Double, 
          /* newSize */ Double, 
          /* isDoubleClick */ Boolean, 
          Unit | Double
        ]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeColumnResize(
    key: beforeColumnResize,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentColumn */ Double, 
          /* newSize */ Double, 
          /* isDoubleClick */ Boolean, 
          Unit | Double
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeColumnSort(
    key: beforeColumnSort,
    callback: js.UndefOr[
      js.Function2[
        /* currentSortConfig */ js.Array[Config], 
        /* destinationSortConfigs */ js.Array[Config], 
        Unit | Boolean
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeColumnSort(
    key: beforeColumnSort,
    callback: js.UndefOr[
      js.Function2[
        /* currentSortConfig */ js.Array[Config], 
        /* destinationSortConfigs */ js.Array[Config], 
        Unit | Boolean
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeColumnSort(
    key: beforeColumnSort,
    callback: js.Array[
      js.UndefOr[
        js.Function2[
          /* currentSortConfig */ js.Array[Config], 
          /* destinationSortConfigs */ js.Array[Config], 
          Unit | Boolean
        ]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeColumnSort(
    key: beforeColumnSort,
    callback: js.Array[
      js.UndefOr[
        js.Function2[
          /* currentSortConfig */ js.Array[Config], 
          /* destinationSortConfigs */ js.Array[Config], 
          Unit | Boolean
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeContextMenuSetItems(
    key: beforeContextMenuSetItems,
    callback: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeContextMenuSetItems(
    key: beforeContextMenuSetItems,
    callback: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeContextMenuSetItems(
    key: beforeContextMenuSetItems,
    callback: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeContextMenuSetItems(
    key: beforeContextMenuSetItems,
    callback: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeContextMenuShow(key: beforeContextMenuShow, callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]): Unit = js.native
  @JSName("once")
  def once_beforeContextMenuShow(
    key: beforeContextMenuShow,
    callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeContextMenuShow(
    key: beforeContextMenuShow,
    callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeContextMenuShow(
    key: beforeContextMenuShow,
    callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeCopy(
    key: beforeCopy,
    callback: js.UndefOr[
      js.Function2[
        /* data */ js.Array[js.Array[CellValue]], 
        /* coords */ js.Array[RangeType], 
        Unit | Boolean
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeCopy(
    key: beforeCopy,
    callback: js.UndefOr[
      js.Function2[
        /* data */ js.Array[js.Array[CellValue]], 
        /* coords */ js.Array[RangeType], 
        Unit | Boolean
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeCopy(
    key: beforeCopy,
    callback: js.Array[
      js.UndefOr[
        js.Function2[
          /* data */ js.Array[js.Array[CellValue]], 
          /* coords */ js.Array[RangeType], 
          Unit | Boolean
        ]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeCopy(
    key: beforeCopy,
    callback: js.Array[
      js.UndefOr[
        js.Function2[
          /* data */ js.Array[js.Array[CellValue]], 
          /* coords */ js.Array[RangeType], 
          Unit | Boolean
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeCreateCol(
    key: beforeCreateCol,
    callback: js.UndefOr[
      js.Function3[
        /* index */ Double, 
        /* amount */ Double, 
        /* source */ js.UndefOr[ChangeSource], 
        Unit | Boolean
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeCreateCol(
    key: beforeCreateCol,
    callback: js.UndefOr[
      js.Function3[
        /* index */ Double, 
        /* amount */ Double, 
        /* source */ js.UndefOr[ChangeSource], 
        Unit | Boolean
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeCreateCol(
    key: beforeCreateCol,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* index */ Double, 
          /* amount */ Double, 
          /* source */ js.UndefOr[ChangeSource], 
          Unit | Boolean
        ]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeCreateCol(
    key: beforeCreateCol,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* index */ Double, 
          /* amount */ Double, 
          /* source */ js.UndefOr[ChangeSource], 
          Unit | Boolean
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeCreateRow(
    key: beforeCreateRow,
    callback: js.UndefOr[
      js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeCreateRow(
    key: beforeCreateRow,
    callback: js.UndefOr[
      js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeCreateRow(
    key: beforeCreateRow,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeCreateRow(
    key: beforeCreateRow,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeCut(
    key: beforeCut,
    callback: js.UndefOr[
      js.Function2[
        /* data */ js.Array[js.Array[CellValue]], 
        /* coords */ js.Array[RangeType], 
        Unit | Boolean
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeCut(
    key: beforeCut,
    callback: js.UndefOr[
      js.Function2[
        /* data */ js.Array[js.Array[CellValue]], 
        /* coords */ js.Array[RangeType], 
        Unit | Boolean
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeCut(
    key: beforeCut,
    callback: js.Array[
      js.UndefOr[
        js.Function2[
          /* data */ js.Array[js.Array[CellValue]], 
          /* coords */ js.Array[RangeType], 
          Unit | Boolean
        ]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeCut(
    key: beforeCut,
    callback: js.Array[
      js.UndefOr[
        js.Function2[
          /* data */ js.Array[js.Array[CellValue]], 
          /* coords */ js.Array[RangeType], 
          Unit | Boolean
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeDetachChild(
    key: beforeDetachChild,
    callback: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeDetachChild(
    key: beforeDetachChild,
    callback: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeDetachChild(
    key: beforeDetachChild,
    callback: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeDetachChild(
    key: beforeDetachChild,
    callback: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeDropdownMenuSetItems(
    key: beforeDropdownMenuSetItems,
    callback: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeDropdownMenuSetItems(
    key: beforeDropdownMenuSetItems,
    callback: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeDropdownMenuSetItems(
    key: beforeDropdownMenuSetItems,
    callback: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeDropdownMenuSetItems(
    key: beforeDropdownMenuSetItems,
    callback: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeDropdownMenuShow(key: beforeDropdownMenuShow, callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]): Unit = js.native
  @JSName("once")
  def once_beforeDropdownMenuShow(
    key: beforeDropdownMenuShow,
    callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeDropdownMenuShow(
    key: beforeDropdownMenuShow,
    callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeDropdownMenuShow(
    key: beforeDropdownMenuShow,
    callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeFilter(
    key: beforeFilter,
    callback: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeFilter(
    key: beforeFilter,
    callback: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeFilter(
    key: beforeFilter,
    callback: js.Array[
      js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeFilter(
    key: beforeFilter,
    callback: js.Array[
      js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeGetCellMeta(
    key: beforeGetCellMeta,
    callback: js.UndefOr[
      js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeGetCellMeta(
    key: beforeGetCellMeta,
    callback: js.UndefOr[
      js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeGetCellMeta(
    key: beforeGetCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeGetCellMeta(
    key: beforeGetCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeHideColumns(
    key: beforeHideColumns,
    callback: js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeHideColumns(
    key: beforeHideColumns,
    callback: js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeHideColumns(
    key: beforeHideColumns,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeHideColumns(
    key: beforeHideColumns,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeHideRows(
    key: beforeHideRows,
    callback: js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeHideRows(
    key: beforeHideRows,
    callback: js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeHideRows(
    key: beforeHideRows,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeHideRows(
    key: beforeHideRows,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeInit(key: beforeInit, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_beforeInit(key: beforeInit, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_beforeInit(key: beforeInit, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_beforeInit(key: beforeInit, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_beforeInitWalkontable(
    key: beforeInitWalkontable,
    callback: js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeInitWalkontable(
    key: beforeInitWalkontable,
    callback: js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeInitWalkontable(
    key: beforeInitWalkontable,
    callback: js.Array[js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeInitWalkontable(
    key: beforeInitWalkontable,
    callback: js.Array[js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeKeyDown(key: beforeKeyDown, callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]): Unit = js.native
  @JSName("once")
  def once_beforeKeyDown(
    key: beforeKeyDown,
    callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeKeyDown(key: beforeKeyDown, callback: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]): Unit = js.native
  @JSName("once")
  def once_beforeKeyDown(
    key: beforeKeyDown,
    callback: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeLanguageChange(key: beforeLanguageChange, callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]]): Unit = js.native
  @JSName("once")
  def once_beforeLanguageChange(
    key: beforeLanguageChange,
    callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeLanguageChange(
    key: beforeLanguageChange,
    callback: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeLanguageChange(
    key: beforeLanguageChange,
    callback: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeMergeCells(
    key: beforeMergeCells,
    callback: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeMergeCells(
    key: beforeMergeCells,
    callback: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeMergeCells(
    key: beforeMergeCells,
    callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeMergeCells(
    key: beforeMergeCells,
    callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellContextMenu(
    key: beforeOnCellContextMenu,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellContextMenu(
    key: beforeOnCellContextMenu,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellContextMenu(
    key: beforeOnCellContextMenu,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellContextMenu(
    key: beforeOnCellContextMenu,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellMouseDown(
    key: beforeOnCellMouseDown,
    callback: js.UndefOr[
      js.Function4[
        /* event */ MouseEvent, 
        /* coords */ CellCoords, 
        /* TD */ HTMLTableCellElement, 
        /* controller */ SelectionController, 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellMouseDown(
    key: beforeOnCellMouseDown,
    callback: js.UndefOr[
      js.Function4[
        /* event */ MouseEvent, 
        /* coords */ CellCoords, 
        /* TD */ HTMLTableCellElement, 
        /* controller */ SelectionController, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellMouseDown(
    key: beforeOnCellMouseDown,
    callback: js.Array[
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
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellMouseDown(
    key: beforeOnCellMouseDown,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* event */ MouseEvent, 
          /* coords */ CellCoords, 
          /* TD */ HTMLTableCellElement, 
          /* controller */ SelectionController, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellMouseOut(
    key: beforeOnCellMouseOut,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellMouseOut(
    key: beforeOnCellMouseOut,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellMouseOut(
    key: beforeOnCellMouseOut,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellMouseOut(
    key: beforeOnCellMouseOut,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellMouseOver(
    key: beforeOnCellMouseOver,
    callback: js.UndefOr[
      js.Function4[
        /* event */ MouseEvent, 
        /* coords */ CellCoords, 
        /* TD */ HTMLTableCellElement, 
        /* controller */ SelectionController, 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellMouseOver(
    key: beforeOnCellMouseOver,
    callback: js.UndefOr[
      js.Function4[
        /* event */ MouseEvent, 
        /* coords */ CellCoords, 
        /* TD */ HTMLTableCellElement, 
        /* controller */ SelectionController, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellMouseOver(
    key: beforeOnCellMouseOver,
    callback: js.Array[
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
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellMouseOver(
    key: beforeOnCellMouseOver,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* event */ MouseEvent, 
          /* coords */ CellCoords, 
          /* TD */ HTMLTableCellElement, 
          /* controller */ SelectionController, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellMouseUp(
    key: beforeOnCellMouseUp,
    callback: js.UndefOr[
      js.Function4[
        /* event */ MouseEvent, 
        /* coords */ CellCoords, 
        /* TD */ HTMLTableCellElement, 
        /* controller */ SelectionController, 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellMouseUp(
    key: beforeOnCellMouseUp,
    callback: js.UndefOr[
      js.Function4[
        /* event */ MouseEvent, 
        /* coords */ CellCoords, 
        /* TD */ HTMLTableCellElement, 
        /* controller */ SelectionController, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellMouseUp(
    key: beforeOnCellMouseUp,
    callback: js.Array[
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
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellMouseUp(
    key: beforeOnCellMouseUp,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* event */ MouseEvent, 
          /* coords */ CellCoords, 
          /* TD */ HTMLTableCellElement, 
          /* controller */ SelectionController, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforePaste(
    key: beforePaste,
    callback: js.UndefOr[
      js.Function2[
        /* data */ js.Array[js.Array[CellValue]], 
        /* coords */ js.Array[RangeType], 
        Unit | Boolean
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforePaste(
    key: beforePaste,
    callback: js.UndefOr[
      js.Function2[
        /* data */ js.Array[js.Array[CellValue]], 
        /* coords */ js.Array[RangeType], 
        Unit | Boolean
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforePaste(
    key: beforePaste,
    callback: js.Array[
      js.UndefOr[
        js.Function2[
          /* data */ js.Array[js.Array[CellValue]], 
          /* coords */ js.Array[RangeType], 
          Unit | Boolean
        ]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforePaste(
    key: beforePaste,
    callback: js.Array[
      js.UndefOr[
        js.Function2[
          /* data */ js.Array[js.Array[CellValue]], 
          /* coords */ js.Array[RangeType], 
          Unit | Boolean
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRedo(key: beforeRedo, callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]): Unit = js.native
  @JSName("once")
  def once_beforeRedo(
    key: beforeRedo,
    callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRedo(key: beforeRedo, callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]): Unit = js.native
  @JSName("once")
  def once_beforeRedo(
    key: beforeRedo,
    callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRefreshDimensions(
    key: beforeRefreshDimensions,
    callback: js.UndefOr[
      js.Function3[
        /* previousDimensions */ js.Object, 
        /* currentDimensions */ js.Object, 
        /* actionPossible */ Boolean, 
        Boolean | Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeRefreshDimensions(
    key: beforeRefreshDimensions,
    callback: js.UndefOr[
      js.Function3[
        /* previousDimensions */ js.Object, 
        /* currentDimensions */ js.Object, 
        /* actionPossible */ Boolean, 
        Boolean | Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRefreshDimensions(
    key: beforeRefreshDimensions,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* previousDimensions */ js.Object, 
          /* currentDimensions */ js.Object, 
          /* actionPossible */ Boolean, 
          Boolean | Unit
        ]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeRefreshDimensions(
    key: beforeRefreshDimensions,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* previousDimensions */ js.Object, 
          /* currentDimensions */ js.Object, 
          /* actionPossible */ Boolean, 
          Boolean | Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRemoveCellClassNames(key: beforeRemoveCellClassNames, callback: js.UndefOr[js.Function0[js.Array[String] | Unit]]): Unit = js.native
  @JSName("once")
  def once_beforeRemoveCellClassNames(
    key: beforeRemoveCellClassNames,
    callback: js.UndefOr[js.Function0[js.Array[String] | Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRemoveCellClassNames(
    key: beforeRemoveCellClassNames,
    callback: js.Array[js.UndefOr[js.Function0[js.Array[String] | Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeRemoveCellClassNames(
    key: beforeRemoveCellClassNames,
    callback: js.Array[js.UndefOr[js.Function0[js.Array[String] | Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRemoveCellMeta(
    key: beforeRemoveCellMeta,
    callback: js.UndefOr[
      js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeRemoveCellMeta(
    key: beforeRemoveCellMeta,
    callback: js.UndefOr[
      js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRemoveCellMeta(
    key: beforeRemoveCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeRemoveCellMeta(
    key: beforeRemoveCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRemoveCol(
    key: beforeRemoveCol,
    callback: js.UndefOr[
      js.Function4[
        /* index */ Double, 
        /* amount */ Double, 
        /* physicalColumns */ js.Array[Double], 
        /* source */ js.UndefOr[ChangeSource], 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeRemoveCol(
    key: beforeRemoveCol,
    callback: js.UndefOr[
      js.Function4[
        /* index */ Double, 
        /* amount */ Double, 
        /* physicalColumns */ js.Array[Double], 
        /* source */ js.UndefOr[ChangeSource], 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRemoveCol(
    key: beforeRemoveCol,
    callback: js.Array[
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
  ): Unit = js.native
  @JSName("once")
  def once_beforeRemoveCol(
    key: beforeRemoveCol,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* index */ Double, 
          /* amount */ Double, 
          /* physicalColumns */ js.Array[Double], 
          /* source */ js.UndefOr[ChangeSource], 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRemoveRow(
    key: beforeRemoveRow,
    callback: js.UndefOr[
      js.Function4[
        /* index */ Double, 
        /* amount */ Double, 
        /* physicalColumns */ js.Array[Double], 
        /* source */ js.UndefOr[ChangeSource], 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeRemoveRow(
    key: beforeRemoveRow,
    callback: js.UndefOr[
      js.Function4[
        /* index */ Double, 
        /* amount */ Double, 
        /* physicalColumns */ js.Array[Double], 
        /* source */ js.UndefOr[ChangeSource], 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRemoveRow(
    key: beforeRemoveRow,
    callback: js.Array[
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
  ): Unit = js.native
  @JSName("once")
  def once_beforeRemoveRow(
    key: beforeRemoveRow,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* index */ Double, 
          /* amount */ Double, 
          /* physicalColumns */ js.Array[Double], 
          /* source */ js.UndefOr[ChangeSource], 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRender(
    key: beforeRender,
    callback: js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeRender(
    key: beforeRender,
    callback: js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRender(
    key: beforeRender,
    callback: js.Array[
      js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeRender(
    key: beforeRender,
    callback: js.Array[
      js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRenderer(
    key: beforeRenderer,
    callback: js.UndefOr[
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
  ): Unit = js.native
  @JSName("once")
  def once_beforeRenderer(
    key: beforeRenderer,
    callback: js.UndefOr[
      js.Function6[
        /* TD */ HTMLTableCellElement, 
        /* row */ Double, 
        /* col */ Double, 
        /* prop */ String | Double, 
        /* value */ CellValue, 
        /* cellProperties */ CellProperties, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRenderer(
    key: beforeRenderer,
    callback: js.Array[
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
  ): Unit = js.native
  @JSName("once")
  def once_beforeRenderer(
    key: beforeRenderer,
    callback: js.Array[
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
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRowMove(
    key: beforeRowMove,
    callback: js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeRowMove(
    key: beforeRowMove,
    callback: js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRowMove(
    key: beforeRowMove,
    callback: js.Array[
      js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeRowMove(
    key: beforeRowMove,
    callback: js.Array[
      js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRowResize(
    key: beforeRowResize,
    callback: js.UndefOr[
      js.Function3[
        /* currentRow */ Double, 
        /* newSize */ Double, 
        /* isDoubleClick */ Boolean, 
        Double | Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeRowResize(
    key: beforeRowResize,
    callback: js.UndefOr[
      js.Function3[
        /* currentRow */ Double, 
        /* newSize */ Double, 
        /* isDoubleClick */ Boolean, 
        Double | Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRowResize(
    key: beforeRowResize,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentRow */ Double, 
          /* newSize */ Double, 
          /* isDoubleClick */ Boolean, 
          Double | Unit
        ]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeRowResize(
    key: beforeRowResize,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentRow */ Double, 
          /* newSize */ Double, 
          /* isDoubleClick */ Boolean, 
          Double | Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeSetRangeEnd(key: beforeSetRangeEnd, callback: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]): Unit = js.native
  @JSName("once")
  def once_beforeSetRangeEnd(
    key: beforeSetRangeEnd,
    callback: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeSetRangeEnd(
    key: beforeSetRangeEnd,
    callback: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeSetRangeEnd(
    key: beforeSetRangeEnd,
    callback: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeSetRangeStart(key: beforeSetRangeStart, callback: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]): Unit = js.native
  @JSName("once")
  def once_beforeSetRangeStart(
    key: beforeSetRangeStart,
    callback: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeSetRangeStart(
    key: beforeSetRangeStart,
    callback: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeSetRangeStart(
    key: beforeSetRangeStart,
    callback: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeSetRangeStartOnly(key: beforeSetRangeStartOnly, callback: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]): Unit = js.native
  @JSName("once")
  def once_beforeSetRangeStartOnly(
    key: beforeSetRangeStartOnly,
    callback: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeSetRangeStartOnly(
    key: beforeSetRangeStartOnly,
    callback: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeSetRangeStartOnly(
    key: beforeSetRangeStartOnly,
    callback: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeStretchingColumnWidth(
    key: beforeStretchingColumnWidth,
    callback: js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeStretchingColumnWidth(
    key: beforeStretchingColumnWidth,
    callback: js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeStretchingColumnWidth(
    key: beforeStretchingColumnWidth,
    callback: js.Array[
      js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeStretchingColumnWidth(
    key: beforeStretchingColumnWidth,
    callback: js.Array[
      js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeTouchScroll(key: beforeTouchScroll, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_beforeTouchScroll(key: beforeTouchScroll, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_beforeTouchScroll(key: beforeTouchScroll, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_beforeTouchScroll(key: beforeTouchScroll, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_beforeTrimRow(
    key: beforeTrimRow,
    callback: js.UndefOr[
      js.Function3[
        /* currentTrimConfig */ js.Array[Double], 
        /* destinationTrimConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeTrimRow(
    key: beforeTrimRow,
    callback: js.UndefOr[
      js.Function3[
        /* currentTrimConfig */ js.Array[Double], 
        /* destinationTrimConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeTrimRow(
    key: beforeTrimRow,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentTrimConfig */ js.Array[Double], 
          /* destinationTrimConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeTrimRow(
    key: beforeTrimRow,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentTrimConfig */ js.Array[Double], 
          /* destinationTrimConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeUndo(key: beforeUndo, callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]): Unit = js.native
  @JSName("once")
  def once_beforeUndo(
    key: beforeUndo,
    callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeUndo(key: beforeUndo, callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]): Unit = js.native
  @JSName("once")
  def once_beforeUndo(
    key: beforeUndo,
    callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeUnhideColumns(
    key: beforeUnhideColumns,
    callback: js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeUnhideColumns(
    key: beforeUnhideColumns,
    callback: js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeUnhideColumns(
    key: beforeUnhideColumns,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeUnhideColumns(
    key: beforeUnhideColumns,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeUnhideRows(
    key: beforeUnhideRows,
    callback: js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeUnhideRows(
    key: beforeUnhideRows,
    callback: js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeUnhideRows(
    key: beforeUnhideRows,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeUnhideRows(
    key: beforeUnhideRows,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeUnmergeCells(
    key: beforeUnmergeCells,
    callback: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeUnmergeCells(
    key: beforeUnmergeCells,
    callback: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeUnmergeCells(
    key: beforeUnmergeCells,
    callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeUnmergeCells(
    key: beforeUnmergeCells,
    callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeUntrimRow(
    key: beforeUntrimRow,
    callback: js.UndefOr[
      js.Function3[
        /* currentTrimConfig */ js.Array[Double], 
        /* destinationTrimConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeUntrimRow(
    key: beforeUntrimRow,
    callback: js.UndefOr[
      js.Function3[
        /* currentTrimConfig */ js.Array[Double], 
        /* destinationTrimConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeUntrimRow(
    key: beforeUntrimRow,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentTrimConfig */ js.Array[Double], 
          /* destinationTrimConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeUntrimRow(
    key: beforeUntrimRow,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentTrimConfig */ js.Array[Double], 
          /* destinationTrimConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeValidate(
    key: beforeValidate,
    callback: js.UndefOr[
      js.Function4[
        /* value */ CellValue, 
        /* row */ Double, 
        /* prop */ String | Double, 
        /* source */ js.UndefOr[ChangeSource], 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeValidate(
    key: beforeValidate,
    callback: js.UndefOr[
      js.Function4[
        /* value */ CellValue, 
        /* row */ Double, 
        /* prop */ String | Double, 
        /* source */ js.UndefOr[ChangeSource], 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeValidate(
    key: beforeValidate,
    callback: js.Array[
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
  ): Unit = js.native
  @JSName("once")
  def once_beforeValidate(
    key: beforeValidate,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* value */ CellValue, 
          /* row */ Double, 
          /* prop */ String | Double, 
          /* source */ js.UndefOr[ChangeSource], 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeValueRender(
    key: beforeValueRender,
    callback: js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeValueRender(
    key: beforeValueRender,
    callback: js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeValueRender(
    key: beforeValueRender,
    callback: js.Array[
      js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeValueRender(
    key: beforeValueRender,
    callback: js.Array[
      js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_construct(key: construct, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_construct(key: construct, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_construct(key: construct, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_construct(key: construct, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_hiddenColumn(key: hiddenColumn, callback: js.UndefOr[js.Function1[/* column */ Double, Unit]]): Unit = js.native
  @JSName("once")
  def once_hiddenColumn(
    key: hiddenColumn,
    callback: js.UndefOr[js.Function1[/* column */ Double, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_hiddenColumn(key: hiddenColumn, callback: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]]): Unit = js.native
  @JSName("once")
  def once_hiddenColumn(
    key: hiddenColumn,
    callback: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_hiddenRow(key: hiddenRow, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Unit = js.native
  @JSName("once")
  def once_hiddenRow(key: hiddenRow, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_hiddenRow(key: hiddenRow, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Unit = js.native
  @JSName("once")
  def once_hiddenRow(
    key: hiddenRow,
    callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_init(key: init, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_init(key: init, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_init(key: init, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_init(key: init, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_modifyAutofillRange(
    key: modifyAutofillRange,
    callback: js.UndefOr[
      js.Function2[
        /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
        /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_modifyAutofillRange(
    key: modifyAutofillRange,
    callback: js.UndefOr[
      js.Function2[
        /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
        /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyAutofillRange(
    key: modifyAutofillRange,
    callback: js.Array[
      js.UndefOr[
        js.Function2[
          /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
          /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
          Unit
        ]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_modifyAutofillRange(
    key: modifyAutofillRange,
    callback: js.Array[
      js.UndefOr[
        js.Function2[
          /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
          /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyCol(key: modifyCol, callback: js.UndefOr[js.Function1[/* col */ Double, Unit]]): Unit = js.native
  @JSName("once")
  def once_modifyCol(key: modifyCol, callback: js.UndefOr[js.Function1[/* col */ Double, Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_modifyCol(key: modifyCol, callback: js.Array[js.UndefOr[js.Function1[/* col */ Double, Unit]]]): Unit = js.native
  @JSName("once")
  def once_modifyCol(
    key: modifyCol,
    callback: js.Array[js.UndefOr[js.Function1[/* col */ Double, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyColHeader(key: modifyColHeader, callback: js.UndefOr[js.Function1[/* column */ Double, Unit]]): Unit = js.native
  @JSName("once")
  def once_modifyColHeader(
    key: modifyColHeader,
    callback: js.UndefOr[js.Function1[/* column */ Double, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyColHeader(key: modifyColHeader, callback: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]]): Unit = js.native
  @JSName("once")
  def once_modifyColHeader(
    key: modifyColHeader,
    callback: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyColWidth(
    key: modifyColWidth,
    callback: js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_modifyColWidth(
    key: modifyColWidth,
    callback: js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyColWidth(
    key: modifyColWidth,
    callback: js.Array[js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_modifyColWidth(
    key: modifyColWidth,
    callback: js.Array[js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyColumnHeaderHeight(key: modifyColumnHeaderHeight, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_modifyColumnHeaderHeight(key: modifyColumnHeaderHeight, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_modifyColumnHeaderHeight(key: modifyColumnHeaderHeight, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_modifyColumnHeaderHeight(
    key: modifyColumnHeaderHeight,
    callback: js.Array[js.UndefOr[js.Function0[Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyCopyableRange(
    key: modifyCopyableRange,
    callback: js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_modifyCopyableRange(
    key: modifyCopyableRange,
    callback: js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyCopyableRange(
    key: modifyCopyableRange,
    callback: js.Array[js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_modifyCopyableRange(
    key: modifyCopyableRange,
    callback: js.Array[js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyGetCellCoords(
    key: modifyGetCellCoords,
    callback: js.UndefOr[
      js.Function3[
        /* row */ Double, 
        /* column */ Double, 
        /* topmost */ Boolean, 
        Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_modifyGetCellCoords(
    key: modifyGetCellCoords,
    callback: js.UndefOr[
      js.Function3[
        /* row */ Double, 
        /* column */ Double, 
        /* topmost */ Boolean, 
        Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyGetCellCoords(
    key: modifyGetCellCoords,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* row */ Double, 
          /* column */ Double, 
          /* topmost */ Boolean, 
          Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
        ]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_modifyGetCellCoords(
    key: modifyGetCellCoords,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* row */ Double, 
          /* column */ Double, 
          /* topmost */ Boolean, 
          Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyRow(key: modifyRow, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Unit = js.native
  @JSName("once")
  def once_modifyRow(key: modifyRow, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_modifyRow(key: modifyRow, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Unit = js.native
  @JSName("once")
  def once_modifyRow(
    key: modifyRow,
    callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyRowData(key: modifyRowData, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Unit = js.native
  @JSName("once")
  def once_modifyRowData(
    key: modifyRowData,
    callback: js.UndefOr[js.Function1[/* row */ Double, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyRowData(key: modifyRowData, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Unit = js.native
  @JSName("once")
  def once_modifyRowData(
    key: modifyRowData,
    callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyRowHeader(key: modifyRowHeader, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Unit = js.native
  @JSName("once")
  def once_modifyRowHeader(
    key: modifyRowHeader,
    callback: js.UndefOr[js.Function1[/* row */ Double, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyRowHeader(key: modifyRowHeader, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Unit = js.native
  @JSName("once")
  def once_modifyRowHeader(
    key: modifyRowHeader,
    callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyRowHeaderWidth(key: modifyRowHeaderWidth, callback: js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]): Unit = js.native
  @JSName("once")
  def once_modifyRowHeaderWidth(
    key: modifyRowHeaderWidth,
    callback: js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyRowHeaderWidth(
    key: modifyRowHeaderWidth,
    callback: js.Array[js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_modifyRowHeaderWidth(
    key: modifyRowHeaderWidth,
    callback: js.Array[js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyRowHeight(
    key: modifyRowHeight,
    callback: js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_modifyRowHeight(
    key: modifyRowHeight,
    callback: js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyRowHeight(
    key: modifyRowHeight,
    callback: js.Array[js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_modifyRowHeight(
    key: modifyRowHeight,
    callback: js.Array[js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyRowSourceData(key: modifyRowSourceData, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Unit = js.native
  @JSName("once")
  def once_modifyRowSourceData(
    key: modifyRowSourceData,
    callback: js.UndefOr[js.Function1[/* row */ Double, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyRowSourceData(key: modifyRowSourceData, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Unit = js.native
  @JSName("once")
  def once_modifyRowSourceData(
    key: modifyRowSourceData,
    callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyTransformEnd(key: modifyTransformEnd, callback: js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]): Unit = js.native
  @JSName("once")
  def once_modifyTransformEnd(
    key: modifyTransformEnd,
    callback: js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyTransformEnd(
    key: modifyTransformEnd,
    callback: js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_modifyTransformEnd(
    key: modifyTransformEnd,
    callback: js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyTransformStart(key: modifyTransformStart, callback: js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]): Unit = js.native
  @JSName("once")
  def once_modifyTransformStart(
    key: modifyTransformStart,
    callback: js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyTransformStart(
    key: modifyTransformStart,
    callback: js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_modifyTransformStart(
    key: modifyTransformStart,
    callback: js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_persistentStateLoad(
    key: persistentStateLoad,
    callback: js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_persistentStateLoad(
    key: persistentStateLoad,
    callback: js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_persistentStateLoad(
    key: persistentStateLoad,
    callback: js.Array[
      js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_persistentStateLoad(
    key: persistentStateLoad,
    callback: js.Array[
      js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_persistentStateReset(key: persistentStateReset, callback: js.UndefOr[js.Function1[/* key */ String, Unit]]): Unit = js.native
  @JSName("once")
  def once_persistentStateReset(
    key: persistentStateReset,
    callback: js.UndefOr[js.Function1[/* key */ String, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_persistentStateReset(key: persistentStateReset, callback: js.Array[js.UndefOr[js.Function1[/* key */ String, Unit]]]): Unit = js.native
  @JSName("once")
  def once_persistentStateReset(
    key: persistentStateReset,
    callback: js.Array[js.UndefOr[js.Function1[/* key */ String, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_persistentStateSave(
    key: persistentStateSave,
    callback: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_persistentStateSave(
    key: persistentStateSave,
    callback: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_persistentStateSave(
    key: persistentStateSave,
    callback: js.Array[js.UndefOr[js.Function2[/* key */ String, /* value */ _, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_persistentStateSave(
    key: persistentStateSave,
    callback: js.Array[js.UndefOr[js.Function2[/* key */ String, /* value */ _, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_skipLengthCache(key: skipLengthCache, callback: js.UndefOr[js.Function1[/* delay */ Double, Unit]]): Unit = js.native
  @JSName("once")
  def once_skipLengthCache(
    key: skipLengthCache,
    callback: js.UndefOr[js.Function1[/* delay */ Double, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_skipLengthCache(key: skipLengthCache, callback: js.Array[js.UndefOr[js.Function1[/* delay */ Double, Unit]]]): Unit = js.native
  @JSName("once")
  def once_skipLengthCache(
    key: skipLengthCache,
    callback: js.Array[js.UndefOr[js.Function1[/* delay */ Double, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_unmodifyCol(key: unmodifyCol, callback: js.UndefOr[js.Function1[/* col */ Double, Unit]]): Unit = js.native
  @JSName("once")
  def once_unmodifyCol(
    key: unmodifyCol,
    callback: js.UndefOr[js.Function1[/* col */ Double, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_unmodifyCol(key: unmodifyCol, callback: js.Array[js.UndefOr[js.Function1[/* col */ Double, Unit]]]): Unit = js.native
  @JSName("once")
  def once_unmodifyCol(
    key: unmodifyCol,
    callback: js.Array[js.UndefOr[js.Function1[/* col */ Double, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_unmodifyRow(key: unmodifyRow, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Unit = js.native
  @JSName("once")
  def once_unmodifyRow(
    key: unmodifyRow,
    callback: js.UndefOr[js.Function1[/* row */ Double, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_unmodifyRow(key: unmodifyRow, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Unit = js.native
  @JSName("once")
  def once_unmodifyRow(
    key: unmodifyRow,
    callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]],
    context: Handsontable
  ): Unit = js.native
  def register(key: String): Unit = js.native
  def remove(
    key: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 161 */ js.Any,
    callback: js.Function
  ): Boolean = js.native
  def remove(
    key: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 161 */ js.Any,
    callback: js.Function,
    context: Handsontable
  ): Boolean = js.native
  def run(
    context: Handsontable,
    key: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 161 */ js.Any,
    p1: js.UndefOr[js.Any],
    p2: js.UndefOr[js.Any],
    p3: js.UndefOr[js.Any],
    p4: js.UndefOr[js.Any],
    p5: js.UndefOr[js.Any],
    p6: js.UndefOr[js.Any]
  ): js.Any = js.native
}

