package typingsSlinky.reactDashNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.ListViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Not @ScalaJSDefined trait */
object ListView
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashNative.reactDashNativeMod.ListView] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.reactDashNative.reactDashNativeMod.ListView].asInstanceOf[String | js.Object]
  def apply(props: ListViewProps with js.Object, overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactDashNative.reactDashNativeMod.ListView] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, props)
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ListViewProps
}

