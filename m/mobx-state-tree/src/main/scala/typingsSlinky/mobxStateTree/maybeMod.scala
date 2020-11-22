package typingsSlinky.mobxStateTree

import typingsSlinky.mobxStateTree.typeMod.IAnyType
import typingsSlinky.mobxStateTree.typeMod.IType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-state-tree/dist/types/utility-types/maybe", JSImport.Namespace)
@js.native
object maybeMod extends js.Object {
  
  def maybe[IT /* <: IAnyType */](`type`: IT): IMaybe[IT] = js.native
  
  def maybeNull[IT /* <: IAnyType */](`type`: IT): IMaybeNull[IT] = js.native
  
  type IMaybe[IT /* <: IAnyType */] = IMaybeIType[IT, js.UndefOr[scala.Nothing], js.UndefOr[scala.Nothing]]
  
  type IMaybeIType[IT /* <: IAnyType */, C, O] = IType[
    (/* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ js.Any) | C, 
    (/* import warning: importer.ImportType#apply Failed type conversion: IT['SnapshotType'] */ js.Any) | O, 
    (/* import warning: importer.ImportType#apply Failed type conversion: IT['TypeWithoutSTN'] */ js.Any) | O
  ]
  
  type IMaybeNull[IT /* <: IAnyType */] = IMaybeIType[IT, js.UndefOr[Null], Null]
}
