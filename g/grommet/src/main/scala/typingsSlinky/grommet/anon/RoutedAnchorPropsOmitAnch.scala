package typingsSlinky.grommet.anon

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.push
import typingsSlinky.grommet.grommetStrings.replace
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import typingsSlinky.grommet.grommetStrings.xxlarge
import typingsSlinky.grommet.utilsMod.A11yTitleType
import typingsSlinky.grommet.utilsMod.AlignSelfType
import typingsSlinky.grommet.utilsMod.ColorType
import typingsSlinky.grommet.utilsMod.GridAreaType
import typingsSlinky.grommet.utilsMod.MarginType
import typingsSlinky.grommet.utilsMod.PolymorphicType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined grommet.grommet/components/RoutedAnchor.RoutedAnchorProps & grommet.grommet/utils.Omit<grommet.grommet/components/Anchor.AnchorProps, 'href'> */
@js.native
trait RoutedAnchorPropsOmitAnch extends StObject {
  
  var a11yTitle: js.UndefOr[A11yTitleType] = js.native
  
  var alignSelf: js.UndefOr[AlignSelfType] = js.native
  
  var as: js.UndefOr[PolymorphicType] = js.native
  
  var color: js.UndefOr[ColorType] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var gridArea: js.UndefOr[GridAreaType] = js.native
  
  var icon: js.UndefOr[ReactElement] = js.native
  
  var label: js.UndefOr[ReactElement] = js.native
  
  var margin: js.UndefOr[MarginType] = js.native
  
  var method: js.UndefOr[push | replace] = js.native
  
  var path: String = js.native
  
  var reverse: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[xsmall | small | medium | large | xlarge | xxlarge | String] = js.native
}
object RoutedAnchorPropsOmitAnch {
  
  @scala.inline
  def apply(path: String): RoutedAnchorPropsOmitAnch = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutedAnchorPropsOmitAnch]
  }
  
  @scala.inline
  implicit class RoutedAnchorPropsOmitAnchMutableBuilder[Self <: RoutedAnchorPropsOmitAnch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
    
    @scala.inline
    def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
    
    @scala.inline
    def setAs(value: PolymorphicType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsComponentClass(value: ReactComponentClass[js.Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsFunctionComponent(value: ReactComponentClass[js.Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
    
    @scala.inline
    def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelReactElement(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setMethod(value: push | replace): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    @scala.inline
    def setSize(value: xsmall | small | medium | large | xlarge | xxlarge | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
