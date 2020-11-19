package typingsSlinky.remarkStringify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Compiler = typingsSlinky.remarkStringify.mod.RemarkCompiler
  
  type Visitor = js.Function2[
    /* node */ typingsSlinky.unist.mod.Node, 
    /* parent */ js.UndefOr[typingsSlinky.unist.mod.Parent], 
    java.lang.String
  ]
}
