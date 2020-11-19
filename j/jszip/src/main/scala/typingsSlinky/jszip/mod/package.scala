package typingsSlinky.jszip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // This private `_data` property on a JSZipObject uses this interface.
  // If/when it is made public this should be uncommented.
  // interface CompressedObject {
  //     compressedSize: number;
  //     uncompressedSize: number;
  //     crc32: number;
  //     compression: object;
  //     compressedContent: string|ArrayBuffer|Uint8Array|Buffer;
  // }
  type InputFileFormat = org.scalajs.dom.raw.Blob | java.lang.String | js.typedarray.ArrayBuffer | typingsSlinky.node.NodeJS.ReadableStream | js.Array[scala.Double] | js.typedarray.Uint8Array
  
  type OnUpdateCallback = js.Function1[/* metadata */ typingsSlinky.jszip.mod.Metadata, scala.Unit]
}
