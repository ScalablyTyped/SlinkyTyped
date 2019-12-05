package typingsSlinky.reactDashSwipeable.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashSwipeable.reactDashSwipeableMod.SwipeableOptions
import typingsSlinky.reactDashSwipeable.reactDashSwipeableMod.SwipeableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object Swipeable
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashSwipeable.reactDashSwipeableMod.Swipeable] {
  @JSImport("react-swipeable", "Swipeable")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = SwipeableProps with SwipeableOptions
}

