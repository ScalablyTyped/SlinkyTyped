package typingsSlinky.mobxStateTree.anon

import typingsSlinky.mobxStateTree.maybeMod.IMaybe
import typingsSlinky.mobxStateTree.referenceMod.IReferenceType
import typingsSlinky.mobxStateTree.referenceMod.ReferenceOptionsGetSet
import typingsSlinky.mobxStateTree.typeMod.IAnyComplexType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn0 extends js.Object {
  
  def apply[IT /* <: IAnyComplexType */](subType: IT): IMaybe[IReferenceType[IT]] = js.native
  def apply[IT /* <: IAnyComplexType */](subType: IT, options: (ReferenceOptionsGetSet[IT] | js.Object) with `0`): IReferenceType[IT] = js.native
}
