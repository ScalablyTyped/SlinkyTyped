package typingsSlinky.reactFns.components

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactFns.mediaMediaMod.MediaProps
import typingsSlinky.reactFns.typesMod.SharedRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Media {
  @JSImport("react-fns", "Media")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def componentFunctionComponent(value: ReactComponentClass[MediaProps | Unit]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def componentComponentClass(value: ReactComponentClass[MediaProps | Unit]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def component(value: ReactComponentClass[MediaProps | Unit]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def debug(value: Boolean): this.type = set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def render(value: MediaProps => TagMod[Any]): this.type = set("render", js.Any.fromFunction1(value))
  }
  
  def withProps(p: SharedRenderProps[MediaProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Media.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

