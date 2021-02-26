package typingsSlinky.fluentuiReactWindowProvider

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Window
import slinky.core.ReactComponentClass
import typingsSlinky.fluentuiReactWindowProvider.windowProviderMod.WindowProviderProps
import typingsSlinky.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fluentui/react-window-provider", "WindowContext")
  @js.native
  val WindowContext: Context[WindowProviderProps] = js.native
  
  @JSImport("@fluentui/react-window-provider", "WindowProvider")
  @js.native
  val WindowProvider: ReactComponentClass[WindowProviderProps] = js.native
  
  @JSImport("@fluentui/react-window-provider", "useDocument")
  @js.native
  def useDocument(): js.UndefOr[Document] = js.native
  
  @JSImport("@fluentui/react-window-provider", "useWindow")
  @js.native
  def useWindow(): js.UndefOr[Window] = js.native
}
