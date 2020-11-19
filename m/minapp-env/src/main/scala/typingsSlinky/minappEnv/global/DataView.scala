package typingsSlinky.minappEnv.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.minappEnv.ArrayBufferLike
import typingsSlinky.minappEnv.DataViewConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("DataView")
@js.native
class DataView protected ()
  extends typingsSlinky.minappEnv.DataView {
  def this(buffer: ArrayBufferLike) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: js.UndefOr[scala.Nothing], byteLength: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, byteLength: Double) = this()
}
@JSGlobal("DataView")
@js.native
object DataView extends TopLevel[DataViewConstructor]
