package typingsSlinky.baseui.selectMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import slinky.core.facade.ReactElement
import typingsSlinky.baseui.anon.Error
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/select", "SelectDropdown")
@js.native
class SelectDropdown protected ()
  extends Component[DropdownProps, js.Object, js.Any] {
  def this(props: DropdownProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: DropdownProps, context: js.Any) = this()
  
  def getItemLabel(option: StringDictionary[js.Any]): ReactElement = js.native
  
  def getSharedProps(): Error = js.native
  
  def onMouseDown(e: Event): Unit = js.native
}
