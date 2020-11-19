package typingsSlinky.eggMultipart

import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultipartFileStream extends Readable {
  
  var encoding: String = js.native
  
  var fieldname: String = js.native
  
  var fields: js.Any = js.native
  
  var filename: String = js.native
  
  var mime: String = js.native
  
  var mimeType: String = js.native
  
  var transferEncoding: String = js.native
  
  var truncated: Boolean = js.native
}
