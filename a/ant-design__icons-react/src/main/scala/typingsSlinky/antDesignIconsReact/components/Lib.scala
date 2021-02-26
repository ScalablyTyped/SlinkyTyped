package typingsSlinky.antDesignIconsReact.components

import typingsSlinky.antDesignIconsReact.iconMod.IconProps
import typingsSlinky.antDesignIconsReact.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Lib {
  
  @scala.inline
  def apply(
    `type`: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any)
  ): SharedBuilder_IconProps_1416468498[default] = {
    val __props = js.Dynamic.literal()
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new SharedBuilder_IconProps_1416468498[default](js.Array(this.component, __props.asInstanceOf[IconProps]))
  }
  
  @JSImport("@ant-design/icons-react/lib", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IconProps): SharedBuilder_IconProps_1416468498[default] = new SharedBuilder_IconProps_1416468498[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
