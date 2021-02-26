package typingsSlinky.reactColor.components

import typingsSlinky.reactColor.githubMod.GithubPickerProps
import typingsSlinky.reactColor.githubMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Github {
  
  @JSImport("react-color/lib/components/github/Github", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Github.type): SharedBuilder_GithubPickerProps1409653094[default] = new SharedBuilder_GithubPickerProps1409653094[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GithubPickerProps): SharedBuilder_GithubPickerProps1409653094[default] = new SharedBuilder_GithubPickerProps1409653094[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
