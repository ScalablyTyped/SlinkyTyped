package typingsSlinky.node.anon

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.dnsMod.SrvRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofresolveSrv extends StObject {
  
  def apply(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[SrvRecord], Unit]
  ): Unit = js.native
  
  def __promisify__(hostname: String): js.Promise[js.Array[SrvRecord]] = js.native
}
