package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Window
import slinky.core.ReactComponentClass
import typingsSlinky.fluentuiReactWindowProvider.windowProviderMod.WindowProviderProps
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/WindowProvider", JSImport.Namespace)
@js.native
object windowProviderMod extends js.Object {
  
  val WindowContext: Context[WindowProviderProps] = js.native
  
  val WindowProvider: ReactComponentClass[WindowProviderProps] = js.native
  
  def useDocument(): js.UndefOr[Document] = js.native
  
  def useWindow(): js.UndefOr[Window] = js.native
}
