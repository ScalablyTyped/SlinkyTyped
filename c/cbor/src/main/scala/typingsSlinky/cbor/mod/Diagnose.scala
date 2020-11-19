package typingsSlinky.cbor.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cbor", "Diagnose")
@js.native
class Diagnose () extends Transform {
  def this(options: DiagnoseOptions) = this()
}
/* static members */
@JSImport("cbor", "Diagnose")
@js.native
object Diagnose extends js.Object {
  
  def diagnose(input: String): js.Promise[String] = js.native
  def diagnose(input: String, cb: diagnoseCallback): Unit = js.native
  def diagnose(input: String, encoding: String): js.Promise[String] = js.native
  def diagnose(input: Buffer): js.Promise[String] = js.native
  def diagnose(input: Buffer, cb: diagnoseCallback): Unit = js.native
  def diagnose(input: Buffer, encoding: String): js.Promise[String] = js.native
}
