package typingsSlinky.reactCssTransitionReplace.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactCssTransitionReplace.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactCssTransitionReplace {
  @JSImport("react-css-transition-replace", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def changeWidth(value: Boolean): this.type = set("changeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def overflowHidden(value: Boolean): this.type = set("overflowHidden", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactCssTransitionReplace.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

