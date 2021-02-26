package typingsSlinky.reactBodyClassname.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactBodyClassname.anon.ClassName
import typingsSlinky.reactBodyClassname.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactBodyClassname {
  
  @scala.inline
  def apply(className: String): Default[tag.type, ^] = {
    val __props = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    new Default[tag.type, ^](js.Array(this.component, __props.asInstanceOf[ClassName]))
  }
  
  @JSImport("react-body-classname", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ClassName): Default[tag.type, ^] = new Default[tag.type, ^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
