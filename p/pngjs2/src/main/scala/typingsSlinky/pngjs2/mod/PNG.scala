package typingsSlinky.pngjs2.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Writable
import typingsSlinky.pngjs2.pngjs2Strings.error
import typingsSlinky.pngjs2.pngjs2Strings.metadata
import typingsSlinky.pngjs2.pngjs2Strings.parsed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pngjs2", "PNG")
@js.native
class PNG () extends Writable {
  def this(options: PNGOptions) = this()
  
  def bitblt(
    dst: PNG,
    srcX: Double,
    srcY: Double,
    width: Double,
    height: Double,
    deltaX: Double,
    deltaY: Double
  ): PNG = js.native
  
  var data: Buffer = js.native
  
  var gamma: Double = js.native
  
  var height: Double = js.native
  
  def on(event: String, callback: js.Function): this.type = js.native
  @JSName("on")
  def on_error(event: error, callback: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_metadata(event: metadata, callback: js.Function1[/* metadata */ PNGMetadata, Unit]): this.type = js.native
  @JSName("on")
  def on_parsed(event: parsed, callback: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
  
  def pack(): PNG = js.native
  
  def parse(data: String): PNG = js.native
  def parse(data: String, callback: js.Function2[/* err */ js.Error, /* data */ Buffer, Unit]): PNG = js.native
  def parse(data: Buffer): PNG = js.native
  def parse(data: Buffer, callback: js.Function2[/* err */ js.Error, /* data */ Buffer, Unit]): PNG = js.native
  
  var width: Double = js.native
}
/* static members */
@JSImport("pngjs2", "PNG")
@js.native
object PNG extends js.Object {
  
  def bitblt(
    src: PNG,
    dst: PNG,
    srcX: Double,
    srcY: Double,
    width: Double,
    height: Double,
    deltaX: Double,
    deltaY: Double
  ): Unit = js.native
  
  @js.native
  object sync extends js.Object {
    
    def read(buffer: String): PNG = js.native
    def read(buffer: String, options: PNGOptions): PNG = js.native
    def read(buffer: Buffer): PNG = js.native
    def read(buffer: Buffer, options: PNGOptions): PNG = js.native
  }
}
