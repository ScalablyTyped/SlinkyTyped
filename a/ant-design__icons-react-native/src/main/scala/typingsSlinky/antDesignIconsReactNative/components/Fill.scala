package typingsSlinky.antDesignIconsReactNative.components

import typingsSlinky.antDesignIconsReactNative.fillMod.FillGlyphMapType
import typingsSlinky.antDesignIconsReactNative.fillMod.IconFillProps
import typingsSlinky.antDesignIconsReactNative.fillMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Fill {
  @JSImport("@ant-design/icons-react-native/es/fill", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: IconFillProps): SharedBuilder_IconFillProps_867732494[default] = new SharedBuilder_IconFillProps_867732494[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(name: FillGlyphMapType): SharedBuilder_IconFillProps_867732494[default] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_IconFillProps_867732494[default](js.Array(this.component, __props.asInstanceOf[IconFillProps]))
  }
}

