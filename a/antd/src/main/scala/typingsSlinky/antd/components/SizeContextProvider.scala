package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.sizeContextMod.AvatarSize
import typingsSlinky.antd.sizeContextMod.SizeContextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SizeContextProvider {
  
  @JSImport("antd/lib/avatar/SizeContext", "SizeContextProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def size(value: AvatarSize): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SizeContextProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SizeContextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
