package typingsSlinky.fsExtraPromise.mod

import typingsSlinky.fsExtra.mod.WriteFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra-promise", "outputFile")
@js.native
object outputFile extends js.Object {
  
  def apply(file: String, data: js.Any): js.Promise[Unit] = js.native
  def apply(file: String, data: js.Any, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def apply(file: String, data: js.Any, options: String): js.Promise[Unit] = js.native
  def apply(file: String, data: js.Any, options: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def apply(file: String, data: js.Any, options: WriteFileOptions): js.Promise[Unit] = js.native
  def apply(
    file: String,
    data: js.Any,
    options: WriteFileOptions,
    callback: js.Function1[/* err */ js.Error, Unit]
  ): Unit = js.native
}
