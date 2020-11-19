package typingsSlinky.rcTreeSelect.treeSelectMod

import slinky.core.facade.ReactRef
import typingsSlinky.rcSelect.generateMod.RefSelectProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeSelect[ValueType]
  extends Component[TreeSelectProps[ValueType], js.Object, js.Any] {
  
  def blur(): Unit = js.native
  
  def focus(): Unit = js.native
  
  var selectRef: ReactRef[RefSelectProps] = js.native
}
