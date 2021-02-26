package typingsSlinky.reactIcofont.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactIcofont.mod.IcofontProps
import typingsSlinky.reactIcofont.mod.default
import typingsSlinky.reactIcofont.reactIcofontStrings.`10`
import typingsSlinky.reactIcofont.reactIcofontStrings.`180`
import typingsSlinky.reactIcofont.reactIcofontStrings.`1`
import typingsSlinky.reactIcofont.reactIcofontStrings.`270`
import typingsSlinky.reactIcofont.reactIcofontStrings.`2`
import typingsSlinky.reactIcofont.reactIcofontStrings.`3`
import typingsSlinky.reactIcofont.reactIcofontStrings.`4`
import typingsSlinky.reactIcofont.reactIcofontStrings.`5`
import typingsSlinky.reactIcofont.reactIcofontStrings.`6`
import typingsSlinky.reactIcofont.reactIcofontStrings.`7`
import typingsSlinky.reactIcofont.reactIcofontStrings.`8`
import typingsSlinky.reactIcofont.reactIcofontStrings.`90`
import typingsSlinky.reactIcofont.reactIcofontStrings.`9`
import typingsSlinky.reactIcofont.reactIcofontStrings.h
import typingsSlinky.reactIcofont.reactIcofontStrings.v
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactIcofont {
  
  @scala.inline
  def apply(icon: String): Builder = {
    val __props = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IcofontProps]))
  }
  
  @JSImport("react-icofont", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flip(value: h | v): this.type = set("flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rotate(value: `90` | `180` | `270`): this.type = set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10`): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def spin(value: Boolean): this.type = set("spin", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IcofontProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
