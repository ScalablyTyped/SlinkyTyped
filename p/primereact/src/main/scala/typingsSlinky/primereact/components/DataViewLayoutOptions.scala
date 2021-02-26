package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.OriginalEventEvent
import typingsSlinky.primereact.dataViewMod.DataViewLayoutOptionsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataViewLayoutOptions {
  
  @scala.inline
  def apply(onChange: OriginalEventEvent => Unit): Builder = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    new Builder(js.Array(this.component, __props.asInstanceOf[DataViewLayoutOptionsProps]))
  }
  
  @JSImport("primereact/dataview", "DataViewLayoutOptions")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactDataviewMod.DataViewLayoutOptions] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def layout(value: String): this.type = set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: String): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DataViewLayoutOptionsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
