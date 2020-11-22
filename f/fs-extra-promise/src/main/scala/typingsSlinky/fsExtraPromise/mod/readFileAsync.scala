package typingsSlinky.fsExtraPromise.mod

import typingsSlinky.bluebird.mod.^
import typingsSlinky.fsExtra.mod.ReadOptions
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra-promise", "readFileAsync")
@js.native
object readFileAsync extends js.Object {
  
  def apply(filename: String): ^[Buffer] = js.native
  def apply(filename: String, options: String): ^[String] = js.native
  def apply(filename: String, options: ReadOptions): ^[String] = js.native
}
