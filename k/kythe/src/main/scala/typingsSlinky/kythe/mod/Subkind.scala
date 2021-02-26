package typingsSlinky.kythe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Subkind extends StObject
@JSImport("kythe", "Subkind")
@js.native
object Subkind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Subkind with String] = js.native
  
  @js.native
  sealed trait CATEGORY extends Subkind
  /* "category" */ val CATEGORY: typingsSlinky.kythe.mod.Subkind.CATEGORY with String = js.native
  
  @js.native
  sealed trait CLASS extends Subkind
  /* "class" */ val CLASS: typingsSlinky.kythe.mod.Subkind.CLASS with String = js.native
  
  @js.native
  sealed trait CONSTRUCTOR extends Subkind
  /* "constructor" */ val CONSTRUCTOR: typingsSlinky.kythe.mod.Subkind.CONSTRUCTOR with String = js.native
  
  @js.native
  sealed trait DESTRUCTOR extends Subkind
  /* "destructor" */ val DESTRUCTOR: typingsSlinky.kythe.mod.Subkind.DESTRUCTOR with String = js.native
  
  @js.native
  sealed trait ENUM extends Subkind
  /* "enum" */ val ENUM: typingsSlinky.kythe.mod.Subkind.ENUM with String = js.native
  
  @js.native
  sealed trait ENUM_CLASS extends Subkind
  /* "enumClass" */ val ENUM_CLASS: typingsSlinky.kythe.mod.Subkind.ENUM_CLASS with String = js.native
  
  @js.native
  sealed trait FIELD extends Subkind
  /* "field" */ val FIELD: typingsSlinky.kythe.mod.Subkind.FIELD with String = js.native
  
  @js.native
  sealed trait IMPLICIT extends Subkind
  /* "implicit" */ val IMPLICIT: typingsSlinky.kythe.mod.Subkind.IMPLICIT with String = js.native
  
  @js.native
  sealed trait IMPORT extends Subkind
  /* "import" */ val IMPORT: typingsSlinky.kythe.mod.Subkind.IMPORT with String = js.native
  
  @js.native
  sealed trait INITIALIZER extends Subkind
  /* "initializer" */ val INITIALIZER: typingsSlinky.kythe.mod.Subkind.INITIALIZER with String = js.native
  
  @js.native
  sealed trait LOCAL extends Subkind
  /* "local" */ val LOCAL: typingsSlinky.kythe.mod.Subkind.LOCAL with String = js.native
  
  @js.native
  sealed trait LOCAL_PARAMETER extends Subkind
  /* "local/parameter" */ val LOCAL_PARAMETER: typingsSlinky.kythe.mod.Subkind.LOCAL_PARAMETER with String = js.native
  
  @js.native
  sealed trait METHOD extends Subkind
  /* "method" */ val METHOD: typingsSlinky.kythe.mod.Subkind.METHOD with String = js.native
  
  @js.native
  sealed trait NAMESPACE extends Subkind
  /* "namespace" */ val NAMESPACE: typingsSlinky.kythe.mod.Subkind.NAMESPACE with String = js.native
  
  @js.native
  sealed trait STRUCT extends Subkind
  /* "struct" */ val STRUCT: typingsSlinky.kythe.mod.Subkind.STRUCT with String = js.native
  
  @js.native
  sealed trait TYPE extends Subkind
  /* "type" */ val TYPE: typingsSlinky.kythe.mod.Subkind.TYPE with String = js.native
  
  @js.native
  sealed trait UNION extends Subkind
  /* "union" */ val UNION: typingsSlinky.kythe.mod.Subkind.UNION with String = js.native
}
