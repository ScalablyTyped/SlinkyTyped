package typingsSlinky.reactFilepond.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactFilepond.mod.FilePondOrigin
import typingsSlinky.reactFilepond.mod.FileProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object File
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactFilepond.mod.File] {
  @JSImport("react-filepond", "File")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: name, size, type */
  def apply(src: String, origin: FilePondOrigin = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactFilepond.mod.File] = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = FileProps
}

