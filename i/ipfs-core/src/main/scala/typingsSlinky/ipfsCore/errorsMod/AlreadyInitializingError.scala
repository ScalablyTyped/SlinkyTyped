package typingsSlinky.ipfsCore.errorsMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.ipfsCore.anon.TypeofAlreadyInitializing
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlreadyInitializingError extends Error {
  
  var code: String = js.native
}
@JSImport("ipfs-core/dist/src/errors", "AlreadyInitializingError")
@js.native
object AlreadyInitializingError
  extends TopLevel[
      TypeofAlreadyInitializing with (Instantiable1[/* message */ js.UndefOr[String], AlreadyInitializingError])
    ]
