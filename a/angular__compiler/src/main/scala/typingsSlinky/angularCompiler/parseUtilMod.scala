package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.srcParseUtilMod.ParseError
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseUtilMod {
  
  @JSImport("@angular/compiler/src/i18n/parse_util", "I18nError")
  @js.native
  class I18nError protected () extends ParseError {
    def this(span: ParseSourceSpan, msg: String) = this()
  }
}
