package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Window
import slinky.core.ReactComponentClass
import typingsSlinky.fluentuiReactWindowProvider.windowProviderMod.WindowProviderProps
import typingsSlinky.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowProviderMod {
  
  @JSImport("office-ui-fabric-react/lib/WindowProvider", "WindowContext")
  @js.native
  val WindowContext: Context[WindowProviderProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/WindowProvider", "WindowProvider")
  @js.native
  val WindowProvider: ReactComponentClass[WindowProviderProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/WindowProvider", "useDocument")
  @js.native
  def useDocument(): js.UndefOr[Document] = js.native
  
  @JSImport("office-ui-fabric-react/lib/WindowProvider", "useWindow")
  @js.native
  def useWindow(): js.UndefOr[Window] = js.native
}
