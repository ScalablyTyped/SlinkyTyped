package typingsSlinky.reactShowMore.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactShowMore.mod.ReactShowMoreProps
import typingsSlinky.reactShowMore.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactShowMore {
  
  @JSImport("react-show-more", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def anchorClass(value: String): this.type = set("anchorClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def children(value: String): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def less(value: String): this.type = set("less", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lines(value: Double): this.type = set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def more(value: String): this.type = set("more", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactShowMore.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReactShowMoreProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
