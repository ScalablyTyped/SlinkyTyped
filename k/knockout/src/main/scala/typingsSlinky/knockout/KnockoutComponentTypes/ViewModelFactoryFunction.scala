package typingsSlinky.knockout.KnockoutComponentTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewModelFactoryFunction extends _ViewModel {
  def createViewModel(params: js.Any, componentInfo: ComponentInfo): js.Any = js.native
}

object ViewModelFactoryFunction {
  @scala.inline
  def apply(createViewModel: (js.Any, ComponentInfo) => js.Any): ViewModelFactoryFunction = {
    val __obj = js.Dynamic.literal(createViewModel = js.Any.fromFunction2(createViewModel))
    __obj.asInstanceOf[ViewModelFactoryFunction]
  }
  @scala.inline
  implicit class ViewModelFactoryFunctionOps[Self <: ViewModelFactoryFunction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateViewModel(value: (js.Any, ComponentInfo) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createViewModel")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

