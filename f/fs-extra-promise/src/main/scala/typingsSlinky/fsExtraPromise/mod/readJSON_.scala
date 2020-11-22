package typingsSlinky.fsExtraPromise.mod

import typingsSlinky.fsExtra.mod.ReadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra-promise", "readJSON")
@js.native
object readJSON_ extends js.Object {
  
  def apply(file: String): js.Promise[_] = js.native
  def apply(file: String, callback: js.Function2[/* err */ js.Error, /* jsonObject */ js.Any, Unit]): Unit = js.native
  def apply(file: String, options: ReadOptions): js.Promise[_] = js.native
  def apply(
    file: String,
    options: ReadOptions,
    callback: js.Function2[/* err */ js.Error, /* jsonObject */ js.Any, Unit]
  ): Unit = js.native
}
