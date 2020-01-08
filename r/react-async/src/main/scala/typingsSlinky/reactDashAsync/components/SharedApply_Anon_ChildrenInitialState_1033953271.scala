package typingsSlinky.reactDashAsync.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashAsync.Anon_ChildrenInitialState
import typingsSlinky.reactDashAsync.reactDashAsyncMod.AsyncState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_Anon_ChildrenInitialState_1033953271 (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  def apply[T](
    state: AsyncState[T],
    initial: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (!js.isUndefined(initial)) __obj.updateDynamic("initial")(initial.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object]]
  }
  type Props = Anon_ChildrenInitialState[js.Any]
}

