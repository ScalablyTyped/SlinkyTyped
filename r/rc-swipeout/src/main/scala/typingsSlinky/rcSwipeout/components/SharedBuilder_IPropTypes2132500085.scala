package typingsSlinky.rcSwipeout.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcSwipeout.anon.ClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_IPropTypes2132500085[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def autoClose(value: Boolean): this.type = set("autoClose", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def left(value: js.Array[ClassName]): this.type = set("left", value.asInstanceOf[js.Any])
  
  @scala.inline
  def leftVarargs(value: ClassName*): this.type = set("left", js.Array(value :_*))
  
  @scala.inline
  def onClose(value: () => Unit): this.type = set("onClose", js.Any.fromFunction0(value))
  
  @scala.inline
  def onOpen(value: () => Unit): this.type = set("onOpen", js.Any.fromFunction0(value))
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def right(value: js.Array[ClassName]): this.type = set("right", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rightVarargs(value: ClassName*): this.type = set("right", js.Array(value :_*))
  
  @scala.inline
  def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
}
