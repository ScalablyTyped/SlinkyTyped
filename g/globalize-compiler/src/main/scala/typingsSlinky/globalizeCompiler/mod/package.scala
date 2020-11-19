package typingsSlinky.globalizeCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ExtractFunction = js.Function1[
    /* globalize */ typingsSlinky.globalize.globalizeMod.Static, 
    js.Array[typingsSlinky.globalizeCompiler.mod.FormatterOrParserFunction]
  ]
  
  type FormatterOrParserFunction = js.Function1[/* repeated */ js.Any, js.Any]
}
