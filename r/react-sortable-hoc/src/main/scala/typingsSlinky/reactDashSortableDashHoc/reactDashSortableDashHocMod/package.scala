package typingsSlinky.reactDashSortableDashHoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashSortableDashHocMod {
  import org.scalajs.dom.raw.HTMLElement
  import slinky.core.ReactComponentClass
  import slinky.core.facade.ReactElement
  import slinky.web.SyntheticMouseEvent
  import slinky.web.SyntheticTouchEvent
  import typingsSlinky.react.reactMod._Global_.JSX.Element
  import typingsSlinky.reactDashSortableDashHoc.Anon_Target

  type ContainerGetter = js.Function1[/* element */ ReactElement, HTMLElement | js.Promise[HTMLElement]]
  type HelperContainerGetter = js.Function0[HTMLElement]
  type Offset = Double | String
  type SortEndHandler = js.Function2[/* sort */ SortEnd, /* event */ SortEvent, Unit]
  type SortEvent = SyntheticMouseEvent[js.Any] | SyntheticTouchEvent[js.Any]
  type SortEventWithTag = SortEvent with Anon_Target
  type SortMoveHandler = js.Function1[/* event */ SortEvent, Unit]
  type SortOverHandler = js.Function2[/* sort */ SortOver, /* event */ SortEvent, Unit]
  type SortStartHandler = js.Function2[/* sort */ SortStart, /* event */ SortEvent, Unit]
  type WrappedComponent[P] = ReactComponentClass[P] | ReactComponentClass[P] | WrappedComponentFactory[P]
  type WrappedComponentFactory[P] = js.Function1[/* props */ P, Element]
}
