package typingsSlinky.reactNepalMap.components

import typingsSlinky.reactNepalMap.mod.MapPropsTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ZonalMap {
  
  @JSImport("react-nepal-map", "ZonalMap")
  @js.native
  object component extends js.Object
  
  def withProps(p: MapPropsTypes): SharedBuilder_MapPropsTypes532102299 = new SharedBuilder_MapPropsTypes532102299(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ZonalMap.type): SharedBuilder_MapPropsTypes532102299 = new SharedBuilder_MapPropsTypes532102299(js.Array(this.component, js.Dictionary.empty))()
}
