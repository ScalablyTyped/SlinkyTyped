package typingsSlinky.kythe.kytheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EdgeKind extends js.Object

@JSImport("kythe", "EdgeKind")
@js.native
object EdgeKind extends js.Object {
  @js.native
  sealed trait ALIASES extends EdgeKind
  
  @js.native
  sealed trait ALIASES_ROOT extends EdgeKind
  
  @js.native
  sealed trait ANNOTATED_BY extends EdgeKind
  
  @js.native
  sealed trait BOUNDED_LOWER extends EdgeKind
  
  @js.native
  sealed trait BOUNDED_UPPER extends EdgeKind
  
  @js.native
  sealed trait CHILD_OF extends EdgeKind
  
  @js.native
  sealed trait CHILD_OF_CONTEXT extends EdgeKind
  
  @js.native
  sealed trait COMPLETES extends EdgeKind
  
  @js.native
  sealed trait COMPLETES_UNIQUELY extends EdgeKind
  
  @js.native
  sealed trait DEFINES extends EdgeKind
  
  @js.native
  sealed trait DEFINES_BINDING extends EdgeKind
  
  @js.native
  sealed trait DEPENDS extends EdgeKind
  
  @js.native
  sealed trait DOCUMENTS extends EdgeKind
  
  @js.native
  sealed trait EXPORTS extends EdgeKind
  
  @js.native
  sealed trait EXTENDS extends EdgeKind
  
  @js.native
  sealed trait GENERATES extends EdgeKind
  
  @js.native
  sealed trait IMPUTES extends EdgeKind
  
  @js.native
  sealed trait INSTANTIATES extends EdgeKind
  
  @js.native
  sealed trait INSTANTIATES_SPECULATIVE extends EdgeKind
  
  @js.native
  sealed trait NAMED extends EdgeKind
  
  @js.native
  sealed trait OVERRIDES extends EdgeKind
  
  @js.native
  sealed trait OVERRIDES_ROOT extends EdgeKind
  
  @js.native
  sealed trait OVERRIDES_TRANSITIVE extends EdgeKind
  
  @js.native
  sealed trait PARAM extends EdgeKind
  
  @js.native
  sealed trait REF extends EdgeKind
  
  @js.native
  sealed trait REF_CALL extends EdgeKind
  
  @js.native
  sealed trait REF_CALL_IMPLICIT extends EdgeKind
  
  @js.native
  sealed trait REF_DOC extends EdgeKind
  
  @js.native
  sealed trait REF_EXPANDS extends EdgeKind
  
  @js.native
  sealed trait REF_EXPANDS_TRANSITIVE extends EdgeKind
  
  @js.native
  sealed trait REF_FILE extends EdgeKind
  
  @js.native
  sealed trait REF_IMPLICIT extends EdgeKind
  
  @js.native
  sealed trait REF_IMPORTS extends EdgeKind
  
  @js.native
  sealed trait REF_INCLUDES extends EdgeKind
  
  @js.native
  sealed trait REF_INIT extends EdgeKind
  
  @js.native
  sealed trait REF_INIT_IMPLICIT extends EdgeKind
  
  @js.native
  sealed trait REF_QUERIES extends EdgeKind
  
  @js.native
  sealed trait SATISFIES extends EdgeKind
  
  @js.native
  sealed trait SPECIALIZES extends EdgeKind
  
  @js.native
  sealed trait SPECIALIZES_SPECULATIVE extends EdgeKind
  
  @js.native
  sealed trait TAGGED extends EdgeKind
  
  @js.native
  sealed trait TYPED extends EdgeKind
  
  @js.native
  sealed trait UNDEFINES extends EdgeKind
  
  /* "/kythe/edge/aliases" */ val ALIASES: typingsSlinky.kythe.kytheMod.EdgeKind.ALIASES with String = js.native
  /* "/kythe/edge/aliases/root" */ val ALIASES_ROOT: typingsSlinky.kythe.kytheMod.EdgeKind.ALIASES_ROOT with String = js.native
  /* "/kythe/edge/annotatedby" */ val ANNOTATED_BY: typingsSlinky.kythe.kytheMod.EdgeKind.ANNOTATED_BY with String = js.native
  /* "/kythe/edge/bounded/lower" */ val BOUNDED_LOWER: typingsSlinky.kythe.kytheMod.EdgeKind.BOUNDED_LOWER with String = js.native
  /* "/kythe/edge/bounded/upper" */ val BOUNDED_UPPER: typingsSlinky.kythe.kytheMod.EdgeKind.BOUNDED_UPPER with String = js.native
  /* "/kythe/edge/childof" */ val CHILD_OF: typingsSlinky.kythe.kytheMod.EdgeKind.CHILD_OF with String = js.native
  /* "/kythe/edge/childof/context" */ val CHILD_OF_CONTEXT: typingsSlinky.kythe.kytheMod.EdgeKind.CHILD_OF_CONTEXT with String = js.native
  /* "/kythe/edge/completes" */ val COMPLETES: typingsSlinky.kythe.kytheMod.EdgeKind.COMPLETES with String = js.native
  /* "/kythe/edge/completes/uniquely" */ val COMPLETES_UNIQUELY: typingsSlinky.kythe.kytheMod.EdgeKind.COMPLETES_UNIQUELY with String = js.native
  /* "/kythe/edge/defines" */ val DEFINES: typingsSlinky.kythe.kytheMod.EdgeKind.DEFINES with String = js.native
  /* "/kythe/edge/defines/binding" */ val DEFINES_BINDING: typingsSlinky.kythe.kytheMod.EdgeKind.DEFINES_BINDING with String = js.native
  /* "/kythe/edge/depends" */ val DEPENDS: typingsSlinky.kythe.kytheMod.EdgeKind.DEPENDS with String = js.native
  /* "/kythe/edge/documents" */ val DOCUMENTS: typingsSlinky.kythe.kytheMod.EdgeKind.DOCUMENTS with String = js.native
  /* "/kythe/edge/exports" */ val EXPORTS: typingsSlinky.kythe.kytheMod.EdgeKind.EXPORTS with String = js.native
  /* "/kythe/edge/extends" */ val EXTENDS: typingsSlinky.kythe.kytheMod.EdgeKind.EXTENDS with String = js.native
  /* "/kythe/edge/generates" */ val GENERATES: typingsSlinky.kythe.kytheMod.EdgeKind.GENERATES with String = js.native
  /* "/kythe/edge/imputes" */ val IMPUTES: typingsSlinky.kythe.kytheMod.EdgeKind.IMPUTES with String = js.native
  /* "/kythe/edge/instantiates" */ val INSTANTIATES: typingsSlinky.kythe.kytheMod.EdgeKind.INSTANTIATES with String = js.native
  /* "/kythe/edge/instantiates/speculative" */ val INSTANTIATES_SPECULATIVE: typingsSlinky.kythe.kytheMod.EdgeKind.INSTANTIATES_SPECULATIVE with String = js.native
  /* "/kythe/edge/named" */ val NAMED: typingsSlinky.kythe.kytheMod.EdgeKind.NAMED with String = js.native
  /* "/kythe/edge/overrides" */ val OVERRIDES: typingsSlinky.kythe.kytheMod.EdgeKind.OVERRIDES with String = js.native
  /* "/kythe/edge/overrides/root" */ val OVERRIDES_ROOT: typingsSlinky.kythe.kytheMod.EdgeKind.OVERRIDES_ROOT with String = js.native
  /* "/kythe/edge/overrides/transitive" */ val OVERRIDES_TRANSITIVE: typingsSlinky.kythe.kytheMod.EdgeKind.OVERRIDES_TRANSITIVE with String = js.native
  /* "/kythe/edge/param" */ val PARAM: typingsSlinky.kythe.kytheMod.EdgeKind.PARAM with String = js.native
  /* "/kythe/edge/ref" */ val REF: typingsSlinky.kythe.kytheMod.EdgeKind.REF with String = js.native
  /* "/kythe/edge/ref/call" */ val REF_CALL: typingsSlinky.kythe.kytheMod.EdgeKind.REF_CALL with String = js.native
  /* "/kythe/edge/ref/call/implicit" */ val REF_CALL_IMPLICIT: typingsSlinky.kythe.kytheMod.EdgeKind.REF_CALL_IMPLICIT with String = js.native
  /* "/kythe/edge/ref/doc" */ val REF_DOC: typingsSlinky.kythe.kytheMod.EdgeKind.REF_DOC with String = js.native
  /* "/kythe/edge/ref/expands" */ val REF_EXPANDS: typingsSlinky.kythe.kytheMod.EdgeKind.REF_EXPANDS with String = js.native
  /* "/kythe/edge/ref/expands/transitive" */ val REF_EXPANDS_TRANSITIVE: typingsSlinky.kythe.kytheMod.EdgeKind.REF_EXPANDS_TRANSITIVE with String = js.native
  /* "/kythe/edge/ref/file" */ val REF_FILE: typingsSlinky.kythe.kytheMod.EdgeKind.REF_FILE with String = js.native
  /* "/kythe/edge/ref/implicit" */ val REF_IMPLICIT: typingsSlinky.kythe.kytheMod.EdgeKind.REF_IMPLICIT with String = js.native
  /* "/kythe/edge/ref/imports" */ val REF_IMPORTS: typingsSlinky.kythe.kytheMod.EdgeKind.REF_IMPORTS with String = js.native
  /* "/kythe/edge/ref/includes" */ val REF_INCLUDES: typingsSlinky.kythe.kytheMod.EdgeKind.REF_INCLUDES with String = js.native
  /* "/kythe/edge/ref/init" */ val REF_INIT: typingsSlinky.kythe.kytheMod.EdgeKind.REF_INIT with String = js.native
  /* "/kythe/edge/ref/init/implicit" */ val REF_INIT_IMPLICIT: typingsSlinky.kythe.kytheMod.EdgeKind.REF_INIT_IMPLICIT with String = js.native
  /* "/kythe/edge/ref/queries" */ val REF_QUERIES: typingsSlinky.kythe.kytheMod.EdgeKind.REF_QUERIES with String = js.native
  /* "/kythe/edge/satisfies" */ val SATISFIES: typingsSlinky.kythe.kytheMod.EdgeKind.SATISFIES with String = js.native
  /* "/kythe/edge/specializes" */ val SPECIALIZES: typingsSlinky.kythe.kytheMod.EdgeKind.SPECIALIZES with String = js.native
  /* "/kythe/edge/specializes/speculative" */ val SPECIALIZES_SPECULATIVE: typingsSlinky.kythe.kytheMod.EdgeKind.SPECIALIZES_SPECULATIVE with String = js.native
  /* "/kythe/edge/tagged" */ val TAGGED: typingsSlinky.kythe.kytheMod.EdgeKind.TAGGED with String = js.native
  /* "/kythe/edge/typed" */ val TYPED: typingsSlinky.kythe.kytheMod.EdgeKind.TYPED with String = js.native
  /* "/kythe/edge/undefines" */ val UNDEFINES: typingsSlinky.kythe.kytheMod.EdgeKind.UNDEFINES with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EdgeKind with String] = js.native
}

