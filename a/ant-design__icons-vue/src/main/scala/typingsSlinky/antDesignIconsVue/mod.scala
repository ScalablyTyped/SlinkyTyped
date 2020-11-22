package typingsSlinky.antDesignIconsVue

import typingsSlinky.antDesignIconsVue.iconFontMod.CustomIconOptions
import typingsSlinky.antDesignIconsVue.iconMod.IconComponentProps
import typingsSlinky.antDesignIconsVue.twoTonePrimaryColorMod.TwoToneColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/icons-vue/es", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def createFromIconfontCN(): js.Function = js.native
  def createFromIconfontCN(options: CustomIconOptions): js.Function = js.native
  
  def getTwoToneColor(): TwoToneColor = js.native
  
  def setTwoToneColor(twoToneColor: TwoToneColor): Unit = js.native
  
  @js.native
  object default extends js.Object {
    
    def apply(
      props: IconComponentProps,
      context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SetupContext */ js.Any
    ): js.Any = js.native
    
    var inheritAttrs: Boolean = js.native
  }
}
