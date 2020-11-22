package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object highlightJs {
  
  type AutoHighlightResult = typingsSlinky.highlightJs.HighlightResult
  
  type HLJSApi = typingsSlinky.highlightJs.PublicApi with typingsSlinky.highlightJs.ModesAPI
  
  type KeywordData = js.Tuple2[java.lang.String, scala.Double]
  
  type KeywordDict = typingsSlinky.std.Record[java.lang.String, typingsSlinky.highlightJs.KeywordData]
  
  type LanguageFn = js.Function1[
    /* hljs */ js.UndefOr[typingsSlinky.highlightJs.HLJSApi], 
    typingsSlinky.highlightJs.Language
  ]
  
  type ModeCallback = js.Function2[
    /* match */ typingsSlinky.std.RegExpMatchArray, 
    /* response */ typingsSlinky.highlightJs.CallbackResponse, 
    scala.Unit
  ]
}
