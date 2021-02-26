package typingsSlinky.reactMdUtils

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getInstanceMod {
  
  @JSImport("@react-md/utils/types/wia-aria/getInstance", "getInstance")
  @js.native
  def getInstance(refOrInstance: RefOrInstance): HTMLElement | Null = js.native
  
  type RefOrInstance = HTMLElement | Null | (MutableRefObject[HTMLElement | Null])
}
