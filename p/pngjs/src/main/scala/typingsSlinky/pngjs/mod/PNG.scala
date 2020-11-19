package typingsSlinky.pngjs.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.pngjs.anon.Read
import typingsSlinky.pngjs.pngjsStrings.close
import typingsSlinky.pngjs.pngjsStrings.error
import typingsSlinky.pngjs.pngjsStrings.metadata
import typingsSlinky.pngjs.pngjsStrings.parsed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pngjs", "PNG")
@js.native
class PNG () extends Duplex {
  def this(options: PNGOptions) = this()
  
  def adjustGamma(): Unit = js.native
  
  def bitblt(
    dst: PNG,
    srcX: js.UndefOr[Double],
    srcY: js.UndefOr[Double],
    width: js.UndefOr[Double],
    height: js.UndefOr[Double],
    deltaX: js.UndefOr[Double],
    deltaY: js.UndefOr[Double]
  ): PNG = js.native
  
  var data: Buffer = js.native
  
  var gamma: Double = js.native
  
  var height: Double = js.native
  
  def on(event: String, callback: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: close, callback: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, callback: js.ThisFunction1[/* this */ this.type, /* error */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_metadata(event: metadata, callback: js.ThisFunction1[/* this */ this.type, /* metadata */ Metadata, Unit]): this.type = js.native
  @JSName("on")
  def on_parsed(event: parsed, callback: js.ThisFunction1[/* this */ this.type, /* data */ Buffer, Unit]): this.type = js.native
  
  def pack(): PNG = js.native
  
  def parse(data: String): PNG = js.native
  def parse(data: String, callback: js.Function2[/* error */ js.Error, /* data */ this.type, Unit]): PNG = js.native
  def parse(data: Buffer): PNG = js.native
  def parse(data: Buffer, callback: js.Function2[/* error */ js.Error, /* data */ this.type, Unit]): PNG = js.native
  
  var width: Double = js.native
}
/* static members */
@JSImport("pngjs", "PNG")
@js.native
object PNG extends js.Object {
  
  def adjustGamma(src: PNG): Unit = js.native
  
  def bitblt(
    src: PNG,
    dst: PNG,
    srcX: js.UndefOr[Double],
    srcY: js.UndefOr[Double],
    width: js.UndefOr[Double],
    height: js.UndefOr[Double],
    deltaX: js.UndefOr[Double],
    deltaY: js.UndefOr[Double]
  ): Unit = js.native
  
  var sync: Read = js.native
}
