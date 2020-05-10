package typingsSlinky.jqueryAjaxfile.KnockoutComponentTypes

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Loader extends js.Object {
  var getConfig: js.UndefOr[
    js.Function2[
      /* componentName */ String, 
      /* callback */ js.Function1[/* result */ ComponentConfig, Unit], 
      Unit
    ]
  ] = js.native
  var loadComponent: js.UndefOr[
    js.Function3[
      /* componentName */ String, 
      /* config */ ComponentConfig, 
      /* callback */ js.Function1[/* result */ Definition, Unit], 
      Unit
    ]
  ] = js.native
  var loadTemplate: js.UndefOr[
    js.Function3[
      /* componentName */ String, 
      /* templateConfig */ js.Any, 
      /* callback */ js.Function1[/* result */ js.Array[Node], Unit], 
      Unit
    ]
  ] = js.native
  var loadViewModel: js.UndefOr[
    js.Function3[
      /* componentName */ String, 
      /* viewModelConfig */ js.Any, 
      /* callback */ js.Function1[/* result */ js.Any, Unit], 
      Unit
    ]
  ] = js.native
  var suppressLoaderExceptions: js.UndefOr[Boolean] = js.native
}

object Loader {
  @scala.inline
  def apply(): Loader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Loader]
  }
  @scala.inline
  implicit class LoaderOps[Self <: Loader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetConfig(
      value: (/* componentName */ String, /* callback */ js.Function1[/* result */ ComponentConfig, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConfig")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadComponent(
      value: (/* componentName */ String, /* config */ ComponentConfig, /* callback */ js.Function1[/* result */ Definition, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadComponent")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutLoadComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadTemplate(
      value: (/* componentName */ String, /* templateConfig */ js.Any, /* callback */ js.Function1[/* result */ js.Array[Node], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutLoadTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadViewModel(
      value: (/* componentName */ String, /* viewModelConfig */ js.Any, /* callback */ js.Function1[/* result */ js.Any, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadViewModel")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutLoadViewModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadViewModel")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressLoaderExceptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressLoaderExceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressLoaderExceptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressLoaderExceptions")(js.undefined)
        ret
    }
  }
  
}

