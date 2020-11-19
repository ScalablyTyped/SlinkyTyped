package typingsSlinky.fsExtraPromiseEs6.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra-promise-es6", "copy")
@js.native
object copy extends js.Object {
  
  def apply(src: String, dest: String): Unit = js.native
  def apply(
    src: String,
    dest: String,
    callback: js.Function1[(/* err */ js.Error) | (/* src */ String), Boolean | Unit]
  ): Unit = js.native
  def apply(
    src: String,
    dest: String,
    filter: js.Function1[/* src */ String, Boolean],
    callback: js.Function1[/* err */ js.Error, Unit]
  ): Unit = js.native
}
