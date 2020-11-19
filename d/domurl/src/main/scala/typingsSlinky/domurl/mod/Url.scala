package typingsSlinky.domurl.mod

import typingsSlinky.domurl.mod.domurl.QueryString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Url[T] extends js.Object {
  
  def clearQuery(): Url[js.Object] = js.native
  
  def decode(s: String): String = js.native
  
  def encode(s: String): String = js.native
  
  var hash: String = js.native
  
  var host: String = js.native
  
  var href: String = js.native
  
  def isAbsolute(): Boolean = js.native
  
  def isEmptyQuery(): Boolean = js.native
  
  var pass: String = js.native
  
  var path: String = js.native
  
  def paths(): js.Array[String] = js.native
  def paths(paths: js.Array[String]): js.Array[String] = js.native
  
  var port: String = js.native
  
  var protocol: String = js.native
  
  var query: QueryString[T] = js.native
  
  def queryLength(): Double = js.native
  
  var user: String = js.native
}
