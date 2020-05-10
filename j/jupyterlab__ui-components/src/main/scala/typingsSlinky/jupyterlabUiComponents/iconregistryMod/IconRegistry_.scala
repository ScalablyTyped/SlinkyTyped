package typingsSlinky.jupyterlabUiComponents.iconregistryMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jupyterlabUiComponents.INodeOptionscontainerHTML
import typingsSlinky.jupyterlabUiComponents.iconregistryMod.IconRegistry.IOptions
import typingsSlinky.jupyterlabUiComponents.interfacesMod.IIconRegistry
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
    * Get the icon as an HTMLElement of tag <svg><svg/>
    */
  def icon(props: INodeOptionscontainerHTML): HTMLElement | Null = js.native
  def resolveName(name: String): String = js.native
  def resolveSvg(name: String): HTMLElement | Null = js.native
  def svg(name: String): String = js.native
}

