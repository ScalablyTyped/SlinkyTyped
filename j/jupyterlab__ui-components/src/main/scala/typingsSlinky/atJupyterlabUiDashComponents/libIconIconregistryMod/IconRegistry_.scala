package typingsSlinky.atJupyterlabUiDashComponents.libIconIconregistryMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.atJupyterlabUiDashComponents.Anon_ContainerHTMLElement
import typingsSlinky.atJupyterlabUiDashComponents.Anon_Div
import typingsSlinky.atJupyterlabUiDashComponents.libIconIconregistryMod.IconRegistry.IOptions
import typingsSlinky.atJupyterlabUiDashComponents.libIconInterfacesMod.IIconRegistry
import typingsSlinky.atJupyterlabUiDashComponents.libIconInterfacesMod.Icon.IModel
import typingsSlinky.atJupyterlabUiDashComponents.libIconInterfacesMod.Icon.INodeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/ui-components/lib/icon/iconregistry", "IconRegistry")
@js.native
class IconRegistry_ () extends IIconRegistry {
  def this(options: IOptions) = this()
  var _classNameToName: js.Any = js.native
  var _debug: js.Any = js.native
  var _nameToClassName: js.Any = js.native
  var _resolveName: js.Any = js.native
  var _svg: js.Any = js.native
  /**
    * Add the raw text representation of an svg icon to this registry
    */
  /* CompleteClass */
  override def addIcon(icons: IModel*): Unit = js.native
  /**
    * Check if any icon of name `name` has been registered.
    * Exact matches only
    */
  /* CompleteClass */
  override def contains(name: String): Boolean = js.native
  /**
    * Get the icon as an HTMLElement of tag <svg><svg/>
    */
  /* CompleteClass */
  override def icon(props: INodeOptions with Anon_ContainerHTMLElement): HTMLElement | Null = js.native
  /**
    * Get the icon as a ReactElement of tag <tag><svg><svg/><tag/>
    */
  /* CompleteClass */
  override def iconReact(props: INodeOptions with Anon_Div): ReactElement = js.native
  def resolveName(name: String): String = js.native
  def resolveSvg(name: String): HTMLElement | Null = js.native
  def svg(name: String): String = js.native
}

