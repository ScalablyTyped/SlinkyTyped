package typingsSlinky.reactIntl.components

import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.reactIntl.componentsInjectIntlMod.WithIntlProps
import typingsSlinky.reactIntl.componentsPluralMod.Props
import typingsSlinky.reactIntl.srcTypesMod.IntlShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormattedPlural {
  
  @scala.inline
  def apply(intl: IntlShape, value: Double): SharedBuilder_PropsWithChildren1403840397 = {
    val __props = js.Dynamic.literal(intl = intl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new SharedBuilder_PropsWithChildren1403840397(js.Array(this.component, __props.asInstanceOf[PropsWithChildren[WithIntlProps[Props]]]))
  }
  
  object WrappedComponent {
    
    @scala.inline
    def apply(intl: IntlShape, value: Double): SharedBuilder_Props_1017889570 = {
      val __props = js.Dynamic.literal(intl = intl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      new SharedBuilder_Props_1017889570(js.Array(this.component, __props.asInstanceOf[Props]))
    }
    
    @JSImport("react-intl", "FormattedPlural.WrappedComponent")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: Props): SharedBuilder_Props_1017889570 = new SharedBuilder_Props_1017889570(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-intl", "FormattedPlural")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PropsWithChildren[WithIntlProps[Props]]): SharedBuilder_PropsWithChildren1403840397 = new SharedBuilder_PropsWithChildren1403840397(js.Array(this.component, p.asInstanceOf[js.Any]))
}
