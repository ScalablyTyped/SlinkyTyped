package typingsSlinky.gulpInsert

import org.scalajs.dom.raw.File
import typingsSlinky.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gulp-insert", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Appends a string onto the contents
    * @param {string} content
    * @returns {NodeJS.ReadWriteStream}
    */
  def append(content: String): ReadWriteStream = js.native
  
  /**
    * Prepends a string onto the contents
    * @param {string} content
    * @returns {NodeJS.ReadWriteStream}
    */
  def prepend(content: String): ReadWriteStream = js.native
  
  /**
    * Calls a function with the contents of the file
    * @param {Transformer} transformer
    * @returns {NodeJS.ReadWriteStream}
    */
  def transform(transformer: Transformer): ReadWriteStream = js.native
  
  /**
    * Wraps the contents with two strings
    * @param {string} prepend
    * @param {string} append
    * @returns {NodeJS.ReadWriteStream}
    */
  def wrap(prepend: String, append: String): ReadWriteStream = js.native
  
  type Transformer = js.Function2[/* contents */ String, /* file */ File, String]
}
