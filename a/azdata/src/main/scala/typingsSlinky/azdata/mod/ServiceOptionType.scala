package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ServiceOptionType extends StObject
@JSImport("azdata", "ServiceOptionType")
@js.native
object ServiceOptionType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ServiceOptionType with String] = js.native
  
  @js.native
  sealed trait boolean extends ServiceOptionType
  /* "boolean" */ val boolean: typingsSlinky.azdata.mod.ServiceOptionType.boolean with String = js.native
  
  @js.native
  sealed trait category extends ServiceOptionType
  /* "category" */ val category: typingsSlinky.azdata.mod.ServiceOptionType.category with String = js.native
  
  @js.native
  sealed trait multistring extends ServiceOptionType
  /* "multistring" */ val multistring: typingsSlinky.azdata.mod.ServiceOptionType.multistring with String = js.native
  
  @js.native
  sealed trait number extends ServiceOptionType
  /* "number" */ val number: typingsSlinky.azdata.mod.ServiceOptionType.number with String = js.native
  
  @js.native
  sealed trait `object` extends ServiceOptionType
  /* "object" */ val `object`: typingsSlinky.azdata.mod.ServiceOptionType.`object` with String = js.native
  
  @js.native
  sealed trait password extends ServiceOptionType
  /* "password" */ val password: typingsSlinky.azdata.mod.ServiceOptionType.password with String = js.native
  
  @js.native
  sealed trait string extends ServiceOptionType
  /* "string" */ val string: typingsSlinky.azdata.mod.ServiceOptionType.string with String = js.native
}
