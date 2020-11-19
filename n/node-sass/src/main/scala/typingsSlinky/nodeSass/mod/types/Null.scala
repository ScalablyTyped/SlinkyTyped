package typingsSlinky.nodeSass.mod.types

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.nodeSass.mod._ImporterReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Null
  extends Value
     with _ImporterReturnType {
  
  /**
    * This property doesn't exist, but its presence forces the typescript
    * compiler to properly type check this type. Without it, it seems to
    * allow things that aren't types.Null to match it in case statements and
    * assignments.
    */
  val ___NULL___ : js.Symbol = js.native
}
@JSImport("node-sass", "types.Null")
@js.native
object Null extends TopLevel[NullConstructor]
