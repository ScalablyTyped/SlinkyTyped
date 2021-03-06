package typingsSlinky.reactCsv.components

import typingsSlinky.reactCsv.commonPropTypesMod.Data
import typingsSlinky.reactCsv.linkMod.LinkProps
import typingsSlinky.reactCsv.linkMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Link {
  
  @scala.inline
  def apply(data: String | Data): SharedBuilder_LinkProps1358107926[default] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new SharedBuilder_LinkProps1358107926[default](js.Array(this.component, __props.asInstanceOf[LinkProps]))
  }
  
  @JSImport("react-csv/components/Link", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LinkProps): SharedBuilder_LinkProps1358107926[default] = new SharedBuilder_LinkProps1358107926[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
