package typingsSlinky.antd.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.errorBoundaryMod.ErrorBoundaryProps
import typingsSlinky.antd.errorBoundaryMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ErrorBoundary {
  @JSImport("antd/lib/alert/ErrorBoundary", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def descriptionReactElement(value: ReactElement): this.type = set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def description(value: TagMod[Any]): this.type = set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def messageReactElement(value: ReactElement): this.type = set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def message(value: TagMod[Any]): this.type = set("message", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ErrorBoundaryProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ErrorBoundary.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

