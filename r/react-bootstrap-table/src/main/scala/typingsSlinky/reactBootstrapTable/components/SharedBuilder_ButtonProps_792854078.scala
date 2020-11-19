package typingsSlinky.reactBootstrapTable.components

import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_ButtonProps_792854078[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def btnContextual(value: String): this.type = set("btnContextual", value.asInstanceOf[js.Any])
  
  @scala.inline
  def btnGlyphicon(value: String): this.type = set("btnGlyphicon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def btnText(value: String): this.type = set("btnText", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onClick(value: /* e */ SyntheticMouseEvent[_] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
}
