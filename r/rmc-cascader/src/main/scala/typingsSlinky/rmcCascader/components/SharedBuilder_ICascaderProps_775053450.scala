package typingsSlinky.rmcCascader.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rmcCascader.cascaderTypesMod.CascaderOneValue
import typingsSlinky.rmcCascader.cascaderTypesMod.CascaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_ICascaderProps_775053450[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def cols(value: Double): this.type = set("cols", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultValue(value: CascaderValue): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultValueVarargs(value: CascaderOneValue*): this.type = set("defaultValue", js.Array(value :_*))
  
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def indicatorStyle(value: js.Object): this.type = set("indicatorStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onChange(value: /* value */ CascaderValue => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onScrollChange(value: /* value */ CascaderValue => Unit): this.type = set("onScrollChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def pickerItemStyle(value: js.Object): this.type = set("pickerItemStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def pickerPrefixCls(value: String): this.type = set("pickerPrefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rootNativeProps(value: js.Object): this.type = set("rootNativeProps", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def value(value: CascaderValue): this.type = set("value", value.asInstanceOf[js.Any])
  
  @scala.inline
  def valueVarargs(value: CascaderOneValue*): this.type = set("value", js.Array(value :_*))
}
