package typingsSlinky.micromark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object sharedTypesMod {
  
  type Chunk = typingsSlinky.std.NonNullable[typingsSlinky.micromark.codesMod.Code] | java.lang.String
  
  type CodeAsKey = typingsSlinky.std.NonNullable[typingsSlinky.micromark.codesMod.Code] | typingsSlinky.micromark.micromarkStrings.`null`
  
  type CodeCheck = js.Function1[/* code */ typingsSlinky.micromark.codesMod.Code, scala.Boolean]
  
  type Compile = js.Function1[
    /* slice */ js.Array[typingsSlinky.micromark.sharedTypesMod.Event], 
    java.lang.String
  ]
  
  type Event = js.Tuple3[
    java.lang.String, 
    typingsSlinky.micromark.sharedTypesMod.Token, 
    typingsSlinky.micromark.sharedTypesMod.Tokenizer
  ]
  
  type NotOkay = typingsSlinky.micromark.sharedTypesMod.State
  
  type Okay = typingsSlinky.micromark.sharedTypesMod.State
  
  type Options = typingsSlinky.micromark.sharedTypesMod.ParseOptions with typingsSlinky.micromark.sharedTypesMod.CompileOptions
  
  type Resolve = js.Function2[
    /* events */ js.Array[typingsSlinky.micromark.sharedTypesMod.Event], 
    /* context */ typingsSlinky.micromark.sharedTypesMod.Tokenizer, 
    js.Array[typingsSlinky.micromark.sharedTypesMod.Event]
  ]
  
  type State = js.Function1[
    /* code */ scala.Double, 
    (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias micromark.micromark/dist/shared-types.State */ js.Object) | scala.Unit
  ]
  
  type Tokenize = js.Function2[
    /* context */ typingsSlinky.micromark.sharedTypesMod.Tokenizer, 
    /* effects */ typingsSlinky.micromark.sharedTypesMod.Effects, 
    typingsSlinky.micromark.sharedTypesMod.State
  ]
}
