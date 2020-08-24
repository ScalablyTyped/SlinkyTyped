package typingsSlinky.reactMdForm.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMdForm.formThemeProviderMod.FormTheme
import typingsSlinky.reactMdForm.formThemeProviderMod.FormThemeProviderProps
import typingsSlinky.reactMdForm.formThemeProviderMod.FormUnderlineDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormThemeProvider {
  @JSImport("@react-md/form", "FormThemeProvider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def theme(value: FormTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def underlineDirection(value: FormUnderlineDirection): this.type = set("underlineDirection", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FormThemeProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FormThemeProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

