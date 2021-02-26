package typingsSlinky.reactCsv.components

import typingsSlinky.reactCsv.commonPropTypesMod.Data
import typingsSlinky.reactCsv.linkMod.LinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CSVLink {
  
  @scala.inline
  def apply(data: String | Data): SharedBuilder_LinkProps1358107926[typingsSlinky.reactCsv.mod.CSVLink] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new SharedBuilder_LinkProps1358107926[typingsSlinky.reactCsv.mod.CSVLink](js.Array(this.component, __props.asInstanceOf[LinkProps]))
  }
  
  @JSImport("react-csv", "CSVLink")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LinkProps): SharedBuilder_LinkProps1358107926[typingsSlinky.reactCsv.mod.CSVLink] = new SharedBuilder_LinkProps1358107926[typingsSlinky.reactCsv.mod.CSVLink](js.Array(this.component, p.asInstanceOf[js.Any]))
}
