package typingsSlinky.antd.components

import typingsSlinky.antd.metaMod.CardMetaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardMeta {
  @JSImport("antd", "Card.Meta")
  @js.native
  object component extends js.Object
  
  def withProps(p: CardMetaProps): SharedBuilder_CardMetaProps1450922115 = new SharedBuilder_CardMetaProps1450922115(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CardMeta.type): SharedBuilder_CardMetaProps1450922115 = new SharedBuilder_CardMetaProps1450922115(js.Array(this.component, js.Dictionary.empty))()
}

