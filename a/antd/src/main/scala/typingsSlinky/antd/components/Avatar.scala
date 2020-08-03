package typingsSlinky.antd.components

import typingsSlinky.antd.skeletonAvatarMod.AvatarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Avatar {
  @JSImport("antd/lib/skeleton/Avatar", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: AvatarProps): SharedBuilder_AvatarProps1231857601 = new SharedBuilder_AvatarProps1231857601(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Avatar.type): SharedBuilder_AvatarProps1231857601 = new SharedBuilder_AvatarProps1231857601(js.Array(this.component, js.Dictionary.empty))()
}

