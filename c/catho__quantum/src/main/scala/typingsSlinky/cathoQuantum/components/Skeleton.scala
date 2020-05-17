package typingsSlinky.cathoQuantum.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.anon.BaseFontSizeNumber
import typingsSlinky.cathoQuantum.cathoQuantumStrings.button
import typingsSlinky.cathoQuantum.cathoQuantumStrings.circle
import typingsSlinky.cathoQuantum.cathoQuantumStrings.large
import typingsSlinky.cathoQuantum.cathoQuantumStrings.medium
import typingsSlinky.cathoQuantum.cathoQuantumStrings.rect
import typingsSlinky.cathoQuantum.cathoQuantumStrings.small
import typingsSlinky.cathoQuantum.cathoQuantumStrings.text
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xsmall
import typingsSlinky.cathoQuantum.skeletonMod.SkeletonProps
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
    def theme(value: BaseFontSizeNumber): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: rect | circle | text | button | typingsSlinky.cathoQuantum.cathoQuantumStrings.tag): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SkeletonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Skeleton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

