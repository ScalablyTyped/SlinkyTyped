package typingsSlinky.reactDataGrid.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDataGrid.AdazzleReactDataGrid.EditorBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Couldn't find props for TypeRef(QualifiedName(IArray(Name(<intersection>))),IArray(TypeRef(QualifiedName(IArray(Name(P))),IArray(),NoComments), TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(reactDataGrid), Name(AdazzleReactDataGrid), Name(EditorBaseProps))),IArray(),NoComments)),NoComments) because: Could't extract props from TypeRef(QualifiedName(IArray(Name(P))),IArray(),NoComments) because couldn't resolve ClassTree. */
object EditorsEditorBase
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDataGrid.mod.editors.EditorBase[js.Any, js.Any]] {
  @JSImport("react-data-grid", "editors.EditorBase")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = js.Any with EditorBaseProps
}

