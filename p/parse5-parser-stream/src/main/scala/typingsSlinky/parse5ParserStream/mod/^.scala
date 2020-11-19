package typingsSlinky.parse5ParserStream.mod

import typingsSlinky.parse5.mod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Streaming HTML parser with scripting support.
  * A [writable stream](https://nodejs.org/api/stream.html#stream_class_stream_writable).
  *
  * ** NOTE:** This API is available only for Node.js.
  *
  * @example
  * ```js
  *
  * const parse5 = require('parse5');
  * const http = require('http');
  *
  * // Fetch the page content and obtain it's <head> node
  * http.get('http://inikulin.github.io/parse5/', res => {
  *    const parser = new parse5.ParserStream();
  *
  *    parser.once('finish', () => {
  *        console.log(parser.document.childNodes[1].childNodes[0].tagName); //> 'head'
  *    });
  *
  *    res.pipe(parser);
  * });
  * ```
  */
@JSImport("parse5-parser-stream", JSImport.Namespace)
@js.native
/**
  * @param options - Parsing options.
  */
class ^[TDocument] () extends ParserStream[TDocument] {
  def this(options: ParserOptions) = this()
}
