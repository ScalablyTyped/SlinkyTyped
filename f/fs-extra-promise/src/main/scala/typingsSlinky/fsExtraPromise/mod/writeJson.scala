package typingsSlinky.fsExtraPromise.mod

import typingsSlinky.fsExtra.mod.WriteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra-promise", "writeJson")
@js.native
object writeJson extends js.Object {
  
  def apply(file: String, `object`: js.Any): js.Promise[Unit] = js.native
  def apply(file: String, `object`: js.Any, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def apply(file: String, `object`: js.Any, options: WriteOptions): js.Promise[Unit] = js.native
  def apply(
    file: String,
    `object`: js.Any,
    options: WriteOptions,
    callback: js.Function1[/* err */ js.Error, Unit]
  ): Unit = js.native
}
