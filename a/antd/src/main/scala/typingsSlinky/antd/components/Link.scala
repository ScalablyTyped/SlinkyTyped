package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.antd.linkMod.LinkProps
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Link {
  @JSImport("antd/lib/typography/Link", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: LinkProps with RefAttributes[HTMLElement]): SharedBuilder_LinkPropsRefAttributes783260929[HTMLElement] = new SharedBuilder_LinkPropsRefAttributes783260929[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Link.type): SharedBuilder_LinkPropsRefAttributes783260929[HTMLElement] = new SharedBuilder_LinkPropsRefAttributes783260929[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
}

