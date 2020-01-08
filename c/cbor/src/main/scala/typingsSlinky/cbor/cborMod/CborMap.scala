package typingsSlinky.cbor.cborMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CborMap
  extends typingsSlinky.std.Map[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for K */ js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for V */ js.Any
    ] {
  def encodeCBOR(gen: Encoder): Boolean = js.native
}

