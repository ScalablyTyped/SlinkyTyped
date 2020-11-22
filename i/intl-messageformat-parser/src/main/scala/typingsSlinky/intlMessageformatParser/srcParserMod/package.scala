package typingsSlinky.intlMessageformatParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object srcParserMod {
  
  type ParseFunction = js.Function2[
    /* input */ java.lang.String, 
    /* options */ js.UndefOr[typingsSlinky.intlMessageformatParser.srcParserMod.IParseOptions], 
    js.Array[typingsSlinky.intlMessageformatParser.srcTypesMod.MessageFormatElement]
  ]
}
