package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLSpanElement
import typingsSlinky.antd.anon.PickAntdIconPropschildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Success {
  
  @JSImport("antd/lib/result", "IconMap.success")
  @js.native
  object component extends js.Object
  
  def withProps(p: PickAntdIconPropschildren): SharedBuilder_PickAntdIconPropschildren_1258851850[HTMLSpanElement] = new SharedBuilder_PickAntdIconPropschildren_1258851850[HTMLSpanElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Success.type): SharedBuilder_PickAntdIconPropschildren_1258851850[HTMLSpanElement] = new SharedBuilder_PickAntdIconPropschildren_1258851850[HTMLSpanElement](js.Array(this.component, js.Dictionary.empty))()
}
