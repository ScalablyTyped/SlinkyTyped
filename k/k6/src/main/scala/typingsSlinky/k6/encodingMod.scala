package typingsSlinky.k6

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodingMod {
  
  /**
    * The encoding module provides base64 encoding/decoding.
    * https://k6.io/docs/javascript-api/k6-encoding
    */
  object default {
    
    /**
      * Base64 decode a string.
      * https://k6.io/docs/javascript-api/k6-encoding/b64decode-input-encoding
      * @param input - Base64 encoded string.
      * @param encoding - Base64 variant.
      * @returns Decoded string.
      * @example
      * encoding.b64decode(str)
      * encoding.b64decode(str, 'rawstd')
      */
    @JSImport("k6/encoding", "default.b64decode")
    @js.native
    def b64decode(input: String): String = js.native
    @JSImport("k6/encoding", "default.b64decode")
    @js.native
    def b64decode(input: String, encoding: Base64Variant): String = js.native
    
    /**
      * Base64 decode a string.
      * https://k6.io/docs/javascript-api/k6-encoding/b64decode-input-encoding
      * @param input - Base64 encoded string.
      * @param encoding - Base64 variant.
      * @returns Decoded string.
      * @example
      * encoding.b64encode(str)
      * encoding.b64encode(str, 'rawstd')
      */
    @JSImport("k6/encoding", "default.b64encode")
    @js.native
    def b64encode(input: String): String = js.native
    @JSImport("k6/encoding", "default.b64encode")
    @js.native
    def b64encode(input: String, encoding: Base64Variant): String = js.native
  }
  
  @JSImport("k6/encoding", "b64decode")
  @js.native
  def b64decode(input: String): String = js.native
  @JSImport("k6/encoding", "b64decode")
  @js.native
  def b64decode(input: String, encoding: Base64Variant): String = js.native
  
  @JSImport("k6/encoding", "b64encode")
  @js.native
  def b64encode(input: String): String = js.native
  @JSImport("k6/encoding", "b64encode")
  @js.native
  def b64encode(input: String, encoding: Base64Variant): String = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.k6.k6Strings.std
    - typingsSlinky.k6.k6Strings.rawstd
    - typingsSlinky.k6.k6Strings.url
    - typingsSlinky.k6.k6Strings.rawurl
  */
  trait Base64Variant extends StObject
  object Base64Variant {
    
    @scala.inline
    def rawstd: typingsSlinky.k6.k6Strings.rawstd = "rawstd".asInstanceOf[typingsSlinky.k6.k6Strings.rawstd]
    
    @scala.inline
    def rawurl: typingsSlinky.k6.k6Strings.rawurl = "rawurl".asInstanceOf[typingsSlinky.k6.k6Strings.rawurl]
    
    @scala.inline
    def std: typingsSlinky.k6.k6Strings.std = "std".asInstanceOf[typingsSlinky.k6.k6Strings.std]
    
    @scala.inline
    def url: typingsSlinky.k6.k6Strings.url = "url".asInstanceOf[typingsSlinky.k6.k6Strings.url]
  }
  
  /**
    * The encoding module provides base64 encoding/decoding.
    * https://k6.io/docs/javascript-api/k6-encoding
    */
  object encoding
}
