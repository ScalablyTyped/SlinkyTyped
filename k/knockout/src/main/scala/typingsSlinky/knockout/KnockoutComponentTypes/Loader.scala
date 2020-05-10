package typingsSlinky.knockout.KnockoutComponentTypes

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Loader extends js.Object {
  /**
    * Define this if: you want to supply configurations programmatically based on names, e.g., to implement a naming convention.
    * @see {@link https://knockoutjs.com/documentation/component-loaders.html}
    */
  var getConfig: js.UndefOr[
    js.Function2[
      /* componentName */ String, 
      /* callback */ js.Function1[/* result */ ComponentConfig[ViewModel] | Null, Unit], 
      Unit
    ]
  ] = js.native
  /**
    * Define this if: you want to take control over how component configurations are interpreted, e.g., if you do not want to use the standard 'viewModel/template' pair format.
    * @see {@link https://knockoutjs.com/documentation/component-loaders.html}
    */
  var loadComponent: js.UndefOr[
    js.Function3[
      /* componentName */ String, 
      /* config */ ComponentConfig[ViewModel], 
      /* callback */ js.Function1[/* result */ Definition | Null, Unit], 
      Unit
    ]
  ] = js.native
  /**
    * Define this if: you want to use custom logic to supply DOM nodes for a given template configuration (e.g., using an ajax request to fetch a template by URL).
    * @see {@link https://knockoutjs.com/documentation/component-loaders.html}
    */
  var loadTemplate: js.UndefOr[
    js.Function3[
      /* componentName */ String, 
      /* templateConfig */ js.Any, 
      /* callback */ js.Function1[/* result */ js.Array[Node] | Null, Unit], 
      Unit
    ]
  ] = js.native
  /**
    * Define this if: you want to use custom logic to supply a viewmodel factory for a given viewmodel configuration (e.g., integrating with a third-party module loader or dependency injection system).
    * @see {@link https://knockoutjs.com/documentation/component-loaders.html}
    */
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
      value: (/* componentName */ String, /* callback */ js.Function1[/* result */ ComponentConfig[ViewModel] | Null, Unit]) => Unit
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
      value: (/* componentName */ String, /* config */ ComponentConfig[ViewModel], /* callback */ js.Function1[/* result */ Definition | Null, Unit]) => Unit
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
      value: (/* componentName */ String, /* templateConfig */ js.Any, /* callback */ js.Function1[/* result */ js.Array[Node] | Null, Unit]) => Unit
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

