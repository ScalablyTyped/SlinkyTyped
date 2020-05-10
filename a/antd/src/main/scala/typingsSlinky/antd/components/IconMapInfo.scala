package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLSpanElement
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for (/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_AntdIcon.AntdIconProps * / js.Any) with typingsSlinky.react.mod.RefAttributes[typingsSlinky.std.HTMLSpanElement] because: IArray(Could't extract props from / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_AntdIcon.AntdIconProps * / js.Any because couldn't resolve ClassTree.) */
object IconMapInfo {
  @JSImport("antd/lib/result", "IconMap.info")
  @js.native
  object component extends js.Object
  
  def apply(
    p: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_AntdIcon.AntdIconProps */ js.Any) with RefAttributes[HTMLSpanElement]
  ): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: IconMapInfo.type): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}

