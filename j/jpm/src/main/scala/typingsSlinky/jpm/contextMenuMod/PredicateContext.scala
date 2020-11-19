package typingsSlinky.jpm.contextMenuMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.jpm.anon.DocumentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PredicateContext extends Context {
  
  def apply(predicateFunction: js.Function1[/* context */ DocumentType, Boolean]): js.Object = js.native
}
@JSImport("sdk/context-menu", "PredicateContext")
@js.native
object PredicateContext extends TopLevel[PredicateContext]
