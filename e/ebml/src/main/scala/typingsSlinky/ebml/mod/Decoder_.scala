package typingsSlinky.ebml.mod

import typingsSlinky.ebml.ebmlStrings.close
import typingsSlinky.ebml.ebmlStrings.data
import typingsSlinky.ebml.ebmlStrings.end
import typingsSlinky.ebml.ebmlStrings.error
import typingsSlinky.ebml.ebmlStrings.readable
import typingsSlinky.ebml.mod.Decoder.State
import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ebml", "Decoder")
@js.native
class Decoder_ () extends Transform {
  
  // #region Duplex methods overloadings
  def addListener[K /* <: /* keyof ebml.ebml.Decoder.EventListenerMap */ data | close | end | readable | error */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  
  var buffer: Buffer = js.native
  
  var cursor: Double = js.native
  
  def end(chunk: Buffer): Unit = js.native
  def end(chunk: Buffer, cb: js.Function0[Unit]): Unit = js.native
  def end(chunk: Buffer, encoding: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): Unit = js.native
  def end(chunk: Buffer, encoding: String): Unit = js.native
  def end(chunk: Buffer, encoding: String, cb: js.Function0[Unit]): Unit = js.native
  
  def on[K /* <: /* keyof ebml.ebml.Decoder.EventListenerMap */ data | close | end | readable | error */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  
  def once[K /* <: /* keyof ebml.ebml.Decoder.EventListenerMap */ data | close | end | readable | error */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  
  def prependListener[K /* <: /* keyof ebml.ebml.Decoder.EventListenerMap */ data | close | end | readable | error */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  
  def prependOnceListener[K /* <: /* keyof ebml.ebml.Decoder.EventListenerMap */ data | close | end | readable | error */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  
  def readContent(): Boolean = js.native
  
  def readSize(): Boolean = js.native
  
  def readTag(): Boolean = js.native
  
  def removeListener[K /* <: /* keyof ebml.ebml.Decoder.EventListenerMap */ data | close | end | readable | error */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  
  var state: State = js.native
  
  var tagStack: js.Array[TagMetadata] = js.native
  
  var total: Double = js.native
  
  def write(chunk: Buffer): Boolean = js.native
  def write(chunk: Buffer, cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
  def write(
    chunk: Buffer,
    encoding: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
  ): Boolean = js.native
  def write(chunk: Buffer, encoding: String): Boolean = js.native
  def write(chunk: Buffer, encoding: String, cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
}
