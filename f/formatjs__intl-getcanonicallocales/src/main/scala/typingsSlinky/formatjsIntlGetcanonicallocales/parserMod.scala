package typingsSlinky.formatjsIntlGetcanonicallocales

import typingsSlinky.formatjsIntlGetcanonicallocales.typesMod.UnicodeLanguageId
import typingsSlinky.formatjsIntlGetcanonicallocales.typesMod.UnicodeLocaleId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/intl-getcanonicallocales/src/parser", JSImport.Namespace)
@js.native
object parserMod extends js.Object {
  
  val SEPARATOR: /* "-" */ String = js.native
  
  def isStructurallyValidLanguageTag(tag: String): Boolean = js.native
  
  def isUnicodeLanguageSubtag(lang: String): Boolean = js.native
  
  def isUnicodeRegionSubtag(region: String): Boolean = js.native
  
  def isUnicodeScriptSubtag(script: String): Boolean = js.native
  
  def isUnicodeVariantSubtag(variant: String): Boolean = js.native
  
  def parseUnicodeLanguageId(chunks: String): UnicodeLanguageId = js.native
  def parseUnicodeLanguageId(chunks: js.Array[String]): UnicodeLanguageId = js.native
  
  def parseUnicodeLocaleId(locale: String): UnicodeLocaleId = js.native
}
