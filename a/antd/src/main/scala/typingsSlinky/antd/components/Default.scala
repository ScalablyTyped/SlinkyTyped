package typingsSlinky.antd.components

import typingsSlinky.antd.modalMod.defaultCls
import typingsSlinky.antd.modalModalMod.ModalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Default {
  @JSImport("antd/lib/modal", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ModalProps): SharedBuilder_ModalProps_568751350[defaultCls] = new SharedBuilder_ModalProps_568751350[defaultCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Default.type): SharedBuilder_ModalProps_568751350[defaultCls] = new SharedBuilder_ModalProps_568751350[defaultCls](js.Array(this.component, js.Dictionary.empty))()
}

