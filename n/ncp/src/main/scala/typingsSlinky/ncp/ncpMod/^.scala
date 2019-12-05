package typingsSlinky.ncp.ncpMod

import typingsSlinky.ncp.Anon_Errs
import typingsSlinky.ncp.Anon_ErrsPathLike
import typingsSlinky.ncp.Anon_StopOnErr
import typingsSlinky.node.fsMod.WriteStream
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ncp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var ncp: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ncp */ js.Any = js.native
  def apply(
    source: String,
    destination: String,
    callback: js.Function1[/* err */ js.Array[Error] | Null, Unit]
  ): Unit = js.native
  def apply(
    source: String,
    destination: String,
    options: (Options with (Anon_Errs | Anon_ErrsPathLike | Anon_StopOnErr)) | Options,
    callback: js.Function1[js.Array[js.Error] | js.Error | Null | WriteStream, Unit]
  ): Unit = js.native
  /**
  	 * **NOTE:** This function provides design-time support for util.promisify.
  	 *
  	 * It does not exist at runtime.
  	 */
  def __promisify__(source: String, destination: String): js.Promise[Unit] = js.native
  def __promisify__(source: String, destination: String, options: Options): js.Promise[Unit] = js.native
}

