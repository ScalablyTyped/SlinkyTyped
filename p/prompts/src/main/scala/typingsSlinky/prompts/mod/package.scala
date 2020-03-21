package typingsSlinky.prompts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Answers[T /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ id in T ]: any}
    */ typingsSlinky.prompts.promptsStrings.Answers with js.Any
  type Falsy = js.UndefOr[typingsSlinky.prompts.promptsBooleans.`false` | scala.Null]
  type PrevCaller[T /* <: java.lang.String */, R] = js.Function3[
    /* prev */ js.Any, 
    /* values */ typingsSlinky.prompts.mod.Answers[T], 
    /* prompt */ typingsSlinky.prompts.mod.PromptObject[java.lang.String], 
    R
  ]
  type ValueOrFunc[T /* <: java.lang.String */] = T | (typingsSlinky.prompts.mod.PrevCaller[T, T])
}
