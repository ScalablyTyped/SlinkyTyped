package typingsSlinky.evernote.mod.Types

import typingsSlinky.evernote.anon.ParentGuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "Types.Tag")
@js.native
class Tag () extends StObject {
  def this(args: ParentGuid) = this()
  
  var guid: js.UndefOr[Guid] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var parentGuid: js.UndefOr[Guid] = js.native
  
  var updateSequenceNum: js.UndefOr[Double] = js.native
}
