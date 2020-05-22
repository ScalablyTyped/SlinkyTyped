package typingsSlinky.jupyterlabUiComponents.interfacesMod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.jupyterlabUiComponents.anon.INodeOptionscontainerHTMLAlignContent
import typingsSlinky.jupyterlabUiComponents.anon.INodeOptionstagdivspan
import typingsSlinky.jupyterlabUiComponents.interfacesMod.Icon.IModel
import typingsSlinky.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIconRegistry extends js.Object {
  /**
    * Add the raw text representation of an svg icon to this registry
    */
  def addIcon(icons: IModel*): Unit
  /**
    * Check if any icon of name `name` has been registered.
    * Exact matches only
    */
  def contains(name: String): Boolean
  /**
    * Get the icon as an HTMLElement of tag <svg><svg/>
    */
  def icon(props: INodeOptionscontainerHTMLAlignContent): HTMLElement | Null
  /**
    * Get the icon as a ReactElement of tag <tag><svg><svg/><tag/>
    */
  def iconReact(props: INodeOptionstagdivspan): ReactElement
}

@JSImport("@jupyterlab/ui-components/lib/icon/interfaces", "IIconRegistry")
@js.native
object IIconRegistry extends TopLevel[Token[IIconRegistry]]

