package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeclarativeDataType extends StObject
@JSImport("azdata", "DeclarativeDataType")
@js.native
object DeclarativeDataType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DeclarativeDataType with String] = js.native
  
  @js.native
  sealed trait boolean extends DeclarativeDataType
  /* "boolean" */ val boolean: typingsSlinky.azdata.mod.DeclarativeDataType.boolean with String = js.native
  
  @js.native
  sealed trait category extends DeclarativeDataType
  /* "category" */ val category: typingsSlinky.azdata.mod.DeclarativeDataType.category with String = js.native
  
  @js.native
  sealed trait editableCategory extends DeclarativeDataType
  /* "editableCategory" */ val editableCategory: typingsSlinky.azdata.mod.DeclarativeDataType.editableCategory with String = js.native
  
  @js.native
  sealed trait string extends DeclarativeDataType
  /* "string" */ val string: typingsSlinky.azdata.mod.DeclarativeDataType.string with String = js.native
}
