package typingsSlinky.clamavJs

import typingsSlinky.clamavJs.clamavJsNumbers.`3310`
import typingsSlinky.clamavJs.clamavJsStrings.localhost
import typingsSlinky.node.fsMod.ReadStream
import typingsSlinky.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("clamav.js", "ClamAVChannel")
  @js.native
  class ClamAVChannel () extends StObject {
    
    def _flush(callback: js.Function0[_]): Unit = js.native
    
    def _transform(chunk: Double, encoding: js.Any, callback: js.Function0[_]): Unit = js.native
  }
  
  @JSImport("clamav.js", "clamavfilescan")
  @js.native
  def clamavfilescan(
    port: Double,
    host: String,
    filename: String,
    callback: js.Function3[/* error */ js.Error, /* object */ js.Any, /* result */ String, _]
  ): Unit = js.native
  
  @JSImport("clamav.js", "clamavpathscan")
  @js.native
  def clamavpathscan(
    port: Double,
    host: String,
    pathname: String,
    callback: js.Function3[/* error */ js.Error, /* object */ js.Any, /* result */ String, _]
  ): Unit = js.native
  
  @JSImport("clamav.js", "clamavstreamscan")
  @js.native
  def clamavstreamscan(
    port: Double,
    host: String,
    stream: ReadStream,
    complete: js.Function1[/* stream */ Stream | ReadStream, _],
    `object`: js.Any,
    callback: js.Function3[/* error */ js.Error, /* object */ js.Any, /* result */ String, _]
  ): Unit = js.native
  @JSImport("clamav.js", "clamavstreamscan")
  @js.native
  def clamavstreamscan(
    port: Double,
    host: String,
    stream: Stream,
    complete: js.Function1[/* stream */ Stream | ReadStream, _],
    `object`: js.Any,
    callback: js.Function3[/* error */ js.Error, /* object */ js.Any, /* result */ String, _]
  ): Unit = js.native
  
  @JSImport("clamav.js", "createScanner")
  @js.native
  def createScanner(port: Double, host: String): ClamScanner = js.native
  
  @JSImport("clamav.js", "ping")
  @js.native
  def ping(
    port: Double,
    host: String,
    timeout: Double,
    callback: js.Function1[/* error */ js.UndefOr[js.Error], _]
  ): Unit = js.native
  
  @JSImport("clamav.js", "version")
  @js.native
  def version(
    port: Double,
    host: String,
    timeout: Double,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* status */ js.UndefOr[String], _]
  ): Unit = js.native
  
  @js.native
  trait ClamScanner extends StObject {
    
    var host: String | localhost = js.native
    
    var port: `3310` | Double = js.native
    
    def scan(
      `object`: String,
      callback: js.Function3[/* error */ js.Error, /* object */ js.Any, /* result */ String, _]
    ): Unit = js.native
    def scan(
      `object`: ReadStream,
      callback: js.Function3[/* error */ js.Error, /* object */ js.Any, /* result */ String, _]
    ): Unit = js.native
    def scan(
      `object`: Stream,
      callback: js.Function3[/* error */ js.Error, /* object */ js.Any, /* result */ String, _]
    ): Unit = js.native
  }
}
