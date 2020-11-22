package typingsSlinky.mobxStateTree.anon

import typingsSlinky.mobxStateTree.optionalMod.IOptionalIType
import typingsSlinky.mobxStateTree.optionalMod.OptionalDefaultValueOrFunction
import typingsSlinky.mobxStateTree.optionalMod.ValidOptionalValues
import typingsSlinky.mobxStateTree.typeMod.IAnyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallTypeDefaultValueOrFunctionOptionalValues extends js.Object {
  
  def apply[IT /* <: IAnyType */](`type`: IT, defaultValueOrFunction: OptionalDefaultValueOrFunction[IT]): IOptionalIType[IT, js.Array[js.UndefOr[scala.Nothing]]] = js.native
  def apply[IT /* <: IAnyType */, OptionalVals /* <: ValidOptionalValues */](
    `type`: IT,
    defaultValueOrFunction: OptionalDefaultValueOrFunction[IT],
    optionalValues: OptionalVals
  ): IOptionalIType[IT, OptionalVals] = js.native
}
