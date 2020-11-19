package typingsSlinky.evernote.mod.Types

import typingsSlinky.evernote.anon.Order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "Types.Publishing")
@js.native
class Publishing () extends js.Object {
  def this(args: Order) = this()
  
  var ascending: js.UndefOr[Boolean] = js.native
  
  var order: js.UndefOr[NoteSortOrder] = js.native
  
  var publicDescription: js.UndefOr[String] = js.native
  
  var uri: js.UndefOr[String] = js.native
}
