package typingsSlinky.devextreme.mod.default

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.Buttons
import typingsSlinky.devextreme.anon.Compile
import typingsSlinky.devextreme.mod.DevExpress.ui.CollectionWidgetOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.DataExpressionMixinOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.DraggableBaseOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.EditorOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.GridBaseOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.HierarchicalCollectionWidgetOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.SearchBoxMixinOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.WidgetOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxAccordionOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxActionSheetOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxAutocompleteOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxBoxOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxButtonGroupOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxButtonOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxCalendarOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxCheckBoxOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxColorBoxOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxContextMenuOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDataGridOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDateBoxOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDeferRenderingOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDiagramOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDraggableOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDrawerOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDropDownBoxOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDropDownButtonOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDropDownEditorOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDropDownListOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxFileManagerOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxFileUploaderOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxFilterBuilderOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxFormOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxGalleryOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxGanttOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxHtmlEditorOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxListOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxLoadIndicatorOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxLoadPanelOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxLookupOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxMapOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxMenuBaseOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxMenuOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxMultiViewOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxNavBarOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxNumberBoxOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxOverlayOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxPivotGridFieldChooserOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxPivotGridOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxPopoverOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxPopupOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxProgressBarOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxRadioGroupOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxRangeSliderOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxRecurrenceEditorOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxResizableOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxResponsiveBoxOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxSchedulerOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxScrollViewOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxScrollableOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxSelectBoxOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxSlideOutOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxSlideOutViewOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxSliderBaseOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxSliderOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxSortableOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxSpeedDialActionOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxSwitchOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxTabPanelOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxTabsOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxTagBoxOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxTextAreaOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxTextBoxOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxTextEditorOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxTileViewOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxToastOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxToolbarOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxTooltipOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxTrackBarOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxTreeListOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxTreeViewOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxValidationGroupOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxValidationSummaryOptions
import typingsSlinky.devextreme.mod.DevExpress.ui.dxValidatorOptions
import typingsSlinky.devextreme.mod.global.JQuery
import typingsSlinky.devextreme.mod.global.JQueryPromise
import typingsSlinky.devextreme.mod.global.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devextreme", "default.ui")
@js.native
class ui ()
  extends typingsSlinky.devextreme.mod.DevExpress.ui
/* static members */
object ui {
  
  @JSImport("devextreme", "default.ui")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("devextreme", "default.ui.CollectionWidget")
  @js.native
  class CollectionWidget protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.CollectionWidget {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(
      element: Element,
      options: CollectionWidgetOptions[typingsSlinky.devextreme.mod.DevExpress.ui.CollectionWidget]
    ) = this()
    def this(
      element: JQuery,
      options: CollectionWidgetOptions[typingsSlinky.devextreme.mod.DevExpress.ui.CollectionWidget]
    ) = this()
  }
  
  @JSImport("devextreme", "default.ui.DataExpressionMixin")
  @js.native
  class DataExpressionMixin ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.DataExpressionMixin {
    def this(options: DataExpressionMixinOptions[typingsSlinky.devextreme.mod.DevExpress.ui.DataExpressionMixin]) = this()
  }
  
  @JSImport("devextreme", "default.ui.DraggableBase")
  @js.native
  class DraggableBase protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.DOMComponent {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(
      element: Element,
      options: DraggableBaseOptions[typingsSlinky.devextreme.mod.DevExpress.ui.DraggableBase]
    ) = this()
    def this(
      element: JQuery,
      options: DraggableBaseOptions[typingsSlinky.devextreme.mod.DevExpress.ui.DraggableBase]
    ) = this()
  }
  
  @JSImport("devextreme", "default.ui.Editor")
  @js.native
  class Editor protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.Editor {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: EditorOptions[typingsSlinky.devextreme.mod.DevExpress.ui.Editor]) = this()
    def this(element: JQuery, options: EditorOptions[typingsSlinky.devextreme.mod.DevExpress.ui.Editor]) = this()
  }
  
  @JSImport("devextreme", "default.ui.GridBase")
  @js.native
  class GridBase protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.GridBase {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: GridBaseOptions[typingsSlinky.devextreme.mod.DevExpress.ui.GridBase]) = this()
    def this(element: JQuery, options: GridBaseOptions[typingsSlinky.devextreme.mod.DevExpress.ui.GridBase]) = this()
  }
  
  @JSImport("devextreme", "default.ui.HierarchicalCollectionWidget")
  @js.native
  class HierarchicalCollectionWidget protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.CollectionWidget {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(
      element: Element,
      options: HierarchicalCollectionWidgetOptions[typingsSlinky.devextreme.mod.DevExpress.ui.HierarchicalCollectionWidget]
    ) = this()
    def this(
      element: JQuery,
      options: HierarchicalCollectionWidgetOptions[typingsSlinky.devextreme.mod.DevExpress.ui.HierarchicalCollectionWidget]
    ) = this()
  }
  
  @JSImport("devextreme", "default.ui.SearchBoxMixin")
  @js.native
  class SearchBoxMixin ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.SearchBoxMixin {
    def this(options: SearchBoxMixinOptions[typingsSlinky.devextreme.mod.DevExpress.ui.SearchBoxMixin]) = this()
  }
  
  @JSImport("devextreme", "default.ui.Widget")
  @js.native
  class Widget protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.Widget {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: WidgetOptions[typingsSlinky.devextreme.mod.DevExpress.ui.Widget]) = this()
    def this(element: JQuery, options: WidgetOptions[typingsSlinky.devextreme.mod.DevExpress.ui.Widget]) = this()
  }
  
  object dialog {
    
    @JSImport("devextreme", "default.ui.dialog.alert")
    @js.native
    def alert(messageHtml: String, title: String): Promise[Unit] with JQueryPromise[Unit] = js.native
    
    @JSImport("devextreme", "default.ui.dialog.confirm")
    @js.native
    def confirm(messageHtml: String, title: String): Promise[Boolean] with JQueryPromise[Boolean] = js.native
    
    @JSImport("devextreme", "default.ui.dialog.custom")
    @js.native
    def custom(options: Buttons): js.Any = js.native
  }
  
  @JSImport("devextreme", "default.ui.dxAccordion")
  @js.native
  class dxAccordion protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxAccordion {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxAccordionOptions) = this()
    def this(element: JQuery, options: dxAccordionOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxActionSheet")
  @js.native
  class dxActionSheet protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxActionSheet {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxActionSheetOptions) = this()
    def this(element: JQuery, options: dxActionSheetOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxAutocomplete")
  @js.native
  class dxAutocomplete protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxDropDownList {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxAutocompleteOptions) = this()
    def this(element: JQuery, options: dxAutocompleteOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxBox")
  @js.native
  class dxBox protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.CollectionWidget {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxBoxOptions) = this()
    def this(element: JQuery, options: dxBoxOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxButton")
  @js.native
  class dxButton protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.Widget {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxButtonOptions) = this()
    def this(element: JQuery, options: dxButtonOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxButtonGroup")
  @js.native
  class dxButtonGroup protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.Widget {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxButtonGroupOptions) = this()
    def this(element: JQuery, options: dxButtonGroupOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxCalendar")
  @js.native
  class dxCalendar protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.Editor {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxCalendarOptions) = this()
    def this(element: JQuery, options: dxCalendarOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxCheckBox")
  @js.native
  class dxCheckBox protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.Editor {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxCheckBoxOptions) = this()
    def this(element: JQuery, options: dxCheckBoxOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxColorBox")
  @js.native
  class dxColorBox protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxDropDownEditor {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxColorBoxOptions) = this()
    def this(element: JQuery, options: dxColorBoxOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxContextMenu")
  @js.native
  class dxContextMenu protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxContextMenu {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxContextMenuOptions) = this()
    def this(element: JQuery, options: dxContextMenuOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxDataGrid")
  @js.native
  class dxDataGrid protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxDataGrid {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxDataGridOptions) = this()
    def this(element: JQuery, options: dxDataGridOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxDateBox")
  @js.native
  class dxDateBox protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxDateBox {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxDateBoxOptions) = this()
    def this(element: JQuery, options: dxDateBoxOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxDeferRendering")
  @js.native
  class dxDeferRendering protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.Widget {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxDeferRenderingOptions) = this()
    def this(element: JQuery, options: dxDeferRenderingOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxDiagram")
  @js.native
  class dxDiagram protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxDiagram {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxDiagramOptions) = this()
    def this(element: JQuery, options: dxDiagramOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxDraggable")
  @js.native
  class dxDraggable protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.DOMComponent {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxDraggableOptions) = this()
    def this(element: JQuery, options: dxDraggableOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxDrawer")
  @js.native
  class dxDrawer protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxDrawer {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxDrawerOptions) = this()
    def this(element: JQuery, options: dxDrawerOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxDropDownBox")
  @js.native
  class dxDropDownBox protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxDropDownBox {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxDropDownBoxOptions) = this()
    def this(element: JQuery, options: dxDropDownBoxOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxDropDownButton")
  @js.native
  class dxDropDownButton protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxDropDownButton {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxDropDownButtonOptions) = this()
    def this(element: JQuery, options: dxDropDownButtonOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxDropDownEditor")
  @js.native
  class dxDropDownEditor protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxDropDownEditor {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(
      element: Element,
      options: dxDropDownEditorOptions[typingsSlinky.devextreme.mod.DevExpress.ui.dxDropDownEditor]
    ) = this()
    def this(
      element: JQuery,
      options: dxDropDownEditorOptions[typingsSlinky.devextreme.mod.DevExpress.ui.dxDropDownEditor]
    ) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxDropDownList")
  @js.native
  class dxDropDownList protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxDropDownList {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(
      element: Element,
      options: dxDropDownListOptions[typingsSlinky.devextreme.mod.DevExpress.ui.dxDropDownList]
    ) = this()
    def this(
      element: JQuery,
      options: dxDropDownListOptions[typingsSlinky.devextreme.mod.DevExpress.ui.dxDropDownList]
    ) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxFileManager")
  @js.native
  class dxFileManager protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxFileManager {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxFileManagerOptions) = this()
    def this(element: JQuery, options: dxFileManagerOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxFileUploader")
  @js.native
  class dxFileUploader protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxFileUploader {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxFileUploaderOptions) = this()
    def this(element: JQuery, options: dxFileUploaderOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxFilterBuilder")
  @js.native
  class dxFilterBuilder protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxFilterBuilder {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxFilterBuilderOptions) = this()
    def this(element: JQuery, options: dxFilterBuilderOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxForm")
  @js.native
  class dxForm protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxForm {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxFormOptions) = this()
    def this(element: JQuery, options: dxFormOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxGallery")
  @js.native
  class dxGallery protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxGallery {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxGalleryOptions) = this()
    def this(element: JQuery, options: dxGalleryOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxGantt")
  @js.native
  class dxGantt protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxGantt {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxGanttOptions) = this()
    def this(element: JQuery, options: dxGanttOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxHtmlEditor")
  @js.native
  class dxHtmlEditor protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxHtmlEditor {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxHtmlEditorOptions) = this()
    def this(element: JQuery, options: dxHtmlEditorOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxItem")
  @js.native
  def dxItem: js.Any = js.native
  @scala.inline
  def dxItem_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dxItem")(x.asInstanceOf[js.Any])
  
  @JSImport("devextreme", "default.ui.dxList")
  @js.native
  class dxList protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxList {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxListOptions) = this()
    def this(element: JQuery, options: dxListOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxLoadIndicator")
  @js.native
  class dxLoadIndicator protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.Widget {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxLoadIndicatorOptions) = this()
    def this(element: JQuery, options: dxLoadIndicatorOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxLoadPanel")
  @js.native
  class dxLoadPanel protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxOverlay {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxLoadPanelOptions) = this()
    def this(element: JQuery, options: dxLoadPanelOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxLookup")
  @js.native
  class dxLookup protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxDropDownList {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxLookupOptions) = this()
    def this(element: JQuery, options: dxLookupOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxMap")
  @js.native
  class dxMap protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxMap {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxMapOptions) = this()
    def this(element: JQuery, options: dxMapOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxMenu")
  @js.native
  class dxMenu protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxMenuBase {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxMenuOptions) = this()
    def this(element: JQuery, options: dxMenuOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxMenuBase")
  @js.native
  class dxMenuBase protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxMenuBase {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(
      element: Element,
      options: dxMenuBaseOptions[typingsSlinky.devextreme.mod.DevExpress.ui.dxMenuBase]
    ) = this()
    def this(element: JQuery, options: dxMenuBaseOptions[typingsSlinky.devextreme.mod.DevExpress.ui.dxMenuBase]) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxMultiView")
  @js.native
  class dxMultiView protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.CollectionWidget {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(
      element: Element,
      options: dxMultiViewOptions[typingsSlinky.devextreme.mod.DevExpress.ui.dxMultiView]
    ) = this()
    def this(
      element: JQuery,
      options: dxMultiViewOptions[typingsSlinky.devextreme.mod.DevExpress.ui.dxMultiView]
    ) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxNavBar")
  @js.native
  class dxNavBar protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.CollectionWidget {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxNavBarOptions) = this()
    def this(element: JQuery, options: dxNavBarOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxNumberBox")
  @js.native
  class dxNumberBox protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxTextEditor {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxNumberBoxOptions) = this()
    def this(element: JQuery, options: dxNumberBoxOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxOverlay")
  @js.native
  class dxOverlay protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxOverlay {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxOverlayOptions[typingsSlinky.devextreme.mod.DevExpress.ui.dxOverlay]) = this()
    def this(element: JQuery, options: dxOverlayOptions[typingsSlinky.devextreme.mod.DevExpress.ui.dxOverlay]) = this()
  }
  object dxOverlay {
    
    @JSImport("devextreme", "default.ui.dxOverlay.baseZIndex")
    @js.native
    def baseZIndex(zIndex: Double): Unit = js.native
  }
  
  @JSImport("devextreme", "default.ui.dxPivotGrid")
  @js.native
  class dxPivotGrid protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxPivotGrid {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxPivotGridOptions) = this()
    def this(element: JQuery, options: dxPivotGridOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxPivotGridFieldChooser")
  @js.native
  class dxPivotGridFieldChooser protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxPivotGridFieldChooser {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxPivotGridFieldChooserOptions) = this()
    def this(element: JQuery, options: dxPivotGridFieldChooserOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxPivotGridSummaryCell")
  @js.native
  class dxPivotGridSummaryCell ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxPivotGridSummaryCell
  
  @JSImport("devextreme", "default.ui.dxPopover")
  @js.native
  class dxPopover protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxPopover {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxPopoverOptions[typingsSlinky.devextreme.mod.DevExpress.ui.dxPopover]) = this()
    def this(element: JQuery, options: dxPopoverOptions[typingsSlinky.devextreme.mod.DevExpress.ui.dxPopover]) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxPopup")
  @js.native
  class dxPopup protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxOverlay {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxPopupOptions[typingsSlinky.devextreme.mod.DevExpress.ui.dxPopup]) = this()
    def this(element: JQuery, options: dxPopupOptions[typingsSlinky.devextreme.mod.DevExpress.ui.dxPopup]) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxProgressBar")
  @js.native
  class dxProgressBar protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.Editor {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxProgressBarOptions) = this()
    def this(element: JQuery, options: dxProgressBarOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxRadioGroup")
  @js.native
  class dxRadioGroup protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxRadioGroup {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxRadioGroupOptions) = this()
    def this(element: JQuery, options: dxRadioGroupOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxRangeSlider")
  @js.native
  class dxRangeSlider protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.Editor {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxRangeSliderOptions) = this()
    def this(element: JQuery, options: dxRangeSliderOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxRecurrenceEditor")
  @js.native
  class dxRecurrenceEditor protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.Editor {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxRecurrenceEditorOptions) = this()
    def this(element: JQuery, options: dxRecurrenceEditorOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxResizable")
  @js.native
  class dxResizable protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.DOMComponent {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxResizableOptions) = this()
    def this(element: JQuery, options: dxResizableOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxResponsiveBox")
  @js.native
  class dxResponsiveBox protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.CollectionWidget {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxResponsiveBoxOptions) = this()
    def this(element: JQuery, options: dxResponsiveBoxOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxScheduler")
  @js.native
  class dxScheduler protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxScheduler {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxSchedulerOptions) = this()
    def this(element: JQuery, options: dxSchedulerOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxScrollView")
  @js.native
  class dxScrollView protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxScrollView {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxScrollViewOptions) = this()
    def this(element: JQuery, options: dxScrollViewOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxScrollable")
  @js.native
  class dxScrollable protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxScrollable {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(
      element: Element,
      options: dxScrollableOptions[typingsSlinky.devextreme.mod.DevExpress.ui.dxScrollable]
    ) = this()
    def this(
      element: JQuery,
      options: dxScrollableOptions[typingsSlinky.devextreme.mod.DevExpress.ui.dxScrollable]
    ) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxSelectBox")
  @js.native
  class dxSelectBox protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxDropDownList {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(
      element: Element,
      options: dxSelectBoxOptions[typingsSlinky.devextreme.mod.DevExpress.ui.dxSelectBox]
    ) = this()
    def this(
      element: JQuery,
      options: dxSelectBoxOptions[typingsSlinky.devextreme.mod.DevExpress.ui.dxSelectBox]
    ) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxSlideOut")
  @js.native
  class dxSlideOut protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxSlideOut {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxSlideOutOptions) = this()
    def this(element: JQuery, options: dxSlideOutOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxSlideOutView")
  @js.native
  class dxSlideOutView protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxSlideOutView {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxSlideOutViewOptions) = this()
    def this(element: JQuery, options: dxSlideOutViewOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxSlider")
  @js.native
  class dxSlider protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.Editor {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxSliderOptions) = this()
    def this(element: JQuery, options: dxSliderOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxSliderBase")
  @js.native
  class dxSliderBase protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.Editor {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(
      element: Element,
      options: dxSliderBaseOptions[typingsSlinky.devextreme.mod.DevExpress.ui.dxSliderBase]
    ) = this()
    def this(
      element: JQuery,
      options: dxSliderBaseOptions[typingsSlinky.devextreme.mod.DevExpress.ui.dxSliderBase]
    ) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxSortable")
  @js.native
  class dxSortable protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxSortable {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxSortableOptions) = this()
    def this(element: JQuery, options: dxSortableOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxSpeedDialAction")
  @js.native
  class dxSpeedDialAction protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.Widget {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxSpeedDialActionOptions) = this()
    def this(element: JQuery, options: dxSpeedDialActionOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxSwitch")
  @js.native
  class dxSwitch protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.Editor {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxSwitchOptions) = this()
    def this(element: JQuery, options: dxSwitchOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxTabPanel")
  @js.native
  class dxTabPanel protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.CollectionWidget {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxTabPanelOptions) = this()
    def this(element: JQuery, options: dxTabPanelOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxTabs")
  @js.native
  class dxTabs protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.CollectionWidget {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxTabsOptions[typingsSlinky.devextreme.mod.DevExpress.ui.dxTabs]) = this()
    def this(element: JQuery, options: dxTabsOptions[typingsSlinky.devextreme.mod.DevExpress.ui.dxTabs]) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxTagBox")
  @js.native
  class dxTagBox protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxDropDownList {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxTagBoxOptions) = this()
    def this(element: JQuery, options: dxTagBoxOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxTextArea")
  @js.native
  class dxTextArea protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxTextEditor {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxTextAreaOptions) = this()
    def this(element: JQuery, options: dxTextAreaOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxTextBox")
  @js.native
  class dxTextBox protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxTextEditor {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxTextBoxOptions[typingsSlinky.devextreme.mod.DevExpress.ui.dxTextBox]) = this()
    def this(element: JQuery, options: dxTextBoxOptions[typingsSlinky.devextreme.mod.DevExpress.ui.dxTextBox]) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxTextEditor")
  @js.native
  class dxTextEditor protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxTextEditor {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(
      element: Element,
      options: dxTextEditorOptions[typingsSlinky.devextreme.mod.DevExpress.ui.dxTextEditor]
    ) = this()
    def this(
      element: JQuery,
      options: dxTextEditorOptions[typingsSlinky.devextreme.mod.DevExpress.ui.dxTextEditor]
    ) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxTileView")
  @js.native
  class dxTileView protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxTileView {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxTileViewOptions) = this()
    def this(element: JQuery, options: dxTileViewOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxToast")
  @js.native
  class dxToast protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxOverlay {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxToastOptions) = this()
    def this(element: JQuery, options: dxToastOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxToolbar")
  @js.native
  class dxToolbar protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.CollectionWidget {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxToolbarOptions) = this()
    def this(element: JQuery, options: dxToolbarOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxTooltip")
  @js.native
  class dxTooltip protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxPopover {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxTooltipOptions) = this()
    def this(element: JQuery, options: dxTooltipOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxTrackBar")
  @js.native
  class dxTrackBar protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.Editor {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(
      element: Element,
      options: dxTrackBarOptions[typingsSlinky.devextreme.mod.DevExpress.ui.dxTrackBar]
    ) = this()
    def this(element: JQuery, options: dxTrackBarOptions[typingsSlinky.devextreme.mod.DevExpress.ui.dxTrackBar]) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxTreeList")
  @js.native
  class dxTreeList protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxTreeList {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxTreeListOptions) = this()
    def this(element: JQuery, options: dxTreeListOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxTreeView")
  @js.native
  class dxTreeView protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxTreeView {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxTreeViewOptions) = this()
    def this(element: JQuery, options: dxTreeViewOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxValidationGroup")
  @js.native
  class dxValidationGroup protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxValidationGroup {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxValidationGroupOptions) = this()
    def this(element: JQuery, options: dxValidationGroupOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxValidationSummary")
  @js.native
  class dxValidationSummary protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.CollectionWidget {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxValidationSummaryOptions) = this()
    def this(element: JQuery, options: dxValidationSummaryOptions) = this()
  }
  
  @JSImport("devextreme", "default.ui.dxValidator")
  @js.native
  class dxValidator protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.dxValidator {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxValidatorOptions) = this()
    def this(element: JQuery, options: dxValidatorOptions) = this()
  }
  
  /**
    * [descr:ui.notify(message,type,displayTime)]
    */
  @JSImport("devextreme", "default.ui.notify")
  @js.native
  def notify(message: String): Unit = js.native
  @JSImport("devextreme", "default.ui.notify")
  @js.native
  def notify(message: String, `type`: js.UndefOr[scala.Nothing], displayTime: Double): Unit = js.native
  @JSImport("devextreme", "default.ui.notify")
  @js.native
  def notify(message: String, `type`: String): Unit = js.native
  @JSImport("devextreme", "default.ui.notify")
  @js.native
  def notify(message: String, `type`: String, displayTime: Double): Unit = js.native
  /**
    * [descr:ui.notify(options,type,displayTime)]
    */
  @JSImport("devextreme", "default.ui.notify")
  @js.native
  def notify(options: js.Any): Unit = js.native
  @JSImport("devextreme", "default.ui.notify")
  @js.native
  def notify(options: js.Any, `type`: js.UndefOr[scala.Nothing], displayTime: Double): Unit = js.native
  @JSImport("devextreme", "default.ui.notify")
  @js.native
  def notify(options: js.Any, `type`: String): Unit = js.native
  @JSImport("devextreme", "default.ui.notify")
  @js.native
  def notify(options: js.Any, `type`: String, displayTime: Double): Unit = js.native
  
  /**
    * [descr:ui.repaintFloatingActionButton()]
    */
  @JSImport("devextreme", "default.ui.repaintFloatingActionButton")
  @js.native
  def repaintFloatingActionButton(): Unit = js.native
  
  /**
    * [descr:ui.setTemplateEngine(name)]
    */
  @JSImport("devextreme", "default.ui.setTemplateEngine")
  @js.native
  def setTemplateEngine(templateEngineName: String): Unit = js.native
  /**
    * [descr:ui.setTemplateEngine(options)]
    */
  @JSImport("devextreme", "default.ui.setTemplateEngine")
  @js.native
  def setTemplateEngine(templateEngineOptions: Compile): Unit = js.native
  
  @JSImport("devextreme", "default.ui.themes")
  @js.native
  class themes ()
    extends typingsSlinky.devextreme.mod.DevExpress.ui.themes
  /* static members */
  object themes {
    
    /**
      * [descr:ui.themes.current()]
      */
    @JSImport("devextreme", "default.ui.themes.current")
    @js.native
    def current(): String = js.native
    /**
      * [descr:ui.themes.current(themeName)]
      */
    @JSImport("devextreme", "default.ui.themes.current")
    @js.native
    def current(themeName: String): Unit = js.native
    
    /**
      * [descr:ui.themes.initialized(callback)]
      */
    @JSImport("devextreme", "default.ui.themes.initialized")
    @js.native
    def initialized(callback: js.Function): Unit = js.native
    
    /**
      * [descr:ui.themes.ready(callback)]
      */
    @JSImport("devextreme", "default.ui.themes.ready")
    @js.native
    def ready(callback: js.Function): Unit = js.native
  }
}
