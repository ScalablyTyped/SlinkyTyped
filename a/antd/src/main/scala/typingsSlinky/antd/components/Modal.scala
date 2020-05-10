package typingsSlinky.antd.components

import typingsSlinky.antd.modalModalMod.ModalProps
import typingsSlinky.antd.modalModalMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Modal {
  @JSImport("antd/lib/modal/Modal", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ModalProps): SharedBuilder_ModalProps_568751350[default] = new SharedBuilder_ModalProps_568751350[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Modal.type): SharedBuilder_ModalProps_568751350[default] = new SharedBuilder_ModalProps_568751350[default](js.Array(this.component, js.Dictionary.empty))()
}

