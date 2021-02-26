package typingsSlinky.decompressResponse

import typingsSlinky.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Decompress a HTTP response if needed.
  @param response - The HTTP incoming stream with compressed data.
  @returns The decompressed HTTP response stream.
  @example
  ```
  import {http} from 'http';
  import decompressResponse = require('decompress-response');
  http.get('https://sindresorhus.com', response => {
  	response = decompressResponse(response);
  });
  ```
  */
  @JSImport("decompress-response", JSImport.Namespace)
  @js.native
  def apply(response: IncomingMessage): IncomingMessage = js.native
}
