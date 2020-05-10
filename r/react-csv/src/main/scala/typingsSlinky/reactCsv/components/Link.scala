package typingsSlinky.reactCsv.components

import typingsSlinky.reactCsv.commonPropTypesMod.Data
import typingsSlinky.reactCsv.linkMod.LinkProps
import typingsSlinky.reactCsv.linkMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Link {
  @JSImport("react-csv/components/Link", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: LinkProps): SharedBuilder_LinkProps1358107926[default] = new SharedBuilder_LinkProps1358107926[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(data: String | Data): SharedBuilder_LinkProps1358107926[default] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new SharedBuilder_LinkProps1358107926[default](js.Array(this.component, __props.asInstanceOf[LinkProps]))
  }
}

