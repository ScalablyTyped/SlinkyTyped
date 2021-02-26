package typingsSlinky.antDesignIconsReactNative.components

import typingsSlinky.antDesignIconsReactNative.outlineMod.IconOutlineProps
import typingsSlinky.antDesignIconsReactNative.outlineMod.OutlineGlyphMapType
import typingsSlinky.antDesignIconsReactNative.outlineMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Outline {
  
  @scala.inline
  def apply(name: OutlineGlyphMapType): SharedBuilder_IconOutlineProps_1809491581[default] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_IconOutlineProps_1809491581[default](js.Array(this.component, __props.asInstanceOf[IconOutlineProps]))
  }
  
  @JSImport("@ant-design/icons-react-native/lib/outline", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IconOutlineProps): SharedBuilder_IconOutlineProps_1809491581[default] = new SharedBuilder_IconOutlineProps_1809491581[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
