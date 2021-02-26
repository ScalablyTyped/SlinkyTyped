package typingsSlinky.mjmlReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.mjmlReact.mod.MjmlProps
import typingsSlinky.mjmlReact.mod.RequiredChildrenProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Mjml {
  
  @JSImport("mjml-react", "Mjml")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.Mjml] {
    
    @scala.inline
    def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def owa(value: String): this.type = set("owa", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Mjml.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MjmlProps with RequiredChildrenProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
