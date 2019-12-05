package typingsSlinky.kythe.kytheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Subkind extends js.Object

@JSImport("kythe", "Subkind")
@js.native
object Subkind extends js.Object {
  @js.native
  sealed trait CATEGORY extends Subkind
  
  @js.native
  sealed trait CLASS extends Subkind
  
  @js.native
  sealed trait CONSTRUCTOR extends Subkind
  
  @js.native
  sealed trait DESTRUCTOR extends Subkind
  
  @js.native
  sealed trait ENUM extends Subkind
  
  @js.native
  sealed trait ENUM_CLASS extends Subkind
  
  @js.native
  sealed trait FIELD extends Subkind
  
  @js.native
  sealed trait IMPLICIT extends Subkind
  
  @js.native
  sealed trait IMPORT extends Subkind
  
  @js.native
  sealed trait INITIALIZER extends Subkind
  
  @js.native
  sealed trait LOCAL extends Subkind
  
  @js.native
  sealed trait LOCAL_PARAMETER extends Subkind
  
  @js.native
  sealed trait METHOD extends Subkind
  
  @js.native
  sealed trait NAMESPACE extends Subkind
  
  @js.native
  sealed trait STRUCT extends Subkind
  
  @js.native
  sealed trait TYPE extends Subkind
  
  @js.native
  sealed trait UNION extends Subkind
  
  /* "category" */ val CATEGORY: typingsSlinky.kythe.kytheMod.Subkind.CATEGORY with String = js.native
  /* "class" */ val CLASS: typingsSlinky.kythe.kytheMod.Subkind.CLASS with String = js.native
  /* "constructor" */ val CONSTRUCTOR: typingsSlinky.kythe.kytheMod.Subkind.CONSTRUCTOR with String = js.native
  /* "destructor" */ val DESTRUCTOR: typingsSlinky.kythe.kytheMod.Subkind.DESTRUCTOR with String = js.native
  /* "enum" */ val ENUM: typingsSlinky.kythe.kytheMod.Subkind.ENUM with String = js.native
  /* "enumClass" */ val ENUM_CLASS: typingsSlinky.kythe.kytheMod.Subkind.ENUM_CLASS with String = js.native
  /* "field" */ val FIELD: typingsSlinky.kythe.kytheMod.Subkind.FIELD with String = js.native
  /* "implicit" */ val IMPLICIT: typingsSlinky.kythe.kytheMod.Subkind.IMPLICIT with String = js.native
  /* "import" */ val IMPORT: typingsSlinky.kythe.kytheMod.Subkind.IMPORT with String = js.native
  /* "initializer" */ val INITIALIZER: typingsSlinky.kythe.kytheMod.Subkind.INITIALIZER with String = js.native
  /* "local" */ val LOCAL: typingsSlinky.kythe.kytheMod.Subkind.LOCAL with String = js.native
  /* "local/parameter" */ val LOCAL_PARAMETER: typingsSlinky.kythe.kytheMod.Subkind.LOCAL_PARAMETER with String = js.native
  /* "method" */ val METHOD: typingsSlinky.kythe.kytheMod.Subkind.METHOD with String = js.native
  /* "namespace" */ val NAMESPACE: typingsSlinky.kythe.kytheMod.Subkind.NAMESPACE with String = js.native
  /* "struct" */ val STRUCT: typingsSlinky.kythe.kytheMod.Subkind.STRUCT with String = js.native
  /* "type" */ val TYPE: typingsSlinky.kythe.kytheMod.Subkind.TYPE with String = js.native
  /* "union" */ val UNION: typingsSlinky.kythe.kytheMod.Subkind.UNION with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Subkind with String] = js.native
}

