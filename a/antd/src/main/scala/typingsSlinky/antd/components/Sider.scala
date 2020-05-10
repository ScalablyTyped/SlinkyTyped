package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.antd.siderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Sider {
  @JSImport("antd/lib/layout/Sider", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: js.Object): typingsSlinky.StBuildingComponent.Default[tag.type, default] = new typingsSlinky.StBuildingComponent.Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Sider.type): typingsSlinky.StBuildingComponent.Default[tag.type, default] = new typingsSlinky.StBuildingComponent.Default[tag.type, default](js.Array(this.component, js.Dictionary.empty))()
}

