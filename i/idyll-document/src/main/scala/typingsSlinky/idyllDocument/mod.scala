package typingsSlinky.idyllDocument

import slinky.core.ReactComponentClass
import typingsSlinky.idyllCompiler.mod.AST
import typingsSlinky.idyllCompiler.mod.Node
import typingsSlinky.idyllCompiler.mod.Options
import typingsSlinky.idyllDocument.anon.Children
import typingsSlinky.react.mod.PureComponent
import typingsSlinky.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("idyll-document", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[IdyllDocumentProps, js.Any, js.Any]
  
  type IdyllDocument = ReactComponentClass[IdyllDocumentProps]
  
  @js.native
  trait IdyllDocumentProps extends StObject {
    
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
    var errorComponent: js.UndefOr[ReactType[Children]] = js.native
    
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
    implicit class IdyllDocumentPropsMutableBuilder[Self <: IdyllDocumentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAst(value: AST): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
      
      @scala.inline
      def setAstVarargs(value: Node*): Self = StObject.set(x, "ast", js.Array(value :_*))
      
      @scala.inline
      def setCompilerOptions(value: Options): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
      
      @scala.inline
      def setComponents(value: js.Any): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: /* context */ js.Any => Unit): Self = StObject.set(x, "context", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setDatasets(value: js.Object): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatasetsUndefined: Self = StObject.set(x, "datasets", js.undefined)
      
      @scala.inline
      def setErrorComponent(value: ReactType[Children]): Self = StObject.set(x, "errorComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorComponentComponentClass(value: ReactComponentClass[Children]): Self = StObject.set(x, "errorComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorComponentFunctionComponent(value: ReactComponentClass[Children]): Self = StObject.set(x, "errorComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorComponentUndefined: Self = StObject.set(x, "errorComponent", js.undefined)
      
      @scala.inline
      def setInitialState(value: js.Any): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      @scala.inline
      def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setMarkup(value: String): Self = StObject.set(x, "markup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkupUndefined: Self = StObject.set(x, "markup", js.undefined)
      
      @scala.inline
      def setOnError(value: /* err */ js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
