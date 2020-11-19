package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.abstractEmitterMod.OutputEmitter
import typingsSlinky.angularCompiler.anon.Context
import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.outputAstMod.ExternalReference
import typingsSlinky.angularCompiler.outputAstMod.Statement
import typingsSlinky.angularCompiler.outputAstMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/ts_emitter", JSImport.Namespace)
@js.native
object tsEmitterMod extends js.Object {
  
  def debugOutputAstAsTypeScript(ast: js.Array[_]): String = js.native
  def debugOutputAstAsTypeScript(ast: Expression): String = js.native
  def debugOutputAstAsTypeScript(ast: Statement): String = js.native
  def debugOutputAstAsTypeScript(ast: Type): String = js.native
  
  @js.native
  class TypeScriptEmitter () extends OutputEmitter {
    
    def emitStatementsAndContext(genFilePath: String, stmts: js.Array[Statement]): Context = js.native
    def emitStatementsAndContext(
      genFilePath: String,
      stmts: js.Array[Statement],
      preamble: js.UndefOr[scala.Nothing],
      emitSourceMaps: js.UndefOr[scala.Nothing],
      referenceFilter: js.UndefOr[scala.Nothing],
      importFilter: ReferenceFilter
    ): Context = js.native
    def emitStatementsAndContext(
      genFilePath: String,
      stmts: js.Array[Statement],
      preamble: js.UndefOr[scala.Nothing],
      emitSourceMaps: js.UndefOr[scala.Nothing],
      referenceFilter: ReferenceFilter
    ): Context = js.native
    def emitStatementsAndContext(
      genFilePath: String,
      stmts: js.Array[Statement],
      preamble: js.UndefOr[scala.Nothing],
      emitSourceMaps: js.UndefOr[scala.Nothing],
      referenceFilter: ReferenceFilter,
      importFilter: ReferenceFilter
    ): Context = js.native
    def emitStatementsAndContext(
      genFilePath: String,
      stmts: js.Array[Statement],
      preamble: js.UndefOr[scala.Nothing],
      emitSourceMaps: Boolean
    ): Context = js.native
    def emitStatementsAndContext(
      genFilePath: String,
      stmts: js.Array[Statement],
      preamble: js.UndefOr[scala.Nothing],
      emitSourceMaps: Boolean,
      referenceFilter: js.UndefOr[scala.Nothing],
      importFilter: ReferenceFilter
    ): Context = js.native
    def emitStatementsAndContext(
      genFilePath: String,
      stmts: js.Array[Statement],
      preamble: js.UndefOr[scala.Nothing],
      emitSourceMaps: Boolean,
      referenceFilter: ReferenceFilter
    ): Context = js.native
    def emitStatementsAndContext(
      genFilePath: String,
      stmts: js.Array[Statement],
      preamble: js.UndefOr[scala.Nothing],
      emitSourceMaps: Boolean,
      referenceFilter: ReferenceFilter,
      importFilter: ReferenceFilter
    ): Context = js.native
    def emitStatementsAndContext(genFilePath: String, stmts: js.Array[Statement], preamble: String): Context = js.native
    def emitStatementsAndContext(
      genFilePath: String,
      stmts: js.Array[Statement],
      preamble: String,
      emitSourceMaps: js.UndefOr[scala.Nothing],
      referenceFilter: js.UndefOr[scala.Nothing],
      importFilter: ReferenceFilter
    ): Context = js.native
    def emitStatementsAndContext(
      genFilePath: String,
      stmts: js.Array[Statement],
      preamble: String,
      emitSourceMaps: js.UndefOr[scala.Nothing],
      referenceFilter: ReferenceFilter
    ): Context = js.native
    def emitStatementsAndContext(
      genFilePath: String,
      stmts: js.Array[Statement],
      preamble: String,
      emitSourceMaps: js.UndefOr[scala.Nothing],
      referenceFilter: ReferenceFilter,
      importFilter: ReferenceFilter
    ): Context = js.native
    def emitStatementsAndContext(genFilePath: String, stmts: js.Array[Statement], preamble: String, emitSourceMaps: Boolean): Context = js.native
    def emitStatementsAndContext(
      genFilePath: String,
      stmts: js.Array[Statement],
      preamble: String,
      emitSourceMaps: Boolean,
      referenceFilter: js.UndefOr[scala.Nothing],
      importFilter: ReferenceFilter
    ): Context = js.native
    def emitStatementsAndContext(
      genFilePath: String,
      stmts: js.Array[Statement],
      preamble: String,
      emitSourceMaps: Boolean,
      referenceFilter: ReferenceFilter
    ): Context = js.native
    def emitStatementsAndContext(
      genFilePath: String,
      stmts: js.Array[Statement],
      preamble: String,
      emitSourceMaps: Boolean,
      referenceFilter: ReferenceFilter,
      importFilter: ReferenceFilter
    ): Context = js.native
  }
  
  type ReferenceFilter = js.Function1[/* reference */ ExternalReference, Boolean]
}
