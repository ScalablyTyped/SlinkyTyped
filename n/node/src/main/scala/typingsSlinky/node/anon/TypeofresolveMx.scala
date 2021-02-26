package typingsSlinky.node.anon

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.dnsMod.MxRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofresolveMx extends StObject {
  
  def apply(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[MxRecord], Unit]
  ): Unit = js.native
  
  def __promisify__(hostname: String): js.Promise[js.Array[MxRecord]] = js.native
}
