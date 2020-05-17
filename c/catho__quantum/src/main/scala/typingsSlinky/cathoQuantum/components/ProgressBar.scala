package typingsSlinky.cathoQuantum.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.anon.ComponentsProgressBar
import typingsSlinky.cathoQuantum.cathoQuantumStrings.neutral
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.secondary
import typingsSlinky.cathoQuantum.progressBarMod.ProgressBarProps
import typingsSlinky.cathoQuantum.progressBarMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ProgressBar {
  @JSImport("@catho/quantum/ProgressBar", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def progressPercent(value: Double): this.type = set("progressPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def progressText(value: Double): this.type = set("progressText", value.asInstanceOf[js.Any])
    @scala.inline
    def skin(value: neutral | primary | secondary): this.type = set("skin", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ComponentsProgressBar): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ProgressBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ProgressBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

