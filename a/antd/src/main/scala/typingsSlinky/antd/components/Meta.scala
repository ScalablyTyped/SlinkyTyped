package typingsSlinky.antd.components

import typingsSlinky.antd.metaMod.CardMetaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Meta {
  
  @JSImport("antd/lib/card/Meta", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Meta.type): SharedBuilder_CardMetaProps1450922115 = new SharedBuilder_CardMetaProps1450922115(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CardMetaProps): SharedBuilder_CardMetaProps1450922115 = new SharedBuilder_CardMetaProps1450922115(js.Array(this.component, p.asInstanceOf[js.Any]))
}
