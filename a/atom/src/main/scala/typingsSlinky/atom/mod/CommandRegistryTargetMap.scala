package typingsSlinky.atom.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.EventTarget
import typingsSlinky.atom.mod.global.HTMLElementTagNameMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandRegistryTargetMap
  extends HTMLElementTagNameMap
     with /* key */ StringDictionary[EventTarget]
object CommandRegistryTargetMap {
  
  @scala.inline
  def apply(`atom-text-editor`: TextEditorElement): CommandRegistryTargetMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("atom-text-editor")(`atom-text-editor`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandRegistryTargetMap]
  }
}
