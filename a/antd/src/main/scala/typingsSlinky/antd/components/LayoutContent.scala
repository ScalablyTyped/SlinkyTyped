package typingsSlinky.antd.components

import typingsSlinky.antd.layoutLayoutMod.BasicProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LayoutContent {
  @JSImport("antd", "Layout.Content")
  @js.native
  object component extends js.Object
  
  def withProps(p: BasicProps): SharedBuilder_BasicProps_202839332 = new SharedBuilder_BasicProps_202839332(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: LayoutContent.type): SharedBuilder_BasicProps_202839332 = new SharedBuilder_BasicProps_202839332(js.Array(this.component, js.Dictionary.empty))()
}

