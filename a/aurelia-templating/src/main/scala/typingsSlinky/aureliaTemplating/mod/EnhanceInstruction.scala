package typingsSlinky.aureliaTemplating.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.aureliaDependencyInjection.mod.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnhanceInstruction extends js.Object {
  /**
    * A binding context for the enhancement.
    */
  var bindingContext: js.UndefOr[js.Object] = js.native
  /**
    * The DI container to use as the root for UI enhancement.
    */
  var container: js.UndefOr[Container] = js.native
  /**
    * The element to enhance.
    */
  var element: Element = js.native
  /**
    * A secondary binding context that can override the standard context.
    */
  var overrideContext: js.UndefOr[js.Any] = js.native
  /**
    * The resources available for enhancement.
    */
  var resources: js.UndefOr[ViewResources_] = js.native
}

object EnhanceInstruction {
  @scala.inline
  def apply(element: Element): EnhanceInstruction = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhanceInstruction]
  }
  @scala.inline
  implicit class EnhanceInstructionOps[Self <: EnhanceInstruction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBindingContext(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindingContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingContext")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: Container): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideContext")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: ViewResources_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(js.undefined)
        ret
    }
  }
  
}

