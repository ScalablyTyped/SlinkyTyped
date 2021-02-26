package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLSpanElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.span.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_CheckableTagProps2088584901 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onChange(value: /* checked */ Boolean => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onClick(value: /* e */ SyntheticMouseEvent[HTMLSpanElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
}
