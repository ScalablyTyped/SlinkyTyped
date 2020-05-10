package typingsSlinky.ejWebAll.ej.RTE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Enables/disables the editing of the content.
    * @Default {True}
    */
  var allowEditing: js.UndefOr[Boolean] = js.native
  /** RTE control can be accessed through the keyboard shortcut keys.
    * @Default {True}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
  /** When the property is set to true, it focuses the RTE at the time of rendering.
    * @Default {false}
    */
  var autoFocus: js.UndefOr[Boolean] = js.native
  /** Based on the content size, its height is adjusted instead of adding the scrollbar.
    * @Default {false}
    */
  var autoHeight: js.UndefOr[Boolean] = js.native
  /** Fires when changed successfully.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  /** Sets the colorCode to display the color of the fontColor and backgroundColor in the font tools of the RTE.
    * @Default {[000000, FFFFFF, C4C4C4, ADADAD, 595959, 262626, 4f81bd, dbe5f1, b8cce4, 95b3d7, 366092, 244061, c0504d, f2dcdb, e5b9b7, d99694, 953734,632423, 9bbb59, ebf1dd, d7e3bc,
    * c3d69b, 76923c, 4f6128, 8064a2, e5e0ec, ccc1d9, b2a2c7, 5f497a, 3f3151, f79646, fdeada, fbd5b5, fac08f,e36c09, 974806]}
    */
  var colorCode: js.UndefOr[js.Any] = js.native
  /** The number of columns given are rendered in the color palate popup.
    * @Default {6}
    */
  var colorPaletteColumns: js.UndefOr[Double] = js.native
  /** The number of rows given are rendered in the color palate popup.
    * @Default {6}
    */
  var colorPaletteRows: js.UndefOr[Double] = js.native
  /** Fires when mouse click on menu items.
    */
  var contextMenuClick: js.UndefOr[js.Function1[/* e */ ContextMenuClickEventArgs, Unit]] = js.native
  /** Fires when the RTE is created successfully
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Sets the root class for the RTE theme. This cssClass API helps the usage of custom skinning option for the RTE control by including this root class in CSS.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Fires before the RTE is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** When the property is set to true, it returns the encrypted text.
    * @Default {false}
    */
  var enableHtmlEncode: js.UndefOr[Boolean] = js.native
  /** Maintain the values of the RTE after page reload.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** Shows the RTE in the RTL direction.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Shows the resize icon and enables the resize option in the RTE.
    * @Default {True}
    */
  var enableResize: js.UndefOr[Boolean] = js.native
  /** Enables the tab key action with the RichTextEditor content.
    * @Default {True}
    */
  var enableTabKeyNavigation: js.UndefOr[Boolean] = js.native
  /** Formats the contents based on the XHTML rules.
    * @Default {false}
    */
  var enableXHTML: js.UndefOr[Boolean] = js.native
  /** Enables/disables the RTE controlâ€™s accessibility or interaction.
    * @Default {True}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Fires when the commands are executed successfully.
    */
  var execute: js.UndefOr[js.Function1[/* e */ ExecuteEventArgs, Unit]] = js.native
  /** This API allows to enable url and fileName for pdf export.
    * @Default {null}
    */
  var exportToPdfSettings: js.UndefOr[ExportToPdfSettings] = js.native
  /** This API allows to enable url and fileName for word export.
    * @Default {null}
    */
  var exportToWordSettings: js.UndefOr[ExportToWordSettings] = js.native
  /** Load the external CSS file inside Iframe.
    * @Default {null}
    */
  var externalCSS: js.UndefOr[String] = js.native
  /** This API allows to enable the file browser support in the RTE control to browse, create, delete and upload the files in the specified current directory.
    * @Default {null}
    */
  var fileBrowser: js.UndefOr[FileBrowser] = js.native
  /** Sets the fontName in the RTE.
    * @Default {{text: Segoe UI, value: Segoe UI },{text: Arial, value: Arial,Helvetica,sans-serif },{text: Courier New, value: Courier New,Courier,Monospace },{text: Georgia, value:
    * Georgia,serif },{text: Impact, value: Impact,Charcoal,sans-serif },{text: Lucida Console, value: Lucida Console,Monaco,Monospace },{text: Tahoma, value: Tahoma,Geneva,sans-serif
    * },{text: Times New Roman, value: Times New Roman },{text: Trebuchet MS, value: Trebuchet MS,Helvetica,sans-serif },{text: Verdana, value: Verdana,Geneva,sans-serif}}
    */
  var fontName: js.UndefOr[js.Any] = js.native
  /** Sets the fontSize in the RTE.
    * @Default {{ text: 1, value: 1 },{ text: 2 (10pt), value: 2 },{ text: 3 (12pt), value: 3 },{ text: 4 (14pt), value: 4 },{ text: 5 (18pt), value: 5 },{ text: 6 (24pt), value: 6 },{
    * text: 7 (36pt), value: 7 }}
    */
  var fontSize: js.UndefOr[js.Any] = js.native
  /** Sets the format in the RTE.
    * @Default {{ text: Paragraph, value: &lt;p&gt;, spriteCssClass: e-paragraph },{ text: Quotation, value: &lt;blockquote&gt;, spriteCssClass: e-quotation },{ text: Heading 1, value:
    * &lt;h1&gt;, spriteCssClass: e-h1 },{ text: Heading 2, value: &lt;h2&gt;, spriteCssClass: e-h2 },{ text: Heading 3, value: &lt;h3&gt;, spriteCssClass: e-h3 },{ text: Heading 4,
    * value: &lt;h4&gt;, spriteCssClass: e-h4 },{ text: Heading 5, value: &lt;h5&gt;, spriteCssClass: e-h5 },{ text: Heading 6, value: &lt;h6&gt;, spriteCssClass: e-h6}}
    */
  var format: js.UndefOr[String] = js.native
  /** Defines the height of the RTE textbox.
    * @Default {370}
    */
  var height: js.UndefOr[String | Double] = js.native
  /** Specifies the HTML Attributes of the ejRTE.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  /** Sets the given attributes to the iframe body element.
    * @Default {{}}
    */
  var iframeAttributes: js.UndefOr[js.Any] = js.native
  /** This API allows the image browser to support in the RTE control to browse, create, delete, and upload the image files to the specified current directory.
    * @Default {null}
    */
  var imageBrowser: js.UndefOr[ImageBrowser] = js.native
  /** This API allows to enable the url for connecting to RTE import.
    * @Default {null}
    */
  var importSettings: js.UndefOr[ImportSettings] = js.native
  /** Enables/disables responsive support for the RTE control toolbar items during the window resizing time.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Fires when the keydown action is successful.
    */
  var keydown: js.UndefOr[js.Function1[/* e */ KeydownEventArgs, Unit]] = js.native
  /** Fires when the keyup action is successful.
    */
  var keyup: js.UndefOr[js.Function1[/* e */ KeyupEventArgs, Unit]] = js.native
  /** Sets the culture in the RTE when you set the localization values are needs to be assigned to the corresponding text as follows.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Sets the maximum height for the RTE outer wrapper element.
    * @Default {null}
    */
  var maxHeight: js.UndefOr[String | Double] = js.native
  /** Sets the maximum length for the RTE outer wrapper element.
    * @Default {7000}
    */
  var maxLength: js.UndefOr[Double] = js.native
  /** Sets the maximum width for the RTE outer wrapper element.
    * @Default {null}
    */
  var maxWidth: js.UndefOr[String | Double] = js.native
  /** Sets the minimum height for the RTE outer wrapper element.
    * @Default {280}
    */
  var minHeight: js.UndefOr[String | Double] = js.native
  /** Sets the minimum width for the RTE outer wrapper element.
    * @Default {400}
    */
  var minWidth: js.UndefOr[String | Double] = js.native
  /** Sets the name in the RTE. When the name value is not initialized, the ID value is assigned to the name.
    */
  var name: js.UndefOr[String] = js.native
  /** This API holds configuration setting for paste cleanup behavior.
    * @Default {{ listConversion: false, cleanCSS: false,	removeStyles: false, cleanElements: false }}
    */
  var pasteCleanupSettings: js.UndefOr[PasteCleanupSettings] = js.native
  /** Fires before the RTE Edit area is rendered and after the toolbar is rendered.
    */
  var preRender: js.UndefOr[js.Function1[/* e */ PreRenderEventArgs, Unit]] = js.native
  /** Fires when the text is selected in the text area
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.native
  /** Counts the total characters and displays it in the RTE footer.
    * @Default {True}
    */
  var showCharCount: js.UndefOr[Boolean] = js.native
  /** Shows ClearAll icon in the RTE footer.
    * @Default {false}
    */
  var showClearAll: js.UndefOr[Boolean] = js.native
  /** Shows the clear format in the RTE footer.
    * @Default {true}
    */
  var showClearFormat: js.UndefOr[Boolean] = js.native
  /** The showContextMenu property helps to enable custom context menu within editor area.
    * @Default {True}
    */
  var showContextMenu: js.UndefOr[Boolean] = js.native
  /** Shows the Custom Table in the RTE.
    * @Default {True}
    */
  var showCustomTable: js.UndefOr[Boolean] = js.native
  /** This API is used to set the default dimensions for the image and video. When this property is set to true, the image and video dialog displays the dimension option.
    * @Default {false}
    */
  var showDimensions: js.UndefOr[Boolean] = js.native
  /** Shows the FontOption in the RTE.
    * @Default {True}
    */
  var showFontOption: js.UndefOr[Boolean] = js.native
  /** Shows footer in the RTE. When the footer is enabled, it displays the HTML tag, word Count, character count, clear format, resize icon and clear all the content icons, by default.
    * @Default {false}
    */
  var showFooter: js.UndefOr[Boolean] = js.native
  /** Shows the HtmlSource in the RTE footer.
    * @Default {false}
    */
  var showHtmlSource: js.UndefOr[Boolean] = js.native
  /** When the cursor is placed or when the text is selected in the RTE, it displays the tag info in the footer.
    * @Default {True}
    */
  var showHtmlTagInfo: js.UndefOr[Boolean] = js.native
  /** Enables or disables rounded corner UI look for RTE.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  /** Shows the toolbar in the RTE.
    * @Default {True}
    */
  var showToolbar: js.UndefOr[Boolean] = js.native
  /** Counts the total words and displays it in the RTE footer.
    * @Default {True}
    */
  var showWordCount: js.UndefOr[Boolean] = js.native
  /** The given number of columns render the insert table pop.
    * @Default {10}
    */
  var tableColumns: js.UndefOr[Double] = js.native
  /** The given number of rows render the insert table pop.
    * @Default {8}
    */
  var tableRows: js.UndefOr[Double] = js.native
  /** Specifies the overflow mode for RTE responsive toolbar
    * @Default {Popup}
    */
  var toolbarOverflowMode: js.UndefOr[ToolbarOverflowMode | String] = js.native
  /** Sets the tools in the RTE and gets the inner display order of the corresponding group element. Tools are dependent on the toolsList property.
    * @Default {formatStyle: [format],style: [bold, italic, underline, strikethrough],alignment: [justifyLeft, justifyCenter, justifyRight, justifyFull],lists: [unorderedList,
    * orderedList],indenting: [outdent, indent],doAction: [undo, redo],links: [createLink,removeLink],images: [image],media: [video],tables: [createTable, addRowAbove, addRowBelow,
    * addColumnLeft, addColumnRight, deleteRow, deleteColumn, deleteTable]],view:[â€œfullScreenâ€,zoomIn,zoomOut],print:[print]}
    */
  var tools: js.UndefOr[Tools] = js.native
  /** Specifies the list of groups and order of those groups displayed in the RTE toolbar.  The toolsList property is used to get the root group order and tools property is used to get
    * the inner order of the corresponding groups displayed. When the value is not specified, it gets its default display order and tools.
    * @Default {[formatStyle, font, style, effects, alignment, lists, indenting, clipboard, doAction, clear, links, images, media, tables, casing,view, customTools,print,edit]}
    */
  var toolsList: js.UndefOr[js.Array[_]] = js.native
  /** Display the hints for the tools in the Toolbar.
    * @Default {{ associate: mouseenter, showShadow: true, position: { stem: { horizontal: left, vertical: top }  }, tip: { size: { width: 5, height: 5 }, isBalloon: false }}
    */
  var tooltipSettings: js.UndefOr[js.Any] = js.native
  /** Gets the undo stack limit.
    * @Default {50}
    */
  var undoStackLimit: js.UndefOr[Double] = js.native
  /** Sets the jQuery validation error message to the Rich Text Editor.
    * @Default {null}
    */
  var validationMessage: js.UndefOr[js.Any] = js.native
  /** Sets the jQuery validation rules to the Rich Text Editor.
    * @Default {null}
    */
  var validationRules: js.UndefOr[js.Any] = js.native
  /** The given string value is displayed in the editable area.
    * @Default {null}
    */
  var value: js.UndefOr[String] = js.native
  /** Defines the width of the RTE textbox.
    * @Default {786}
    */
  var width: js.UndefOr[String | Double] = js.native
  /** Increases and decreases the contents zoom range in percentage
    * @Default {0.05}
    */
  var zoomStep: js.UndefOr[String | Double] = js.native
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
    def withAllowEditing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEditing")(js.undefined)
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
    def withAutoFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: /* e */ ChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withColorCode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withColorPaletteColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPaletteColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorPaletteColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPaletteColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withColorPaletteRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPaletteRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorPaletteRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPaletteRows")(js.undefined)
        ret
    }
    @scala.inline
    def withContextMenuClick(value: /* e */ ContextMenuClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContextMenuClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuClick")(js.undefined)
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
    def withEnableHtmlEncode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHtmlEncode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableHtmlEncode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHtmlEncode")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePersistence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePersistence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePersistence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePersistence")(js.undefined)
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
    def withEnableResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableResize")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTabKeyNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTabKeyNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTabKeyNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTabKeyNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableXHTML(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableXHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableXHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableXHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withExecute(value: /* e */ ExecuteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExecute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.undefined)
        ret
    }
    @scala.inline
    def withExportToPdfSettings(value: ExportToPdfSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportToPdfSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportToPdfSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportToPdfSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withExportToWordSettings(value: ExportToWordSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportToWordSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportToWordSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportToWordSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalCSS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalCSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalCSS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalCSS")(js.undefined)
        ret
    }
    @scala.inline
    def withFileBrowser(value: FileBrowser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileBrowser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileBrowser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileBrowser")(js.undefined)
        ret
    }
    @scala.inline
    def withFontName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontName")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withIframeAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIframeAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withImageBrowser(value: ImageBrowser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageBrowser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageBrowser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageBrowser")(js.undefined)
        ret
    }
    @scala.inline
    def withImportSettings(value: ImportSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importSettings")(js.undefined)
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
    def withKeydown(value: /* e */ KeydownEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keydown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutKeydown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keydown")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyup(value: /* e */ KeyupEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutKeyup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyup")(js.undefined)
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
    def withMaxHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: String | Double): Self = {
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPasteCleanupSettings(value: PasteCleanupSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteCleanupSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasteCleanupSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteCleanupSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withPreRender(value: /* e */ PreRenderEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPreRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preRender")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: /* e */ SelectEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCharCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCharCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCharCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCharCount")(js.undefined)
        ret
    }
    @scala.inline
    def withShowClearAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClearAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowClearAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClearAll")(js.undefined)
        ret
    }
    @scala.inline
    def withShowClearFormat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClearFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowClearFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClearFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withShowContextMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showContextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCustomTable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCustomTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCustomTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCustomTable")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDimensions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFontOption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFontOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFontOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFontOption")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFooter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHtmlSource(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHtmlSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHtmlSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHtmlSource")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHtmlTagInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHtmlTagInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHtmlTagInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHtmlTagInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRoundedCorner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoundedCorner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRoundedCorner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoundedCorner")(js.undefined)
        ret
    }
    @scala.inline
    def withShowToolbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withShowWordCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWordCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowWordCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWordCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTableColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withTableRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRows")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarOverflowMode(value: ToolbarOverflowMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarOverflowMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarOverflowMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarOverflowMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTools(value: Tools): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tools")(js.undefined)
        ret
    }
    @scala.inline
    def withToolsList(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolsList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolsList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolsList")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipSettings(value: js.Any): Self = {
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
    def withUndoStackLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undoStackLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUndoStackLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undoStackLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationMessage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationRules(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomStep(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomStep")(js.undefined)
        ret
    }
  }
  
}

