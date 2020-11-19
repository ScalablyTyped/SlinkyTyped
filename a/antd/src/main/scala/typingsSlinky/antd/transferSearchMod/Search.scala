package typingsSlinky.antd.transferSearchMod

import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Search
  extends Component[TransferSearchProps, js.Any, js.Any] {
  
  def handleChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  
  def handleClear(e: SyntheticMouseEvent[HTMLAnchorElement]): Unit = js.native
}
