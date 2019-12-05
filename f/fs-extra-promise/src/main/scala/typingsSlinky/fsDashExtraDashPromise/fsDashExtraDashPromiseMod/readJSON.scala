package typingsSlinky.fsDashExtraDashPromise.fsDashExtraDashPromiseMod

import typingsSlinky.fsDashExtra.fsDashExtraMod.ReadOptions
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise", "readJSON")
@js.native
object readJSON extends js.Object {
  def apply(file: String): js.Promise[_] = js.native
  def apply(file: String, callback: js.Function2[/* err */ Error, /* jsonObject */ js.Any, Unit]): Unit = js.native
  def apply(file: String, options: ReadOptions): js.Promise[_] = js.native
  def apply(
    file: String,
    options: ReadOptions,
    callback: js.Function2[/* err */ js.Error, /* jsonObject */ js.Any, Unit]
  ): Unit = js.native
}

@JSImport("fs-extra-promise", "readJson")
@js.native
object readJson extends js.Object {
  def apply(file: String): js.Promise[_] = js.native
  def apply(file: String, callback: js.Function2[/* err */ Error, /* jsonObject */ js.Any, Unit]): Unit = js.native
  def apply(file: String, options: ReadOptions): js.Promise[_] = js.native
  def apply(
    file: String,
    options: ReadOptions,
    callback: js.Function2[/* err */ js.Error, /* jsonObject */ js.Any, Unit]
  ): Unit = js.native
}

