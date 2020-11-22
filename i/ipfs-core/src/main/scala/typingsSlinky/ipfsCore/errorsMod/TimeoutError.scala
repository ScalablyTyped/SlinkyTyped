package typingsSlinky.ipfsCore.errorsMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.ipfsCore.anon.TypeofTimeoutError
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeoutError extends Error {
  
  var code: String = js.native
}
@JSImport("ipfs-core/dist/src/errors", "TimeoutError")
@js.native
object TimeoutError
  extends TopLevel[
      TypeofTimeoutError with (Instantiable1[/* message */ js.UndefOr[String], TimeoutError])
    ]
