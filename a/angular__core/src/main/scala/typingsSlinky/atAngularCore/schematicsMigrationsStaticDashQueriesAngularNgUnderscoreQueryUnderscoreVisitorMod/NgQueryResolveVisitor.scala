package typingsSlinky.atAngularCore.schematicsMigrationsStaticDashQueriesAngularNgUnderscoreQueryUnderscoreVisitorMod

import typingsSlinky.atAngularCore.schematicsMigrationsStaticDashQueriesAngularQueryDashDefinitionMod.NgQueryDefinition
import typingsSlinky.std.Map
import typingsSlinky.typescript.typescriptMod.Node
import typingsSlinky.typescript.typescriptMod.SourceFile
import typingsSlinky.typescript.typescriptMod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/schematics/migrations/static-queries/angular/ng_query_visitor", "NgQueryResolveVisitor")
@js.native
class NgQueryResolveVisitor protected () extends js.Object {
  def this(typeChecker: TypeChecker) = this()
  var _getClassMetadata: js.Any = js.native
  var _recordClassInheritances: js.Any = js.native
  var _recordClassInputSetters: js.Any = js.native
  var _recordQueryDeclaration: js.Any = js.native
  /** Maps a class declaration to its class metadata. */
  var classMetadata: ClassMetadataMap = js.native
  /** Resolved Angular query definitions. */
  var resolvedQueries: Map[SourceFile, js.Array[NgQueryDefinition]] = js.native
  var typeChecker: TypeChecker = js.native
  var visitAccessorDeclaration: js.Any = js.native
  var visitClassDeclaration: js.Any = js.native
  var visitPropertyDeclaration: js.Any = js.native
  def visitNode(node: Node): Unit = js.native
}

