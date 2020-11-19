package typingsSlinky.markdownIt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object libMod {
  
  type PluginSimple = js.Function1[/* md */ typingsSlinky.markdownIt.libMod.MarkdownIt, scala.Unit]
  
  type PluginWithOptions[T] = js.Function2[
    /* md */ typingsSlinky.markdownIt.libMod.MarkdownIt, 
    /* options */ js.UndefOr[T], 
    scala.Unit
  ]
  
  type PluginWithParams = js.Function2[
    /* md */ typingsSlinky.markdownIt.libMod.MarkdownIt, 
    /* repeated */ js.Any, 
    scala.Unit
  ]
}
