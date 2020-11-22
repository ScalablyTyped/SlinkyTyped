package typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.jupyterlabUiComponents.anon.Icon
import typingsSlinky.jupyterlabUiComponents.anon.PartialIResolverPropsIPro
import typingsSlinky.jupyterlabUiComponents.anon.PartialIResolverPropsIRea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/ui-components/lib/icon/labicon", "LabIcon")
@js.native
object ^ extends js.Object {
  
  var _debug: js.Any = js.native
  
  var _instances: js.Any = js.native
  
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
  def resolveReact(hasIconIconClassFallbackProps: PartialIResolverPropsIRea): ReactElement = js.native
  
  /**
    * Resolve a {name, svgstr} pair into an actual svg node.
    */
  def resolveSvg(hasNameSvgstr: IIcon): HTMLElement | Null = js.native
  
  /**
    * Toggle icon debug from off-to-on, or vice-versa.
    *
    * @param debug - optional boolean to force debug on or off
    */
  def toggleDebug(): Unit = js.native
  def toggleDebug(debug: Boolean): Unit = js.native
}
