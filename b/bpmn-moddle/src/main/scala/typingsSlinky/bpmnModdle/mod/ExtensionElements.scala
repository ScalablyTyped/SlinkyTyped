package typingsSlinky.bpmnModdle.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionElements
  extends TypeDerived
     with /* key */ StringDictionary[js.Any] {
  var extensionAttributeDefinition: ExtensionAttributeDefinition = js.native
  var valueRef: BaseElement = js.native
  var values: js.Array[BaseElement] = js.native
}

object ExtensionElements {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    extensionAttributeDefinition: ExtensionAttributeDefinition,
    valueRef: BaseElement,
    values: js.Array[BaseElement]
  ): ExtensionElements = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], extensionAttributeDefinition = extensionAttributeDefinition.asInstanceOf[js.Any], valueRef = valueRef.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionElements]
  }
  @scala.inline
  implicit class ExtensionElementsOps[Self <: ExtensionElements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtensionAttributeDefinition(value: ExtensionAttributeDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionAttributeDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueRef(value: BaseElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[BaseElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

