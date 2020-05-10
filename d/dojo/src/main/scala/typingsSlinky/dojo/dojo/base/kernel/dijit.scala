package typingsSlinky.dojo.dojo.base.kernel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.dijit.html
  *
  *
  */
@js.native
trait dijit extends js.Object {
  /**
    *
    */
  var form: js.Object = js.native
  /**
    *
    */
  var layout: js.Object = js.native
  /**
    * W3C range API
    *
    */
  var range: js.Object = js.native
  /**
    *
    */
  var registry: js.Object = js.native
  /**
    *
    */
  var tree: js.Object = js.native
  /**
    *
    */
  def Calendar(): Unit = js.native
  /**
    *
    */
  def CalendarLite(): Unit = js.native
  /**
    *
    */
  def CheckedMenuItem(): Unit = js.native
  /**
    *
    */
  def ColorPalette(): Unit = js.native
  /**
    *
    */
  def Declaration(): Unit = js.native
  /**
    *
    */
  def Destroyable(): Unit = js.native
  /**
    *
    */
  def Dialog(): Unit = js.native
  /**
    *
    */
  def DialogUnderlay(): Unit = js.native
  /**
    *
    */
  def DropDownMenu(): Unit = js.native
  /**
    *
    */
  def Dye(): Unit = js.native
  /**
    *
    */
  def Editor(): Unit = js.native
  /**
    *
    */
  def Fieldset(): Unit = js.native
  /**
    *
    */
  def InlineEditBox(): Unit = js.native
  /**
    *
    */
  def Menu(): Unit = js.native
  /**
    *
    */
  def MenuBar(): Unit = js.native
  /**
    *
    */
  def MenuBarItem(): Unit = js.native
  /**
    *
    */
  def MenuItem(): Unit = js.native
  /**
    *
    */
  def MenuSeparator(): Unit = js.native
  /**
    *
    */
  def PopupMenuBarItem(): Unit = js.native
  /**
    *
    */
  def PopupMenuItem(): Unit = js.native
  /**
    *
    */
  def ProgressBar(): Unit = js.native
  /**
    *
    */
  def RadioButtonMenuItem(): Unit = js.native
  /**
    *
    */
  def TitlePane(): Unit = js.native
  /**
    *
    */
  def Toolbar(): Unit = js.native
  /**
    *
    */
  def ToolbarSeparator(): Unit = js.native
  /**
    *
    */
  def Tooltip(): Unit = js.native
  /**
    *
    */
  def TooltipDialog(): Unit = js.native
  /**
    *
    */
  def Tree(): Unit = js.native
  /**
    *
    */
  def WidgetSet(): Unit = js.native
  /**
    *
    * @param id
    */
  def byId(id: js.Any): js.Any = js.native
}

object dijit {
  @scala.inline
  def apply(
    Calendar: () => Unit,
    CalendarLite: () => Unit,
    CheckedMenuItem: () => Unit,
    ColorPalette: () => Unit,
    Declaration: () => Unit,
    Destroyable: () => Unit,
    Dialog: () => Unit,
    DialogUnderlay: () => Unit,
    DropDownMenu: () => Unit,
    Dye: () => Unit,
    Editor: () => Unit,
    Fieldset: () => Unit,
    InlineEditBox: () => Unit,
    Menu: () => Unit,
    MenuBar: () => Unit,
    MenuBarItem: () => Unit,
    MenuItem: () => Unit,
    MenuSeparator: () => Unit,
    PopupMenuBarItem: () => Unit,
    PopupMenuItem: () => Unit,
    ProgressBar: () => Unit,
    RadioButtonMenuItem: () => Unit,
    TitlePane: () => Unit,
    Toolbar: () => Unit,
    ToolbarSeparator: () => Unit,
    Tooltip: () => Unit,
    TooltipDialog: () => Unit,
    Tree: () => Unit,
    WidgetSet: () => Unit,
    byId: js.Any => js.Any,
    form: js.Object,
    layout: js.Object,
    range: js.Object,
    registry: js.Object,
    tree: js.Object
  ): dijit = {
    val __obj = js.Dynamic.literal(Calendar = js.Any.fromFunction0(Calendar), CalendarLite = js.Any.fromFunction0(CalendarLite), CheckedMenuItem = js.Any.fromFunction0(CheckedMenuItem), ColorPalette = js.Any.fromFunction0(ColorPalette), Declaration = js.Any.fromFunction0(Declaration), Destroyable = js.Any.fromFunction0(Destroyable), Dialog = js.Any.fromFunction0(Dialog), DialogUnderlay = js.Any.fromFunction0(DialogUnderlay), DropDownMenu = js.Any.fromFunction0(DropDownMenu), Dye = js.Any.fromFunction0(Dye), Editor = js.Any.fromFunction0(Editor), Fieldset = js.Any.fromFunction0(Fieldset), InlineEditBox = js.Any.fromFunction0(InlineEditBox), Menu = js.Any.fromFunction0(Menu), MenuBar = js.Any.fromFunction0(MenuBar), MenuBarItem = js.Any.fromFunction0(MenuBarItem), MenuItem = js.Any.fromFunction0(MenuItem), MenuSeparator = js.Any.fromFunction0(MenuSeparator), PopupMenuBarItem = js.Any.fromFunction0(PopupMenuBarItem), PopupMenuItem = js.Any.fromFunction0(PopupMenuItem), ProgressBar = js.Any.fromFunction0(ProgressBar), RadioButtonMenuItem = js.Any.fromFunction0(RadioButtonMenuItem), TitlePane = js.Any.fromFunction0(TitlePane), Toolbar = js.Any.fromFunction0(Toolbar), ToolbarSeparator = js.Any.fromFunction0(ToolbarSeparator), Tooltip = js.Any.fromFunction0(Tooltip), TooltipDialog = js.Any.fromFunction0(TooltipDialog), Tree = js.Any.fromFunction0(Tree), WidgetSet = js.Any.fromFunction0(WidgetSet), byId = js.Any.fromFunction1(byId), form = form.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[dijit]
  }
  @scala.inline
  implicit class dijitOps[Self <: dijit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendar(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Calendar")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCalendarLite(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CalendarLite")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCheckedMenuItem(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckedMenuItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withColorPalette(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColorPalette")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeclaration(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Declaration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDestroyable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destroyable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDialog(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dialog")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDialogUnderlay(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DialogUnderlay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDropDownMenu(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DropDownMenu")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDye(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dye")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEditor(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Editor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFieldset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fieldset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInlineEditBox(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InlineEditBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMenu(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Menu")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMenuBar(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MenuBar")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMenuBarItem(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MenuBarItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMenuItem(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MenuItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMenuSeparator(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MenuSeparator")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPopupMenuBarItem(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PopupMenuBarItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPopupMenuItem(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PopupMenuItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withProgressBar(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressBar")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRadioButtonMenuItem(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RadioButtonMenuItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTitlePane(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TitlePane")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToolbar(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Toolbar")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToolbarSeparator(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToolbarSeparator")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTooltip(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tooltip")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTooltipDialog(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TooltipDialog")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTree(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tree")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWidgetSet(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WidgetSet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withById(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withForm(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayout(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegistry(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registry")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

