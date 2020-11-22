package typingsSlinky.inkBigText.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.inkBigText.inkBigTextStrings.`3d`
import typingsSlinky.inkBigText.inkBigTextStrings.black
import typingsSlinky.inkBigText.inkBigTextStrings.block
import typingsSlinky.inkBigText.inkBigTextStrings.blue
import typingsSlinky.inkBigText.inkBigTextStrings.center
import typingsSlinky.inkBigText.inkBigTextStrings.chrome
import typingsSlinky.inkBigText.inkBigTextStrings.cyan
import typingsSlinky.inkBigText.inkBigTextStrings.green
import typingsSlinky.inkBigText.inkBigTextStrings.grid
import typingsSlinky.inkBigText.inkBigTextStrings.huge
import typingsSlinky.inkBigText.inkBigTextStrings.left
import typingsSlinky.inkBigText.inkBigTextStrings.magenta
import typingsSlinky.inkBigText.inkBigTextStrings.pallet
import typingsSlinky.inkBigText.inkBigTextStrings.red
import typingsSlinky.inkBigText.inkBigTextStrings.right
import typingsSlinky.inkBigText.inkBigTextStrings.shade
import typingsSlinky.inkBigText.inkBigTextStrings.simple
import typingsSlinky.inkBigText.inkBigTextStrings.simple3d
import typingsSlinky.inkBigText.inkBigTextStrings.simpleBlock
import typingsSlinky.inkBigText.inkBigTextStrings.slick
import typingsSlinky.inkBigText.inkBigTextStrings.tiny
import typingsSlinky.inkBigText.inkBigTextStrings.transparent
import typingsSlinky.inkBigText.inkBigTextStrings.white
import typingsSlinky.inkBigText.inkBigTextStrings.yellow
import typingsSlinky.inkBigText.mod.BigTextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InkBigText {
  
  @JSImport("ink-big-text", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def align(value: left | center | right): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundColor(value: transparent | black | red | green | yellow | blue | magenta | cyan | white): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorsVarargs(value: String*): this.type = set("colors", js.Array(value :_*))
    
    @scala.inline
    def colors(value: js.Array[String]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def font(
      value: block | slick | tiny | grid | pallet | shade | simple | simpleBlock | `3d` | simple3d | chrome | huge
    ): this.type = set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def letterSpacing(value: Double): this.type = set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lineHeight(value: Double): this.type = set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def space(value: Boolean): this.type = set("space", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BigTextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(text: String): Builder = {
    val __props = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BigTextProps]))
  }
}
