package typingsSlinky.gatsbyCli.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.gatsbyCli.errorMod.IErrorProps
import typingsSlinky.gatsbyCli.structuredErrorsTypesMod.IStructuredError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Error {
  
  @scala.inline
  def apply(details: IStructuredError): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(details = details.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[IErrorProps]))
  }
  
  @JSImport("gatsby-cli/lib/reporter/loggers/ink/components/error", "Error")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IErrorProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
