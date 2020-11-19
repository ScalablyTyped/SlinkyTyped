package typingsSlinky.ncp.mod

import typingsSlinky.ncp.anon.OptionserrsPathLike
import typingsSlinky.ncp.anon.Optionserrsundefined
import typingsSlinky.ncp.anon.OptionsstopOnErrtrue
import typingsSlinky.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ncp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(
    source: String,
    destination: String,
    callback: js.Function1[/* err */ js.Array[js.Error] | Null, Unit]
  ): Unit = js.native
  def apply(
    source: String,
    destination: String,
    options: OptionserrsPathLike,
    callback: js.Function1[/* err */ WriteStream | Null, Unit]
  ): Unit = js.native
  def apply(
    source: String,
    destination: String,
    options: Optionserrsundefined,
    callback: js.Function1[/* err */ js.Array[js.Error] | Null, Unit]
  ): Unit = js.native
  def apply(
    source: String,
    destination: String,
    options: OptionsstopOnErrtrue,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  def apply(
    source: String,
    destination: String,
    options: Options,
    callback: js.Function1[/* err */ js.Error | js.Array[js.Error] | WriteStream | Null, Unit]
  ): Unit = js.native
  
  /**
    * **NOTE:** This function provides design-time support for util.promisify.
    *
    * It does not exist at runtime.
    */
  def __promisify__(source: String, destination: String): js.Promise[Unit] = js.native
  def __promisify__(source: String, destination: String, options: Options): js.Promise[Unit] = js.native
  
  var ncp: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ncp */ js.Any = js.native
}
