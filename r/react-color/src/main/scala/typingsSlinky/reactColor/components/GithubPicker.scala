package typingsSlinky.reactColor.components

import typingsSlinky.reactColor.githubMod.GithubPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GithubPicker {
  
  @JSImport("react-color", "GithubPicker")
  @js.native
  object component extends js.Object
  
  def withProps(p: GithubPickerProps): SharedBuilder_GithubPickerProps1409653094[typingsSlinky.reactColor.mod.GithubPicker] = new SharedBuilder_GithubPickerProps1409653094[typingsSlinky.reactColor.mod.GithubPicker](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: GithubPicker.type): SharedBuilder_GithubPickerProps1409653094[typingsSlinky.reactColor.mod.GithubPicker] = new SharedBuilder_GithubPickerProps1409653094[typingsSlinky.reactColor.mod.GithubPicker](js.Array(this.component, js.Dictionary.empty))()
}
