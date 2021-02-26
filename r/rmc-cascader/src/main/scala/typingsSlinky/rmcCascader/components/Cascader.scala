package typingsSlinky.rmcCascader.components

import typingsSlinky.rmcCascader.cascaderMod.default
import typingsSlinky.rmcCascader.cascaderTypesMod.ICascaderDataItem
import typingsSlinky.rmcCascader.cascaderTypesMod.ICascaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Cascader {
  
  @scala.inline
  def apply(data: js.Array[ICascaderDataItem]): SharedBuilder_ICascaderProps_775053450[default] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new SharedBuilder_ICascaderProps_775053450[default](js.Array(this.component, __props.asInstanceOf[ICascaderProps]))
  }
  
  @JSImport("rmc-cascader/lib/Cascader", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ICascaderProps): SharedBuilder_ICascaderProps_775053450[default] = new SharedBuilder_ICascaderProps_775053450[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
