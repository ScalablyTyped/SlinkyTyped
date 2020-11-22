package typingsSlinky.mobxStateTree.anon

import typingsSlinky.mobxStateTree.referenceMod.IReferenceType
import typingsSlinky.mobxStateTree.referenceMod.ReferenceOptions
import typingsSlinky.mobxStateTree.typeMod.IAnyComplexType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallSubTypeOptions extends js.Object {
  
  def apply[IT /* <: IAnyComplexType */](subType: IT): IReferenceType[IT] = js.native
  def apply[IT /* <: IAnyComplexType */](subType: IT, options: ReferenceOptions[IT]): IReferenceType[IT] = js.native
}
