package typingsSlinky.reactColor.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.reactColor.anon.PartialClassesSliderPicke
import typingsSlinky.reactColor.mod.Color
import typingsSlinky.reactColor.mod.ColorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_SliderPickerProps_2143603056[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def color(value: Color): this.type = set("color", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onChange(value: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
  
  @scala.inline
  def onChangeComplete(value: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): this.type = set("onChangeComplete", js.Any.fromFunction2(value))
  
  @scala.inline
  def styles(value: PartialClassesSliderPicke): this.type = set("styles", value.asInstanceOf[js.Any])
}
