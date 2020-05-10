package typingsSlinky.antd.components

import typingsSlinky.antd.gridMod.CardGridProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardGrid {
  @JSImport("antd", "Card.Grid")
  @js.native
  object component extends js.Object
  
  def withProps(p: CardGridProps): SharedBuilder_CardGridProps552494094 = new SharedBuilder_CardGridProps552494094(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CardGrid.type): SharedBuilder_CardGridProps552494094 = new SharedBuilder_CardGridProps552494094(js.Array(this.component, js.Dictionary.empty))()
}

