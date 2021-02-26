package typingsSlinky.evernote.mod.Types

import typingsSlinky.evernote.anon.FullMap
import typingsSlinky.std.Map
import typingsSlinky.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "Types.LazyMap")
@js.native
class LazyMap () extends StObject {
  def this(args: FullMap) = this()
  
  var fullMap: js.UndefOr[Map[String, String]] = js.native
  
  var keysOnly: js.UndefOr[Set[String]] = js.native
}
