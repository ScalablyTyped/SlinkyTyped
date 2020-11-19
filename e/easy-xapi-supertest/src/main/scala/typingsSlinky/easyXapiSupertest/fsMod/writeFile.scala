package typingsSlinky.easyXapiSupertest.fsMod

import typingsSlinky.easyXapiSupertest.NodeJS.ErrnoException
import typingsSlinky.easyXapiSupertest.anon.EncodingFlag
import typingsSlinky.easyXapiSupertest.anon.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "writeFile")
@js.native
object writeFile extends js.Object {
  
  def apply(filename: String, data: js.Any): Unit = js.native
  def apply(filename: String, data: js.Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(filename: String, data: js.Any, options: EncodingFlag): Unit = js.native
  def apply(
    filename: String,
    data: js.Any,
    options: EncodingFlag,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(filename: String, data: js.Any, options: Mode): Unit = js.native
  def apply(
    filename: String,
    data: js.Any,
    options: Mode,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
}
