package typingsSlinky.graphqlToolsUtils.interfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VisitSchemaKind extends js.Object
@JSImport("@graphql-tools/utils/Interfaces", "VisitSchemaKind")
@js.native
object VisitSchemaKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[VisitSchemaKind with String] = js.native
  
  @js.native
  sealed trait ABSTRACT_TYPE extends VisitSchemaKind
  /* "VisitSchemaKind.ABSTRACT_TYPE" */ @js.native
  object ABSTRACT_TYPE extends TopLevel[ABSTRACT_TYPE with String]
  
  @js.native
  sealed trait COMPOSITE_TYPE extends VisitSchemaKind
  /* "VisitSchemaKind.COMPOSITE_TYPE" */ @js.native
  object COMPOSITE_TYPE extends TopLevel[COMPOSITE_TYPE with String]
  
  @js.native
  sealed trait ENUM_TYPE extends VisitSchemaKind
  /* "VisitSchemaKind.ENUM_TYPE" */ @js.native
  object ENUM_TYPE extends TopLevel[ENUM_TYPE with String]
  
  @js.native
  sealed trait INPUT_OBJECT_TYPE extends VisitSchemaKind
  /* "VisitSchemaKind.INPUT_OBJECT_TYPE" */ @js.native
  object INPUT_OBJECT_TYPE extends TopLevel[INPUT_OBJECT_TYPE with String]
  
  @js.native
  sealed trait INTERFACE_TYPE extends VisitSchemaKind
  /* "VisitSchemaKind.INTERFACE_TYPE" */ @js.native
  object INTERFACE_TYPE extends TopLevel[INTERFACE_TYPE with String]
  
  @js.native
  sealed trait MUTATION extends VisitSchemaKind
  /* "VisitSchemaKind.MUTATION" */ @js.native
  object MUTATION extends TopLevel[MUTATION with String]
  
  @js.native
  sealed trait OBJECT_TYPE extends VisitSchemaKind
  /* "VisitSchemaKind.OBJECT_TYPE" */ @js.native
  object OBJECT_TYPE extends TopLevel[OBJECT_TYPE with String]
  
  @js.native
  sealed trait QUERY extends VisitSchemaKind
  /* "VisitSchemaKind.QUERY" */ @js.native
  object QUERY extends TopLevel[QUERY with String]
  
  @js.native
  sealed trait ROOT_OBJECT extends VisitSchemaKind
  /* "VisitSchemaKind.ROOT_OBJECT" */ @js.native
  object ROOT_OBJECT extends TopLevel[ROOT_OBJECT with String]
  
  @js.native
  sealed trait SCALAR_TYPE extends VisitSchemaKind
  /* "VisitSchemaKind.SCALAR_TYPE" */ @js.native
  object SCALAR_TYPE extends TopLevel[SCALAR_TYPE with String]
  
  @js.native
  sealed trait SUBSCRIPTION extends VisitSchemaKind
  /* "VisitSchemaKind.SUBSCRIPTION" */ @js.native
  object SUBSCRIPTION extends TopLevel[SUBSCRIPTION with String]
  
  @js.native
  sealed trait TYPE extends VisitSchemaKind
  /* "VisitSchemaKind.TYPE" */ @js.native
  object TYPE extends TopLevel[TYPE with String]
  
  @js.native
  sealed trait UNION_TYPE extends VisitSchemaKind
  /* "VisitSchemaKind.UNION_TYPE" */ @js.native
  object UNION_TYPE extends TopLevel[UNION_TYPE with String]
}
