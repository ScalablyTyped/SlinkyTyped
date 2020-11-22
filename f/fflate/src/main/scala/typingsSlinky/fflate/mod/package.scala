package typingsSlinky.fflate

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
}
