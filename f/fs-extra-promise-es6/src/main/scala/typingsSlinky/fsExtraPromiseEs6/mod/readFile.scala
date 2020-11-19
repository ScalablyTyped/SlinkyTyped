package typingsSlinky.fsExtraPromiseEs6.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra-promise-es6", "readFile")
@js.native
object readFile extends js.Object {
  
  def apply(filename: String, callback: js.Function2[/* err */ js.Error, /* data */ Buffer, Unit]): Unit = js.native
  def apply(
    filename: String,
    options: String,
    callback: js.Function2[/* err */ js.Error, /* data */ String, Unit]
  ): Unit = js.native
  def apply(
    filename: String,
    options: OpenOptions,
    callback: js.Function2[/* err */ js.Error, /* data */ String, Unit]
  ): Unit = js.native
}
