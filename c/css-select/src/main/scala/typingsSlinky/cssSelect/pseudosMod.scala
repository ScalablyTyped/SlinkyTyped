package typingsSlinky.cssSelect

import typingsSlinky.cssSelect.typesMod.InternalOptions
import typingsSlinky.cssWhat.parseMod.DataType
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pseudosMod {
  
  @JSImport("css-select/lib/pseudo-selectors/pseudos", "pseudos")
  @js.native
  val pseudos: Record[String, Pseudo] = js.native
  
  @JSImport("css-select/lib/pseudo-selectors/pseudos", "verifyPseudoArgs")
  @js.native
  def verifyPseudoArgs(func: Pseudo, name: String, subselect: DataType): Unit = js.native
  
  type Pseudo = js.Function3[
    /* elem */ js.Any, 
    /* options */ InternalOptions[js.Any, js.Any], 
    /* subselect */ js.UndefOr[js.Any | String | Null], 
    Boolean
  ]
}
