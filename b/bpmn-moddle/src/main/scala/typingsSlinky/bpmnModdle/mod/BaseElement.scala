package typingsSlinky.bpmnModdle.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseElement extends TypeDerived {
  /**
    * Attributes that aren't defined by the BPMN Spec such
    * as Camunda properties
    */
  @JSName("$attrs")
  var $attrs: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Documentation for the element
    */
  var documentation: js.UndefOr[js.Array[Documentation]] = js.native
  /**
    * Reference to the extension definitions for this element
    */
  var extensionDefinitions: js.UndefOr[js.Array[ExtensionDefinition]] = js.native
  /**
    * Extension Elements
    */
  var extensionElements: js.UndefOr[ExtensionElements] = js.native
  /**
    * Is the primary Id of the element
    */
  var id: String = js.native
}

object BaseElement {
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, id: String): BaseElement = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseElement]
  }
  @scala.inline
  implicit class BaseElementOps[Self <: BaseElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$attrs(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$attrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$attrs")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentation(value: js.Array[Documentation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentation")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensionDefinitions(value: js.Array[ExtensionDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensionDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionDefinitions")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensionElements(value: ExtensionElements): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensionElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionElements")(js.undefined)
        ret
    }
  }
  
}

