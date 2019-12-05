package typingsSlinky.atApolloReactDashHoc.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(TProps))) was not a @ScalaJSDefined trait */
object GraphQLBase
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.atApolloReactDashHoc.libHocDashUtilsMod.GraphQLBase[js.Any, js.Any, js.Any]
    ] {
  @JSImport("@apollo/react-hoc/lib/hoc-utils", "GraphQLBase")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = js.Any
}

