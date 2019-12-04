package typingsSlinky.react.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.experimentalMod.reactMod.SuspenseListProps
import typingsSlinky.react.experimentalMod.reactMod.SuspenseListRevealOrder
import typingsSlinky.react.experimentalMod.reactMod.SuspenseListTailMode
import typingsSlinky.react.reactStrings.backwards
import typingsSlinky.react.reactStrings.forwards
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SuspenseList
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react", "SuspenseList")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def DirectionalSuspenseListProps(
    revealOrder: forwards | backwards,
    tail: SuspenseListTailMode = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(revealOrder = revealOrder.asInstanceOf[js.Any])
    if (tail != null) __obj.updateDynamic("tail")(tail.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def NonDirectionalSuspenseListProps(
    revealOrder: Exclude[SuspenseListRevealOrder, forwards | backwards] = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (revealOrder != null) __obj.updateDynamic("revealOrder")(revealOrder.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SuspenseListProps
}

