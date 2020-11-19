package typingsSlinky.angularCompiler.compilerMod

import typingsSlinky.angularCompiler.astMod.BindingType
import typingsSlinky.angularCompiler.coreMod.SecurityContext
import typingsSlinky.angularCompiler.i18nAstMod.I18nMeta
import typingsSlinky.angularCompiler.i18nAstMod.Message
import typingsSlinky.angularCompiler.i18nAstMod.Node
import typingsSlinky.angularCompiler.r3AstMod.BoundAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "TmplAstBoundAttribute")
@js.native
class TmplAstBoundAttribute protected ()
  extends typingsSlinky.angularCompiler.publicApiMod.TmplAstBoundAttribute {
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typingsSlinky.angularCompiler.astMod.AST,
    unit: String,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typingsSlinky.angularCompiler.astMod.AST,
    unit: Null,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typingsSlinky.angularCompiler.astMod.AST,
    unit: String,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typingsSlinky.angularCompiler.astMod.AST,
    unit: Null,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typingsSlinky.angularCompiler.astMod.AST,
    unit: String,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: js.UndefOr[scala.Nothing],
    i18n: Message
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typingsSlinky.angularCompiler.astMod.AST,
    unit: String,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: js.UndefOr[scala.Nothing],
    i18n: Node
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typingsSlinky.angularCompiler.astMod.AST,
    unit: String,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typingsSlinky.angularCompiler.astMod.AST,
    unit: String,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Node
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typingsSlinky.angularCompiler.astMod.AST,
    unit: Null,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: js.UndefOr[scala.Nothing],
    i18n: Message
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typingsSlinky.angularCompiler.astMod.AST,
    unit: Null,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: js.UndefOr[scala.Nothing],
    i18n: Node
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typingsSlinky.angularCompiler.astMod.AST,
    unit: Null,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typingsSlinky.angularCompiler.astMod.AST,
    unit: Null,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Node
  ) = this()
}
/* static members */
@JSImport("@angular/compiler/compiler", "TmplAstBoundAttribute")
@js.native
object TmplAstBoundAttribute extends js.Object {
  
  def fromBoundElementProperty(prop: typingsSlinky.angularCompiler.astMod.BoundElementProperty): BoundAttribute = js.native
  def fromBoundElementProperty(prop: typingsSlinky.angularCompiler.astMod.BoundElementProperty, i18n: I18nMeta): BoundAttribute = js.native
}
