package typingsSlinky.koaPug

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.^
import typingsSlinky.pug.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-pug", JSImport.Default)
  @js.native
  class default () extends KoaPug {
    def this(options: PugOptions) = this()
  }
  
  @JSImport("koa-pug", "KoaPug")
  @js.native
  class KoaPug () extends StObject {
    def this(options: PugOptions) = this()
    
    /**
      * Compile .pug file
      * @param tpl The path of template file
      * @param locals Variables and helpers that passed to Pug compiler
      * @param compileOptions
      */
    var compileFile: js.Any = js.native
    
    /**
      * Compile a Pug template string
      * @param tpl Template string or the path of template file
      */
    var compileString: js.Any = js.native
    
    var defaultLocals: js.Any = js.native
    
    var defaultOptions: js.Any = js.native
    
    var helpers: StringDictionary[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    var locals: StringDictionary[js.Any] = js.native
    
    var noCache: Boolean = js.native
    
    var options: js.UndefOr[PugOptions] = js.native
    
    /**
      * Render Pug tamplate
      * @param tpl Template string or the path of template file
      * @param locals Variables and helpers that passed to Pug compiler
      * @param options
      */
    def render(tpl: String): js.Promise[String] = js.native
    def render(tpl: String, locals: js.UndefOr[scala.Nothing], options: RenderOptions): js.Promise[String] = js.native
    def render(tpl: String, locals: js.Any): js.Promise[String] = js.native
    def render(tpl: String, locals: js.Any, options: RenderOptions): js.Promise[String] = js.native
    
    /**
      * Bind render function to Koa context
      * @param app Koa instance
      */
    def use(app: ^[DefaultState, DefaultContext]): Unit = js.native
    
    var viewPath: String = js.native
  }
  
  @js.native
  trait PugOptions
    extends Options
       with /* key */ StringDictionary[js.Any] {
    
    /**
      * Koa instance
      */
    var app: js.UndefOr[^[DefaultState, DefaultContext]] = js.native
    
    /**
      * Paths of helpers.
      */
    var helperPath: js.UndefOr[js.Array[_]] = js.native
    
    /**
      * Add a list of variables to make accessible in templates
      */
    var locals: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    /**
      * The root directory of all Pug templates
      */
    var viewPath: js.UndefOr[String] = js.native
  }
  object PugOptions {
    
    @scala.inline
    def apply(): PugOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PugOptions]
    }
    
    @scala.inline
    implicit class PugOptionsMutableBuilder[Self <: PugOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp(value: ^[DefaultState, DefaultContext]): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      @scala.inline
      def setHelperPath(value: js.Array[_]): Self = StObject.set(x, "helperPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelperPathUndefined: Self = StObject.set(x, "helperPath", js.undefined)
      
      @scala.inline
      def setHelperPathVarargs(value: js.Any*): Self = StObject.set(x, "helperPath", js.Array(value :_*))
      
      @scala.inline
      def setLocals(value: StringDictionary[js.Any]): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
      
      @scala.inline
      def setViewPath(value: String): Self = StObject.set(x, "viewPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewPathUndefined: Self = StObject.set(x, "viewPath", js.undefined)
    }
  }
  
  @js.native
  trait RenderOptions extends PugOptions {
    
    /**
      * Render template string instead template file
      */
    var fromString: js.UndefOr[Boolean] = js.native
  }
  object RenderOptions {
    
    @scala.inline
    def apply(): RenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderOptions]
    }
    
    @scala.inline
    implicit class RenderOptionsMutableBuilder[Self <: RenderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromString(value: Boolean): Self = StObject.set(x, "fromString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromStringUndefined: Self = StObject.set(x, "fromString", js.undefined)
    }
  }
  
  /* augmented module */
  object koaAugmentingMod {
    
    @js.native
    trait BaseContext extends StObject {
      
      def render(tpl: String): js.Promise[Unit] = js.native
      def render(
        tpl: String,
        locals: js.UndefOr[scala.Nothing],
        options: js.UndefOr[scala.Nothing],
        noCache: Boolean
      ): js.Promise[Unit] = js.native
      def render(tpl: String, locals: js.UndefOr[scala.Nothing], options: RenderOptions): js.Promise[Unit] = js.native
      def render(tpl: String, locals: js.UndefOr[scala.Nothing], options: RenderOptions, noCache: Boolean): js.Promise[Unit] = js.native
      def render(tpl: String, locals: js.Any): js.Promise[Unit] = js.native
      def render(tpl: String, locals: js.Any, options: js.UndefOr[scala.Nothing], noCache: Boolean): js.Promise[Unit] = js.native
      def render(tpl: String, locals: js.Any, options: RenderOptions): js.Promise[Unit] = js.native
      def render(tpl: String, locals: js.Any, options: RenderOptions, noCache: Boolean): js.Promise[Unit] = js.native
    }
  }
}
