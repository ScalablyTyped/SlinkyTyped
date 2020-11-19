package typingsSlinky.builderUtilRuntime.httpExecutorMod

import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.base64
import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.hex
import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.latin1
import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("builder-util-runtime/out/httpExecutor", "DigestTransform")
@js.native
class DigestTransform protected () extends Transform {
  def this(expected: String) = this()
  def this(expected: String, algorithm: String) = this()
  def this(expected: String, algorithm: js.UndefOr[scala.Nothing], encoding: base64) = this()
  def this(expected: String, algorithm: js.UndefOr[scala.Nothing], encoding: hex) = this()
  def this(expected: String, algorithm: js.UndefOr[scala.Nothing], encoding: latin1) = this()
  def this(expected: String, algorithm: String, encoding: base64) = this()
  def this(expected: String, algorithm: String, encoding: hex) = this()
  def this(expected: String, algorithm: String, encoding: latin1) = this()
  
  var _actual: js.Any = js.native
  
  def _flush(callback: js.Any): Unit = js.native
  
  def _transform(chunk: Buffer, encoding: String, callback: js.Any): Unit = js.native
  
  def actual: String | Null = js.native
  
  val algorithm: js.Any = js.native
  
  val digester: js.Any = js.native
  
  val encoding: js.Any = js.native
  
  val expected: String = js.native
  
  var isValidateOnEnd: Boolean = js.native
  
  def validate(): Null = js.native
}
