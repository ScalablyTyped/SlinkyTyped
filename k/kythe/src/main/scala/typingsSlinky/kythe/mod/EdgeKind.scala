package typingsSlinky.kythe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EdgeKind extends StObject
@JSImport("kythe", "EdgeKind")
@js.native
object EdgeKind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EdgeKind with String] = js.native
  
  @js.native
  sealed trait ALIASES extends EdgeKind
  /* "/kythe/edge/aliases" */ val ALIASES: typingsSlinky.kythe.mod.EdgeKind.ALIASES with String = js.native
  
  @js.native
  sealed trait ALIASES_ROOT extends EdgeKind
  /* "/kythe/edge/aliases/root" */ val ALIASES_ROOT: typingsSlinky.kythe.mod.EdgeKind.ALIASES_ROOT with String = js.native
  
  @js.native
  sealed trait ANNOTATED_BY extends EdgeKind
  /* "/kythe/edge/annotatedby" */ val ANNOTATED_BY: typingsSlinky.kythe.mod.EdgeKind.ANNOTATED_BY with String = js.native
  
  @js.native
  sealed trait BOUNDED_LOWER extends EdgeKind
  /* "/kythe/edge/bounded/lower" */ val BOUNDED_LOWER: typingsSlinky.kythe.mod.EdgeKind.BOUNDED_LOWER with String = js.native
  
  @js.native
  sealed trait BOUNDED_UPPER extends EdgeKind
  /* "/kythe/edge/bounded/upper" */ val BOUNDED_UPPER: typingsSlinky.kythe.mod.EdgeKind.BOUNDED_UPPER with String = js.native
  
  @js.native
  sealed trait CHILD_OF extends EdgeKind
  /* "/kythe/edge/childof" */ val CHILD_OF: typingsSlinky.kythe.mod.EdgeKind.CHILD_OF with String = js.native
  
  @js.native
  sealed trait CHILD_OF_CONTEXT extends EdgeKind
  /* "/kythe/edge/childof/context" */ val CHILD_OF_CONTEXT: typingsSlinky.kythe.mod.EdgeKind.CHILD_OF_CONTEXT with String = js.native
  
  @js.native
  sealed trait COMPLETES extends EdgeKind
  /* "/kythe/edge/completes" */ val COMPLETES: typingsSlinky.kythe.mod.EdgeKind.COMPLETES with String = js.native
  
  @js.native
  sealed trait COMPLETES_UNIQUELY extends EdgeKind
  /* "/kythe/edge/completes/uniquely" */ val COMPLETES_UNIQUELY: typingsSlinky.kythe.mod.EdgeKind.COMPLETES_UNIQUELY with String = js.native
  
  @js.native
  sealed trait DEFINES extends EdgeKind
  /* "/kythe/edge/defines" */ val DEFINES: typingsSlinky.kythe.mod.EdgeKind.DEFINES with String = js.native
  
  @js.native
  sealed trait DEFINES_BINDING extends EdgeKind
  /* "/kythe/edge/defines/binding" */ val DEFINES_BINDING: typingsSlinky.kythe.mod.EdgeKind.DEFINES_BINDING with String = js.native
  
  @js.native
  sealed trait DEPENDS extends EdgeKind
  /* "/kythe/edge/depends" */ val DEPENDS: typingsSlinky.kythe.mod.EdgeKind.DEPENDS with String = js.native
  
  @js.native
  sealed trait DOCUMENTS extends EdgeKind
  /* "/kythe/edge/documents" */ val DOCUMENTS: typingsSlinky.kythe.mod.EdgeKind.DOCUMENTS with String = js.native
  
  @js.native
  sealed trait EXPORTS extends EdgeKind
  /* "/kythe/edge/exports" */ val EXPORTS: typingsSlinky.kythe.mod.EdgeKind.EXPORTS with String = js.native
  
  @js.native
  sealed trait EXTENDS extends EdgeKind
  /* "/kythe/edge/extends" */ val EXTENDS: typingsSlinky.kythe.mod.EdgeKind.EXTENDS with String = js.native
  
  @js.native
  sealed trait GENERATES extends EdgeKind
  /* "/kythe/edge/generates" */ val GENERATES: typingsSlinky.kythe.mod.EdgeKind.GENERATES with String = js.native
  
  @js.native
  sealed trait IMPUTES extends EdgeKind
  /* "/kythe/edge/imputes" */ val IMPUTES: typingsSlinky.kythe.mod.EdgeKind.IMPUTES with String = js.native
  
  @js.native
  sealed trait INSTANTIATES extends EdgeKind
  /* "/kythe/edge/instantiates" */ val INSTANTIATES: typingsSlinky.kythe.mod.EdgeKind.INSTANTIATES with String = js.native
  
  @js.native
  sealed trait INSTANTIATES_SPECULATIVE extends EdgeKind
  /* "/kythe/edge/instantiates/speculative" */ val INSTANTIATES_SPECULATIVE: typingsSlinky.kythe.mod.EdgeKind.INSTANTIATES_SPECULATIVE with String = js.native
  
  @js.native
  sealed trait NAMED extends EdgeKind
  /* "/kythe/edge/named" */ val NAMED: typingsSlinky.kythe.mod.EdgeKind.NAMED with String = js.native
  
  @js.native
  sealed trait OVERRIDES extends EdgeKind
  /* "/kythe/edge/overrides" */ val OVERRIDES: typingsSlinky.kythe.mod.EdgeKind.OVERRIDES with String = js.native
  
  @js.native
  sealed trait OVERRIDES_ROOT extends EdgeKind
  /* "/kythe/edge/overrides/root" */ val OVERRIDES_ROOT: typingsSlinky.kythe.mod.EdgeKind.OVERRIDES_ROOT with String = js.native
  
  @js.native
  sealed trait OVERRIDES_TRANSITIVE extends EdgeKind
  /* "/kythe/edge/overrides/transitive" */ val OVERRIDES_TRANSITIVE: typingsSlinky.kythe.mod.EdgeKind.OVERRIDES_TRANSITIVE with String = js.native
  
  @js.native
  sealed trait PARAM extends EdgeKind
  /* "/kythe/edge/param" */ val PARAM: typingsSlinky.kythe.mod.EdgeKind.PARAM with String = js.native
  
  @js.native
  sealed trait REF extends EdgeKind
  /* "/kythe/edge/ref" */ val REF: typingsSlinky.kythe.mod.EdgeKind.REF with String = js.native
  
  @js.native
  sealed trait REF_CALL extends EdgeKind
  /* "/kythe/edge/ref/call" */ val REF_CALL: typingsSlinky.kythe.mod.EdgeKind.REF_CALL with String = js.native
  
  @js.native
  sealed trait REF_CALL_IMPLICIT extends EdgeKind
  /* "/kythe/edge/ref/call/implicit" */ val REF_CALL_IMPLICIT: typingsSlinky.kythe.mod.EdgeKind.REF_CALL_IMPLICIT with String = js.native
  
  @js.native
  sealed trait REF_DOC extends EdgeKind
  /* "/kythe/edge/ref/doc" */ val REF_DOC: typingsSlinky.kythe.mod.EdgeKind.REF_DOC with String = js.native
  
  @js.native
  sealed trait REF_EXPANDS extends EdgeKind
  /* "/kythe/edge/ref/expands" */ val REF_EXPANDS: typingsSlinky.kythe.mod.EdgeKind.REF_EXPANDS with String = js.native
  
  @js.native
  sealed trait REF_EXPANDS_TRANSITIVE extends EdgeKind
  /* "/kythe/edge/ref/expands/transitive" */ val REF_EXPANDS_TRANSITIVE: typingsSlinky.kythe.mod.EdgeKind.REF_EXPANDS_TRANSITIVE with String = js.native
  
  @js.native
  sealed trait REF_FILE extends EdgeKind
  /* "/kythe/edge/ref/file" */ val REF_FILE: typingsSlinky.kythe.mod.EdgeKind.REF_FILE with String = js.native
  
  @js.native
  sealed trait REF_IMPLICIT extends EdgeKind
  /* "/kythe/edge/ref/implicit" */ val REF_IMPLICIT: typingsSlinky.kythe.mod.EdgeKind.REF_IMPLICIT with String = js.native
  
  @js.native
  sealed trait REF_IMPORTS extends EdgeKind
  /* "/kythe/edge/ref/imports" */ val REF_IMPORTS: typingsSlinky.kythe.mod.EdgeKind.REF_IMPORTS with String = js.native
  
  @js.native
  sealed trait REF_INCLUDES extends EdgeKind
  /* "/kythe/edge/ref/includes" */ val REF_INCLUDES: typingsSlinky.kythe.mod.EdgeKind.REF_INCLUDES with String = js.native
  
  @js.native
  sealed trait REF_INIT extends EdgeKind
  /* "/kythe/edge/ref/init" */ val REF_INIT: typingsSlinky.kythe.mod.EdgeKind.REF_INIT with String = js.native
  
  @js.native
  sealed trait REF_INIT_IMPLICIT extends EdgeKind
  /* "/kythe/edge/ref/init/implicit" */ val REF_INIT_IMPLICIT: typingsSlinky.kythe.mod.EdgeKind.REF_INIT_IMPLICIT with String = js.native
  
  @js.native
  sealed trait REF_QUERIES extends EdgeKind
  /* "/kythe/edge/ref/queries" */ val REF_QUERIES: typingsSlinky.kythe.mod.EdgeKind.REF_QUERIES with String = js.native
  
  @js.native
  sealed trait SATISFIES extends EdgeKind
  /* "/kythe/edge/satisfies" */ val SATISFIES: typingsSlinky.kythe.mod.EdgeKind.SATISFIES with String = js.native
  
  @js.native
  sealed trait SPECIALIZES extends EdgeKind
  /* "/kythe/edge/specializes" */ val SPECIALIZES: typingsSlinky.kythe.mod.EdgeKind.SPECIALIZES with String = js.native
  
  @js.native
  sealed trait SPECIALIZES_SPECULATIVE extends EdgeKind
  /* "/kythe/edge/specializes/speculative" */ val SPECIALIZES_SPECULATIVE: typingsSlinky.kythe.mod.EdgeKind.SPECIALIZES_SPECULATIVE with String = js.native
  
  @js.native
  sealed trait TAGGED extends EdgeKind
  /* "/kythe/edge/tagged" */ val TAGGED: typingsSlinky.kythe.mod.EdgeKind.TAGGED with String = js.native
  
  @js.native
  sealed trait TYPED extends EdgeKind
  /* "/kythe/edge/typed" */ val TYPED: typingsSlinky.kythe.mod.EdgeKind.TYPED with String = js.native
  
  @js.native
  sealed trait UNDEFINES extends EdgeKind
  /* "/kythe/edge/undefines" */ val UNDEFINES: typingsSlinky.kythe.mod.EdgeKind.UNDEFINES with String = js.native
}
