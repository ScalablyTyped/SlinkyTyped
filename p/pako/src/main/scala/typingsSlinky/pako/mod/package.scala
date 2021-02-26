package typingsSlinky.pako

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Data = js.typedarray.Uint8Array | js.Array[scala.Double] | java.lang.String
  
  @scala.inline
  def deflate(data: typingsSlinky.pako.mod.Data): js.typedarray.Uint8Array = typingsSlinky.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  /**
    * Compress data with deflate algorithm and options.
    */
  @scala.inline
  def deflate(data: typingsSlinky.pako.mod.Data, options: typingsSlinky.pako.anon.DeflateFunctionOptionstos): java.lang.String = (typingsSlinky.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def deflate(data: typingsSlinky.pako.mod.Data, options: typingsSlinky.pako.mod.DeflateFunctionOptions): js.typedarray.Uint8Array = (typingsSlinky.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def deflateRaw(data: typingsSlinky.pako.mod.Data): js.typedarray.Uint8Array = typingsSlinky.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  /**
    * The same as deflate, but creates raw data, without wrapper (header and adler32 crc).
    */
  @scala.inline
  def deflateRaw(data: typingsSlinky.pako.mod.Data, options: typingsSlinky.pako.anon.DeflateFunctionOptionstos): java.lang.String = (typingsSlinky.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def deflateRaw(data: typingsSlinky.pako.mod.Data, options: typingsSlinky.pako.mod.DeflateFunctionOptions): js.typedarray.Uint8Array = (typingsSlinky.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def gzip(data: typingsSlinky.pako.mod.Data): js.typedarray.Uint8Array = typingsSlinky.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  /**
    * The same as deflate, but create gzip wrapper instead of deflate one.
    */
  @scala.inline
  def gzip(data: typingsSlinky.pako.mod.Data, options: typingsSlinky.pako.anon.DeflateFunctionOptionstos): java.lang.String = (typingsSlinky.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def gzip(data: typingsSlinky.pako.mod.Data, options: typingsSlinky.pako.mod.DeflateFunctionOptions): js.typedarray.Uint8Array = (typingsSlinky.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def inflate(data: typingsSlinky.pako.mod.Data): js.typedarray.Uint8Array = typingsSlinky.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  /**
    * Decompress data with inflate/ungzip and options. Autodetect format via wrapper header
    * by default. That's why we don't provide separate ungzip method.
    */
  @scala.inline
  def inflate(data: typingsSlinky.pako.mod.Data, options: typingsSlinky.pako.anon.InflateFunctionOptionstos): java.lang.String = (typingsSlinky.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def inflate(data: typingsSlinky.pako.mod.Data, options: typingsSlinky.pako.mod.InflateFunctionOptions): js.typedarray.Uint8Array = (typingsSlinky.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def inflateRaw(data: typingsSlinky.pako.mod.Data): js.typedarray.Uint8Array = typingsSlinky.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inflateRaw")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  /**
    * The same as inflate, but creates raw data, without wrapper (header and adler32 crc).
    */
  @scala.inline
  def inflateRaw(data: typingsSlinky.pako.mod.Data, options: typingsSlinky.pako.anon.InflateFunctionOptionstos): java.lang.String = (typingsSlinky.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inflateRaw")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def inflateRaw(data: typingsSlinky.pako.mod.Data, options: typingsSlinky.pako.mod.InflateFunctionOptions): js.typedarray.Uint8Array = (typingsSlinky.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inflateRaw")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def ungzip(data: typingsSlinky.pako.mod.Data): js.typedarray.Uint8Array = typingsSlinky.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ungzip")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  /**
    * Just shortcut to inflate, because it autodetects format by header.content. Done for convenience.
    */
  @scala.inline
  def ungzip(data: typingsSlinky.pako.mod.Data, options: typingsSlinky.pako.anon.InflateFunctionOptionstos): java.lang.String = (typingsSlinky.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ungzip")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def ungzip(data: typingsSlinky.pako.mod.Data, options: typingsSlinky.pako.mod.InflateFunctionOptions): js.typedarray.Uint8Array = (typingsSlinky.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ungzip")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
}
