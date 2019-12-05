package typingsSlinky.reactDashSelect.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashSelect), Name(srcAsyncCreatableMod), Name(Props))) was not a @ScalaJSDefined trait */
object AsyncCreatable
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashSelect.asyncDashCreatableMod.AsyncCreatable[js.Any]
    ] {
  @JSImport("react-select/async-creatable", "AsyncCreatable")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = typingsSlinky.reactDashSelect.srcAsyncCreatableMod.Props[js.Any]
}

