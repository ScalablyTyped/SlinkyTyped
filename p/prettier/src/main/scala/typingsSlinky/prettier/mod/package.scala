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
    /* parsers */ typingsSlinky.prettier.anon.RecordBuiltInParserNameBu, 
    /* options */ typingsSlinky.prettier.mod.Options, 
    typingsSlinky.prettier.mod.AST
  ]
  
  type Doc_ = typingsSlinky.prettier.mod.doc.builders.Doc
  
  type SupportOptionValue = scala.Double | scala.Boolean | java.lang.String
}
