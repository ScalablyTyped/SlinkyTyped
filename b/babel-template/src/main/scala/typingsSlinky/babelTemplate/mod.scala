package typingsSlinky.babelTemplate

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.babylon.mod.BabylonOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("babel-template", JSImport.Namespace)
  @js.native
  def apply(code: String): UseTemplate = js.native
  @JSImport("babel-template", JSImport.Namespace)
  @js.native
  def apply(code: String, opts: BabylonOptions): UseTemplate = js.native
  
  type Node = typingsSlinky.babelTypes.ts36Mod.Node
  
  type UseTemplate = js.Function1[/* nodes */ js.UndefOr[StringDictionary[Node]], Node]
}
