package typingsSlinky.rmcCascader.components

import typingsSlinky.rmcCascader.cascaderMod.default
import typingsSlinky.rmcCascader.cascaderTypesMod.ICascaderDataItem
import typingsSlinky.rmcCascader.cascaderTypesMod.ICascaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Cascader {
  @JSImport("rmc-cascader/lib/Cascader", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ICascaderProps): SharedBuilder_ICascaderProps_775053450[default] = new SharedBuilder_ICascaderProps_775053450[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(data: js.Array[ICascaderDataItem]): SharedBuilder_ICascaderProps_775053450[default] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new SharedBuilder_ICascaderProps_775053450[default](js.Array(this.component, __props.asInstanceOf[ICascaderProps]))
  }
}

