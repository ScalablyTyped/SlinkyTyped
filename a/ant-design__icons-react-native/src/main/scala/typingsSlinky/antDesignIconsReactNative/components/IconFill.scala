package typingsSlinky.antDesignIconsReactNative.components

import typingsSlinky.antDesignIconsReactNative.fillMod.FillGlyphMapType
import typingsSlinky.antDesignIconsReactNative.fillMod.IconFillProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IconFill {
  
  @scala.inline
  def apply(name: FillGlyphMapType): SharedBuilder_IconFillProps_867732494[typingsSlinky.antDesignIconsReactNative.mod.IconFill] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_IconFillProps_867732494[typingsSlinky.antDesignIconsReactNative.mod.IconFill](js.Array(this.component, __props.asInstanceOf[IconFillProps]))
  }
  
  @JSImport("@ant-design/icons-react-native/lib", "IconFill")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IconFillProps): SharedBuilder_IconFillProps_867732494[typingsSlinky.antDesignIconsReactNative.mod.IconFill] = new SharedBuilder_IconFillProps_867732494[typingsSlinky.antDesignIconsReactNative.mod.IconFill](js.Array(this.component, p.asInstanceOf[js.Any]))
}
