package typingsSlinky.chownr

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chownr", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(path: PathLike, uid: Double, gid: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  
  def sync(path: PathLike, uid: Double, gid: Double): Unit = js.native
  
  type PathLike = String | Buffer | URL_
}
