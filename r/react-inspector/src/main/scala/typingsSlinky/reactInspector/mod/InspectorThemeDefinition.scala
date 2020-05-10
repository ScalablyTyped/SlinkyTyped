package typingsSlinky.reactInspector.mod

import typingsSlinky.csstype.mod.BackgroundColorProperty
import typingsSlinky.csstype.mod.BackgroundImageProperty
import typingsSlinky.csstype.mod.BackgroundSizeProperty
import typingsSlinky.csstype.mod.BorderColorProperty
import typingsSlinky.csstype.mod.ColorProperty
import typingsSlinky.csstype.mod.FontFamilyProperty
import typingsSlinky.csstype.mod.FontSizeProperty
import typingsSlinky.csstype.mod.LineHeightProperty
import typingsSlinky.csstype.mod.MarginRightProperty
import typingsSlinky.csstype.mod.PaddingLeftProperty
import typingsSlinky.csstype.mod.TextTransformProperty
import typingsSlinky.reactInspector.reactInspectorNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InspectorThemeDefinition extends InspectorTheme {
  var ARROW_ANIMATION_DURATION: String = js.native
  var ARROW_COLOR: js.UndefOr[ColorProperty] = js.native
  var ARROW_FONT_SIZE: js.UndefOr[FontSizeProperty[String | `0`]] = js.native
  var ARROW_MARGIN_RIGHT: js.UndefOr[MarginRightProperty[String | `0`]] = js.native
  var BASE_BACKGROUND_COLOR: js.UndefOr[BackgroundColorProperty] = js.native
  var BASE_COLOR: js.UndefOr[ColorProperty] = js.native
  var BASE_FONT_FAMILY: js.UndefOr[FontFamilyProperty] = js.native
  var BASE_FONT_SIZE: js.UndefOr[FontSizeProperty[String | `0`]] = js.native
  var BASE_LINE_HEIGHT: js.UndefOr[LineHeightProperty[String | `0`]] = js.native
  var HTML_ATTRIBUTE_NAME_COLOR: js.UndefOr[ColorProperty] = js.native
  var HTML_ATTRIBUTE_VALUE_COLOR: js.UndefOr[ColorProperty] = js.native
  var HTML_COMMENT_COLOR: js.UndefOr[ColorProperty] = js.native
  var HTML_DOCTYPE_COLOR: js.UndefOr[ColorProperty] = js.native
  var HTML_TAGNAME_COLOR: js.UndefOr[ColorProperty] = js.native
  var HTML_TAGNAME_TEXT_TRANSFORM: js.UndefOr[TextTransformProperty] = js.native
  var HTML_TAG_COLOR: js.UndefOr[ColorProperty] = js.native
  var OBJECT_NAME_COLOR: js.UndefOr[ColorProperty] = js.native
  var OBJECT_PREVIEW_ARRAY_MAX_PROPERTIES: Double = js.native
  var OBJECT_PREVIEW_OBJECT_MAX_PROPERTIES: Double = js.native
  var OBJECT_VALUE_BOOLEAN_COLOR: js.UndefOr[ColorProperty] = js.native
  var OBJECT_VALUE_FUNCTION_PREFIX_COLOR: js.UndefOr[ColorProperty] = js.native
  var OBJECT_VALUE_NULL_COLOR: js.UndefOr[ColorProperty] = js.native
  var OBJECT_VALUE_NUMBER_COLOR: js.UndefOr[ColorProperty] = js.native
  var OBJECT_VALUE_REGEXP_COLOR: js.UndefOr[ColorProperty] = js.native
  var OBJECT_VALUE_STRING_COLOR: js.UndefOr[ColorProperty] = js.native
  var OBJECT_VALUE_SYMBOL_COLOR: js.UndefOr[ColorProperty] = js.native
  var OBJECT_VALUE_UNDEFINED_COLOR: js.UndefOr[ColorProperty] = js.native
  var TABLE_BORDER_COLOR: js.UndefOr[BorderColorProperty] = js.native
  var TABLE_DATA_BACKGROUND_IMAGE: js.UndefOr[BackgroundImageProperty] = js.native
  var TABLE_DATA_BACKGROUND_SIZE: js.UndefOr[BackgroundSizeProperty[String | `0`]] = js.native
  var TABLE_SORT_ICON_COLOR: js.UndefOr[ColorProperty] = js.native
  var TABLE_TH_BACKGROUND_COLOR: js.UndefOr[BackgroundColorProperty] = js.native
  var TABLE_TH_HOVER_COLOR: js.UndefOr[ColorProperty] = js.native
  var TREENODE_FONT_FAMILY: js.UndefOr[FontFamilyProperty] = js.native
  var TREENODE_FONT_SIZE: js.UndefOr[FontSizeProperty[String | `0`]] = js.native
  var TREENODE_LINE_HEIGHT: js.UndefOr[LineHeightProperty[String | `0`]] = js.native
  var TREENODE_PADDING_LEFT: js.UndefOr[PaddingLeftProperty[String | `0`]] = js.native
}

object InspectorThemeDefinition {
  @scala.inline
  def apply(
    ARROW_ANIMATION_DURATION: String,
    OBJECT_PREVIEW_ARRAY_MAX_PROPERTIES: Double,
    OBJECT_PREVIEW_OBJECT_MAX_PROPERTIES: Double
  ): InspectorThemeDefinition = {
    val __obj = js.Dynamic.literal(ARROW_ANIMATION_DURATION = ARROW_ANIMATION_DURATION.asInstanceOf[js.Any], OBJECT_PREVIEW_ARRAY_MAX_PROPERTIES = OBJECT_PREVIEW_ARRAY_MAX_PROPERTIES.asInstanceOf[js.Any], OBJECT_PREVIEW_OBJECT_MAX_PROPERTIES = OBJECT_PREVIEW_OBJECT_MAX_PROPERTIES.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectorThemeDefinition]
  }
  @scala.inline
  implicit class InspectorThemeDefinitionOps[Self <: InspectorThemeDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARROW_ANIMATION_DURATION(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARROW_ANIMATION_DURATION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOBJECT_PREVIEW_ARRAY_MAX_PROPERTIES(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_PREVIEW_ARRAY_MAX_PROPERTIES")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOBJECT_PREVIEW_OBJECT_MAX_PROPERTIES(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_PREVIEW_OBJECT_MAX_PROPERTIES")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withARROW_COLOR(value: ColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARROW_COLOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutARROW_COLOR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARROW_COLOR")(js.undefined)
        ret
    }
    @scala.inline
    def withARROW_FONT_SIZE(value: FontSizeProperty[String | `0`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARROW_FONT_SIZE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutARROW_FONT_SIZE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARROW_FONT_SIZE")(js.undefined)
        ret
    }
    @scala.inline
    def withARROW_MARGIN_RIGHT(value: MarginRightProperty[String | `0`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARROW_MARGIN_RIGHT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutARROW_MARGIN_RIGHT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARROW_MARGIN_RIGHT")(js.undefined)
        ret
    }
    @scala.inline
    def withBASE_BACKGROUND_COLOR(value: BackgroundColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BASE_BACKGROUND_COLOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBASE_BACKGROUND_COLOR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BASE_BACKGROUND_COLOR")(js.undefined)
        ret
    }
    @scala.inline
    def withBASE_COLOR(value: ColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BASE_COLOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBASE_COLOR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BASE_COLOR")(js.undefined)
        ret
    }
    @scala.inline
    def withBASE_FONT_FAMILY(value: FontFamilyProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BASE_FONT_FAMILY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBASE_FONT_FAMILY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BASE_FONT_FAMILY")(js.undefined)
        ret
    }
    @scala.inline
    def withBASE_FONT_SIZE(value: FontSizeProperty[String | `0`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BASE_FONT_SIZE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBASE_FONT_SIZE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BASE_FONT_SIZE")(js.undefined)
        ret
    }
    @scala.inline
    def withBASE_LINE_HEIGHT(value: LineHeightProperty[String | `0`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BASE_LINE_HEIGHT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBASE_LINE_HEIGHT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BASE_LINE_HEIGHT")(js.undefined)
        ret
    }
    @scala.inline
    def withHTML_ATTRIBUTE_NAME_COLOR(value: ColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTML_ATTRIBUTE_NAME_COLOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHTML_ATTRIBUTE_NAME_COLOR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTML_ATTRIBUTE_NAME_COLOR")(js.undefined)
        ret
    }
    @scala.inline
    def withHTML_ATTRIBUTE_VALUE_COLOR(value: ColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTML_ATTRIBUTE_VALUE_COLOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHTML_ATTRIBUTE_VALUE_COLOR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTML_ATTRIBUTE_VALUE_COLOR")(js.undefined)
        ret
    }
    @scala.inline
    def withHTML_COMMENT_COLOR(value: ColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTML_COMMENT_COLOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHTML_COMMENT_COLOR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTML_COMMENT_COLOR")(js.undefined)
        ret
    }
    @scala.inline
    def withHTML_DOCTYPE_COLOR(value: ColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTML_DOCTYPE_COLOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHTML_DOCTYPE_COLOR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTML_DOCTYPE_COLOR")(js.undefined)
        ret
    }
    @scala.inline
    def withHTML_TAGNAME_COLOR(value: ColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTML_TAGNAME_COLOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHTML_TAGNAME_COLOR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTML_TAGNAME_COLOR")(js.undefined)
        ret
    }
    @scala.inline
    def withHTML_TAGNAME_TEXT_TRANSFORM(value: TextTransformProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTML_TAGNAME_TEXT_TRANSFORM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHTML_TAGNAME_TEXT_TRANSFORM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTML_TAGNAME_TEXT_TRANSFORM")(js.undefined)
        ret
    }
    @scala.inline
    def withHTML_TAG_COLOR(value: ColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTML_TAG_COLOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHTML_TAG_COLOR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTML_TAG_COLOR")(js.undefined)
        ret
    }
    @scala.inline
    def withOBJECT_NAME_COLOR(value: ColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_NAME_COLOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOBJECT_NAME_COLOR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_NAME_COLOR")(js.undefined)
        ret
    }
    @scala.inline
    def withOBJECT_VALUE_BOOLEAN_COLOR(value: ColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_VALUE_BOOLEAN_COLOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOBJECT_VALUE_BOOLEAN_COLOR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_VALUE_BOOLEAN_COLOR")(js.undefined)
        ret
    }
    @scala.inline
    def withOBJECT_VALUE_FUNCTION_PREFIX_COLOR(value: ColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_VALUE_FUNCTION_PREFIX_COLOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOBJECT_VALUE_FUNCTION_PREFIX_COLOR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_VALUE_FUNCTION_PREFIX_COLOR")(js.undefined)
        ret
    }
    @scala.inline
    def withOBJECT_VALUE_NULL_COLOR(value: ColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_VALUE_NULL_COLOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOBJECT_VALUE_NULL_COLOR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_VALUE_NULL_COLOR")(js.undefined)
        ret
    }
    @scala.inline
    def withOBJECT_VALUE_NUMBER_COLOR(value: ColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_VALUE_NUMBER_COLOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOBJECT_VALUE_NUMBER_COLOR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_VALUE_NUMBER_COLOR")(js.undefined)
        ret
    }
    @scala.inline
    def withOBJECT_VALUE_REGEXP_COLOR(value: ColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_VALUE_REGEXP_COLOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOBJECT_VALUE_REGEXP_COLOR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_VALUE_REGEXP_COLOR")(js.undefined)
        ret
    }
    @scala.inline
    def withOBJECT_VALUE_STRING_COLOR(value: ColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_VALUE_STRING_COLOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOBJECT_VALUE_STRING_COLOR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_VALUE_STRING_COLOR")(js.undefined)
        ret
    }
    @scala.inline
    def withOBJECT_VALUE_SYMBOL_COLOR(value: ColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_VALUE_SYMBOL_COLOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOBJECT_VALUE_SYMBOL_COLOR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_VALUE_SYMBOL_COLOR")(js.undefined)
        ret
    }
    @scala.inline
    def withOBJECT_VALUE_UNDEFINED_COLOR(value: ColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_VALUE_UNDEFINED_COLOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOBJECT_VALUE_UNDEFINED_COLOR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_VALUE_UNDEFINED_COLOR")(js.undefined)
        ret
    }
    @scala.inline
    def withTABLE_BORDER_COLOR(value: BorderColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TABLE_BORDER_COLOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTABLE_BORDER_COLOR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TABLE_BORDER_COLOR")(js.undefined)
        ret
    }
    @scala.inline
    def withTABLE_DATA_BACKGROUND_IMAGE(value: BackgroundImageProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TABLE_DATA_BACKGROUND_IMAGE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTABLE_DATA_BACKGROUND_IMAGE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TABLE_DATA_BACKGROUND_IMAGE")(js.undefined)
        ret
    }
    @scala.inline
    def withTABLE_DATA_BACKGROUND_SIZE(value: BackgroundSizeProperty[String | `0`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TABLE_DATA_BACKGROUND_SIZE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTABLE_DATA_BACKGROUND_SIZE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TABLE_DATA_BACKGROUND_SIZE")(js.undefined)
        ret
    }
    @scala.inline
    def withTABLE_SORT_ICON_COLOR(value: ColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TABLE_SORT_ICON_COLOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTABLE_SORT_ICON_COLOR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TABLE_SORT_ICON_COLOR")(js.undefined)
        ret
    }
    @scala.inline
    def withTABLE_TH_BACKGROUND_COLOR(value: BackgroundColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TABLE_TH_BACKGROUND_COLOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTABLE_TH_BACKGROUND_COLOR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TABLE_TH_BACKGROUND_COLOR")(js.undefined)
        ret
    }
    @scala.inline
    def withTABLE_TH_HOVER_COLOR(value: ColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TABLE_TH_HOVER_COLOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTABLE_TH_HOVER_COLOR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TABLE_TH_HOVER_COLOR")(js.undefined)
        ret
    }
    @scala.inline
    def withTREENODE_FONT_FAMILY(value: FontFamilyProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TREENODE_FONT_FAMILY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTREENODE_FONT_FAMILY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TREENODE_FONT_FAMILY")(js.undefined)
        ret
    }
    @scala.inline
    def withTREENODE_FONT_SIZE(value: FontSizeProperty[String | `0`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TREENODE_FONT_SIZE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTREENODE_FONT_SIZE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TREENODE_FONT_SIZE")(js.undefined)
        ret
    }
    @scala.inline
    def withTREENODE_LINE_HEIGHT(value: LineHeightProperty[String | `0`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TREENODE_LINE_HEIGHT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTREENODE_LINE_HEIGHT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TREENODE_LINE_HEIGHT")(js.undefined)
        ret
    }
    @scala.inline
    def withTREENODE_PADDING_LEFT(value: PaddingLeftProperty[String | `0`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TREENODE_PADDING_LEFT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTREENODE_PADDING_LEFT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TREENODE_PADDING_LEFT")(js.undefined)
        ret
    }
  }
  
}

