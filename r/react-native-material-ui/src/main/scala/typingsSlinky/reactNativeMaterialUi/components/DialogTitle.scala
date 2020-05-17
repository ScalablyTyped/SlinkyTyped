package typingsSlinky.reactNativeMaterialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeMaterialUi.anon.TitleContainer
import typingsSlinky.reactNativeMaterialUi.mod.Dialog.Title
import typingsSlinky.reactNativeMaterialUi.mod.DialogTitleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DialogTitle {
  @JSImport("react-native-material-ui", "Dialog.Title")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, Title] {
    @scala.inline
    def style(value: TitleContainer): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DialogTitleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DialogTitle.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

