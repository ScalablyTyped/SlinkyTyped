package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.anon.InsertExtraNode
import typingsSlinky.antd.waveMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Wave {
  
  @JSImport("antd/lib/_util/wave", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def insertExtraNode(value: Boolean): this.type = set("insertExtraNode", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Wave.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InsertExtraNode): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
