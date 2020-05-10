package typingsSlinky.cathoQuantum.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.AnonGutter
import typingsSlinky.cathoQuantum.cathoQuantumStrings.large
import typingsSlinky.cathoQuantum.cathoQuantumStrings.medium
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.secondary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xlarge
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xxlarge
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xxxlarge
import typingsSlinky.cathoQuantum.circularLoaderMod.CircularLoaderProps
import typingsSlinky.cathoQuantum.circularLoaderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CircularLoader {
  @JSImport("@catho/quantum/CircularLoader", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def size(value: medium | large | xlarge | xxlarge | xxxlarge): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def skin(value: primary | secondary): this.type = set("skin", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: AnonGutter): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CircularLoaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CircularLoader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

