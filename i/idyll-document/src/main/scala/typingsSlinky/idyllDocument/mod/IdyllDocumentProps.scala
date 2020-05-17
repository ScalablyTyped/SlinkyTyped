package typingsSlinky.idyllDocument.mod

import slinky.core.ReactComponentClass
import typingsSlinky.idyllCompiler.mod.AST
import typingsSlinky.idyllCompiler.mod.Options
import typingsSlinky.idyllDocument.anon.Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdyllDocumentProps extends js.Object {
  /**
    * the AST to be rendered on the page
    * If provided, this will be used insteaed of
    * the markup
    */
  var ast: js.UndefOr[AST] = js.native
  /**
    * Compiler option for Idyll compiler when compiling markup
    */
  var compilerOptions: js.UndefOr[Options] = js.native
  /**
    * Components to be rendered with
    */
  var components: js.Any = js.native
  var context: js.UndefOr[js.Function1[/* context */ js.Any, Unit]] = js.native
  /**
    * Initial data set
    */
  var datasets: js.UndefOr[js.Object] = js.native
  /**
    * The React component rendered when an error occurs
    */
  var errorComponent: js.UndefOr[ReactComponentClass[Children]] = js.native
  var initialState: js.UndefOr[js.Any] = js.native
  /**
    * The layout for idyll document
    * Will correspond to one one layout in idyll-layouts package
    */
  var layout: js.UndefOr[String] = js.native
  /**
    * The Idyll markup to be compiled into AST
    */
  var markup: js.UndefOr[String] = js.native
  /**
    * Callback function if error happens during compilation
    */
  var onError: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.native
  /**
    * The theme for idyll document
    * Will correspond to one theme in idyll-theme package
    */
  var theme: js.UndefOr[String] = js.native
}

object IdyllDocumentProps {
  @scala.inline
  def apply(components: js.Any): IdyllDocumentProps = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdyllDocumentProps]
  }
  @scala.inline
  implicit class IdyllDocumentPropsOps[Self <: IdyllDocumentProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponents(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAst(value: AST): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ast")(js.undefined)
        ret
    }
    @scala.inline
    def withCompilerOptions(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompilerOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilerOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: /* context */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withDatasets(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasets")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorComponentFunctionComponent(value: ReactComponentClass[Children]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorComponentComponentClass(value: ReactComponentClass[Children]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorComponent(value: ReactComponentClass[Children]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markup")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* err */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

