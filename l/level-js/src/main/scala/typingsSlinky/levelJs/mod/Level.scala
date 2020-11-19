package typingsSlinky.levelJs.mod

import typingsSlinky.abstractLeveldown.mod.AbstractLevelDOWN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Level
  extends AbstractLevelDOWN[js.Any, js.Any] {
  
  def destroy(location: String, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  def destroy(location: String, prefix: String, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  
  val location: String = js.native
  
  val prefix: String = js.native
  
  val version: String | Double = js.native
}
