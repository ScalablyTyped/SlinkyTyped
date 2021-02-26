package typingsSlinky.azdata.mod

import typingsSlinky.vscode.mod.Disposable
import typingsSlinky.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.azdata.mod.ComponentProperties because Already inherited
- typingsSlinky.azdata.mod.DropDownProperties because var conflicts: CSSStyles, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined value, values, editable, fireOnTextChange, required */ @js.native
trait DropDownComponent extends Component {
  
  var editable: js.UndefOr[Boolean] = js.native
  
  var fireOnTextChange: js.UndefOr[Boolean] = js.native
  
  def onValueChanged(listener: js.Function1[/* e */ js.Any, _]): Disposable = js.native
  def onValueChanged(
    listener: js.Function1[/* e */ js.Any, _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onValueChanged(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any): Disposable = js.native
  def onValueChanged(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  @JSName("onValueChanged")
  var onValueChanged_Original: Event[_] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[String | CategoryValue] = js.native
  
  var values: js.UndefOr[js.Array[CategoryValue | String]] = js.native
}
