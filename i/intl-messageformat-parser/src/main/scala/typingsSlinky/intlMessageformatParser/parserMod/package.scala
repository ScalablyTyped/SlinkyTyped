package typingsSlinky.intlMessageformatParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object parserMod {
  
  type ParseFunction = js.Function2[
    /* input */ java.lang.String, 
    /* options */ js.UndefOr[typingsSlinky.intlMessageformatParser.parserMod.IParseOptions], 
    js.Array[typingsSlinky.intlMessageformatParser.typesMod.MessageFormatElement]
  ]
}
