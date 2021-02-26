package typingsSlinky.fflate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AsyncFlateStreamHandler = js.Function3[
    /* err */ js.Error, 
    /* data */ js.typedarray.Uint8Array, 
    /* final */ scala.Boolean, 
    scala.Unit
  ]
  
  type AsyncGunzipOptions = typingsSlinky.fflate.mod.AsyncOptions
  
  type AsyncTerminable = js.Function0[scala.Unit]
  
  type AsyncUnzlibOptions = typingsSlinky.fflate.mod.AsyncInflateOptions
  
  type AsyncZippableFile = js.typedarray.Uint8Array | (js.Tuple2[js.typedarray.Uint8Array, typingsSlinky.fflate.mod.AsyncZipOptions])
  
  type FlateCallback = js.Function2[/* err */ js.Error, /* data */ js.typedarray.Uint8Array, scala.Unit]
  
  type FlateStreamHandler = js.Function2[/* data */ js.typedarray.Uint8Array, /* final */ scala.Boolean, scala.Unit]
  
  type UnzipCallback = js.Function2[/* err */ js.Error, /* data */ typingsSlinky.fflate.mod.Unzipped, scala.Unit]
  
  type Unzipped = typingsSlinky.std.Record[java.lang.String, js.typedarray.Uint8Array]
  
  type ZippableFile = js.typedarray.Uint8Array | (js.Tuple2[js.typedarray.Uint8Array, typingsSlinky.fflate.mod.ZipOptions])
  
  type ZlibOptions = typingsSlinky.fflate.mod.DeflateOptions
  
  @scala.inline
  def compress(data: js.typedarray.Uint8Array, cb: typingsSlinky.fflate.mod.FlateCallback): typingsSlinky.fflate.mod.AsyncTerminable = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compress")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.fflate.mod.AsyncTerminable]
  @scala.inline
  def compress(
    data: js.typedarray.Uint8Array,
    opts: typingsSlinky.fflate.mod.AsyncGzipOptions,
    cb: typingsSlinky.fflate.mod.FlateCallback
  ): typingsSlinky.fflate.mod.AsyncTerminable = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compress")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.fflate.mod.AsyncTerminable]
  
  @scala.inline
  def compressSync(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compressSync")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def compressSync(data: js.typedarray.Uint8Array, opts: typingsSlinky.fflate.mod.GzipOptions): js.typedarray.Uint8Array = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compressSync")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def decompress(data: js.typedarray.Uint8Array, cb: typingsSlinky.fflate.mod.FlateCallback): typingsSlinky.fflate.mod.AsyncTerminable = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.fflate.mod.AsyncTerminable]
  @scala.inline
  def decompress(
    data: js.typedarray.Uint8Array,
    opts: typingsSlinky.fflate.mod.AsyncInflateOptions,
    cb: typingsSlinky.fflate.mod.FlateCallback
  ): typingsSlinky.fflate.mod.AsyncTerminable = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.fflate.mod.AsyncTerminable]
  
  @scala.inline
  def decompressSync(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decompressSync")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def decompressSync(data: js.typedarray.Uint8Array, out: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decompressSync")(data.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def deflate(data: js.typedarray.Uint8Array, cb: typingsSlinky.fflate.mod.FlateCallback): typingsSlinky.fflate.mod.AsyncTerminable = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.fflate.mod.AsyncTerminable]
  @scala.inline
  def deflate(
    data: js.typedarray.Uint8Array,
    opts: typingsSlinky.fflate.mod.AsyncDeflateOptions,
    cb: typingsSlinky.fflate.mod.FlateCallback
  ): typingsSlinky.fflate.mod.AsyncTerminable = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.fflate.mod.AsyncTerminable]
  
  @scala.inline
  def deflateSync(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deflateSync")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def deflateSync(data: js.typedarray.Uint8Array, opts: typingsSlinky.fflate.mod.DeflateOptions): js.typedarray.Uint8Array = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deflateSync")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def gunzip(data: js.typedarray.Uint8Array, cb: typingsSlinky.fflate.mod.FlateCallback): typingsSlinky.fflate.mod.AsyncTerminable = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gunzip")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.fflate.mod.AsyncTerminable]
  @scala.inline
  def gunzip(
    data: js.typedarray.Uint8Array,
    opts: typingsSlinky.fflate.mod.AsyncGunzipOptions,
    cb: typingsSlinky.fflate.mod.FlateCallback
  ): typingsSlinky.fflate.mod.AsyncTerminable = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gunzip")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.fflate.mod.AsyncTerminable]
  
  @scala.inline
  def gunzipSync(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gunzipSync")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def gunzipSync(data: js.typedarray.Uint8Array, out: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gunzipSync")(data.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def gzip(data: js.typedarray.Uint8Array, cb: typingsSlinky.fflate.mod.FlateCallback): typingsSlinky.fflate.mod.AsyncTerminable = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.fflate.mod.AsyncTerminable]
  @scala.inline
  def gzip(
    data: js.typedarray.Uint8Array,
    opts: typingsSlinky.fflate.mod.AsyncGzipOptions,
    cb: typingsSlinky.fflate.mod.FlateCallback
  ): typingsSlinky.fflate.mod.AsyncTerminable = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.fflate.mod.AsyncTerminable]
  
  @scala.inline
  def gzipSync(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gzipSync")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def gzipSync(data: js.typedarray.Uint8Array, opts: typingsSlinky.fflate.mod.GzipOptions): js.typedarray.Uint8Array = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gzipSync")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def inflate(data: js.typedarray.Uint8Array, cb: typingsSlinky.fflate.mod.FlateCallback): typingsSlinky.fflate.mod.AsyncTerminable = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.fflate.mod.AsyncTerminable]
  @scala.inline
  def inflate(
    data: js.typedarray.Uint8Array,
    opts: typingsSlinky.fflate.mod.AsyncInflateOptions,
    cb: typingsSlinky.fflate.mod.FlateCallback
  ): typingsSlinky.fflate.mod.AsyncTerminable = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.fflate.mod.AsyncTerminable]
  
  @scala.inline
  def inflateSync(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inflateSync")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def inflateSync(data: js.typedarray.Uint8Array, out: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inflateSync")(data.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def strFromU8(dat: js.typedarray.Uint8Array): java.lang.String = typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("strFromU8")(dat.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def strFromU8(dat: js.typedarray.Uint8Array, latin1: scala.Boolean): java.lang.String = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("strFromU8")(dat.asInstanceOf[js.Any], latin1.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def strToU8(str: java.lang.String): js.typedarray.Uint8Array = typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("strToU8")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def strToU8(str: java.lang.String, latin1: scala.Boolean): js.typedarray.Uint8Array = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("strToU8")(str.asInstanceOf[js.Any], latin1.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def unzip(data: js.typedarray.Uint8Array, cb: typingsSlinky.fflate.mod.UnzipCallback): typingsSlinky.fflate.mod.AsyncTerminable = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unzip")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.fflate.mod.AsyncTerminable]
  
  @scala.inline
  def unzipSync(data: js.typedarray.Uint8Array): typingsSlinky.fflate.mod.Unzipped = typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unzipSync")(data.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.fflate.mod.Unzipped]
  
  @scala.inline
  def unzlib(data: js.typedarray.Uint8Array, cb: typingsSlinky.fflate.mod.FlateCallback): typingsSlinky.fflate.mod.AsyncTerminable = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unzlib")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.fflate.mod.AsyncTerminable]
  @scala.inline
  def unzlib(
    data: js.typedarray.Uint8Array,
    opts: typingsSlinky.fflate.mod.AsyncGunzipOptions,
    cb: typingsSlinky.fflate.mod.FlateCallback
  ): typingsSlinky.fflate.mod.AsyncTerminable = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unzlib")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.fflate.mod.AsyncTerminable]
  
  @scala.inline
  def unzlibSync(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unzlibSync")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def unzlibSync(data: js.typedarray.Uint8Array, out: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unzlibSync")(data.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def zip(data: typingsSlinky.fflate.mod.AsyncZippable, cb: typingsSlinky.fflate.mod.FlateCallback): typingsSlinky.fflate.mod.AsyncTerminable = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("zip")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.fflate.mod.AsyncTerminable]
  @scala.inline
  def zip(
    data: typingsSlinky.fflate.mod.AsyncZippable,
    opts: typingsSlinky.fflate.mod.AsyncZipOptions,
    cb: typingsSlinky.fflate.mod.FlateCallback
  ): typingsSlinky.fflate.mod.AsyncTerminable = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("zip")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.fflate.mod.AsyncTerminable]
  
  @scala.inline
  def zipSync(data: typingsSlinky.fflate.mod.Zippable): js.typedarray.Uint8Array = typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("zipSync")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def zipSync(data: typingsSlinky.fflate.mod.Zippable, opts: typingsSlinky.fflate.mod.ZipOptions): js.typedarray.Uint8Array = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("zipSync")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def zlib(data: js.typedarray.Uint8Array, cb: typingsSlinky.fflate.mod.FlateCallback): typingsSlinky.fflate.mod.AsyncTerminable = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("zlib")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.fflate.mod.AsyncTerminable]
  @scala.inline
  def zlib(
    data: js.typedarray.Uint8Array,
    opts: typingsSlinky.fflate.mod.AsyncZlibOptions,
    cb: typingsSlinky.fflate.mod.FlateCallback
  ): typingsSlinky.fflate.mod.AsyncTerminable = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("zlib")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.fflate.mod.AsyncTerminable]
  
  @scala.inline
  def zlibSync(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("zlibSync")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def zlibSync(data: js.typedarray.Uint8Array, opts: typingsSlinky.fflate.mod.ZlibOptions): js.typedarray.Uint8Array = (typingsSlinky.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("zlibSync")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
}
