package typingsSlinky.antDesignIcons.components

import org.scalajs.dom.raw.HTMLSpanElement
import typingsSlinky.antDesignIcons.anon.PickIconComponentPropsmax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Icon {
  @JSImport("@ant-design/icons/es/components/Icon", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: PickIconComponentPropsmax): SharedBuilder_PickIconComponentPropsmax412646340[HTMLSpanElement] = new SharedBuilder_PickIconComponentPropsmax412646340[HTMLSpanElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Icon.type): SharedBuilder_PickIconComponentPropsmax412646340[HTMLSpanElement] = new SharedBuilder_PickIconComponentPropsmax412646340[HTMLSpanElement](js.Array(this.component, js.Dictionary.empty))()
}

