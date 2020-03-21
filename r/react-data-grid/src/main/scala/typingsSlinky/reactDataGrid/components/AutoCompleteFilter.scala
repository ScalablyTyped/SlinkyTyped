package typingsSlinky.reactDataGrid.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Could't extract props from TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Any))),IArray(),NoComments) because couldn't resolve ClassTree. */
object AutoCompleteFilter
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDataGrid.AdazzleReactDataGridPlugins.Filters.AutoCompleteFilter
    ] {
  @JSGlobal("AdazzleReactDataGridPlugins.Filters.AutoCompleteFilter")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = js.Any
}

