package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemDefinition extends BaseElement {
  var `import`: Import = js.native
  /** @default false */
  var isCollection: Boolean = js.native
  var itemKind: ItemKind = js.native
  var structureRef: String = js.native
}

object ItemDefinition {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    `import`: Import,
    isCollection: Boolean,
    itemKind: ItemKind,
    structureRef: String
  ): ItemDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isCollection = isCollection.asInstanceOf[js.Any], itemKind = itemKind.asInstanceOf[js.Any], structureRef = structureRef.asInstanceOf[js.Any])
    __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemDefinition]
  }
  @scala.inline
  implicit class ItemDefinitionOps[Self <: ItemDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImport(value: Import): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("import")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCollection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCollection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemKind(value: ItemKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStructureRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structureRef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

