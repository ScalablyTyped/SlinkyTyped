package typingsSlinky.relayCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object compilerContextMod {
  type IRTransform = js.Function1[
    /* context */ typingsSlinky.relayCompiler.compilerContextMod.CompilerContext, 
    typingsSlinky.relayCompiler.compilerContextMod.CompilerContext
  ]
}
