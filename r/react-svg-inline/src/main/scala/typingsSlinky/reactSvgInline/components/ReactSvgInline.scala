package typingsSlinky.reactSvgInline.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactSvgInline.mod.SVGInlineProps
import typingsSlinky.reactSvgInline.mod.^
import typingsSlinky.reactSvgInline.reactSvgInlineStrings.comment
import typingsSlinky.reactSvgInline.reactSvgInlineStrings.defs
import typingsSlinky.reactSvgInline.reactSvgInlineStrings.desc
import typingsSlinky.reactSvgInline.reactSvgInlineStrings.fill
import typingsSlinky.reactSvgInline.reactSvgInlineStrings.height
import typingsSlinky.reactSvgInline.reactSvgInlineStrings.sketchMSLayerGroup
import typingsSlinky.reactSvgInline.reactSvgInlineStrings.sketchMSPage
import typingsSlinky.reactSvgInline.reactSvgInlineStrings.sketchMSShapeGroup
import typingsSlinky.reactSvgInline.reactSvgInlineStrings.title
import typingsSlinky.reactSvgInline.reactSvgInlineStrings.width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactSvgInline
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-svg-inline", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    svg: String,
    accessibilityDesc: String = null,
    accessibilityLabel: String = null,
    classSuffix: String = null,
    cleanup: Boolean | (js.Array[
      title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
    ]) = null,
    cleanupExceptions: js.Array[
      title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
    ] = null,
    component: TagMod[Any] = null,
    fill: String = null,
    height: String = null,
    width: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal(svg = svg.asInstanceOf[js.Any])
    if (accessibilityDesc != null) __obj.updateDynamic("accessibilityDesc")(accessibilityDesc.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (classSuffix != null) __obj.updateDynamic("classSuffix")(classSuffix.asInstanceOf[js.Any])
    if (cleanup != null) __obj.updateDynamic("cleanup")(cleanup.asInstanceOf[js.Any])
    if (cleanupExceptions != null) __obj.updateDynamic("cleanupExceptions")(cleanupExceptions.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SVGInlineProps
}

