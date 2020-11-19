package typingsSlinky.antDesignIconsReactNative.components

import typingsSlinky.antDesignIconsReactNative.outlineMod.IconOutlineProps
import typingsSlinky.antDesignIconsReactNative.outlineMod.OutlineGlyphMapType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IconOutline {
  
  @JSImport("@ant-design/icons-react-native/es", "IconOutline")
  @js.native
  object component extends js.Object
  
  def withProps(p: IconOutlineProps): SharedBuilder_IconOutlineProps_1809491581[typingsSlinky.antDesignIconsReactNative.mod.IconOutline] = new SharedBuilder_IconOutlineProps_1809491581[typingsSlinky.antDesignIconsReactNative.mod.IconOutline](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(name: OutlineGlyphMapType): SharedBuilder_IconOutlineProps_1809491581[typingsSlinky.antDesignIconsReactNative.mod.IconOutline] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_IconOutlineProps_1809491581[typingsSlinky.antDesignIconsReactNative.mod.IconOutline](js.Array(this.component, __props.asInstanceOf[IconOutlineProps]))
  }
}
