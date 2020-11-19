package typingsSlinky.openpgp.mod

import typingsSlinky.openpgp.anon.Comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "util")
@js.native
object util extends js.Object {
  
  /**
    * Convert an array of 8-bit integer to a Base-64 encoded string
    * @param bytes An array of 8-bit integers to convert
    * @param url If true, output is URL-safe
    * @returns Base-64 encoded string
    */
  @JSName("Uint8Array_to_b64")
  def Uint8ArrayToB64(bytes: js.typedarray.Uint8Array): String = js.native
  @JSName("Uint8Array_to_b64")
  def Uint8ArrayToB64(bytes: js.typedarray.Uint8Array, url: Boolean): String = js.native
  
  /**
    * Convert an array of 8-bit integers to a hex string
    * @param bytes Array of 8-bit integers to convert
    * @returns Hexadecimal representation of the array
    */
  @JSName("Uint8Array_to_hex")
  def Uint8ArrayToHex(bytes: js.typedarray.Uint8Array): String = js.native
  
  /**
    * Convert a Uint8Array to an MPI-formatted Uint8Array.
    * Note: the output is **not** an MPI object.
    * @see
    * @see
    * @param bin An array of 8-bit integers to convert
    * @returns MPI-formatted Uint8Array
    */
  @JSName("Uint8Array_to_MPI")
  def Uint8ArrayToMPI(bin: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  /**
    * Convert an array of 8-bit integers to a string
    * @param bytes An array of 8-bit integers to convert
    * @returns String representation of the array
    */
  @JSName("Uint8Array_to_str")
  def Uint8ArrayToStr(bytes: js.typedarray.Uint8Array): String = js.native
  
  /**
    * Convert a Base-64 encoded string an array of 8-bit integer
    * Note: accepts both Radix-64 and URL-safe strings
    * @param base64 Base-64 encoded string to convert
    * @returns An array of 8-bit integers
    */
  @JSName("b64_to_Uint8Array")
  def b64ToUint8Array(base64: String): js.typedarray.Uint8Array = js.native
  
  /**
    * Normalize line endings to \r\n
    */
  def canonicalizeEOL(): Unit = js.native
  
  /**
    * Concat a list of Uint8Arrays, Strings or Streams
    * The caller must not mix Uint8Arrays with Strings, but may mix Streams with non-Streams.
    * @param Array of Uint8Arrays/Strings/Streams to concatenate
    * @returns Concatenated array
    */
  var concat: js.Any = js.native
  
  /**
    * Concat Uint8Arrays
    * @param Array of Uint8Arrays to concatenate
    * @returns Concatenated array
    */
  var concatUint8Array: js.Any = js.native
  
  @JSName("decode_utf8")
  def decodeUtf8(utf8: ReadableStream[String]): String | ReadableStream[String] = js.native
  /**
    * Convert a Uint8Array of utf8 bytes to a native javascript string
    * @param utf8 A valid squence of utf8 bytes
    * @returns A native javascript string
    */
  @JSName("decode_utf8")
  def decodeUtf8(utf8: js.typedarray.Uint8Array): String | ReadableStream[String] = js.native
  
  /**
    * Detect Node.js runtime.
    */
  def detectNode(): Unit = js.native
  
  /**
    * Convert a native javascript string to a Uint8Array of utf8 bytes
    * @param str The string to convert
    * @returns A valid squence of utf8 bytes
    */
  @JSName("encode_utf8")
  def encodeUtf8(str: String): js.typedarray.Uint8Array | ReadableStream[String] = js.native
  @JSName("encode_utf8")
  def encodeUtf8(str: ReadableStream[String]): js.typedarray.Uint8Array | ReadableStream[String] = js.native
  
  /**
    * Encode input buffer using Z-Base32 encoding.
    * See: https://tools.ietf.org/html/rfc6189#section-5.1.6
    * @param data The binary data to encode
    * @returns Binary data encoded using Z-Base32
    */
  def encodeZBase32(data: js.typedarray.Uint8Array): String = js.native
  
  /**
    * Check Uint8Array equality
    * @param first array
    * @param second array
    * @returns equality
    */
  def equalsUint8Array(first: js.typedarray.Uint8Array, second: js.typedarray.Uint8Array): Boolean = js.native
  
  /**
    * Format user id for internal use.
    */
  def formatUserId(id: Comment): String = js.native
  
  /**
    * Get native Node.js Buffer constructor. This should be used since
    * Buffer is not available under browserify.
    * @returns The Buffer constructor or 'undefined'
    */
  def getNodeBuffer(): js.Function = js.native
  
  /**
    * Get native Node.js crypto api. The default configuration is to use
    * the api when available. But it can also be deactivated with config.use_native
    * @returns The crypto module or 'undefined'
    */
  def getNodeCrypto(): js.Object = js.native
  
  /**
    * Get transferable objects to pass buffers with zero copy (similar to "pass by reference" in C++)
    * See: https://developer.mozilla.org/en-US/docs/Web/API/Worker/postMessage
    * Also, convert ReadableStreams to MessagePorts
    * @param obj the options object to be passed to the web worker
    * @returns an array of binary data to be passed
    */
  def getTransferables(obj: js.Object): js.Array[_] = js.native
  
  /**
    * Get native Web Cryptography api, only the current version of the spec.
    * The default configuration is to use the api when available. But it can
    * be deactivated with config.use_native
    * @returns The SubtleCrypto api or 'undefined'
    */
  def getWebCrypto(): js.Object = js.native
  
  /**
    * Get native Web Cryptography api for all browsers, including legacy
    * implementations of the spec e.g IE11 and Safari 8/9. The default
    * configuration is to use the api when available. But it can be deactivated
    * with config.use_native
    * @returns The SubtleCrypto api or 'undefined'
    */
  def getWebCryptoAll(): js.Object = js.native
  
  /**
    * Create binary string from a hex encoded string
    * @param str Hex string to convert
    * @returns
    */
  @JSName("hex_to_str")
  def hexToStr(str: String): String = js.native
  
  /**
    * Convert a hex string to an array of 8-bit integers
    * @param hex A hex string to convert
    * @returns An array of 8-bit integers
    */
  @JSName("hex_to_Uint8Array")
  def hexToUint8Array(hex: String): js.typedarray.Uint8Array = js.native
  
  /**
    * Convert line endings from canonicalized \r\n to native \n
    */
  def nativeEOL(): Unit = js.native
  
  /**
    * Get native Node.js module
    * @param The module to require
    * @returns The required module or 'undefined'
    */
  def nodeRequire(The: String): js.Object = js.native
  
  /**
    * Parse user id.
    */
  def parseUserId(userId: String): Comment = js.native
  
  /**
    * Helper function to print a debug message. Debug
    * messages are only printed if
    * @param str String of the debug message
    */
  @JSName("print_debug")
  def printDebug(str: String): Unit = js.native
  
  /**
    * Helper function to print a debug error. Debug
    * messages are only printed if
    * @param str String of the debug message
    */
  @JSName("print_debug_error")
  def printDebugError(str: String): Unit = js.native
  
  /**
    * Helper function to print a debug message. Debug
    * messages are only printed if
    * @param str String of the debug message
    */
  @JSName("print_debug_hexarray_dump")
  def printDebugHexarrayDump(str: String): Unit = js.native
  
  /**
    * Helper function to print a debug message. Debug
    * messages are only printed if
    * @param str String of the debug message
    */
  @JSName("print_debug_hexstr_dump")
  def printDebugHexstrDump(str: String): Unit = js.native
  
  @JSName("print_entire_stream")
  def printEntireStream(str: String, input: String, concat: js.Function): Unit = js.native
  /**
    * Read a stream to the end and print it to the console when it's closed.
    * @param str String of the debug message
    * @param input Stream to print
    * @param concat Function to concatenate chunks of the stream (defaults to util.concat).
    */
  @JSName("print_entire_stream")
  def printEntireStream(str: String, input: ReadableStream[String], concat: js.Function): Unit = js.native
  @JSName("print_entire_stream")
  def printEntireStream(str: String, input: js.typedarray.Uint8Array, concat: js.Function): Unit = js.native
  
  /**
    * Remove trailing spaces and tabs from each line
    */
  def removeTrailingSpaces(): Unit = js.native
  
  /**
    * Convert MessagePorts back to ReadableStreams
    * @param obj
    * @returns
    */
  def restoreStreams(obj: js.Object): js.Object = js.native
  
  /**
    * If S[1] == 0, then double(S) == (S[2..128] || 0);
    * otherwise, double(S) == (S[2..128] || 0) xor
    * (zeros(120) || 10000111).
    * Both OCB and EAX (through CMAC) require this function to be constant-time.
    * @param data
    */
  /* Illegal function name 'double' can't be used here
    function double(data: Uint8Array): void;
    */
  /**
    * Shift a Uint8Array to the right by n bits
    * @param array The array to shift
    * @param bits Amount of bits to shift (MUST be smaller
    *        than 8)
    * @returns Resulting array.
    */
  def shiftRight(array: js.typedarray.Uint8Array, bits: Integer): String = js.native
  
  /**
    * Create hex string from a binary
    * @param str String to convert
    * @returns String containing the hexadecimal values
    */
  @JSName("str_to_hex")
  def strToHex(str: String): String = js.native
  
  /**
    * Convert a string to an array of 8-bit integers
    * @param str String to convert
    * @returns An array of 8-bit integers
    */
  @JSName("str_to_Uint8Array")
  def strToUint8Array(str: String): js.typedarray.Uint8Array = js.native
  
  /**
    * Calculates a 16bit sum of a Uint8Array by adding each character
    * codes modulus 65535
    * @param Uint8Array to create a sum of
    * @returns 2 bytes containing the sum of all charcodes % 65535
    */
  @JSName("write_checksum")
  def writeChecksum(Uint8Array: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
}
