package typingsSlinky.cathoQuantum.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.cathoQuantum.anon.`13`
import typingsSlinky.cathoQuantum.anon.`1`
import typingsSlinky.cathoQuantum.cathoQuantumStrings.button
import typingsSlinky.cathoQuantum.cathoQuantumStrings.circle
import typingsSlinky.cathoQuantum.cathoQuantumStrings.large
import typingsSlinky.cathoQuantum.cathoQuantumStrings.medium
import typingsSlinky.cathoQuantum.cathoQuantumStrings.rect
import typingsSlinky.cathoQuantum.cathoQuantumStrings.small
import typingsSlinky.cathoQuantum.cathoQuantumStrings.text
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xsmall
import typingsSlinky.cathoQuantum.skeletonMod.SkeletonButtonProps
import typingsSlinky.cathoQuantum.skeletonMod.SkeletonProps
import typingsSlinky.cathoQuantum.skeletonMod.SkeletonTagProps
import typingsSlinky.cathoQuantum.skeletonMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Skeleton {
  @JSImport("@catho/quantum/Skeleton", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: xsmall | small | medium | large): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: `13`): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: rect | circle | text | button | typingsSlinky.cathoQuantum.cathoQuantumStrings.tag): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SkeletonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Skeleton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  object Button {
    @JSImport("@catho/quantum/Skeleton", "default.Button")
    @js.native
    object component extends js.Object
    
    def withProps(p: SkeletonButtonProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(size: xsmall | small | medium | large, theme: `1`): Default[tag.type, js.Object] = {
        val __props = js.Dynamic.literal(size = size.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
        new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[SkeletonButtonProps]))
    }
  }
  
  object Circle {
    @JSImport("@catho/quantum/Skeleton", "default.Circle")
    @js.native
    object component extends js.Object
    
    def withProps(p: js.Object): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Circle.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Tag {
    @JSImport("@catho/quantum/Skeleton", "default.Tag")
    @js.native
    object component extends js.Object
    
    def withProps(p: SkeletonTagProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(size: xsmall | small | medium | large, theme: `13`): Default[tag.type, js.Object] = {
        val __props = js.Dynamic.literal(size = size.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
        new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[SkeletonTagProps]))
    }
  }
  
  object Text {
    @JSImport("@catho/quantum/Skeleton", "default.Text")
    @js.native
    object component extends js.Object
    
    def withProps(p: js.Object): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Text.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
  }
  
}

