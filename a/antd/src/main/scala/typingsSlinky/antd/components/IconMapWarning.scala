package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Couldn't find props for TypeRef(QualifiedName(IArray(Name(<intersection>))),IArray(TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Any))),IArray(),Comments(1)), TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(react), Name(mod), Name(RefAttributes))),IArray(TypeRef(QualifiedName(IArray(Name(org), Name(scalajs), Name(dom), Name(raw), Name(HTMLSpanElement))),IArray(),NoComments)),NoComments)),NoComments) because: Could't extract props from TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Any))),IArray(),Comments(1)) because couldn't resolve ClassTree. */
object IconMapWarning
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("antd/lib/result", "IconMap.warning")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_AntdIcon.AntdIconProps */ js.Any) with RefAttributes[HTMLSpanElement]
}

