package typingsSlinky.chmodr

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("chmodr", JSImport.Namespace)
  @js.native
  def apply(path: PathLike, mode: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  @JSImport("chmodr", JSImport.Namespace)
  @js.native
  def apply(path: PathLike, mode: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  
  @JSImport("chmodr", "sync")
  @js.native
  def sync(path: PathLike, mode: String): Unit = js.native
  @JSImport("chmodr", "sync")
  @js.native
  def sync(path: PathLike, mode: Double): Unit = js.native
  
  type PathLike = String | Buffer | URL_
}
