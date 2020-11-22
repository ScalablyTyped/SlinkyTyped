package typingsSlinky.reactMdUtils

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/utils/types/bem", JSImport.Namespace)
@js.native
object bemMod extends js.Object {
  
  def bem(base: Block): BEMResult = js.native
  
  type BEMResult = js.Function2[
    /* elementOrModifier */ js.UndefOr[Element | Modifier], 
    /* modifier */ js.UndefOr[Modifier], 
    String
  ]
  
  type Block = String
  
  type Element = String
  
  type Modifier = Record[String, js.Any]
}
