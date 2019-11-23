package typingsSlinky.reactDashNativeDashGestureDashHandler.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(scala), Name(scalajs), Name(js), Name(Any))) was not a @ScalaJSDefined trait */
object TouchableWithoutFeedback
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.TouchableWithoutFeedback
    ] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.TouchableWithoutFeedback].asInstanceOf[String | js.Object]
  def apply(
    props: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TouchableHighlightProperties */ js.Any) with js.Object,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.TouchableWithoutFeedback
  ] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, props)
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TouchableHighlightProperties */ js.Any
}

