package typingsSlinky.mobxStateTree

import typingsSlinky.mobxStateTree.typeMod.ISimpleType
import typingsSlinky.mobxStateTree.typeMod.IType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-state-tree/dist/types/primitives", JSImport.Namespace)
@js.native
object primitivesMod extends js.Object {
  
  val DatePrimitive: IType[Double | js.Date, Double, js.Date] = js.native
  
  val boolean: ISimpleType[Boolean] = js.native
  
  val integer: ISimpleType[Double] = js.native
  
  def isPrimitiveType(
    `type`: IType[
      Boolean | js.Date | Double | String, 
      Boolean | Double | String, 
      Boolean | js.Date | Double | String
    ]
  ): /* is mobx-state-tree.mobx-state-tree/dist/core/type/type.IType<string, string, string> */ Boolean = js.native
  
  val nullType: ISimpleType[Null] = js.native
  
  val number: ISimpleType[Double] = js.native
  
  val string: ISimpleType[String] = js.native
  
  val undefinedType: ISimpleType[js.UndefOr[scala.Nothing]] = js.native
}
