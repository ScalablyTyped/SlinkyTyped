package typingsSlinky.knockoutPaging.KnockoutComponentTypes

import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var synchronous: js.UndefOr[Boolean] = js.native
  var template: String | js.Array[Node] | DocumentFragment | TemplateElement | AMDModule = js.native
  var viewModel: js.UndefOr[
    ViewModelFunction | ViewModelSharedInstance | ViewModelFactoryFunction | AMDModule
  ] = js.native
}

object Config {
  @scala.inline
  def apply(template: String | js.Array[Node] | DocumentFragment | TemplateElement | AMDModule): Config = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTemplateDocumentFragment(value: DocumentFragment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(value: String | js.Array[Node] | DocumentFragment | TemplateElement | AMDModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSynchronous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSynchronous: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronous")(js.undefined)
        ret
    }
    @scala.inline
    def withViewModelFunction1(value: /* params */ js.UndefOr[js.Any] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withViewModel(value: ViewModelFunction | ViewModelSharedInstance | ViewModelFactoryFunction | AMDModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(js.undefined)
        ret
    }
  }
  
}

