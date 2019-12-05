package typingsSlinky.reactDashDataDashGrid.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashDataDashGrid.AdazzleReactDataGrid.EditorBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object EditorBase
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashDataDashGrid.AdazzleReactDataGrid.ReactDataGrid.editors.EditorBase[js.Any, js.Any]
    ] {
  @JSGlobal("AdazzleReactDataGrid.ReactDataGrid.editors.EditorBase")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = js.Any with EditorBaseProps
}

