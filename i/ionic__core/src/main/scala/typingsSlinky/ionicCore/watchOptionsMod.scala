package typingsSlinky.ionicCore

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MutationObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object watchOptionsMod {
  
  @JSImport("@ionic/core/dist/types/utils/watch-options", "findCheckedOption")
  @js.native
  def findCheckedOption(el: js.Any, tagName: String): js.UndefOr[HTMLElement] = js.native
  
  @JSImport("@ionic/core/dist/types/utils/watch-options", "watchForOptions")
  @js.native
  def watchForOptions[T /* <: HTMLElement */](containerEl: HTMLElement, tagName: String, onChange: js.Function1[/* el */ js.UndefOr[T], Unit]): js.UndefOr[MutationObserver] = js.native
}
