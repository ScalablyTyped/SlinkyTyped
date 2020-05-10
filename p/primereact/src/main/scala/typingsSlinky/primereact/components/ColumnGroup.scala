package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.primereact.columngroupColumnGroupMod.ColumnGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ColumnGroup {
  @JSImport("primereact/columngroup", "ColumnGroup")
  @js.native
  object component extends js.Object
  
  def withProps(p: ColumnGroupProps): Default[tag.type, typingsSlinky.primereact.columngroupMod.ColumnGroup] = new Default[tag.type, typingsSlinky.primereact.columngroupMod.ColumnGroup](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ColumnGroup.type): Default[tag.type, typingsSlinky.primereact.columngroupMod.ColumnGroup] = new Default[tag.type, typingsSlinky.primereact.columngroupMod.ColumnGroup](js.Array(this.component, js.Dictionary.empty))()
}

