package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/types", "classBody")
@js.native
object classBody extends js.Object {
  
  def apply(
    body: js.Array[
      ClassMethod_ | ClassPrivateMethod_ | ClassProperty_ | ClassPrivateProperty_ | TSDeclareMethod_ | TSIndexSignature_
    ]
  ): ClassBody_ = js.native
}
