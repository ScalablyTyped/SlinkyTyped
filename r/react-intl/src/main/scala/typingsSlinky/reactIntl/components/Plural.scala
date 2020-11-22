package typingsSlinky.reactIntl.components

import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.reactIntl.componentsInjectIntlMod.WithIntlProps
import typingsSlinky.reactIntl.componentsPluralMod.Props
import typingsSlinky.reactIntl.srcTypesMod.IntlShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Plural {
  
  @JSImport("react-intl/src/components/plural", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: PropsWithChildren[WithIntlProps[Props]]): SharedBuilder_PropsWithChildren1403840397 = new SharedBuilder_PropsWithChildren1403840397(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(intl: IntlShape, value: Double): SharedBuilder_PropsWithChildren1403840397 = {
    val __props = js.Dynamic.literal(intl = intl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new SharedBuilder_PropsWithChildren1403840397(js.Array(this.component, __props.asInstanceOf[PropsWithChildren[WithIntlProps[Props]]]))
  }
  
  object WrappedComponent {
    
    @JSImport("react-intl/src/components/plural", "default.WrappedComponent")
    @js.native
    object component extends js.Object
    
    def withProps(p: Props): SharedBuilder_Props_1017889570 = new SharedBuilder_Props_1017889570(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply(intl: IntlShape, value: Double): SharedBuilder_Props_1017889570 = {
      val __props = js.Dynamic.literal(intl = intl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      new SharedBuilder_Props_1017889570(js.Array(this.component, __props.asInstanceOf[Props]))
    }
  }
}
