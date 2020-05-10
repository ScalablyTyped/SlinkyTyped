package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelBuilder extends js.Object {
  def button(): ComponentBuilder[ButtonComponent] = js.native
  /**
  		 * @deprecated please use radioCardGroup component.
  		 */
  def card(): ComponentBuilder[CardComponent] = js.native
  def checkBox(): ComponentBuilder[CheckBoxComponent] = js.native
  def dashboardWebview(webviewId: String): ComponentBuilder[DashboardWebviewComponent] = js.native
  def dashboardWidget(widgetId: String): ComponentBuilder[DashboardWidgetComponent] = js.native
  def declarativeTable(): ComponentBuilder[DeclarativeTableComponent] = js.native
  def diffeditor(): ComponentBuilder[DiffEditorComponent] = js.native
  def divContainer(): DivBuilder = js.native
  def dom(): ComponentBuilder[DomComponent] = js.native
  def dropDown(): ComponentBuilder[DropDownComponent] = js.native
  def editor(): ComponentBuilder[EditorComponent] = js.native
  def fileBrowserTree(): ComponentBuilder[FileBrowserTreeComponent] = js.native
  def flexContainer(): FlexBuilder = js.native
  def formContainer(): FormBuilder = js.native
  def groupContainer(): GroupBuilder = js.native
  def hyperlink(): ComponentBuilder[HyperlinkComponent] = js.native
  def image(): ComponentBuilder[ImageComponent] = js.native
  def inputBox(): ComponentBuilder[InputBoxComponent] = js.native
  def listBox(): ComponentBuilder[ListBoxComponent] = js.native
  def loadingComponent(): LoadingComponentBuilder = js.native
  def navContainer(): ContainerBuilder[NavContainer, _, _] = js.native
  def radioButton(): ComponentBuilder[RadioButtonComponent] = js.native
  def splitViewContainer(): SplitViewBuilder = js.native
  def table(): ComponentBuilder[TableComponent] = js.native
  def text(): ComponentBuilder[TextComponent] = js.native
  def toolbarContainer(): ToolbarBuilder = js.native
  def tree[T](): ComponentBuilder[TreeComponent[T]] = js.native
  def webView(): ComponentBuilder[WebViewComponent] = js.native
}

object ModelBuilder {
  @scala.inline
  def apply(
    button: () => ComponentBuilder[ButtonComponent],
    card: () => ComponentBuilder[CardComponent],
    checkBox: () => ComponentBuilder[CheckBoxComponent],
    dashboardWebview: String => ComponentBuilder[DashboardWebviewComponent],
    dashboardWidget: String => ComponentBuilder[DashboardWidgetComponent],
    declarativeTable: () => ComponentBuilder[DeclarativeTableComponent],
    diffeditor: () => ComponentBuilder[DiffEditorComponent],
    divContainer: () => DivBuilder,
    dom: () => ComponentBuilder[DomComponent],
    dropDown: () => ComponentBuilder[DropDownComponent],
    editor: () => ComponentBuilder[EditorComponent],
    fileBrowserTree: () => ComponentBuilder[FileBrowserTreeComponent],
    flexContainer: () => FlexBuilder,
    formContainer: () => FormBuilder,
    groupContainer: () => GroupBuilder,
    hyperlink: () => ComponentBuilder[HyperlinkComponent],
    image: () => ComponentBuilder[ImageComponent],
    inputBox: () => ComponentBuilder[InputBoxComponent],
    listBox: () => ComponentBuilder[ListBoxComponent],
    loadingComponent: () => LoadingComponentBuilder,
    navContainer: () => ContainerBuilder[NavContainer, _, _],
    radioButton: () => ComponentBuilder[RadioButtonComponent],
    splitViewContainer: () => SplitViewBuilder,
    table: () => ComponentBuilder[TableComponent],
    text: () => ComponentBuilder[TextComponent],
    toolbarContainer: () => ToolbarBuilder,
    tree: () => ComponentBuilder[TreeComponent[js.Any]],
    webView: () => ComponentBuilder[WebViewComponent]
  ): ModelBuilder = {
    val __obj = js.Dynamic.literal(button = js.Any.fromFunction0(button), card = js.Any.fromFunction0(card), checkBox = js.Any.fromFunction0(checkBox), dashboardWebview = js.Any.fromFunction1(dashboardWebview), dashboardWidget = js.Any.fromFunction1(dashboardWidget), declarativeTable = js.Any.fromFunction0(declarativeTable), diffeditor = js.Any.fromFunction0(diffeditor), divContainer = js.Any.fromFunction0(divContainer), dom = js.Any.fromFunction0(dom), dropDown = js.Any.fromFunction0(dropDown), editor = js.Any.fromFunction0(editor), fileBrowserTree = js.Any.fromFunction0(fileBrowserTree), flexContainer = js.Any.fromFunction0(flexContainer), formContainer = js.Any.fromFunction0(formContainer), groupContainer = js.Any.fromFunction0(groupContainer), hyperlink = js.Any.fromFunction0(hyperlink), image = js.Any.fromFunction0(image), inputBox = js.Any.fromFunction0(inputBox), listBox = js.Any.fromFunction0(listBox), loadingComponent = js.Any.fromFunction0(loadingComponent), navContainer = js.Any.fromFunction0(navContainer), radioButton = js.Any.fromFunction0(radioButton), splitViewContainer = js.Any.fromFunction0(splitViewContainer), table = js.Any.fromFunction0(table), text = js.Any.fromFunction0(text), toolbarContainer = js.Any.fromFunction0(toolbarContainer), tree = js.Any.fromFunction0(tree), webView = js.Any.fromFunction0(webView))
    __obj.asInstanceOf[ModelBuilder]
  }
  @scala.inline
  implicit class ModelBuilderOps[Self <: ModelBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButton(value: () => ComponentBuilder[ButtonComponent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCard(value: () => ComponentBuilder[CardComponent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCheckBox(value: () => ComponentBuilder[CheckBoxComponent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDashboardWebview(value: String => ComponentBuilder[DashboardWebviewComponent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashboardWebview")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDashboardWidget(value: String => ComponentBuilder[DashboardWidgetComponent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashboardWidget")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeclarativeTable(value: () => ComponentBuilder[DeclarativeTableComponent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declarativeTable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDiffeditor(value: () => ComponentBuilder[DiffEditorComponent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffeditor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDivContainer(value: () => DivBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divContainer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDom(value: () => ComponentBuilder[DomComponent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDropDown(value: () => ComponentBuilder[DropDownComponent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDown")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEditor(value: () => ComponentBuilder[EditorComponent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFileBrowserTree(value: () => ComponentBuilder[FileBrowserTreeComponent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileBrowserTree")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFlexContainer(value: () => FlexBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexContainer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFormContainer(value: () => FormBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formContainer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGroupContainer(value: () => GroupBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupContainer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHyperlink(value: () => ComponentBuilder[HyperlinkComponent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withImage(value: () => ComponentBuilder[ImageComponent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInputBox(value: () => ComponentBuilder[InputBoxComponent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withListBox(value: () => ComponentBuilder[ListBoxComponent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoadingComponent(value: () => LoadingComponentBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingComponent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNavContainer(value: () => ContainerBuilder[NavContainer, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navContainer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRadioButton(value: () => ComponentBuilder[RadioButtonComponent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioButton")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSplitViewContainer(value: () => SplitViewBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitViewContainer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTable(value: () => ComponentBuilder[TableComponent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withText(value: () => ComponentBuilder[TextComponent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToolbarContainer(value: () => ToolbarBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarContainer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTree(value: () => ComponentBuilder[TreeComponent[js.Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWebView(value: () => ComponentBuilder[WebViewComponent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webView")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

