package typingsSlinky.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCompiler.anon.Nodei18nI18nMetaundefined
import typingsSlinky.angularCompiler.i18nAstMod.I18nMeta
import typingsSlinky.angularCompiler.i18nAstMod.IcuPlaceholder
import typingsSlinky.angularCompiler.i18nAstMod.Message
import typingsSlinky.angularCompiler.mlParserAstMod.Element
import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.outputAstMod.LiteralExpr
import typingsSlinky.angularCompiler.outputAstMod.ReadVarExpr
import typingsSlinky.angularCompiler.outputAstMod.Statement
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object i18nUtilMod {
  
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "I18N_ATTR")
  @js.native
  val I18N_ATTR: /* "i18n" */ String = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "I18N_ATTR_PREFIX")
  @js.native
  val I18N_ATTR_PREFIX: /* "i18n-" */ String = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "I18N_ICU_MAPPING_PREFIX")
  @js.native
  val I18N_ICU_MAPPING_PREFIX: /* "I18N_EXP_" */ String = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "I18N_ICU_VAR_PREFIX")
  @js.native
  val I18N_ICU_VAR_PREFIX: /* "VAR_" */ String = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "I18N_PLACEHOLDER_SYMBOL")
  @js.native
  val I18N_PLACEHOLDER_SYMBOL: /* "\\uFFFD" */ String = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "TRANSLATION_VAR_PREFIX")
  @js.native
  val TRANSLATION_VAR_PREFIX: /* "i18n_" */ String = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "assembleBoundTextPlaceholders")
  @js.native
  def assembleBoundTextPlaceholders(meta: I18nMeta): Map[String, js.Array[_]] = js.native
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "assembleBoundTextPlaceholders")
  @js.native
  def assembleBoundTextPlaceholders(meta: I18nMeta, bindingStartIndex: js.UndefOr[scala.Nothing], contextId: Double): Map[String, js.Array[_]] = js.native
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "assembleBoundTextPlaceholders")
  @js.native
  def assembleBoundTextPlaceholders(meta: I18nMeta, bindingStartIndex: Double): Map[String, js.Array[_]] = js.native
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "assembleBoundTextPlaceholders")
  @js.native
  def assembleBoundTextPlaceholders(meta: I18nMeta, bindingStartIndex: Double, contextId: Double): Map[String, js.Array[_]] = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "assembleI18nBoundString")
  @js.native
  def assembleI18nBoundString(strings: js.Array[String]): String = js.native
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "assembleI18nBoundString")
  @js.native
  def assembleI18nBoundString(strings: js.Array[String], bindingStartIndex: js.UndefOr[scala.Nothing], contextId: Double): String = js.native
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "assembleI18nBoundString")
  @js.native
  def assembleI18nBoundString(strings: js.Array[String], bindingStartIndex: Double): String = js.native
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "assembleI18nBoundString")
  @js.native
  def assembleI18nBoundString(strings: js.Array[String], bindingStartIndex: Double, contextId: Double): String = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "declareI18nVariable")
  @js.native
  def declareI18nVariable(variable: ReadVarExpr): Statement = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "formatI18nPlaceholderName")
  @js.native
  def formatI18nPlaceholderName(name: String): String = js.native
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "formatI18nPlaceholderName")
  @js.native
  def formatI18nPlaceholderName(name: String, useCamelCase: Boolean): String = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "getSeqNumberGenerator")
  @js.native
  def getSeqNumberGenerator(): js.Function0[Double] = js.native
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "getSeqNumberGenerator")
  @js.native
  def getSeqNumberGenerator(startsAt: Double): js.Function0[Double] = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "getTranslationConstPrefix")
  @js.native
  def getTranslationConstPrefix(extra: String): String = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "hasI18nAttrs")
  @js.native
  def hasI18nAttrs(element: Element): Boolean = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "hasI18nMeta")
  @js.native
  def hasI18nMeta(node: Nodei18nI18nMetaundefined): Boolean = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "i18nFormatPlaceholderNames")
  @js.native
  def i18nFormatPlaceholderNames(params: js.UndefOr[scala.Nothing], useCamelCase: Boolean): StringDictionary[Expression] = js.native
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "i18nFormatPlaceholderNames")
  @js.native
  def i18nFormatPlaceholderNames(params: StringDictionary[Expression], useCamelCase: Boolean): StringDictionary[Expression] = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "icuFromI18nMessage")
  @js.native
  def icuFromI18nMessage(message: Message): IcuPlaceholder = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "isI18nAttribute")
  @js.native
  def isI18nAttribute(name: String): Boolean = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "isI18nRootNode")
  @js.native
  def isI18nRootNode(): /* is @angular/compiler.@angular/compiler/src/i18n/i18n_ast.Message */ Boolean = js.native
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "isI18nRootNode")
  @js.native
  def isI18nRootNode(meta: I18nMeta): /* is @angular/compiler.@angular/compiler/src/i18n/i18n_ast.Message */ Boolean = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "isSingleI18nIcu")
  @js.native
  def isSingleI18nIcu(): Boolean = js.native
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "isSingleI18nIcu")
  @js.native
  def isSingleI18nIcu(meta: I18nMeta): Boolean = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "placeholdersToParams")
  @js.native
  def placeholdersToParams(placeholders: Map[String, js.Array[String]]): StringDictionary[LiteralExpr] = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "updatePlaceholderMap")
  @js.native
  def updatePlaceholderMap(map: Map[String, js.Array[_]], name: String, values: js.Any*): Unit = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "wrapI18nPlaceholder")
  @js.native
  def wrapI18nPlaceholder(content: String): String = js.native
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "wrapI18nPlaceholder")
  @js.native
  def wrapI18nPlaceholder(content: String, contextId: Double): String = js.native
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "wrapI18nPlaceholder")
  @js.native
  def wrapI18nPlaceholder(content: Double): String = js.native
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "wrapI18nPlaceholder")
  @js.native
  def wrapI18nPlaceholder(content: Double, contextId: Double): String = js.native
}
