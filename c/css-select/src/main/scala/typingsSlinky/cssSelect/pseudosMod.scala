package typingsSlinky.cssSelect

import typingsSlinky.cssSelect.typesMod.InternalOptions
import typingsSlinky.cssWhat.parseMod.DataType
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("css-select/lib/pseudo-selectors/pseudos", JSImport.Namespace)
@js.native
object pseudosMod extends js.Object {
  
  val pseudos: Record[String, Pseudo] = js.native
  
  def verifyPseudoArgs(func: Pseudo, name: String, subselect: DataType): Unit = js.native
  
  type Pseudo = js.Function3[
    /* elem */ js.Any, 
    /* options */ InternalOptions[js.Any, js.Any], 
    /* subselect */ js.UndefOr[js.Any | String | Null], 
    Boolean
  ]
}
