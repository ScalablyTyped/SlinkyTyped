package typingsSlinky.hlsParser.mod.types

import typingsSlinky.hlsParser.anon.AssocLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls-parser", "types.Rendition")
@js.native
class Rendition[T] protected () extends js.Object {
  def this(properties: AssocLanguage[T]) = this()
  
  var assocLanguage: js.UndefOr[String] = js.native
  
  var autoselect: Boolean = js.native
  
  var channels: js.UndefOr[String] = js.native
  
  var characteristics: js.UndefOr[String] = js.native
  
  var forced: Boolean = js.native
  
  var groupId: String = js.native
  
  var instreamId: js.UndefOr[String] = js.native
  
  var isDefault: Boolean = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var `type`: T = js.native
  
  var uri: js.UndefOr[String] = js.native
}
