package typingsSlinky.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Spy
  extends _Expected[js.Any] {
  
  def apply(params: js.Any*): js.Any = js.native
  
  var and: SpyAnd = js.native
  
  var calls: Calls = js.native
  
  def withArgs(args: js.Any*): Spy = js.native
}
