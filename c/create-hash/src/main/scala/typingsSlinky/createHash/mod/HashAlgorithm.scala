package typingsSlinky.createHash.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HashAlgorithm extends js.Object {
  
  def digest(): Buffer = js.native
  def digest(target: encoding): String = js.native
  
  def end(): Unit = js.native
  
  def read(): Unit = js.native
  
  def update(data: String): this.type = js.native
  def update(data: String, encoding: String): this.type = js.native
  def update(data: TypedArray): this.type = js.native
  def update(data: TypedArray, encoding: String): this.type = js.native
  def update(data: Buffer): this.type = js.native
  def update(data: Buffer, encoding: String): this.type = js.native
  def update(data: js.typedarray.DataView): this.type = js.native
  def update(data: js.typedarray.DataView, encoding: String): this.type = js.native
  
  def write(data: String): this.type = js.native
  def write(data: String, encoding: String): this.type = js.native
  def write(data: TypedArray): this.type = js.native
  def write(data: TypedArray, encoding: String): this.type = js.native
  def write(data: Buffer): this.type = js.native
  def write(data: Buffer, encoding: String): this.type = js.native
  def write(data: js.typedarray.DataView): this.type = js.native
  def write(data: js.typedarray.DataView, encoding: String): this.type = js.native
}
