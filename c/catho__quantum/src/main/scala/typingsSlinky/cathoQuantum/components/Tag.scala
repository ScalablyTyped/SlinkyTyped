package typingsSlinky.cathoQuantum.components

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.button.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.anon.ColorsComponentsSpacing
import typingsSlinky.cathoQuantum.cathoQuantumStrings.error
import typingsSlinky.cathoQuantum.cathoQuantumStrings.large
import typingsSlinky.cathoQuantum.cathoQuantumStrings.medium
import typingsSlinky.cathoQuantum.cathoQuantumStrings.neutral
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.small
import typingsSlinky.cathoQuantum.cathoQuantumStrings.success
import typingsSlinky.cathoQuantum.cathoQuantumStrings.warning
import typingsSlinky.cathoQuantum.tagMod.TagProps
import typingsSlinky.cathoQuantum.tagMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tag {
  
  @JSImport("@catho/quantum/Tag", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def bold(value: Boolean): this.type = set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClose(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): this.type = set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def size(value: small | medium | large): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def skin(value: neutral | primary | success | warning | error): this.type = set("skin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stroked(value: Boolean): this.type = set("stroked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: ColorsComponentsSpacing): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TagProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Tag.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
