package typingsSlinky.reduxOrm.tableMod

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.reduxOrm.modelMod.AnyModel
import typingsSlinky.reduxOrm.modelMod.IdType
import typingsSlinky.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableState[MClass /* <: Instantiable0[AnyModel] */] extends js.Object {
  
  val indexes: TableIndexes[MClass] = js.native
  
  val meta: DefaultMeta[IdType[InstanceType[MClass]]] = js.native
}
