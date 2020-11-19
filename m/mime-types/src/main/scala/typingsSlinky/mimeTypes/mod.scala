package typingsSlinky.mimeTypes

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mimeTypes.mimeTypesBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mime-types", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def charset(typeString: String): String | `false` = js.native
  
  def contentType(filenameOrExt: String): String | `false` = js.native
  
  def extension(typeString: String): String | `false` = js.native
  
  def lookup(filenameOrExt: String): String | `false` = js.native
  
  @js.native
  object extensions
    extends /* key */ StringDictionary[js.Array[String]]
  
  @js.native
  object types extends /* key */ StringDictionary[String]
}
