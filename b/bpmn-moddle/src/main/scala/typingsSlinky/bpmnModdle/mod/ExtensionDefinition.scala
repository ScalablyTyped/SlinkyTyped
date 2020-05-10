package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionDefinition extends TypeDerived {
  var extensionAttributeDefinitions: js.Array[ExtensionAttributeDefinition] = js.native
  var name: String = js.native
}

object ExtensionDefinition {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    extensionAttributeDefinitions: js.Array[ExtensionAttributeDefinition],
    name: String
  ): ExtensionDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], extensionAttributeDefinitions = extensionAttributeDefinitions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionDefinition]
  }
  @scala.inline
  implicit class ExtensionDefinitionOps[Self <: ExtensionDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtensionAttributeDefinitions(value: js.Array[ExtensionAttributeDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionAttributeDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

