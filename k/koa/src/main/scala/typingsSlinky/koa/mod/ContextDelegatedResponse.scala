package typingsSlinky.koa.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.contentDisposition.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextDelegatedResponse extends js.Object {
  
  /**
    * Append additional header `field` with value `val`.
    *
    * Examples:
    *
    * ```
    * this.append('Link', ['<http://localhost/>', '<http://localhost:3000/>']);
    * this.append('Set-Cookie', 'foo=bar; Path=/; HttpOnly');
    * this.append('Warning', '199 Miscellaneous warning');
    * ```
    */
  def append(field: String, `val`: String): Unit = js.native
  def append(field: String, `val`: js.Array[String]): Unit = js.native
  
  /**
    * Set Content-Disposition to "attachment" to signal the client to prompt for download.
    * Optionally specify the filename of the download and some options.
    */
  def attachment(): Unit = js.native
  def attachment(filename: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  def attachment(filename: String): Unit = js.native
  def attachment(filename: String, options: Options): Unit = js.native
  
  /**
    * Get/Set response body.
    */
  var body: js.Any = js.native
  
  /**
    * Get/Set the ETag of a response.
    * This will normalize the quotes if necessary.
    *
    *     this.response.etag = 'md5hashsum';
    *     this.response.etag = '"md5hashsum"';
    *     this.response.etag = 'W/"123456789"';
    *
    * @param {String} etag
    * @api public
    */
  var etag: String = js.native
  
  /**
    * Flush any set headers, and begin the body
    */
  def flushHeaders(): Unit = js.native
  
  /**
    * Check if a header has been written to the socket.
    */
  var headerSent: Boolean = js.native
  
  /**
    * Get the Last-Modified date in Date form, if it exists.
    * Set the Last-Modified date using a string or a Date.
    *
    *     this.response.lastModified = new Date();
    *     this.response.lastModified = '2013-09-13';
    */
  var lastModified: js.Date = js.native
  
  /**
    * Return parsed response Content-Length when present.
    * Set Content-Length field to `n`.
    */
  var length: Double = js.native
  
  /**
    * Get response status message
    */
  var message: String = js.native
  
  /**
    * Perform a 302 redirect to `url`.
    *
    * The string "back" is special-cased
    * to provide Referrer support, when Referrer
    * is not present `alt` or "/" is used.
    *
    * Examples:
    *
    *    this.redirect('back');
    *    this.redirect('back', '/index.html');
    *    this.redirect('/login');
    *    this.redirect('http://google.com');
    */
  def redirect(url: String): Unit = js.native
  def redirect(url: String, alt: String): Unit = js.native
  
  /**
    * Remove header `field`.
    */
  def remove(field: String): Unit = js.native
  
  def set(field: String, `val`: String): Unit = js.native
  def set(field: String, `val`: js.Array[String]): Unit = js.native
  /**
    * Set header `field` to `val`, or pass
    * an object of header fields.
    *
    * Examples:
    *
    *    this.set('Foo', ['bar', 'baz']);
    *    this.set('Accept', 'application/json');
    *    this.set({ Accept: 'text/plain', 'X-API-Key': 'tobi' });
    */
  def set(field: StringDictionary[String | js.Array[String]]): Unit = js.native
  
  /**
    * Get/Set response status code.
    */
  var status: Double = js.native
  
  /**
    * Return the response mime type void of
    * parameters such as "charset".
    *
    * Set Content-Type response header with `type` through `mime.lookup()`
    * when it does not contain a charset.
    *
    * Examples:
    *
    *     this.type = '.html';
    *     this.type = 'html';
    *     this.type = 'json';
    *     this.type = 'application/json';
    *     this.type = 'png';
    */
  var `type`: String = js.native
  
  /**
    * Vary on `field`.
    */
  def vary(field: String): Unit = js.native
  
  /**
    * Checks if the request is writable.
    * Tests for the existence of the socket
    * as node sometimes does not set it.
    */
  var writable: Boolean = js.native
}
