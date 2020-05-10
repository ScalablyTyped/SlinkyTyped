package typingsSlinky.antDesignIconsReactNative.components

import typingsSlinky.antDesignIconsReactNative.fillMod.FillGlyphMapType
import typingsSlinky.antDesignIconsReactNative.fillMod.IconFillProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IconFill {
  @JSImport("@ant-design/icons-react-native/lib", "IconFill")
  @js.native
  object component extends js.Object
  
  def withProps(p: IconFillProps): SharedBuilder_IconFillProps_867732494[typingsSlinky.antDesignIconsReactNative.mod.IconFill] = new SharedBuilder_IconFillProps_867732494[typingsSlinky.antDesignIconsReactNative.mod.IconFill](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(name: FillGlyphMapType): SharedBuilder_IconFillProps_867732494[typingsSlinky.antDesignIconsReactNative.mod.IconFill] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_IconFillProps_867732494[typingsSlinky.antDesignIconsReactNative.mod.IconFill](js.Array(this.component, __props.asInstanceOf[IconFillProps]))
  }
}

