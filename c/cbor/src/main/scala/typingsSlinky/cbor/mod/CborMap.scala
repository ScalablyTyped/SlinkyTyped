package typingsSlinky.cbor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CborMap
  extends typingsSlinky.std.Map[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for K */ js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for V */ js.Any
    ] {
  
  def encodeCBOR(gen: Encoder): Boolean = js.native
}
