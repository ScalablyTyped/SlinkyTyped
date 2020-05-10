package typingsSlinky.antdMobileRn.components

import typingsSlinky.antdMobileRn.tagIndexNativeMod.TagNativeProps
import typingsSlinky.antdMobileRn.tagIndexNativeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IndexDotnative {
  @JSImport("antd-mobile-rn/lib/tag/index.native", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: TagNativeProps): SharedBuilder_TagNativeProps1198250225[default] = new SharedBuilder_TagNativeProps1198250225[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: IndexDotnative.type): SharedBuilder_TagNativeProps1198250225[default] = new SharedBuilder_TagNativeProps1198250225[default](js.Array(this.component, js.Dictionary.empty))()
}

