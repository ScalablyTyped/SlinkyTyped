package typingsSlinky.jupyterlabApputils

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLCollection
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLSelectElement
import slinky.core.facade.ReactElement
import typingsSlinky.jupyterlabApputils.anon.PartialIButton
import typingsSlinky.jupyterlabApputils.anon.ReadonlyIButton
import typingsSlinky.jupyterlabApputils.clipboardMod.ClipboardData
import typingsSlinky.jupyterlabApputils.collapseMod.Collapse.IOptions
import typingsSlinky.jupyterlabApputils.dialogMod.Dialog.IButton
import typingsSlinky.jupyterlabApputils.dialogMod.Dialog.IResult
import typingsSlinky.jupyterlabApputils.inputdialogMod.InputDialog.IBooleanOptions
import typingsSlinky.jupyterlabApputils.inputdialogMod.InputDialog.IItemOptions
import typingsSlinky.jupyterlabApputils.inputdialogMod.InputDialog.INumberOptions
import typingsSlinky.jupyterlabApputils.inputdialogMod.InputDialog.ITextOptions
import typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.copy
import typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.cut
import typingsSlinky.jupyterlabApputils.printingMod.Printing.OptionalAsyncThunk
import typingsSlinky.jupyterlabApputils.sanitizerMod.ISanitizer
import typingsSlinky.jupyterlabApputils.sessioncontextMod.ISessionContext
import typingsSlinky.jupyterlabApputils.sessioncontextMod.ISessionContext.IDialogs
import typingsSlinky.jupyterlabApputils.sessioncontextMod.SessionContext.IKernelSearch
import typingsSlinky.jupyterlabApputils.toolbarMod.CommandToolbarButtonComponent.IProps
import typingsSlinky.jupyterlabApputils.vdomMod.IUseSignalProps
import typingsSlinky.jupyterlabApputils.vdomMod.ReactRenderElement
import typingsSlinky.jupyterlabApputils.vdomMod.VDomRenderer.IModel
import typingsSlinky.luminoCoreutils.mod.MimeData
import typingsSlinky.luminoCoreutils.mod.Token
import typingsSlinky.luminoWidgets.mod.Widget
import typingsSlinky.std.HTMLCollectionOf
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Clipboard {
    
    /**
      * Copy text to the system clipboard.
      *
      * #### Notes
      * This can only be called in response to a user input event.
      */
    @JSImport("@jupyterlab/apputils", "Clipboard.copyToSystem")
    @js.native
    def copyToSystem(clipboardData: ClipboardData): Unit = js.native
    
    /**
      * Generate a clipboard event on a node.
      *
      * @param node - The element on which to generate the event.
      *
      * @param type - The type of event to generate.
      *   `'paste'` events cannot be programmatically generated.
      *
      * #### Notes
      * This can only be called in response to a user input event.
      */
    @JSImport("@jupyterlab/apputils", "Clipboard.generateEvent")
    @js.native
    def generateEvent(node: HTMLElement): Unit = js.native
    @JSImport("@jupyterlab/apputils", "Clipboard.generateEvent")
    @js.native
    def generateEvent_copy(node: HTMLElement, `type`: copy): Unit = js.native
    @JSImport("@jupyterlab/apputils", "Clipboard.generateEvent")
    @js.native
    def generateEvent_cut(node: HTMLElement, `type`: cut): Unit = js.native
    
    /**
      * Get the application clipboard instance.
      */
    @JSImport("@jupyterlab/apputils", "Clipboard.getInstance")
    @js.native
    def getInstance(): MimeData = js.native
    
    /**
      * Set the application clipboard instance.
      */
    @JSImport("@jupyterlab/apputils", "Clipboard.setInstance")
    @js.native
    def setInstance(value: MimeData): Unit = js.native
  }
  
  @JSImport("@jupyterlab/apputils", "Collapse")
  @js.native
  class Collapse[T /* <: Widget */] protected ()
    extends typingsSlinky.jupyterlabApputils.collapseMod.Collapse[T] {
    def this(options: IOptions[T]) = this()
  }
  
  @JSImport("@jupyterlab/apputils", "CommandLinker")
  @js.native
  class CommandLinker protected ()
    extends typingsSlinky.jupyterlabApputils.commandlinkerMod.CommandLinker {
    /**
      * Instantiate a new command linker.
      */
    def this(options: typingsSlinky.jupyterlabApputils.commandlinkerMod.CommandLinker.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/apputils", "CommandToolbarButton")
  @js.native
  class CommandToolbarButton protected ()
    extends typingsSlinky.jupyterlabApputils.toolbarMod.CommandToolbarButton {
    /**
      * Creates a command toolbar button
      * @param props props for underlying `CommandToolbarButtonComponent` componenent
      */
    def this(props: IProps) = this()
  }
  
  object CommandToolbarButtonComponent {
    
    @JSImport("@jupyterlab/apputils", "CommandToolbarButtonComponent")
    @js.native
    def apply(props: IProps): ReactElement = js.native
  }
  
  object DOMUtils {
    
    /**
      * Create a DOM id with prefix "id-" to solve bug for UUIDs beginning with numbers.
      */
    @JSImport("@jupyterlab/apputils", "DOMUtils.createDomID")
    @js.native
    def createDomID(): String = js.native
    
    /**
      * Find the first element matching a class name.
      */
    @JSImport("@jupyterlab/apputils", "DOMUtils.findElement")
    @js.native
    def findElement(parent: HTMLElement, className: String): HTMLElement = js.native
    
    /**
      * Find the first element matching a class name.
      */
    @JSImport("@jupyterlab/apputils", "DOMUtils.findElements")
    @js.native
    def findElements(parent: HTMLElement, className: String): HTMLCollectionOf[HTMLElement] = js.native
    
    /**
      * Get the index of the node at a client position, or `-1`.
      */
    @JSImport("@jupyterlab/apputils", "DOMUtils.hitTestNodes")
    @js.native
    def hitTestNodes(nodes: js.Array[HTMLElement], x: Double, y: Double): Double = js.native
    @JSImport("@jupyterlab/apputils", "DOMUtils.hitTestNodes")
    @js.native
    def hitTestNodes(nodes: HTMLCollection, x: Double, y: Double): Double = js.native
  }
  
  @JSImport("@jupyterlab/apputils", "Dialog")
  @js.native
  /**
    * Create a dialog panel instance.
    *
    * @param options - The dialog setup options.
    */
  class Dialog[T] ()
    extends typingsSlinky.jupyterlabApputils.dialogMod.Dialog[T] {
    def this(options: Partial[typingsSlinky.jupyterlabApputils.dialogMod.Dialog.IOptions[T]]) = this()
  }
  object Dialog {
    
    /**
      * The default implementation of a dialog renderer.
      */
    @JSImport("@jupyterlab/apputils", "Dialog.Renderer")
    @js.native
    class Renderer ()
      extends typingsSlinky.jupyterlabApputils.dialogMod.Dialog.Renderer
    
    /**
      * Create a reject button.
      */
    @JSImport("@jupyterlab/apputils", "Dialog.cancelButton")
    @js.native
    def cancelButton(): ReadonlyIButton = js.native
    @JSImport("@jupyterlab/apputils", "Dialog.cancelButton")
    @js.native
    def cancelButton(options: PartialIButton): ReadonlyIButton = js.native
    
    /**
      * Create a button item.
      */
    @JSImport("@jupyterlab/apputils", "Dialog.createButton")
    @js.native
    def createButton(value: PartialIButton): ReadonlyIButton = js.native
    
    /**
      * The default renderer instance.
      */
    @JSImport("@jupyterlab/apputils", "Dialog.defaultRenderer")
    @js.native
    val defaultRenderer: typingsSlinky.jupyterlabApputils.dialogMod.Dialog.Renderer = js.native
    
    /**
      * Disposes all dialog instances.
      *
      * #### Notes
      * This function should only be used in tests or cases where application state
      * may be discarded.
      */
    @JSImport("@jupyterlab/apputils", "Dialog.flush")
    @js.native
    def flush(): Unit = js.native
    
    /**
      * Create an accept button.
      */
    @JSImport("@jupyterlab/apputils", "Dialog.okButton")
    @js.native
    def okButton(): ReadonlyIButton = js.native
    @JSImport("@jupyterlab/apputils", "Dialog.okButton")
    @js.native
    def okButton(options: PartialIButton): ReadonlyIButton = js.native
    
    /**
      * The dialog widget tracker.
      */
    @JSImport("@jupyterlab/apputils", "Dialog.tracker")
    @js.native
    val tracker: typingsSlinky.jupyterlabApputils.widgettrackerMod.WidgetTracker[typingsSlinky.jupyterlabApputils.dialogMod.Dialog[js.Any]] = js.native
    
    /**
      * Create a warn button.
      */
    @JSImport("@jupyterlab/apputils", "Dialog.warnButton")
    @js.native
    def warnButton(): ReadonlyIButton = js.native
    @JSImport("@jupyterlab/apputils", "Dialog.warnButton")
    @js.native
    def warnButton(options: PartialIButton): ReadonlyIButton = js.native
  }
  
  object HoverBox {
    
    /**
      * Set the visible dimensions of a hovering box anchored to an editor cursor.
      *
      * @param options - The hover box geometry calculation options.
      */
    @JSImport("@jupyterlab/apputils", "HoverBox.setGeometry")
    @js.native
    def setGeometry(options: typingsSlinky.jupyterlabApputils.hoverboxMod.HoverBox.IOptions): Unit = js.native
  }
  
  @JSImport("@jupyterlab/apputils", "ICommandPalette")
  @js.native
  val ICommandPalette: Token[typingsSlinky.jupyterlabApputils.commandpaletteMod.ICommandPalette] = js.native
  
  @JSImport("@jupyterlab/apputils", "IFrame")
  @js.native
  /**
    * Create a new IFrame widget.
    */
  class IFrame ()
    extends typingsSlinky.jupyterlabApputils.iframeMod.IFrame {
    def this(options: typingsSlinky.jupyterlabApputils.iframeMod.IFrame.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/apputils", "ISessionContextDialogs")
  @js.native
  val ISessionContextDialogs: Token[IDialogs] = js.native
  
  @JSImport("@jupyterlab/apputils", "ISplashScreen")
  @js.native
  val ISplashScreen: Token[typingsSlinky.jupyterlabApputils.splashMod.ISplashScreen] = js.native
  
  object IThemeManager extends Shortcut {
    
    @JSImport("@jupyterlab/apputils", "IThemeManager")
    @js.native
    val ^ : Token[typingsSlinky.jupyterlabApputils.tokensMod.IThemeManager] = js.native
    
    type _To = Token[typingsSlinky.jupyterlabApputils.tokensMod.IThemeManager]
    
    /* This means you don't have to write `^`, but can instead just say `IThemeManager.foo` */
    override def _to: Token[typingsSlinky.jupyterlabApputils.tokensMod.IThemeManager] = ^
  }
  
  @JSImport("@jupyterlab/apputils", "IWindowResolver")
  @js.native
  val IWindowResolver: Token[typingsSlinky.jupyterlabApputils.windowresolverMod.IWindowResolver] = js.native
  
  object InputDialog {
    
    /**
      * Create and show a input dialog for a boolean.
      *
      * @param options - The dialog setup options.
      *
      * @returns A promise that resolves with whether the dialog was accepted
      */
    @JSImport("@jupyterlab/apputils", "InputDialog.getBoolean")
    @js.native
    def getBoolean(options: IBooleanOptions): js.Promise[IResult[Boolean]] = js.native
    
    /**
      * Create and show a input dialog for a choice.
      *
      * @param options - The dialog setup options.
      *
      * @returns A promise that resolves with whether the dialog was accepted
      */
    @JSImport("@jupyterlab/apputils", "InputDialog.getItem")
    @js.native
    def getItem(options: IItemOptions): js.Promise[IResult[String]] = js.native
    
    /**
      * Create and show a input dialog for a number.
      *
      * @param options - The dialog setup options.
      *
      * @returns A promise that resolves with whether the dialog was accepted
      */
    @JSImport("@jupyterlab/apputils", "InputDialog.getNumber")
    @js.native
    def getNumber(options: INumberOptions): js.Promise[IResult[Double]] = js.native
    
    /**
      * Create and show a input dialog for a password.
      *
      * @param options - The dialog setup options.
      *
      * @returns A promise that resolves with whether the dialog was accepted
      */
    @JSImport("@jupyterlab/apputils", "InputDialog.getPassword")
    @js.native
    def getPassword(options: ITextOptions): js.Promise[IResult[String]] = js.native
    
    /**
      * Create and show a input dialog for a text.
      *
      * @param options - The dialog setup options.
      *
      * @returns A promise that resolves with whether the dialog was accepted
      */
    @JSImport("@jupyterlab/apputils", "InputDialog.getText")
    @js.native
    def getText(options: ITextOptions): js.Promise[IResult[String]] = js.native
  }
  
  @JSImport("@jupyterlab/apputils", "MainAreaWidget")
  @js.native
  class MainAreaWidget[T /* <: Widget */] protected ()
    extends typingsSlinky.jupyterlabApputils.mainareawidgetMod.MainAreaWidget[T] {
    /**
      * Construct a new main area widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: typingsSlinky.jupyterlabApputils.mainareawidgetMod.MainAreaWidget.IOptions[T]) = this()
  }
  
  object Printing {
    
    /**
      * Returns the print function for an object, or null if it does not provide a handler.
      */
    @JSImport("@jupyterlab/apputils", "Printing.getPrintFunction")
    @js.native
    def getPrintFunction(`val`: js.Any): OptionalAsyncThunk = js.native
    
    /**
      * Returns whether an object implements a print method.
      */
    @JSImport("@jupyterlab/apputils", "Printing.isPrintable")
    @js.native
    def isPrintable(a: js.Any): /* is @jupyterlab/apputils.@jupyterlab/apputils/lib/printing.Printing.IPrintable */ Boolean = js.native
    
    /**
      * Prints a URL by loading it into an iframe.
      *
      * @param url URL to load into an iframe.
      */
    @JSImport("@jupyterlab/apputils", "Printing.printURL")
    @js.native
    def printURL(url: String): js.Promise[Unit] = js.native
    
    /**
      * Prints a widget by copying it's DOM node
      * to a hidden iframe and printing that iframe.
      */
    @JSImport("@jupyterlab/apputils", "Printing.printWidget")
    @js.native
    def printWidget(widget: Widget): js.Promise[Unit] = js.native
    
    /**
      * Symbol to use for a method that returns a function to print an object.
      */
    @JSImport("@jupyterlab/apputils", "Printing.symbol")
    @js.native
    val symbol: js.Symbol = js.native
  }
  
  @JSImport("@jupyterlab/apputils", "ReactWidget")
  @js.native
  /**
    * Construct a new widget.
    *
    * @param options - The options for initializing the widget.
    */
  abstract class ReactWidget ()
    extends typingsSlinky.jupyterlabApputils.vdomMod.ReactWidget {
    def this(options: typingsSlinky.luminoWidgets.widgetMod.Widget.IOptions) = this()
  }
  /* static members */
  object ReactWidget {
    
    /**
      * Creates a new `ReactWidget` that renders a constant element.
      * @param element React element to render.
      */
    @JSImport("@jupyterlab/apputils", "ReactWidget.create")
    @js.native
    def create(element: ReactRenderElement): typingsSlinky.jupyterlabApputils.vdomMod.ReactWidget = js.native
  }
  
  @JSImport("@jupyterlab/apputils", "SessionContext")
  @js.native
  class SessionContext protected ()
    extends typingsSlinky.jupyterlabApputils.sessioncontextMod.SessionContext {
    /**
      * Construct a new session context.
      */
    def this(options: typingsSlinky.jupyterlabApputils.sessioncontextMod.SessionContext.IOptions) = this()
  }
  object SessionContext {
    
    /**
      * Get the default kernel name given select options.
      */
    @JSImport("@jupyterlab/apputils", "SessionContext.getDefaultKernel")
    @js.native
    def getDefaultKernel(options: IKernelSearch): String | Null = js.native
  }
  
  @JSImport("@jupyterlab/apputils", "Spinner")
  @js.native
  /**
    * Construct a spinner widget.
    */
  class Spinner ()
    extends typingsSlinky.jupyterlabApputils.spinnerMod.Spinner
  
  object Styling {
    
    /**
      * Style a node and its child elements with the default tag names.
      *
      * @param node - The base node.
      *
      * @param className - The optional CSS class to add to styled nodes.
      */
    @JSImport("@jupyterlab/apputils", "Styling.styleNode")
    @js.native
    def styleNode(node: HTMLElement): Unit = js.native
    @JSImport("@jupyterlab/apputils", "Styling.styleNode")
    @js.native
    def styleNode(node: HTMLElement, className: String): Unit = js.native
    
    /**
      * Style a node and its elements that have a given tag name.
      *
      * @param node - The base node.
      *
      * @param tagName - The html tag name to style.
      *
      * @param className - The optional CSS class to add to styled nodes.
      */
    @JSImport("@jupyterlab/apputils", "Styling.styleNodeByTag")
    @js.native
    def styleNodeByTag(node: HTMLElement, tagName: String): Unit = js.native
    @JSImport("@jupyterlab/apputils", "Styling.styleNodeByTag")
    @js.native
    def styleNodeByTag(node: HTMLElement, tagName: String, className: String): Unit = js.native
    
    /**
      * Wrap a select node.
      */
    @JSImport("@jupyterlab/apputils", "Styling.wrapSelect")
    @js.native
    def wrapSelect(node: HTMLSelectElement): HTMLElement = js.native
  }
  
  @JSImport("@jupyterlab/apputils", "ThemeManager")
  @js.native
  class ThemeManager protected ()
    extends typingsSlinky.jupyterlabApputils.thememanagerMod.ThemeManager {
    /**
      * Construct a new theme manager.
      */
    def this(options: typingsSlinky.jupyterlabApputils.thememanagerMod.ThemeManager.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/apputils", "Toolbar")
  @js.native
  /**
    * Construct a new toolbar widget.
    */
  class Toolbar[T /* <: Widget */] ()
    extends typingsSlinky.jupyterlabApputils.toolbarMod.Toolbar[T]
  object Toolbar {
    
    /**
      * Create an interrupt toolbar item.
      */
    @JSImport("@jupyterlab/apputils", "Toolbar.createInterruptButton")
    @js.native
    def createInterruptButton(sessionContext: ISessionContext): Widget = js.native
    
    /**
      * Create a kernel name indicator item.
      *
      * #### Notes
      * It will display the `'display_name`' of the session context. It can
      * handle a change in context or kernel.
      */
    @JSImport("@jupyterlab/apputils", "Toolbar.createKernelNameItem")
    @js.native
    def createKernelNameItem(sessionContext: ISessionContext): Widget = js.native
    @JSImport("@jupyterlab/apputils", "Toolbar.createKernelNameItem")
    @js.native
    def createKernelNameItem(sessionContext: ISessionContext, dialogs: IDialogs): Widget = js.native
    
    /**
      * Create a kernel status indicator item.
      *
      * #### Notes
      * It will show a busy status if the kernel status is busy.
      * It will show the current status in the node title.
      * It can handle a change to the context or the kernel.
      */
    @JSImport("@jupyterlab/apputils", "Toolbar.createKernelStatusItem")
    @js.native
    def createKernelStatusItem(sessionContext: ISessionContext): Widget = js.native
    
    /**
      * Create a restart toolbar item.
      */
    @JSImport("@jupyterlab/apputils", "Toolbar.createRestartButton")
    @js.native
    def createRestartButton(sessionContext: ISessionContext): Widget = js.native
    @JSImport("@jupyterlab/apputils", "Toolbar.createRestartButton")
    @js.native
    def createRestartButton(sessionContext: ISessionContext, dialogs: IDialogs): Widget = js.native
    
    /**
      * Create a toolbar spacer item.
      *
      * #### Notes
      * It is a flex spacer that separates the left toolbar items
      * from the right toolbar items.
      */
    @JSImport("@jupyterlab/apputils", "Toolbar.createSpacerItem")
    @js.native
    def createSpacerItem(): Widget = js.native
  }
  
  @JSImport("@jupyterlab/apputils", "ToolbarButton")
  @js.native
  /**
    * Creates a toolbar button
    * @param props props for underlying `ToolbarButton` componenent
    */
  class ToolbarButton ()
    extends typingsSlinky.jupyterlabApputils.toolbarMod.ToolbarButton {
    def this(props: typingsSlinky.jupyterlabApputils.toolbarMod.ToolbarButtonComponent.IProps) = this()
  }
  
  object ToolbarButtonComponent {
    
    @JSImport("@jupyterlab/apputils", "ToolbarButtonComponent")
    @js.native
    def apply(props: typingsSlinky.jupyterlabApputils.toolbarMod.ToolbarButtonComponent.IProps): ReactElement = js.native
  }
  
  @JSImport("@jupyterlab/apputils", "UseSignal")
  @js.native
  class UseSignal[SENDER, ARGS] protected ()
    extends typingsSlinky.jupyterlabApputils.vdomMod.UseSignal[SENDER, ARGS] {
    def this(props: IUseSignalProps[SENDER, ARGS]) = this()
  }
  
  @JSImport("@jupyterlab/apputils", "VDomModel")
  @js.native
  class VDomModel ()
    extends typingsSlinky.jupyterlabApputils.vdomMod.VDomModel
  
  @JSImport("@jupyterlab/apputils", "VDomRenderer")
  @js.native
  abstract class VDomRenderer[T /* <: IModel | Null */] protected ()
    extends typingsSlinky.jupyterlabApputils.vdomMod.VDomRenderer[T] {
    /**
      * Create a new VDomRenderer
      */
    def this(model: T | Unit) = this()
  }
  
  @JSImport("@jupyterlab/apputils", "WidgetTracker")
  @js.native
  class WidgetTracker[T /* <: Widget */] protected ()
    extends typingsSlinky.jupyterlabApputils.widgettrackerMod.WidgetTracker[T] {
    /**
      * Create a new widget tracker.
      *
      * @param options - The instantiation options for a widget tracker.
      */
    def this(options: typingsSlinky.jupyterlabApputils.widgettrackerMod.WidgetTracker.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/apputils", "WindowResolver")
  @js.native
  class WindowResolver ()
    extends typingsSlinky.jupyterlabApputils.windowresolverMod.WindowResolver
  
  @JSImport("@jupyterlab/apputils", "addCommandToolbarButtonClass")
  @js.native
  def addCommandToolbarButtonClass(w: Widget): Widget = js.native
  
  @JSImport("@jupyterlab/apputils", "addToolbarButtonClass")
  @js.native
  def addToolbarButtonClass(w: Widget): Widget = js.native
  
  @JSImport("@jupyterlab/apputils", "defaultSanitizer")
  @js.native
  val defaultSanitizer: ISanitizer = js.native
  
  @JSImport("@jupyterlab/apputils", "sessionContextDialogs")
  @js.native
  val sessionContextDialogs: IDialogs = js.native
  
  @JSImport("@jupyterlab/apputils", "showDialog")
  @js.native
  def showDialog[T](): js.Promise[IResult[T]] = js.native
  @JSImport("@jupyterlab/apputils", "showDialog")
  @js.native
  def showDialog[T](options: Partial[typingsSlinky.jupyterlabApputils.dialogMod.Dialog.IOptions[T]]): js.Promise[IResult[T]] = js.native
  
  @JSImport("@jupyterlab/apputils", "showErrorMessage")
  @js.native
  def showErrorMessage(title: String, error: js.Any): js.Promise[Unit] = js.native
  @JSImport("@jupyterlab/apputils", "showErrorMessage")
  @js.native
  def showErrorMessage(title: String, error: js.Any, buttons: js.Array[IButton]): js.Promise[Unit] = js.native
}
