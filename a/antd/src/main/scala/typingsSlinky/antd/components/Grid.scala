package typingsSlinky.antd.components

import typingsSlinky.antd.gridMod.CardGridProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Grid {
  
  @JSImport("antd/lib/card/Grid", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Grid.type): SharedBuilder_CardGridProps552494094 = new SharedBuilder_CardGridProps552494094(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CardGridProps): SharedBuilder_CardGridProps552494094 = new SharedBuilder_CardGridProps552494094(js.Array(this.component, p.asInstanceOf[js.Any]))
}
