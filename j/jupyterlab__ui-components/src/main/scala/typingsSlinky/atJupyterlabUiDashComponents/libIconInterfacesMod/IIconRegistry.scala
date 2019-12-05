package typingsSlinky.atJupyterlabUiDashComponents.libIconInterfacesMod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.atJupyterlabUiDashComponents.Anon_ContainerHTMLElement
import typingsSlinky.atJupyterlabUiDashComponents.Anon_Div
import typingsSlinky.atJupyterlabUiDashComponents.libIconInterfacesMod.Icon.IModel
import typingsSlinky.atJupyterlabUiDashComponents.libIconInterfacesMod.Icon.INodeOptions
import typingsSlinky.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
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
  def icon(props: INodeOptions with Anon_ContainerHTMLElement): HTMLElement | Null
  /**
    * Get the icon as a ReactElement of tag <tag><svg><svg/><tag/>
    */
  def iconReact(props: INodeOptions with Anon_Div): ReactElement
}

@JSImport("@jupyterlab/ui-components/lib/icon/interfaces", "IIconRegistry")
@js.native
object IIconRegistry extends TopLevel[Token[IIconRegistry]]

