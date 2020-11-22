package typingsSlinky.rebass.mod

import typingsSlinky.rebass.rebassStrings.colors
import typingsSlinky.rebass.rebassStrings.fontSizes
import typingsSlinky.rebass.rebassStrings.space
import typingsSlinky.styledSystem.mod.AlignSelfProps
import typingsSlinky.styledSystem.mod.BackgroundColorProps
import typingsSlinky.styledSystem.mod.DisplayProps
import typingsSlinky.styledSystem.mod.FontSizeProps
import typingsSlinky.styledSystem.mod.HeightProps
import typingsSlinky.styledSystem.mod.MaxHeightProps
import typingsSlinky.styledSystem.mod.MaxWidthProps
import typingsSlinky.styledSystem.mod.MinHeightProps
import typingsSlinky.styledSystem.mod.MinWidthProps
import typingsSlinky.styledSystem.mod.OpacityProps
import typingsSlinky.styledSystem.mod.OrderProps
import typingsSlinky.styledSystem.mod.OverflowProps
import typingsSlinky.styledSystem.mod.RequiredTheme
import typingsSlinky.styledSystem.mod.ResponsiveValue
import typingsSlinky.styledSystem.mod.SizeProps
import typingsSlinky.styledSystem.mod.SpaceProps
import typingsSlinky.styledSystem.mod.TextColorProps
import typingsSlinky.styledSystem.mod.ThemeValue
import typingsSlinky.styledSystem.mod.VerticalAlignProps
import typingsSlinky.styledSystem.mod.WidthProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoxKnownProps
  extends BaseProps
     with SpaceProps[RequiredTheme, ThemeValue[space, RequiredTheme, js.Any]]
     with WidthProps[
      RequiredTheme, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ js.Any
    ]
     with HeightProps[
      RequiredTheme, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any
    ]
     with MinWidthProps[
      RequiredTheme, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ js.Any
    ]
     with MinHeightProps[
      RequiredTheme, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ js.Any
    ]
     with MaxWidthProps[
      RequiredTheme, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ js.Any
    ]
     with MaxHeightProps[
      RequiredTheme, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ js.Any
    ]
     with DisplayProps[RequiredTheme]
     with VerticalAlignProps[
      RequiredTheme, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ js.Any
    ]
     with SizeProps[
      RequiredTheme, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any
    ]
     with OverflowProps[RequiredTheme]
     with FontSizeProps[RequiredTheme, ThemeValue[fontSizes, RequiredTheme, js.Any]]
     with TextColorProps[RequiredTheme, ThemeValue[colors, RequiredTheme, js.Any]]
     with BackgroundColorProps[RequiredTheme, ThemeValue[colors, RequiredTheme, js.Any]]
     with OpacityProps[RequiredTheme]
     with typingsSlinky.styledSystem.mod.FlexProps[
      RequiredTheme, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any
    ]
     with OrderProps[RequiredTheme]
     with AlignSelfProps[RequiredTheme]
     with SxProps {
  
  var tx: js.UndefOr[String] = js.native
  
  var variant: js.UndefOr[ResponsiveValue[String, RequiredTheme]] = js.native
}
object BoxKnownProps {
  
  @scala.inline
  def apply(): BoxKnownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxKnownProps]
  }
  
  @scala.inline
  implicit class BoxKnownPropsOps[Self <: BoxKnownProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTx(value: String): Self = this.set("tx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTx: Self = this.set("tx", js.undefined)
    
    @scala.inline
    def setVariantVarargs(value: (String | Null)*): Self = this.set("variant", js.Array(value :_*))
    
    @scala.inline
    def setVariant(value: ResponsiveValue[String, RequiredTheme]): Self = this.set("variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
    
    @scala.inline
    def setVariantNull: Self = this.set("variant", null)
  }
}
