package typingsSlinky.reactMdUtils

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containsElementMod {
  
  @JSImport("@react-md/utils/types/containsElement", "containsElement")
  @js.native
  def containsElement(container: CheckableThing, child: CheckableThing): Boolean = js.native
  
  type CheckableElement = HTMLElement | Null
  
  type CheckableThing = CheckableElement | MutableRefObject[CheckableElement]
}
