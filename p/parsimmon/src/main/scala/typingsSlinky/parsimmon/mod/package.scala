package typingsSlinky.parsimmon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FailureFunctionType[U] = js.Function2[
    /* index */ scala.Double, 
    /* msg */ java.lang.String, 
    typingsSlinky.parsimmon.mod.Reply[U]
  ]
  type Language = org.scalablytyped.runtime.StringDictionary[typingsSlinky.parsimmon.mod.Parser[js.Any]]
  type ParseFunctionType[U] = js.Function2[
    /* stream */ typingsSlinky.parsimmon.mod.StreamType, 
    /* index */ scala.Double, 
    typingsSlinky.parsimmon.mod.Reply[U]
  ]
  type Rule = org.scalablytyped.runtime.StringDictionary[
    js.Function1[
      /* r */ typingsSlinky.parsimmon.mod.Language, 
      typingsSlinky.parsimmon.mod.Parser[js.Any]
    ]
  ]
  type StreamType = java.lang.String
  type SuccessFunctionType[U] = js.Function2[/* index */ scala.Double, /* result */ U, typingsSlinky.parsimmon.mod.Reply[U]]
  type TypedLanguage[TLanguageSpec] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof TLanguageSpec ]: parsimmon.parsimmon.Parser<TLanguageSpec[P]>}
    */ typingsSlinky.parsimmon.parsimmonStrings.TypedLanguage with org.scalablytyped.runtime.TopLevel[TLanguageSpec]
  type TypedRule[TLanguageSpec] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof TLanguageSpec ]: (r : parsimmon.parsimmon.TypedLanguage<TLanguageSpec>): parsimmon.parsimmon.Parser<TLanguageSpec[P]>}
    */ typingsSlinky.parsimmon.parsimmonStrings.TypedRule with org.scalablytyped.runtime.TopLevel[TLanguageSpec]
  type UnParser[T] = js.Any
}
