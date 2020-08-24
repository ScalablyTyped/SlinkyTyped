package typingsSlinky.rcFieldForm.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcFieldForm.listMod.ListField
import typingsSlinky.rcFieldForm.listMod.ListOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_ListProps425441958 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  @scala.inline
  def children(value: (/* fields */ js.Array[ListField], /* operations */ ListOperations) => ReactElement): this.type = set("children", js.Any.fromFunction2(value))
}

