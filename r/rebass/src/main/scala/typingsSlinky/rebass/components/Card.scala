package typingsSlinky.rebass.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rebass.mod.BoxKnownProps
import typingsSlinky.rebass.mod.SxStyleProp
import typingsSlinky.rebass.rebassStrings.colors
import typingsSlinky.rebass.rebassStrings.fontSizes
import typingsSlinky.rebass.rebassStrings.space
import typingsSlinky.styledComponents.styledComponentsMod.CSSObject
import typingsSlinky.styledComponents.styledComponentsMod.FlattenSimpleInterpolation
import typingsSlinky.styledSystem.mod.RequiredTheme
import typingsSlinky.styledSystem.mod.ResponsiveValue
import typingsSlinky.styledSystem.mod.ThemeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Card {
  
  @JSImport("rebass", "Card")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Any with js.Object] {
    
    @scala.inline
    def alignSelfVarargs(value: (js.Any | Null)*): this.type = set("alignSelf", js.Array(value :_*))
    
    @scala.inline
    def alignSelf(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ _, 
          RequiredTheme
        ]
    ): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alignSelfNull: this.type = set("alignSelf", null)
    
    @scala.inline
    def asFunctionComponent(value: ReactComponentClass[_]): this.type = set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def asComponentClass(value: ReactComponentClass[_]): this.type = set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def as(value: ReactElement): this.type = set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): this.type = set("backgroundColor", js.Array(value :_*))
    
    @scala.inline
    def backgroundColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundColorNull: this.type = set("backgroundColor", null)
    
    @scala.inline
    def bgVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): this.type = set("bg", js.Array(value :_*))
    
    @scala.inline
    def bg(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): this.type = set("bg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgNull: this.type = set("bg", null)
    
    @scala.inline
    def colorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): this.type = set("color", js.Array(value :_*))
    
    @scala.inline
    def color(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorNull: this.type = set("color", null)
    
    @scala.inline
    def css(value: CSSObject | FlattenSimpleInterpolation | String): this.type = set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def displayVarargs(value: (js.Any | Null)*): this.type = set("display", js.Array(value :_*))
    
    @scala.inline
    def display(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ _, 
          RequiredTheme
        ]
    ): this.type = set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def displayNull: this.type = set("display", null)
    
    @scala.inline
    def flexVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any) | Null)*
    ): this.type = set("flex", js.Array(value :_*))
    
    @scala.inline
    def flex(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
    ): this.type = set("flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flexNull: this.type = set("flex", null)
    
    @scala.inline
    def fontSizeVarargs(value: ((ThemeValue[fontSizes, RequiredTheme, js.Any]) | Null)*): this.type = set("fontSize", js.Array(value :_*))
    
    @scala.inline
    def fontSize(value: ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, js.Any], RequiredTheme]): this.type = set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontSizeNull: this.type = set("fontSize", null)
    
    @scala.inline
    def heightVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any) | Null)*
    ): this.type = set("height", js.Array(value :_*))
    
    @scala.inline
    def height(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
    ): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def heightNull: this.type = set("height", null)
    
    @scala.inline
    def mVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("m", js.Array(value :_*))
    
    @scala.inline
    def m(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): this.type = set("m", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mNull: this.type = set("m", null)
    
    @scala.inline
    def marginVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("margin", js.Array(value :_*))
    
    @scala.inline
    def margin(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): this.type = set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginNull: this.type = set("margin", null)
    
    @scala.inline
    def marginBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("marginBottom", js.Array(value :_*))
    
    @scala.inline
    def marginBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): this.type = set("marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginBottomNull: this.type = set("marginBottom", null)
    
    @scala.inline
    def marginLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("marginLeft", js.Array(value :_*))
    
    @scala.inline
    def marginLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): this.type = set("marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginLeftNull: this.type = set("marginLeft", null)
    
    @scala.inline
    def marginRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("marginRight", js.Array(value :_*))
    
    @scala.inline
    def marginRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): this.type = set("marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginRightNull: this.type = set("marginRight", null)
    
    @scala.inline
    def marginTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("marginTop", js.Array(value :_*))
    
    @scala.inline
    def marginTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): this.type = set("marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginTopNull: this.type = set("marginTop", null)
    
    @scala.inline
    def marginXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("marginX", js.Array(value :_*))
    
    @scala.inline
    def marginX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): this.type = set("marginX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginXNull: this.type = set("marginX", null)
    
    @scala.inline
    def marginYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("marginY", js.Array(value :_*))
    
    @scala.inline
    def marginY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): this.type = set("marginY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginYNull: this.type = set("marginY", null)
    
    @scala.inline
    def maxHeightVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ js.Any) | Null)*
    ): this.type = set("maxHeight", js.Array(value :_*))
    
    @scala.inline
    def maxHeight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
    ): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxHeightNull: this.type = set("maxHeight", null)
    
    @scala.inline
    def maxWidthVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ js.Any) | Null)*
    ): this.type = set("maxWidth", js.Array(value :_*))
    
    @scala.inline
    def maxWidth(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
    ): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxWidthNull: this.type = set("maxWidth", null)
    
    @scala.inline
    def mbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("mb", js.Array(value :_*))
    
    @scala.inline
    def mb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): this.type = set("mb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mbNull: this.type = set("mb", null)
    
    @scala.inline
    def minHeightVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ js.Any) | Null)*
    ): this.type = set("minHeight", js.Array(value :_*))
    
    @scala.inline
    def minHeight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
    ): this.type = set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minHeightNull: this.type = set("minHeight", null)
    
    @scala.inline
    def minWidthVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ js.Any) | Null)*
    ): this.type = set("minWidth", js.Array(value :_*))
    
    @scala.inline
    def minWidth(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
    ): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minWidthNull: this.type = set("minWidth", null)
    
    @scala.inline
    def mlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("ml", js.Array(value :_*))
    
    @scala.inline
    def ml(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): this.type = set("ml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mlNull: this.type = set("ml", null)
    
    @scala.inline
    def mrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("mr", js.Array(value :_*))
    
    @scala.inline
    def mr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): this.type = set("mr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mrNull: this.type = set("mr", null)
    
    @scala.inline
    def mtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("mt", js.Array(value :_*))
    
    @scala.inline
    def mt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): this.type = set("mt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mtNull: this.type = set("mt", null)
    
    @scala.inline
    def mxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("mx", js.Array(value :_*))
    
    @scala.inline
    def mx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): this.type = set("mx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mxNull: this.type = set("mx", null)
    
    @scala.inline
    def myVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("my", js.Array(value :_*))
    
    @scala.inline
    def my(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): this.type = set("my", value.asInstanceOf[js.Any])
    
    @scala.inline
    def myNull: this.type = set("my", null)
    
    @scala.inline
    def opacityVarargs(value: (js.Any | Null)*): this.type = set("opacity", js.Array(value :_*))
    
    @scala.inline
    def opacity(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ _, 
          RequiredTheme
        ]
    ): this.type = set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def opacityNull: this.type = set("opacity", null)
    
    @scala.inline
    def orderVarargs(value: (js.Any | Null)*): this.type = set("order", js.Array(value :_*))
    
    @scala.inline
    def order(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ _, 
          RequiredTheme
        ]
    ): this.type = set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def orderNull: this.type = set("order", null)
    
    @scala.inline
    def overflowVarargs(value: (js.Any | Null)*): this.type = set("overflow", js.Array(value :_*))
    
    @scala.inline
    def overflow(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ _, 
          RequiredTheme
        ]
    ): this.type = set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overflowNull: this.type = set("overflow", null)
    
    @scala.inline
    def overflowXVarargs(value: (js.Any | Null)*): this.type = set("overflowX", js.Array(value :_*))
    
    @scala.inline
    def overflowX(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ _, 
          RequiredTheme
        ]
    ): this.type = set("overflowX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overflowXNull: this.type = set("overflowX", null)
    
    @scala.inline
    def overflowYVarargs(value: (js.Any | Null)*): this.type = set("overflowY", js.Array(value :_*))
    
    @scala.inline
    def overflowY(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ _, 
          RequiredTheme
        ]
    ): this.type = set("overflowY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overflowYNull: this.type = set("overflowY", null)
    
    @scala.inline
    def pVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("p", js.Array(value :_*))
    
    @scala.inline
    def p(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): this.type = set("p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pNull: this.type = set("p", null)
    
    @scala.inline
    def paddingVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("padding", js.Array(value :_*))
    
    @scala.inline
    def padding(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): this.type = set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingNull: this.type = set("padding", null)
    
    @scala.inline
    def paddingBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("paddingBottom", js.Array(value :_*))
    
    @scala.inline
    def paddingBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): this.type = set("paddingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingBottomNull: this.type = set("paddingBottom", null)
    
    @scala.inline
    def paddingLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("paddingLeft", js.Array(value :_*))
    
    @scala.inline
    def paddingLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): this.type = set("paddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingLeftNull: this.type = set("paddingLeft", null)
    
    @scala.inline
    def paddingRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("paddingRight", js.Array(value :_*))
    
    @scala.inline
    def paddingRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): this.type = set("paddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingRightNull: this.type = set("paddingRight", null)
    
    @scala.inline
    def paddingTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("paddingTop", js.Array(value :_*))
    
    @scala.inline
    def paddingTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): this.type = set("paddingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingTopNull: this.type = set("paddingTop", null)
    
    @scala.inline
    def paddingXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("paddingX", js.Array(value :_*))
    
    @scala.inline
    def paddingX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): this.type = set("paddingX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingXNull: this.type = set("paddingX", null)
    
    @scala.inline
    def paddingYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("paddingY", js.Array(value :_*))
    
    @scala.inline
    def paddingY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): this.type = set("paddingY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingYNull: this.type = set("paddingY", null)
    
    @scala.inline
    def pbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("pb", js.Array(value :_*))
    
    @scala.inline
    def pb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): this.type = set("pb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pbNull: this.type = set("pb", null)
    
    @scala.inline
    def plVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("pl", js.Array(value :_*))
    
    @scala.inline
    def pl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): this.type = set("pl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def plNull: this.type = set("pl", null)
    
    @scala.inline
    def prVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("pr", js.Array(value :_*))
    
    @scala.inline
    def pr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): this.type = set("pr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prNull: this.type = set("pr", null)
    
    @scala.inline
    def ptVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("pt", js.Array(value :_*))
    
    @scala.inline
    def pt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): this.type = set("pt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ptNull: this.type = set("pt", null)
    
    @scala.inline
    def pxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("px", js.Array(value :_*))
    
    @scala.inline
    def px(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): this.type = set("px", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pxNull: this.type = set("px", null)
    
    @scala.inline
    def pyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("py", js.Array(value :_*))
    
    @scala.inline
    def py(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): this.type = set("py", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pyNull: this.type = set("py", null)
    
    @scala.inline
    def sizeVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any) | Null)*
    ): this.type = set("size", js.Array(value :_*))
    
    @scala.inline
    def size(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
    ): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sizeNull: this.type = set("size", null)
    
    @scala.inline
    def sx(value: SxStyleProp): this.type = set("sx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sxNull: this.type = set("sx", null)
    
    @scala.inline
    def tx(value: String): this.type = set("tx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def variantVarargs(value: (String | Null)*): this.type = set("variant", js.Array(value :_*))
    
    @scala.inline
    def variant(value: ResponsiveValue[String, RequiredTheme]): this.type = set("variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def variantNull: this.type = set("variant", null)
    
    @scala.inline
    def verticalAlignVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ js.Any) | Null)*
    ): this.type = set("verticalAlign", js.Array(value :_*))
    
    @scala.inline
    def verticalAlign(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
    ): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def verticalAlignNull: this.type = set("verticalAlign", null)
    
    @scala.inline
    def widthVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ js.Any) | Null)*
    ): this.type = set("width", js.Array(value :_*))
    
    @scala.inline
    def width(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
    ): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def widthNull: this.type = set("width", null)
  }
  
  def withProps(p: BoxKnownProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Card.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
