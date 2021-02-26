package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridColumnMoving
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Specifies if header cells should include an additional button that opens a moving helper dropdown.
    *
    */
  var addMovingDropdown: js.UndefOr[Boolean] = js.native
  
  /**
    * Event which is fired when a drag operation is canceled
    */
  var columnDragCanceled: js.UndefOr[ColumnDragCanceledEvent] = js.native
  
  /**
    * Event which is fired when a drag operation ends on a column header
    */
  var columnDragEnd: js.UndefOr[ColumnDragEndEvent] = js.native
  
  /**
    * Event which is fired when a drag operation begins on a column header
    */
  var columnDragStart: js.UndefOr[ColumnDragStartEvent] = js.native
  
  /**
    * Event which is fired when a column moving operation completes
    */
  var columnMoved: js.UndefOr[ColumnMovedEvent] = js.native
  
  /**
    * Event which is fired when a column moving operation is initiated
    */
  var columnMoving: js.UndefOr[ColumnMovingEvent] = js.native
  
  /**
    * Controls containment behavior of column moving dialog.
    *
    *                 owner  The dialog will be draggable only in the grid area
    *                 window  The dialog will be draggable in the whole window area
    */
  var columnMovingDialogContainment: js.UndefOr[String] = js.native
  
  /**
    * A list of column settings that specifies moving options on a per column basis.
    *
    */
  var columnSettings: js.UndefOr[js.Array[IgGridColumnMovingColumnSetting]] = js.native
  
  /**
    * Name of the dialog widget to be used. It should inherit from $.ui.igGridModalDialog.
    *
    */
  var dialogWidget: js.UndefOr[String] = js.native
  
  /**
    * Specifies the opacity of the drag markup, while a column header is being dragged.
    * The value must be between 0 and 1. When GroupBy is enabled, the corresponding option in the GroupBy configuration
    * will be used with priority over this one.
    *
    */
  var dragHelperOpacity: js.UndefOr[Double] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption for the move last dropdown button. Use option [locale.dropDownMoveFirstText](ui.iggridcolumnmoving#options:locale.dropDownMoveFirstText).
    */
  var dropDownMoveFirstText: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption for the move last dropdown button. Use option [locale.dropDownMoveLastText](ui.iggridcolumnmoving#options:locale.dropDownMoveLastText).
    */
  var dropDownMoveLastText: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption for the move left dropdown button. Use option [locale.dropDownMoveLeftText](ui.iggridcolumnmoving#options:locale.dropDownMoveLeftText).
    */
  var dropDownMoveLeftText: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption for the move right dropdown button. Use option [locale.dropDownMoveRightText](ui.iggridcolumnmoving#options:locale.dropDownMoveRightText).
    */
  var dropDownMoveRightText: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption text for the feature chooser submenu button. Use option [locale.featureChooserSubmenuText](ui.iggridcolumnmoving#options:locale.featureChooserSubmenuText).
    */
  var featureChooserSubmenuText: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether the contents of the column being dragged will get hidden. The option is only
    * relevant in immediate moving mode.
    *
    */
  var hideHeaderContentsDuringDrag: js.UndefOr[Boolean] = js.native
  
  /**
    * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.native
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  
  var locale: js.UndefOr[IgGridColumnMovingLocale] = js.native
  
  /**
    * Specify the drag-and-drop mode for the feature
    *
    *
    * Valid values:
    * "immediate" Column headers will rearange as you drag with a space opening under the cursor for the header to be dropped on
    * "deferred" A clone of the header dragged will be created and indicators will be shown between columns to help navigate the drop.
    */
  var mode: js.UndefOr[String] = js.native
  
  /**
    * Specify the way columns will be rearranged
    *
    *
    * Valid values:
    * "dom" Columns will be rearranged through dom manipulation
    * "render" Columns will not be rearranged but the grid will be rendered again with the new column order. Please note this option is incompatible with immediate move mode.
    */
  var moveType: js.UndefOr[String] = js.native
  
  /**
    * Specifies the length (in pixels) between the dragged column and the column edges below which the move operation is accepted
    *
    */
  var movingAcceptanceTolerance: js.UndefOr[Double] = js.native
  
  /**
    * Specifies time in milliseconds for animation duration to show/hide modal dialog
    *
    */
  var movingDialogAnimationDuration: js.UndefOr[Double] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption for each move up button in the column moving dialog. Use option [locale.movingDialogCaptionButtonAsc](ui.iggridcolumnmoving#options:locale.movingDialogCaptionButtonAsc).
    */
  var movingDialogCaptionButtonAsc: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption for each move down button in the column moving dialog. Use option [locale.movingDialogCaptionButtonDesc](ui.iggridcolumnmoving#options:locale.movingDialogCaptionButtonDesc).
    */
  var movingDialogCaptionButtonDesc: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption text for the column moving dialog. Use option [locale.movingDialogCaptionText](ui.iggridcolumnmoving#options:locale.movingDialogCaptionText).
    */
  var movingDialogCaptionText: js.UndefOr[String] = js.native
  
  /**
    * Event fired after the moving dialog has been closed.
    */
  var movingDialogClosed: js.UndefOr[MovingDialogClosedEvent] = js.native
  
  /**
    * Event fired before the moving dialog is closed.
    */
  var movingDialogClosing: js.UndefOr[MovingDialogClosingEvent] = js.native
  
  /**
    * Event fired after the contents of the model dialog are rendered.
    */
  var movingDialogContentsRendered: js.UndefOr[MovingDialogContentsRenderedEvent] = js.native
  
  /**
    * Event fired before the contents of the model dialog are rendered.
    */
  var movingDialogContentsRendering: js.UndefOr[MovingDialogContentsRenderingEvent] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption text for the feature chooser entry. Use option [locale.movingDialogDisplayText](ui.iggridcolumnmoving#options:locale.movingDialogDisplayText).
    */
  var movingDialogDisplayText: js.UndefOr[String] = js.native
  
  /**
    * Event fired when column moving is completed through dragging it in the moving dialog
    */
  var movingDialogDragColumnMoved: js.UndefOr[MovingDialogDragColumnMovedEvent] = js.native
  
  /**
    * Event fired when column moving is initiated through dragging it in the moving dialog
    */
  var movingDialogDragColumnMoving: js.UndefOr[MovingDialogDragColumnMovingEvent] = js.native
  
  /**
    * Event fired every time the moving dialog changes its position.
    */
  var movingDialogDragged: js.UndefOr[MovingDialogDraggedEvent] = js.native
  
  /**
    * Specifies markup for drop tooltip in column moving dialog
    *
    */
  var movingDialogDropTooltipMarkup: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies text for drop tooltip in column moving dialog. Use option [locale.movingDialogDropTooltipText](ui.iggridcolumnmoving#options:locale.movingDialogDropTooltipText).
    */
  var movingDialogDropTooltipText: js.UndefOr[String] = js.native
  
  /**
    * Specifies height of column moving dialog
    *
    */
  var movingDialogHeight: js.UndefOr[Double] = js.native
  
  /**
    * Event fired when move down button is pressed in the moving dialog
    */
  var movingDialogMoveDownButtonPressed: js.UndefOr[MovingDialogMoveDownButtonPressedEvent] = js.native
  
  /**
    * Event fired when move up button is pressed in the moving dialog
    */
  var movingDialogMoveUpButtonPressed: js.UndefOr[MovingDialogMoveUpButtonPressedEvent] = js.native
  
  /**
    * Event fired after the column chooser is already opened.
    */
  var movingDialogOpened: js.UndefOr[MovingDialogOpenedEvent] = js.native
  
  /**
    * Event fired before the moving dialog is opened.
    */
  var movingDialogOpening: js.UndefOr[MovingDialogOpeningEvent] = js.native
  
  /**
    * Specifies width of column moving dialog
    *
    */
  var movingDialogWidth: js.UndefOr[Double] = js.native
  
  /**
    * Specifies the length (in pixels) between the dragged column and the grid edges below which horizontal scrolling occurs
    *
    */
  var movingScrollTolerance: js.UndefOr[Double] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption text for the feature chooser submenu button. Use option [locale.movingToolTipMove](ui.iggridcolumnmoving#options:locale.movingToolTipMove).
    */
  var movingToolTipMove: js.UndefOr[String] = js.native
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  
  /**
    * Specifies the length (in pixels) of each individual scroll operation
    *
    */
  var scrollDelta: js.UndefOr[Double] = js.native
  
  /**
    * Specifies a multiplier for the delay between subsequent scroll operations. The larger this number is, the slower scrolling will appear to be.
    *
    */
  var scrollSpeedMultiplier: js.UndefOr[Double] = js.native
}
object IgGridColumnMoving {
  
  @scala.inline
  def apply(): IgGridColumnMoving = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridColumnMoving]
  }
  
  @scala.inline
  implicit class IgGridColumnMovingMutableBuilder[Self <: IgGridColumnMoving] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddMovingDropdown(value: Boolean): Self = StObject.set(x, "addMovingDropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddMovingDropdownUndefined: Self = StObject.set(x, "addMovingDropdown", js.undefined)
    
    @scala.inline
    def setColumnDragCanceled(value: (/* event */ Event, /* ui */ ColumnDragCanceledEventUIParam) => Unit): Self = StObject.set(x, "columnDragCanceled", js.Any.fromFunction2(value))
    
    @scala.inline
    def setColumnDragCanceledUndefined: Self = StObject.set(x, "columnDragCanceled", js.undefined)
    
    @scala.inline
    def setColumnDragEnd(value: (/* event */ Event, /* ui */ ColumnDragEndEventUIParam) => Unit): Self = StObject.set(x, "columnDragEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setColumnDragEndUndefined: Self = StObject.set(x, "columnDragEnd", js.undefined)
    
    @scala.inline
    def setColumnDragStart(value: (/* event */ Event, /* ui */ ColumnDragStartEventUIParam) => Unit): Self = StObject.set(x, "columnDragStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def setColumnDragStartUndefined: Self = StObject.set(x, "columnDragStart", js.undefined)
    
    @scala.inline
    def setColumnMoved(value: (/* event */ Event, /* ui */ ColumnMovedEventUIParam) => Unit): Self = StObject.set(x, "columnMoved", js.Any.fromFunction2(value))
    
    @scala.inline
    def setColumnMovedUndefined: Self = StObject.set(x, "columnMoved", js.undefined)
    
    @scala.inline
    def setColumnMoving(value: (/* event */ Event, /* ui */ ColumnMovingEventUIParam) => Unit): Self = StObject.set(x, "columnMoving", js.Any.fromFunction2(value))
    
    @scala.inline
    def setColumnMovingDialogContainment(value: String): Self = StObject.set(x, "columnMovingDialogContainment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnMovingDialogContainmentUndefined: Self = StObject.set(x, "columnMovingDialogContainment", js.undefined)
    
    @scala.inline
    def setColumnMovingUndefined: Self = StObject.set(x, "columnMoving", js.undefined)
    
    @scala.inline
    def setColumnSettings(value: js.Array[IgGridColumnMovingColumnSetting]): Self = StObject.set(x, "columnSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnSettingsUndefined: Self = StObject.set(x, "columnSettings", js.undefined)
    
    @scala.inline
    def setColumnSettingsVarargs(value: IgGridColumnMovingColumnSetting*): Self = StObject.set(x, "columnSettings", js.Array(value :_*))
    
    @scala.inline
    def setDialogWidget(value: String): Self = StObject.set(x, "dialogWidget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogWidgetUndefined: Self = StObject.set(x, "dialogWidget", js.undefined)
    
    @scala.inline
    def setDragHelperOpacity(value: Double): Self = StObject.set(x, "dragHelperOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragHelperOpacityUndefined: Self = StObject.set(x, "dragHelperOpacity", js.undefined)
    
    @scala.inline
    def setDropDownMoveFirstText(value: String): Self = StObject.set(x, "dropDownMoveFirstText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDownMoveFirstTextUndefined: Self = StObject.set(x, "dropDownMoveFirstText", js.undefined)
    
    @scala.inline
    def setDropDownMoveLastText(value: String): Self = StObject.set(x, "dropDownMoveLastText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDownMoveLastTextUndefined: Self = StObject.set(x, "dropDownMoveLastText", js.undefined)
    
    @scala.inline
    def setDropDownMoveLeftText(value: String): Self = StObject.set(x, "dropDownMoveLeftText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDownMoveLeftTextUndefined: Self = StObject.set(x, "dropDownMoveLeftText", js.undefined)
    
    @scala.inline
    def setDropDownMoveRightText(value: String): Self = StObject.set(x, "dropDownMoveRightText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDownMoveRightTextUndefined: Self = StObject.set(x, "dropDownMoveRightText", js.undefined)
    
    @scala.inline
    def setFeatureChooserSubmenuText(value: String): Self = StObject.set(x, "featureChooserSubmenuText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureChooserSubmenuTextUndefined: Self = StObject.set(x, "featureChooserSubmenuText", js.undefined)
    
    @scala.inline
    def setHideHeaderContentsDuringDrag(value: Boolean): Self = StObject.set(x, "hideHeaderContentsDuringDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideHeaderContentsDuringDragUndefined: Self = StObject.set(x, "hideHeaderContentsDuringDrag", js.undefined)
    
    @scala.inline
    def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLocale(value: IgGridColumnMovingLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setMoveType(value: String): Self = StObject.set(x, "moveType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveTypeUndefined: Self = StObject.set(x, "moveType", js.undefined)
    
    @scala.inline
    def setMovingAcceptanceTolerance(value: Double): Self = StObject.set(x, "movingAcceptanceTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovingAcceptanceToleranceUndefined: Self = StObject.set(x, "movingAcceptanceTolerance", js.undefined)
    
    @scala.inline
    def setMovingDialogAnimationDuration(value: Double): Self = StObject.set(x, "movingDialogAnimationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovingDialogAnimationDurationUndefined: Self = StObject.set(x, "movingDialogAnimationDuration", js.undefined)
    
    @scala.inline
    def setMovingDialogCaptionButtonAsc(value: String): Self = StObject.set(x, "movingDialogCaptionButtonAsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovingDialogCaptionButtonAscUndefined: Self = StObject.set(x, "movingDialogCaptionButtonAsc", js.undefined)
    
    @scala.inline
    def setMovingDialogCaptionButtonDesc(value: String): Self = StObject.set(x, "movingDialogCaptionButtonDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovingDialogCaptionButtonDescUndefined: Self = StObject.set(x, "movingDialogCaptionButtonDesc", js.undefined)
    
    @scala.inline
    def setMovingDialogCaptionText(value: String): Self = StObject.set(x, "movingDialogCaptionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovingDialogCaptionTextUndefined: Self = StObject.set(x, "movingDialogCaptionText", js.undefined)
    
    @scala.inline
    def setMovingDialogClosed(value: (/* event */ Event, /* ui */ MovingDialogClosedEventUIParam) => Unit): Self = StObject.set(x, "movingDialogClosed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMovingDialogClosedUndefined: Self = StObject.set(x, "movingDialogClosed", js.undefined)
    
    @scala.inline
    def setMovingDialogClosing(value: (/* event */ Event, /* ui */ MovingDialogClosingEventUIParam) => Unit): Self = StObject.set(x, "movingDialogClosing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMovingDialogClosingUndefined: Self = StObject.set(x, "movingDialogClosing", js.undefined)
    
    @scala.inline
    def setMovingDialogContentsRendered(value: (/* event */ Event, /* ui */ MovingDialogContentsRenderedEventUIParam) => Unit): Self = StObject.set(x, "movingDialogContentsRendered", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMovingDialogContentsRenderedUndefined: Self = StObject.set(x, "movingDialogContentsRendered", js.undefined)
    
    @scala.inline
    def setMovingDialogContentsRendering(value: (/* event */ Event, /* ui */ MovingDialogContentsRenderingEventUIParam) => Unit): Self = StObject.set(x, "movingDialogContentsRendering", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMovingDialogContentsRenderingUndefined: Self = StObject.set(x, "movingDialogContentsRendering", js.undefined)
    
    @scala.inline
    def setMovingDialogDisplayText(value: String): Self = StObject.set(x, "movingDialogDisplayText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovingDialogDisplayTextUndefined: Self = StObject.set(x, "movingDialogDisplayText", js.undefined)
    
    @scala.inline
    def setMovingDialogDragColumnMoved(value: (/* event */ Event, /* ui */ MovingDialogDragColumnMovedEventUIParam) => Unit): Self = StObject.set(x, "movingDialogDragColumnMoved", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMovingDialogDragColumnMovedUndefined: Self = StObject.set(x, "movingDialogDragColumnMoved", js.undefined)
    
    @scala.inline
    def setMovingDialogDragColumnMoving(value: (/* event */ Event, /* ui */ MovingDialogDragColumnMovingEventUIParam) => Unit): Self = StObject.set(x, "movingDialogDragColumnMoving", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMovingDialogDragColumnMovingUndefined: Self = StObject.set(x, "movingDialogDragColumnMoving", js.undefined)
    
    @scala.inline
    def setMovingDialogDragged(value: (/* event */ Event, /* ui */ MovingDialogDraggedEventUIParam) => Unit): Self = StObject.set(x, "movingDialogDragged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMovingDialogDraggedUndefined: Self = StObject.set(x, "movingDialogDragged", js.undefined)
    
    @scala.inline
    def setMovingDialogDropTooltipMarkup(value: String): Self = StObject.set(x, "movingDialogDropTooltipMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovingDialogDropTooltipMarkupUndefined: Self = StObject.set(x, "movingDialogDropTooltipMarkup", js.undefined)
    
    @scala.inline
    def setMovingDialogDropTooltipText(value: String): Self = StObject.set(x, "movingDialogDropTooltipText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovingDialogDropTooltipTextUndefined: Self = StObject.set(x, "movingDialogDropTooltipText", js.undefined)
    
    @scala.inline
    def setMovingDialogHeight(value: Double): Self = StObject.set(x, "movingDialogHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovingDialogHeightUndefined: Self = StObject.set(x, "movingDialogHeight", js.undefined)
    
    @scala.inline
    def setMovingDialogMoveDownButtonPressed(value: (/* event */ Event, /* ui */ MovingDialogMoveDownButtonPressedEventUIParam) => Unit): Self = StObject.set(x, "movingDialogMoveDownButtonPressed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMovingDialogMoveDownButtonPressedUndefined: Self = StObject.set(x, "movingDialogMoveDownButtonPressed", js.undefined)
    
    @scala.inline
    def setMovingDialogMoveUpButtonPressed(value: (/* event */ Event, /* ui */ MovingDialogMoveUpButtonPressedEventUIParam) => Unit): Self = StObject.set(x, "movingDialogMoveUpButtonPressed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMovingDialogMoveUpButtonPressedUndefined: Self = StObject.set(x, "movingDialogMoveUpButtonPressed", js.undefined)
    
    @scala.inline
    def setMovingDialogOpened(value: (/* event */ Event, /* ui */ MovingDialogOpenedEventUIParam) => Unit): Self = StObject.set(x, "movingDialogOpened", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMovingDialogOpenedUndefined: Self = StObject.set(x, "movingDialogOpened", js.undefined)
    
    @scala.inline
    def setMovingDialogOpening(value: (/* event */ Event, /* ui */ MovingDialogOpeningEventUIParam) => Unit): Self = StObject.set(x, "movingDialogOpening", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMovingDialogOpeningUndefined: Self = StObject.set(x, "movingDialogOpening", js.undefined)
    
    @scala.inline
    def setMovingDialogWidth(value: Double): Self = StObject.set(x, "movingDialogWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovingDialogWidthUndefined: Self = StObject.set(x, "movingDialogWidth", js.undefined)
    
    @scala.inline
    def setMovingScrollTolerance(value: Double): Self = StObject.set(x, "movingScrollTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovingScrollToleranceUndefined: Self = StObject.set(x, "movingScrollTolerance", js.undefined)
    
    @scala.inline
    def setMovingToolTipMove(value: String): Self = StObject.set(x, "movingToolTipMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovingToolTipMoveUndefined: Self = StObject.set(x, "movingToolTipMove", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    @scala.inline
    def setScrollDelta(value: Double): Self = StObject.set(x, "scrollDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollDeltaUndefined: Self = StObject.set(x, "scrollDelta", js.undefined)
    
    @scala.inline
    def setScrollSpeedMultiplier(value: Double): Self = StObject.set(x, "scrollSpeedMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollSpeedMultiplierUndefined: Self = StObject.set(x, "scrollSpeedMultiplier", js.undefined)
  }
}
