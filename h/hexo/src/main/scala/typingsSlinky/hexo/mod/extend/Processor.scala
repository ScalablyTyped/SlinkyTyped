package typingsSlinky.hexo.mod.extend

import typingsSlinky.hexo.mod.Box.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Processor extends js.Object {
  
  def register(fn: js.Function1[/* file */ File, Unit]): Unit = js.native
  def register(pattern: String, fn: js.Function1[/* file */ File, Unit]): Unit = js.native
  def register(pattern: js.Function1[/* str */ String, _], fn: js.Function1[/* file */ File, Unit]): Unit = js.native
  def register(pattern: js.RegExp, fn: js.Function1[/* file */ File, Unit]): Unit = js.native
}
