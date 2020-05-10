package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.growlMod.GrowlMessage
import typingsSlinky.primereact.growlMod.GrowlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Growl {
  @JSImport("primereact/growl", "Growl")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactGrowlMod.Growl] {
    @scala.inline
    def baseZIndex(value: Double): this.type = set("baseZIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: /* message */ GrowlMessage => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onClose(value: /* message */ GrowlMessage => Unit): this.type = set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def onRemove(value: /* message */ GrowlMessage => Unit): this.type = set("onRemove", js.Any.fromFunction1(value))
    @scala.inline
    def position(value: String): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GrowlProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Growl.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

