package typingsSlinky.astTypes.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayType[T]
  extends BaseType[T]
     with Type[T] {
  
  val elemType: Type[_] = js.native
  
  val kind: typingsSlinky.astTypes.astTypesStrings.ArrayType = js.native
}
