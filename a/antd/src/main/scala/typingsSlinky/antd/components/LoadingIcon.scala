package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.loadingIconMod.LoadingIconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LoadingIcon {
  
  @scala.inline
  def apply(existIcon: Boolean, prefixCls: String): Builder = {
    val __props = js.Dynamic.literal(existIcon = existIcon.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LoadingIconProps]))
  }
  
  @JSImport("antd/lib/button/LoadingIcon", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def loading(value: Boolean | js.Object): this.type = set("loading", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LoadingIconProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
