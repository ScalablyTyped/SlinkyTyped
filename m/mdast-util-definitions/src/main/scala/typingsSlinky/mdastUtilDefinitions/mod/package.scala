package typingsSlinky.mdastUtilDefinitions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * @param identifier [Identifier](https://github.com/syntax-tree/mdast#association) of [definition](https://github.com/syntax-tree/mdast#definition).
    */
  type DefinitionCache = js.Function1[/* identifier */ java.lang.String, typingsSlinky.mdast.mod.Definition | scala.Null]
}
