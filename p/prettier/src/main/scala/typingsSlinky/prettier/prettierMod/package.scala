package typingsSlinky.prettier

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object prettierMod {
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Record

  type AST = js.Any
  type BuiltInParser = js.Function2[/* text */ String, /* options */ js.UndefOr[js.Any], AST]
  type CustomParser = js.Function3[
    /* text */ String, 
    /* parsers */ Record[BuiltInParserName, BuiltInParser], 
    /* options */ Options, 
    AST
  ]
  type Doc = typingsSlinky.prettier.prettierMod.doc.builders.Doc
  type Options = Partial[RequiredOptions]
  type SupportOptionValue = Double | Boolean | String
}
