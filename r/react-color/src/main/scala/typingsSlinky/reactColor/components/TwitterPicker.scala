package typingsSlinky.reactColor.components

import typingsSlinky.reactColor.twitterMod.TwitterPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TwitterPicker {
  @JSImport("react-color", "TwitterPicker")
  @js.native
  object component extends js.Object
  
  def withProps(p: TwitterPickerProps): SharedBuilder_TwitterPickerProps_1235431115[typingsSlinky.reactColor.mod.TwitterPicker] = new SharedBuilder_TwitterPickerProps_1235431115[typingsSlinky.reactColor.mod.TwitterPicker](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TwitterPicker.type): SharedBuilder_TwitterPickerProps_1235431115[typingsSlinky.reactColor.mod.TwitterPicker] = new SharedBuilder_TwitterPickerProps_1235431115[typingsSlinky.reactColor.mod.TwitterPicker](js.Array(this.component, js.Dictionary.empty))()
}

