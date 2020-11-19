package typingsSlinky.jss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseRule extends Rule {
  
  var isProcessed: Boolean = js.native
  
  var key: String = js.native
  
  // eslint-disable-next-line no-use-before-define
  var options: RuleOptions = js.native
  
  def toString(options: ToCssOptions): String = js.native
  
  var `type`: String = js.native
}
