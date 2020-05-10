package typingsSlinky.reactSvgInline.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
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

@js.native
trait SVGInlineProps extends js.Object {
  var accessibilityDesc: js.UndefOr[String] = js.native
  var accessibilityLabel: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var classSuffix: js.UndefOr[String] = js.native
  var cleanup: js.UndefOr[
    Boolean | (js.Array[
      title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
    ])
  ] = js.native
  var cleanupExceptions: js.UndefOr[
    js.Array[
      title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
    ]
  ] = js.native
  var component: js.UndefOr[TagMod[Any]] = js.native
  var fill: js.UndefOr[String] = js.native
  var height: js.UndefOr[String] = js.native
  var svg: String = js.native
  var width: js.UndefOr[String] = js.native
}

object SVGInlineProps {
  @scala.inline
  def apply(svg: String): SVGInlineProps = {
    val __obj = js.Dynamic.literal(svg = svg.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGInlineProps]
  }
  @scala.inline
  implicit class SVGInlinePropsOps[Self <: SVGInlineProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSvg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessibilityDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityDesc")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withClassSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withCleanup(
      value: Boolean | (js.Array[
          title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanup")(js.undefined)
        ret
    }
    @scala.inline
    def withCleanupExceptions(
      value: js.Array[
          title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanupExceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanupExceptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanupExceptions")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponent(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

