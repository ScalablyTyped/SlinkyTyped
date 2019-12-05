package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.Anon_EventAny
import typingsSlinky.baseui.Anon_NextPage
import typingsSlinky.baseui.baseuiStrings.change_
import typingsSlinky.baseui.paginationMod.Labels
import typingsSlinky.baseui.paginationMod.PaginationOverrides
import typingsSlinky.baseui.paginationMod.State
import typingsSlinky.baseui.paginationMod.StatefulPaginationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulPagination
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("baseui/pagination", "StatefulPagination")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    numPages: Double,
    initialState: State = null,
    labels: Labels = null,
    onNextClick: /* args */ Anon_EventAny => _ = null,
    onPageChange: /* args */ Anon_NextPage => _ = null,
    onPrevClick: /* args */ Anon_EventAny => _ = null,
    overrides: PaginationOverrides = null,
    stateReducer: (change_, /* changes */ State, /* currentState */ State) => State = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(numPages = numPages.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (onNextClick != null) __obj.updateDynamic("onNextClick")(js.Any.fromFunction1(onNextClick))
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction1(onPageChange))
    if (onPrevClick != null) __obj.updateDynamic("onPrevClick")(js.Any.fromFunction1(onPrevClick))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StatefulPaginationProps
}

