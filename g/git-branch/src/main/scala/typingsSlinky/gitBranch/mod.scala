package typingsSlinky.gitBranch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git-branch", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): Unit = js.native
  def apply(callback: js.Function2[/* err */ Null | String, /* name */ String, Unit]): Unit = js.native
  def apply(
    cwd: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Null | String, /* name */ String, Unit]
  ): Unit = js.native
  def apply(cwd: String): Unit = js.native
  def apply(cwd: String, callback: js.Function2[/* err */ Null | String, /* name */ String, Unit]): Unit = js.native
  
  def sync(): String = js.native
  def sync(cwd: String): String = js.native
}
