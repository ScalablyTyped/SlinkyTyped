package typingsSlinky.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggered for every Kanban action before its starts.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.native
  /** Triggered for every Kanban action success event.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.native
  /** Triggered for every Kanban action server failure event.
    */
  var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, Unit]] = js.native
  /** Gets or sets a value that indicates whether to enable allowDragAndDrop behavior on Kanban.
    * @Default {true}
    */
  var allowDragAndDrop: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable drag and drop behavior between Kanban controls.
    * @Default {false}
    */
  var allowExternalDragAndDrop: js.UndefOr[Boolean] = js.native
  /** To enable filtering behavior on Kanban.User can specify query in filterSettings collection after enabling allowFiltering.
    * @Default {false}
    */
  var allowFiltering: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to allow card hover actions.
    * @Default {true}
    */
  var allowHover: js.UndefOr[Boolean] = js.native
  /** To allow keyboard navigation actions.
    * @Default {false}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable printing option.
    * @Default {false}
    */
  var allowPrinting: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable the scrollbar in the Kanban and view the card by scroll through the Kanban manually.
    * @Default {false}
    */
  var allowScrolling: js.UndefOr[Boolean] = js.native
  /** To enable Searching operation in Kanban.
    * @Default {false}
    */
  var allowSearching: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable allowSelection behavior on Kanban.User can select card and the selected card will be highlighted on Kanban.
    * @Default {true}
    */
  var allowSelection: js.UndefOr[Boolean] = js.native
  /** To enable or disable the title of the card.
    * @Default {false}
    */
  var allowTitle: js.UndefOr[Boolean] = js.native
  /** To enable or disable the column expand /collapse.
    * @Default {false}
    */
  var allowToggleColumn: js.UndefOr[Boolean] = js.native
  /** Triggered before the card is selected.
    */
  var beforeCardSelect: js.UndefOr[js.Function1[/* e */ BeforeCardSelectEventArgs, Unit]] = js.native
  /** Triggered before the task is going to be edited.
    */
  var beginEdit: js.UndefOr[js.Function1[/* e */ BeginEditEventArgs, Unit]] = js.native
  /** Trigger after the card is clicked.
    */
  var cardClick: js.UndefOr[js.Function1[/* e */ CardClickEventArgs, Unit]] = js.native
  /** Triggered when card is double clicked.
    */
  var cardDoubleClick: js.UndefOr[js.Function1[/* e */ CardDoubleClickEventArgs, Unit]] = js.native
  /** Triggered when the card is being dragged.
    */
  var cardDrag: js.UndefOr[js.Function1[/* e */ CardDragEventArgs, Unit]] = js.native
  /** Triggered when card dragging start.
    */
  var cardDragStart: js.UndefOr[js.Function1[/* e */ CardDragStartEventArgs, Unit]] = js.native
  /** Triggered when card dragging stops.
    */
  var cardDragStop: js.UndefOr[js.Function1[/* e */ CardDragStopEventArgs, Unit]] = js.native
  /** Triggered when the card is Dropped.
    */
  var cardDrop: js.UndefOr[js.Function1[/* e */ CardDropEventArgs, Unit]] = js.native
  /** Triggered after the card is selected.
    */
  var cardSelect: js.UndefOr[js.Function1[/* e */ CardSelectEventArgs, Unit]] = js.native
  /** Triggered before the card is selected.
    */
  var cardSelecting: js.UndefOr[js.Function1[/* e */ CardSelectingEventArgs, Unit]] = js.native
  /** Gets or sets an object that indicates whether to Customize the card settings.
    * @Default {Object}
    */
  var cardSettings: js.UndefOr[CardSettings] = js.native
  /** Triggers after the cell is clicked.
    */
  var cellClick: js.UndefOr[js.Function1[/* e */ CellClickEventArgs, Unit]] = js.native
  /** Gets or sets an object that indicates to render the Kanban with specified columns.
    * @Default {Array}
    */
  var columns: js.UndefOr[js.Array[Column]] = js.native
  /** Triggered when context menu item is clicked in Kanban
    */
  var contextClick: js.UndefOr[js.Function1[/* e */ ContextClickEventArgs, Unit]] = js.native
  /** Gets or sets an object that indicates whether to customize the context menu behavior of the Kanban.
    * @Default {Object}
    */
  var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.native
  /** Triggered before the context menu is opened.
    */
  var contextOpen: js.UndefOr[js.Function1[/* e */ ContextOpenEventArgs, Unit]] = js.native
  /** Triggered when the Kanban is rendered completely
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Gets or sets a value that indicates to render the Kanban with custom theme.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates whether to add customToolbarItems within the toolbar to perform any action in the Kanban.
    * @Default {[]}
    */
  var customToolbarItems: js.UndefOr[js.Array[CustomToolbarItem]] = js.native
  /** Triggered the Kanban is bound with data during initial rendering.
    */
  var dataBound: js.UndefOr[js.Function1[/* e */ DataBoundEventArgs, Unit]] = js.native
  /** Gets or sets the data to render the Kanban with cards.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /** Triggered when Kanban going to destroy.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Get or sets an object that indicates whether to customize the editing behavior of the Kanban.
    * @Default {Object}
    */
  var editSettings: js.UndefOr[EditSettings] = js.native
  /** Align content in the Kanban control align from right to left by setting the property as true.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** To show total count of cards in each column.
    * @Default {false}
    */
  var enableTotalCount: js.UndefOr[Boolean] = js.native
  /** To perform kanban functionalities with touch interaction.
    * @Default {true}
    */
  var enableTouch: js.UndefOr[Boolean] = js.native
  /** Triggered after the card is deleted.
    */
  var endDelete: js.UndefOr[js.Function1[/* e */ EndDeleteEventArgs, Unit]] = js.native
  /** Triggered after the card is edited.
    */
  var endEdit: js.UndefOr[js.Function1[/* e */ EndEditEventArgs, Unit]] = js.native
  /** To customize field mappings for card , editing title and control key parameters
    * @Default {Object}
    */
  var fields: js.UndefOr[Fields] = js.native
  /** To customize the filtering behavior based on queries given.
    * @Default {Array}
    */
  var filterSettings: js.UndefOr[js.Array[FilterSetting]] = js.native
  /** Triggers after the header is clicked.
    */
  var headerClick: js.UndefOr[js.Function1[/* e */ HeaderClickEventArgs, Unit]] = js.native
  /** When set to true, adapts the Kanban layout to fit the screen size of devices on which it renders.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** To map datasource field for column values mapping
    * @Default {null}
    */
  var keyField: js.UndefOr[String] = js.native
  /** To change the key in keyboard interaction to Kanban control.
    * @Default {null}
    */
  var keySettings: js.UndefOr[js.Any] = js.native
  /** Triggered initial load.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  /** Gets or sets a value that indicates whether to customizing the user interface (UI) as locale-specific in order to display regional data i.e. in a language and culture specific to
    * a particular country or region.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates whether to set the minimum width of the responsive Kanban while isResponsive property is true.
    * @Default {0}
    */
  var minWidth: js.UndefOr[Double] = js.native
  /** ej Query to query database of Kanban.
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.native
  /** Triggered every time a single card rendered request is made to access particular card information.
    */
  var queryCellInfo: js.UndefOr[js.Function1[/* e */ QueryCellInfoEventArgs, Unit]] = js.native
  /** Gets or sets an object that indicates whether to customize the scrolling behavior of the Kanban.
    * @Default {Object}
    */
  var scrollSettings: js.UndefOr[ScrollSettings] = js.native
  /** To customize the searching behavior of the Kanban.
    * @Default {Object}
    */
  var searchSettings: js.UndefOr[SearchSettings] = js.native
  /** To allow customize selection type. Accepting types are &quot;single&quot; and &quot;multiple&quot;.
    * @Default {ej.Kanban.SelectionType.Single}
    */
  var selectionType: js.UndefOr[SelectionType | String] = js.native
  /** Gets or sets a value that indicates whether to render kanban columns using without data source.
    * @Default {false}
    */
  var showColumnWhenEmpty: js.UndefOr[Boolean] = js.native
  /** Gets or sets an object that indicates to managing the collection of stacked header rows for the Kanban.
    * @Default {Array}
    */
  var stackedHeaderRows: js.UndefOr[js.Array[StackedHeaderRow]] = js.native
  /** Triggers before swim lane expand or collapse icon is clicked.
    */
  var swimlaneClick: js.UndefOr[js.Function1[/* e */ SwimlaneClickEventArgs, Unit]] = js.native
  /** Customize the settings for swim lane.
    * @Default {Object}
    */
  var swimlaneSettings: js.UndefOr[SwimlaneSettings] = js.native
  /** Triggered when toolbar item is clicked in Kanban.
    */
  var toolbarClick: js.UndefOr[js.Function1[/* e */ ToolbarClickEventArgs, Unit]] = js.native
  /** The tooltip allows to display card details in a tooltip while hovering on it.
    */
  var tooltipSettings: js.UndefOr[TooltipSettings] = js.native
  /** Gets or sets an object that indicates to render the Kanban with specified workflows.
    * @Default {Array}
    */
  var workflows: js.UndefOr[js.Array[Workflow]] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionBegin(value: /* e */ ActionBeginEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionBegin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionBegin")(js.undefined)
        ret
    }
    @scala.inline
    def withActionComplete(value: /* e */ ActionCompleteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withActionFailure(value: /* e */ ActionFailureEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionFailure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDragAndDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDragAndDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDragAndDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDragAndDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowExternalDragAndDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExternalDragAndDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowExternalDragAndDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExternalDragAndDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowFiltering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFiltering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFiltering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFiltering")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHover")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowKeyboardNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowKeyboardNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowKeyboardNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowKeyboardNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowPrinting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPrinting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowPrinting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPrinting")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowScrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSearching(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSearching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSearching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSearching")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowToggleColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowToggleColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowToggleColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowToggleColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeCardSelect(value: /* e */ BeforeCardSelectEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCardSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeCardSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCardSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withBeginEdit(value: /* e */ BeginEditEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginEdit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeginEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withCardClick(value: /* e */ CardClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCardClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardClick")(js.undefined)
        ret
    }
    @scala.inline
    def withCardDoubleClick(value: /* e */ CardDoubleClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardDoubleClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCardDoubleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withCardDrag(value: /* e */ CardDragEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCardDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withCardDragStart(value: /* e */ CardDragStartEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardDragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCardDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withCardDragStop(value: /* e */ CardDragStopEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardDragStop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCardDragStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardDragStop")(js.undefined)
        ret
    }
    @scala.inline
    def withCardDrop(value: /* e */ CardDropEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardDrop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCardDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withCardSelect(value: /* e */ CardSelectEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCardSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withCardSelecting(value: /* e */ CardSelectingEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardSelecting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCardSelecting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardSelecting")(js.undefined)
        ret
    }
    @scala.inline
    def withCardSettings(value: CardSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withCellClick(value: /* e */ CellClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellClick")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[Column]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withContextClick(value: /* e */ ContextClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContextClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextClick")(js.undefined)
        ret
    }
    @scala.inline
    def withContextMenuSettings(value: ContextMenuSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenuSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withContextOpen(value: /* e */ ContextOpenEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContextOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: /* e */ CreateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomToolbarItems(value: js.Array[CustomToolbarItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customToolbarItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomToolbarItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customToolbarItems")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBound(value: /* e */ DataBoundEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* e */ DestroyEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withEditSettings(value: EditSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTotalCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTotalCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTotalCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTotalCount")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTouch")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDelete(value: /* e */ EndDeleteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDelete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEndDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withEndEdit(value: /* e */ EndEditEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endEdit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEndEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: Fields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterSettings(value: js.Array[FilterSetting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderClick(value: /* e */ HeaderClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHeaderClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClick")(js.undefined)
        ret
    }
    @scala.inline
    def withIsResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyField")(js.undefined)
        ret
    }
    @scala.inline
    def withKeySettings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeySettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySettings")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: /* e */ LoadEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryCellInfo(value: /* e */ QueryCellInfoEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryCellInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutQueryCellInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryCellInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollSettings(value: ScrollSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchSettings(value: SearchSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionType(value: SelectionType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionType")(js.undefined)
        ret
    }
    @scala.inline
    def withShowColumnWhenEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnWhenEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowColumnWhenEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnWhenEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withStackedHeaderRows(value: js.Array[StackedHeaderRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedHeaderRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackedHeaderRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedHeaderRows")(js.undefined)
        ret
    }
    @scala.inline
    def withSwimlaneClick(value: /* e */ SwimlaneClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swimlaneClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSwimlaneClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swimlaneClick")(js.undefined)
        ret
    }
    @scala.inline
    def withSwimlaneSettings(value: SwimlaneSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swimlaneSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwimlaneSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swimlaneSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarClick(value: /* e */ ToolbarClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToolbarClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarClick")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipSettings(value: TooltipSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkflows(value: js.Array[Workflow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkflows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflows")(js.undefined)
        ret
    }
  }
  
}

