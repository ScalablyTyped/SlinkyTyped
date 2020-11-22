package typingsSlinky.jupyterlabUiComponents.labiconMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import typingsSlinky.jupyterlabUiComponents.anon.IOptionsloadingbooleanund
import typingsSlinky.jupyterlabUiComponents.anon.PartialIRenderer
import typingsSlinky.jupyterlabUiComponents.anon.Title
import typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon.IIcon
import typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon.IProps
import typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon.IReact
import typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon.IRendererOptions
import typingsSlinky.luminoSignaling.mod.Signal
import typingsSlinky.luminoVirtualdom.mod.VirtualElement.IRenderer
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/ui-components/lib/icon/labicon", "LabIcon")
@js.native
class LabIcon_ protected ()
  extends IIcon
     with IRenderer {
  /** *********
    * members *
    ***********/
  def this(hasNameSvgstrRenderUnrender_loading: IOptionsloadingbooleanund) = this()
  
  var _className: String = js.native
  
  /* protected */ def _initReact(displayName: String): ForwardRefExoticComponent[IProps with RefAttributes[SVGElement]] = js.native
  
  /* protected */ def _initRender(hasRenderUnrender: PartialIRenderer): Unit = js.native
  
  /* protected */ def _initSvg(): HTMLElement | Null = js.native
  /* protected */ def _initSvg(hasTitleUuid: Title): HTMLElement | Null = js.native
  
  var _loading: Boolean = js.native
  
  var _props: IProps = js.native
  
  /**
    * Cache for svg parsing intermediates
    *   - undefined: the cache has not yet been populated
    *   - null: a valid, but empty, value
    */
  var _svgElement: js.UndefOr[HTMLElement | Null] = js.native
  
  var _svgInnerHTML: js.UndefOr[String | Null] = js.native
  
  var _svgReactAttrs: js.UndefOr[js.Any | Null] = js.native
  
  var _svgReplaced: Signal[this.type, Unit] = js.native
  
  var _svgstr: String = js.native
  
  var _uuid: String = js.native
  
  /**
    * Get a view of this icon that is bound to the specified icon/style props
    *
    * @param optional icon/style props (same as args for .element
    * and .react methods). These will be bound to the resulting view
    *
    * @returns a view of this LabIcon instance
    */
  def bindprops(): js.Any = js.native
  def bindprops(props: IProps): js.Any = js.native
  
  /**
    * Create an icon as a DOM element
    *
    * @param className - a string that will be used as the class
    * of the container element. Overrides any existing class
    *
    * @param container - a preexisting DOM element that
    * will be used as the container for the svg element
    *
    * @param label - text that will be displayed adjacent
    * to the icon
    *
    * @param title - a tooltip for the icon
    *
    * @param tag - if container is not explicitly
    * provided, this tag will be used when creating the container
    *
    * @param stylesheet - optional string naming a builtin icon
    * stylesheet, for example 'menuItem' or `statusBar`. Can also be an
    * object defining a custom icon stylesheet, or a list of builtin
    * stylesheet names and/or custom stylesheet objects. If array,
    * the given stylesheets will be merged.
    *
    *   See @jupyterlab/ui-components/src/style/icon.ts for details
    *
    * @param elementPosition - optional position for the inner svg element
    *
    * @param elementSize - optional size for the inner svg element.
    * Set to 'normal' to get a standard 16px x 16px icon
    *
    * @param ...elementCSS - all additional args are treated as
    * overrides for the CSS props applied to the inner svg element
    *
    * @returns A DOM element that contains an (inline) svg element
    * that displays an icon
    */
  def element(): HTMLElement = js.native
  def element(props: IProps): HTMLElement = js.native
  
  /**
    * A React component that will create the icon.
    *
    * @param className - a string that will be used as the class
    * of the container element. Overrides any existing class
    *
    * @param container - a preexisting DOM element that
    * will be used as the container for the svg element
    *
    * @param label - text that will be displayed adjacent
    * to the icon
    *
    * @param title - a tooltip for the icon
    *
    * @param tag - if container is not explicitly
    * provided, this tag will be used when creating the container
    *
    * @param stylesheet - optional string naming a builtin icon
    * stylesheet, for example 'menuItem' or `statusBar`. Can also be an
    * object defining a custom icon stylesheet, or a list of builtin
    * stylesheet names and/or custom stylesheet objects. If array,
    * the given stylesheets will be merged.
    *
    *   See @jupyterlab/ui-components/src/style/icon.ts for details
    *
    * @param elementPosition - optional position for the inner svg element
    *
    * @param elementSize - optional size for the inner svg element.
    * Set to 'normal' to get a standard 16px x 16px icon
    *
    * @param ...elementCSS - all additional args are treated as
    * overrides for the CSS props applied to the inner svg element
    *
    * @param ref - forwarded to the ref prop of the icon's svg element
    */
  val react: IReact = js.native
  
  def render(container: HTMLElement, options: IRendererOptions): Unit = js.native
  
  /* protected */ def svgElement: HTMLElement | Null = js.native
  
  /* protected */ def svgInnerHTML: String | Null = js.native
  
  /* protected */ def svgReactAttrs: js.Any | Null = js.native
  
  @JSName("svgstr")
  def svgstr_MLabIcon_ : String = js.native
  
  @JSName("unrender")
  var unrender_LabIcon_ : js.UndefOr[
    js.Function2[/* container */ HTMLElement, /* options */ js.UndefOr[IRendererOptions], Unit]
  ] = js.native
}
