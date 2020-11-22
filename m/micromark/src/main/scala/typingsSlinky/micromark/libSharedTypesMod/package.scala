package typingsSlinky.micromark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object libSharedTypesMod {
  
  type Chunk = typingsSlinky.std.NonNullable[typingsSlinky.micromark.characterCodesMod.Code] | java.lang.String
  
  type CodeAsKey = typingsSlinky.std.NonNullable[typingsSlinky.micromark.characterCodesMod.Code] | typingsSlinky.micromark.micromarkStrings.`null`
  
  type CodeCheck = js.Function1[/* code */ typingsSlinky.micromark.characterCodesMod.Code, scala.Boolean]
  
  type Compile = js.Function1[
    /* slice */ js.Array[typingsSlinky.micromark.libSharedTypesMod.Event], 
    java.lang.String
  ]
  
  type Event = js.Tuple3[
    java.lang.String, 
    typingsSlinky.micromark.libSharedTypesMod.Token, 
    typingsSlinky.micromark.libSharedTypesMod.Tokenizer
  ]
  
  type NotOkay = typingsSlinky.micromark.libSharedTypesMod.State
  
  type Okay = typingsSlinky.micromark.libSharedTypesMod.State
  
  type Options = typingsSlinky.micromark.libSharedTypesMod.ParseOptions with typingsSlinky.micromark.libSharedTypesMod.CompileOptions
  
  type Resolve = js.Function2[
    /* events */ js.Array[typingsSlinky.micromark.libSharedTypesMod.Event], 
    /* context */ typingsSlinky.micromark.libSharedTypesMod.Tokenizer, 
    js.Array[typingsSlinky.micromark.libSharedTypesMod.Event]
  ]
  
  type State = js.Function1[
    /* code */ scala.Double, 
    (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias micromark.micromark/lib/shared-types.State */ js.Object) | scala.Unit
  ]
  
  type Tokenize = js.Function2[
    /* context */ typingsSlinky.micromark.libSharedTypesMod.Tokenizer, 
    /* effects */ typingsSlinky.micromark.libSharedTypesMod.Effects, 
    typingsSlinky.micromark.libSharedTypesMod.State
  ]
}
