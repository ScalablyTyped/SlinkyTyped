package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.anon.PathString
import typingsSlinky.gestalt.gestaltStrings.blue
import typingsSlinky.gestalt.gestaltStrings.darkGray
import typingsSlinky.gestalt.gestaltStrings.gray
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.lightGray
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.gestaltStrings.orange
import typingsSlinky.gestalt.gestaltStrings.red
import typingsSlinky.gestalt.gestaltStrings.sm
import typingsSlinky.gestalt.gestaltStrings.transparent
import typingsSlinky.gestalt.gestaltStrings.transparentDarkGray
import typingsSlinky.gestalt.gestaltStrings.white
import typingsSlinky.gestalt.gestaltStrings.xl
import typingsSlinky.gestalt.gestaltStrings.xs
import typingsSlinky.gestalt.mod.Icons
import typingsSlinky.gestalt.mod.PogProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pog {
  
  @JSImport("gestalt", "Pog")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.Pog] {
    
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgColor(value: transparent | lightGray | white | gray | blue | transparentDarkGray): this.type = set("bgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dangerouslySetSvgPath(value: PathString): this.type = set("dangerouslySetSvgPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focused(value: Boolean): this.type = set("focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hovered(value: Boolean): this.type = set("hovered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: Icons): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconColor(value: blue | darkGray | gray | red | white | orange): this.type = set("iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: xs | sm | md | lg | xl): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PogProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Pog.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
