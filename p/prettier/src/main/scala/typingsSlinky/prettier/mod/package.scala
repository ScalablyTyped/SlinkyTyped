package typingsSlinky.prettier

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AST = js.Any
  
  type BuiltInParser = js.Function2[
    /* text */ java.lang.String, 
    /* options */ js.UndefOr[js.Any], 
    typingsSlinky.prettier.mod.AST
  ]
  
  type CustomParser = js.Function3[
    /* text */ java.lang.String, 
    /* parsers */ typingsSlinky.prettier.mod.BuiltInParsers, 
    /* options */ typingsSlinky.prettier.mod.Options, 
    typingsSlinky.prettier.mod.AST
  ]
  
  type Doc_ = typingsSlinky.prettier.mod.doc.builders.Doc
  
  type LiteralUnion[T /* <: U */, U] = T | ((typingsSlinky.std.Pick[U, scala.Nothing]) with typingsSlinky.prettier.anon._empty)
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.prettier.mod.IntSupportOption
    - typingsSlinky.prettier.mod.IntArraySupportOption
    - typingsSlinky.prettier.mod.BooleanSupportOption
    - typingsSlinky.prettier.mod.BooleanArraySupportOption
    - typingsSlinky.prettier.mod.ChoiceSupportOption[js.Any]
    - typingsSlinky.prettier.mod.PathSupportOption
    - typingsSlinky.prettier.mod.PathArraySupportOption
  */
  type SupportOption = typingsSlinky.prettier.mod._SupportOption | typingsSlinky.prettier.mod.ChoiceSupportOption[js.Any]
  
  type SupportOptions = typingsSlinky.std.Record[java.lang.String, typingsSlinky.prettier.mod.SupportOption]
}
