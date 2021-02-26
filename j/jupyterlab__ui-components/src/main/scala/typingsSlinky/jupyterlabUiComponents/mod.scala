package typingsSlinky.jupyterlabUiComponents

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.jupyterlabUiComponents.anon.IOptionsloadingbooleanund
import typingsSlinky.jupyterlabUiComponents.anon.Icon
import typingsSlinky.jupyterlabUiComponents.anon.Ignore
import typingsSlinky.jupyterlabUiComponents.anon.PartialIResolverPropsIPro
import typingsSlinky.jupyterlabUiComponents.anon.PartialIResolverPropsIRea
import typingsSlinky.jupyterlabUiComponents.blueprintMod.CommonProps
import typingsSlinky.jupyterlabUiComponents.blueprintMod.IButtonProps
import typingsSlinky.jupyterlabUiComponents.blueprintMod.IInputGroupProps
import typingsSlinky.jupyterlabUiComponents.htmlselectMod.IHTMLSelectProps
import typingsSlinky.jupyterlabUiComponents.jupyterlabUiComponentsBooleans.`false`
import typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon.IIcon
import typingsSlinky.luminoCoreutils.mod.Token
import typingsSlinky.luminoWidgets.contextmenuMod.ContextMenu.IOptions
import typingsSlinky.luminoWidgets.mod.Menu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/ui-components", "Button")
  @js.native
  def Button(props: IButtonProps with CommonProps[_]): ReactElement = js.native
  
  @JSImport("@jupyterlab/ui-components", "Checkbox")
  @js.native
  def Checkbox(
    props: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ICheckboxProps */ js.Any) with CommonProps[_]
  ): ReactElement = js.native
  
  @JSImport("@jupyterlab/ui-components", "Collapse")
  @js.native
  def Collapse(
    props: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ICollapseProps */ js.Any) with CommonProps[_]
  ): ReactElement = js.native
  
  object CommandPaletteSvg {
    
    /**
      * a modified implementation of the CommandPalette Renderer
      */
    @JSImport("@jupyterlab/ui-components", "CommandPaletteSvg.Renderer")
    @js.native
    class Renderer ()
      extends typingsSlinky.jupyterlabUiComponents.iconMod.CommandPaletteSvg.Renderer
    
    @JSImport("@jupyterlab/ui-components", "CommandPaletteSvg.defaultRenderer")
    @js.native
    val defaultRenderer: typingsSlinky.jupyterlabUiComponents.commandpalettesvgMod.CommandPaletteSvg.Renderer = js.native
  }
  
  @JSImport("@jupyterlab/ui-components", "ContextMenuSvg")
  @js.native
  class ContextMenuSvg protected ()
    extends typingsSlinky.jupyterlabUiComponents.iconMod.ContextMenuSvg {
    /**
      * Construct a new context menu.
      *
      * @param options - The options for initializing the menu.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/ui-components", "DEFAULT_STYLE_CLASS")
  @js.native
  val DEFAULT_STYLE_CLASS: /* "jp-DefaultStyle" */ String = js.native
  
  @JSImport("@jupyterlab/ui-components", "DockPanelSvg")
  @js.native
  /**
    * Construct a new dock panel.
    *
    * @param options - The options for initializing the panel.
    */
  class DockPanelSvg ()
    extends typingsSlinky.jupyterlabUiComponents.iconMod.DockPanelSvg {
    def this(options: typingsSlinky.luminoWidgets.dockpanelMod.DockPanel.IOptions) = this()
  }
  object DockPanelSvg {
    
    /**
      * A modified implementation of the DockPanel Renderer.
      */
    @JSImport("@jupyterlab/ui-components", "DockPanelSvg.Renderer")
    @js.native
    class Renderer ()
      extends typingsSlinky.jupyterlabUiComponents.iconMod.DockPanelSvg.Renderer
    
    @JSImport("@jupyterlab/ui-components", "DockPanelSvg.defaultRenderer")
    @js.native
    val defaultRenderer: typingsSlinky.jupyterlabUiComponents.tabbarsvgMod.DockPanelSvg.Renderer = js.native
  }
  
  @JSImport("@jupyterlab/ui-components", "HTMLSelect")
  @js.native
  class HTMLSelect protected ()
    extends typingsSlinky.jupyterlabUiComponents.componentsMod.HTMLSelect {
    def this(props: IHTMLSelectProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IHTMLSelectProps, context: js.Any) = this()
  }
  
  @JSImport("@jupyterlab/ui-components", "HTML_SELECT_CLASS")
  @js.native
  val HTML_SELECT_CLASS: /* "jp-HTMLSelect" */ String = js.native
  
  @JSImport("@jupyterlab/ui-components", "ILabIconManager")
  @js.native
  val ILabIconManager: Token[typingsSlinky.jupyterlabUiComponents.tokensMod.ILabIconManager] = js.native
  
  @JSImport("@jupyterlab/ui-components", "InputGroup")
  @js.native
  def InputGroup(props: IInputGroupProps with CommonProps[_]): ReactElement = js.native
  
  @JSImport("@jupyterlab/ui-components", "LabIcon")
  @js.native
  class LabIcon protected ()
    extends typingsSlinky.jupyterlabUiComponents.iconMod.LabIcon {
    /** *********
      * members *
      ***********/
    def this(hasNameSvgstrRenderUnrender_loading: IOptionsloadingbooleanund) = this()
  }
  /* static members */
  object LabIcon {
    
    @JSImport("@jupyterlab/ui-components", "LabIcon")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@jupyterlab/ui-components", "LabIcon._debug")
    @js.native
    def _debug: js.Any = js.native
    @scala.inline
    def _debug_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_debug")(x.asInstanceOf[js.Any])
    
    @JSImport("@jupyterlab/ui-components", "LabIcon._instances")
    @js.native
    def _instances: js.Any = js.native
    @scala.inline
    def _instances_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instances")(x.asInstanceOf[js.Any])
    
    /** *********
      * statics *
      ***********/
    /**
      * Remove any rendered icon from the element that contains it
      *
      * @param container - a DOM node into which an icon was
      * previously rendered
      *
      * @returns the cleaned container
      */
    @JSImport("@jupyterlab/ui-components", "LabIcon.remove")
    @js.native
    def remove(container: HTMLElement): HTMLElement = js.native
    
    /**
      * Resolve an icon name or a {name, svgstr} pair into an
      * actual LabIcon.
      *
      * @param icon - either a string with the name of an existing icon
      * or an object with {name: string, svgstr: string} fields.
      *
      * @returns a LabIcon instance
      */
    @JSImport("@jupyterlab/ui-components", "LabIcon.resolve")
    @js.native
    def resolve(hasIcon: Icon): typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
    
    /**
      * Resolve an icon name or a {name, svgstr} pair into a DOM element.
      * If icon arg is undefined, the function will fall back to trying to render
      * the icon as a CSS background image, via the iconClass arg.
      * If both icon and iconClass are undefined, this function will return
      * an empty div.
      *
      * @param icon - optional, either a string with the name of an existing icon
      * or an object with {name: string, svgstr: string} fields
      *
      * @param iconClass - optional, if the icon arg is not set, the iconClass arg
      * should be a CSS class associated with an existing CSS background-image
      *
      * @deprecated fallback - don't use, optional, a LabIcon instance that will
      * be used if neither icon nor iconClass are defined
      *
      * @param props - any additional args are passed though to the element method
      * of the resolved icon on render
      *
      * @returns a DOM node with the resolved icon rendered into it
      */
    @JSImport("@jupyterlab/ui-components", "LabIcon.resolveElement")
    @js.native
    def resolveElement(hasIconIconClassFallbackProps: PartialIResolverPropsIPro): HTMLElement = js.native
    
    /**
      * Resolve an icon name or a {name, svgstr} pair into a React component.
      * If icon arg is undefined, the function will fall back to trying to render
      * the icon as a CSS background image, via the iconClass arg.
      * If both icon and iconClass are undefined, the returned component
      * will simply render an empty div.
      *
      * @param icon - optional, either a string with the name of an existing icon
      * or an object with {name: string, svgstr: string} fields
      *
      * @param iconClass - optional, if the icon arg is not set, the iconClass arg
      * should be a CSS class associated with an existing CSS background-image
      *
      * @deprecated fallback - don't use, optional, a LabIcon instance that will
      * be used if neither icon nor iconClass are defined
      *
      * @param props - any additional args are passed though to the React component
      * of the resolved icon on render
      *
      * @returns a React component that will render the resolved icon
      */
    @JSImport("@jupyterlab/ui-components", "LabIcon.resolveReact")
    @js.native
    def resolveReact(hasIconIconClassFallbackProps: PartialIResolverPropsIRea): ReactElement = js.native
    
    /**
      * Resolve a {name, svgstr} pair into an actual svg node.
      */
    @JSImport("@jupyterlab/ui-components", "LabIcon.resolveSvg")
    @js.native
    def resolveSvg(hasNameSvgstr: IIcon): HTMLElement | Null = js.native
    
    /**
      * Toggle icon debug from off-to-on, or vice-versa.
      *
      * @param debug - optional boolean to force debug on or off
      */
    @JSImport("@jupyterlab/ui-components", "LabIcon.toggleDebug")
    @js.native
    def toggleDebug(): Unit = js.native
    @JSImport("@jupyterlab/ui-components", "LabIcon.toggleDebug")
    @js.native
    def toggleDebug(debug: Boolean): Unit = js.native
  }
  
  @JSImport("@jupyterlab/ui-components", "MenuSvg")
  @js.native
  class MenuSvg protected ()
    extends typingsSlinky.jupyterlabUiComponents.iconMod.MenuSvg {
    /**
      * construct a new menu. Overrides the default renderer
      *
      * @param options - The options for initializing the tab bar.
      */
    def this(options: typingsSlinky.luminoWidgets.menuMod.Menu.IOptions) = this()
  }
  object MenuSvg {
    
    /**
      * a modified implementation of the Menu Renderer
      */
    @JSImport("@jupyterlab/ui-components", "MenuSvg.Renderer")
    @js.native
    /**
      * Construct a new renderer.
      */
    class Renderer ()
      extends typingsSlinky.jupyterlabUiComponents.iconMod.MenuSvg.Renderer
    
    @JSImport("@jupyterlab/ui-components", "MenuSvg.defaultRenderer")
    @js.native
    val defaultRenderer: typingsSlinky.jupyterlabUiComponents.menusvgMod.MenuSvg.Renderer = js.native
    
    @JSImport("@jupyterlab/ui-components", "MenuSvg.overrideDefaultRenderer")
    @js.native
    def overrideDefaultRenderer(menu: Menu): Unit = js.native
  }
  
  @JSImport("@jupyterlab/ui-components", "Select")
  @js.native
  def Select(
    props: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISelectProps<any> */ js.Any) with CommonProps[_]
  ): ReactElement = js.native
  
  @JSImport("@jupyterlab/ui-components", "TabBarSvg")
  @js.native
  /**
    * Construct a new tab bar. Overrides the default renderer.
    *
    * @param options - The options for initializing the tab bar.
    */
  class TabBarSvg[T] ()
    extends typingsSlinky.jupyterlabUiComponents.iconMod.TabBarSvg[T] {
    def this(options: typingsSlinky.luminoWidgets.tabbarMod.TabBar.IOptions[T]) = this()
  }
  object TabBarSvg {
    
    /**
      * A modified implementation of the TabBar Renderer.
      */
    @JSImport("@jupyterlab/ui-components", "TabBarSvg.Renderer")
    @js.native
    /**
      * Construct a new renderer.
      */
    class Renderer ()
      extends typingsSlinky.jupyterlabUiComponents.iconMod.TabBarSvg.Renderer
    
    @JSImport("@jupyterlab/ui-components", "TabBarSvg.defaultRenderer")
    @js.native
    val defaultRenderer: typingsSlinky.jupyterlabUiComponents.tabbarsvgMod.TabBarSvg.Renderer = js.native
  }
  
  @JSImport("@jupyterlab/ui-components", "addIcon")
  @js.native
  val addIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "badIcon")
  @js.native
  val badIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "blankIcon")
  @js.native
  val blankIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "bugIcon")
  @js.native
  val bugIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "buildIcon")
  @js.native
  val buildIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "caretDownEmptyIcon")
  @js.native
  val caretDownEmptyIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "caretDownEmptyThinIcon")
  @js.native
  val caretDownEmptyThinIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "caretDownIcon")
  @js.native
  val caretDownIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "caretLeftIcon")
  @js.native
  val caretLeftIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "caretRightIcon")
  @js.native
  val caretRightIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "caretUpEmptyThinIcon")
  @js.native
  val caretUpEmptyThinIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "caretUpIcon")
  @js.native
  val caretUpIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "caseSensitiveIcon")
  @js.native
  val caseSensitiveIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "checkIcon")
  @js.native
  val checkIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "circleEmptyIcon")
  @js.native
  val circleEmptyIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "circleIcon")
  @js.native
  val circleIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "classesDedupe")
  @js.native
  def classesDedupe_false(classes: (js.UndefOr[String | `false` | Null | StringDictionary[js.Any]])*): String = js.native
  
  @JSImport("@jupyterlab/ui-components", "classes")
  @js.native
  def classes_false(classes: (js.UndefOr[String | `false` | Null | StringDictionary[js.Any]])*): String = js.native
  
  @JSImport("@jupyterlab/ui-components", "clearIcon")
  @js.native
  val clearIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "closeIcon")
  @js.native
  val closeIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "consoleIcon")
  @js.native
  val consoleIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "copyIcon")
  @js.native
  val copyIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "cutIcon")
  @js.native
  val cutIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "downloadIcon")
  @js.native
  val downloadIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "editIcon")
  @js.native
  val editIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "ellipsesIcon")
  @js.native
  val ellipsesIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "extensionIcon")
  @js.native
  val extensionIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "fastForwardIcon")
  @js.native
  val fastForwardIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "fileIcon")
  @js.native
  val fileIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "fileUploadIcon")
  @js.native
  val fileUploadIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "filterListIcon")
  @js.native
  val filterListIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "folderIcon")
  @js.native
  val folderIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "getReactAttrs")
  @js.native
  def getReactAttrs(elem: Element): js.Any = js.native
  @JSImport("@jupyterlab/ui-components", "getReactAttrs")
  @js.native
  def getReactAttrs(elem: Element, hasIgnore: Ignore): js.Any = js.native
  
  @JSImport("@jupyterlab/ui-components", "html5Icon")
  @js.native
  val html5Icon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "imageIcon")
  @js.native
  val imageIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "inspectorIcon")
  @js.native
  val inspectorIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "jsonIcon")
  @js.native
  val jsonIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "jupyterFaviconIcon")
  @js.native
  val jupyterFaviconIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "jupyterIcon")
  @js.native
  val jupyterIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "jupyterlabWordmarkIcon")
  @js.native
  val jupyterlabWordmarkIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "kernelIcon")
  @js.native
  val kernelIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "keyboardIcon")
  @js.native
  val keyboardIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "launcherIcon")
  @js.native
  val launcherIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "lineFormIcon")
  @js.native
  val lineFormIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "linkIcon")
  @js.native
  val linkIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "listIcon")
  @js.native
  val listIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "listingsInfoIcon")
  @js.native
  val listingsInfoIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "markdownIcon")
  @js.native
  val markdownIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "newFolderIcon")
  @js.native
  val newFolderIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "notTrustedIcon")
  @js.native
  val notTrustedIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "notebookIcon")
  @js.native
  val notebookIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "paletteIcon")
  @js.native
  val paletteIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "pasteIcon")
  @js.native
  val pasteIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "pythonIcon")
  @js.native
  val pythonIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "rKernelIcon")
  @js.native
  val rKernelIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "reactIcon")
  @js.native
  val reactIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "redoIcon")
  @js.native
  val redoIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "refreshIcon")
  @js.native
  val refreshIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "regexIcon")
  @js.native
  val regexIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "runIcon")
  @js.native
  val runIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "runningIcon")
  @js.native
  val runningIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "saveIcon")
  @js.native
  val saveIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "searchIcon")
  @js.native
  val searchIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "settingsIcon")
  @js.native
  val settingsIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "spreadsheetIcon")
  @js.native
  val spreadsheetIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "stopIcon")
  @js.native
  val stopIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "tabIcon")
  @js.native
  val tabIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "terminalIcon")
  @js.native
  val terminalIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "textEditorIcon")
  @js.native
  val textEditorIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "trustedIcon")
  @js.native
  val trustedIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "undoIcon")
  @js.native
  val undoIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "vegaIcon")
  @js.native
  val vegaIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "yamlIcon")
  @js.native
  val yamlIcon: typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon = js.native
}
