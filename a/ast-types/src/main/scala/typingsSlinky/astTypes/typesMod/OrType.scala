package typingsSlinky.astTypes.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrType[T]
  extends BaseType[T]
     with Type[T] {
  
  val kind: typingsSlinky.astTypes.astTypesStrings.OrType = js.native
  
  val types: js.Array[Type[_]] = js.native
}
