package typingsSlinky.reactColor.components

import typingsSlinky.reactColor.twitterMod.TwitterPickerProps
import typingsSlinky.reactColor.twitterMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Twitter {
  @JSImport("react-color/lib/components/twitter/Twitter", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: TwitterPickerProps): SharedBuilder_TwitterPickerProps_1235431115[default] = new SharedBuilder_TwitterPickerProps_1235431115[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Twitter.type): SharedBuilder_TwitterPickerProps_1235431115[default] = new SharedBuilder_TwitterPickerProps_1235431115[default](js.Array(this.component, js.Dictionary.empty))()
}

