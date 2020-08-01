package typingsSlinky.materialUiCore.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.materialUiCore.tableContextMod.TableContextProps
import typingsSlinky.react.mod.ConsumerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Consumer {
  @JSImport("@material-ui/core/Table/TableContext", "default.Consumer")
  @js.native
  object component extends js.Object
  
  def withProps(p: ConsumerProps[js.UndefOr[TableContextProps]]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(children: js.UndefOr[TableContextProps] => ReactElement): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[js.UndefOr[TableContextProps]]]))
  }
}

