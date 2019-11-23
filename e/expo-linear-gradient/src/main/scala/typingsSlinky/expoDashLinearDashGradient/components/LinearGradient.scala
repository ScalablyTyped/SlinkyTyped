package typingsSlinky.expoDashLinearDashGradient.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.expoDashLinearDashGradient.buildLinearGradientMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(expoDashLinearDashGradient), Name(buildLinearGradientMod), Name(Props))) was not a @ScalaJSDefined trait */
object LinearGradient
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.expoDashLinearDashGradient.buildLinearGradientMod.default].asInstanceOf[String | js.Object]
  def apply(
    props: typingsSlinky.expoDashLinearDashGradient.buildLinearGradientMod.Props with js.Object,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, props)
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.expoDashLinearDashGradient.buildLinearGradientMod.Props
}

