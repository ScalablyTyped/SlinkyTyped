package typingsSlinky.hexo.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.connect.mod.Server
import typingsSlinky.hexo.anon.Desc
import typingsSlinky.hexo.anon.Dictkey
import typingsSlinky.hexo.anon.Path
import typingsSlinky.hexo.hexoBooleans.`false`
import typingsSlinky.hexo.hexoBooleans.`true`
import typingsSlinky.hexo.hexoStrings.after_clean
import typingsSlinky.hexo.hexoStrings.after_generate
import typingsSlinky.hexo.hexoStrings.after_init
import typingsSlinky.hexo.hexoStrings.after_post_render
import typingsSlinky.hexo.hexoStrings.after_renderColonhtml
import typingsSlinky.hexo.hexoStrings.before_exit
import typingsSlinky.hexo.hexoStrings.before_generate
import typingsSlinky.hexo.hexoStrings.before_post_render
import typingsSlinky.hexo.hexoStrings.new_post_path
import typingsSlinky.hexo.hexoStrings.post_permalink
import typingsSlinky.hexo.hexoStrings.server_middleware
import typingsSlinky.hexo.hexoStrings.template_locals
import typingsSlinky.hexo.mod.Box.File
import typingsSlinky.hexo.mod.Post.Data
import typingsSlinky.hexo.mod.extend.Console.Options
import typingsSlinky.hexo.mod.extend.Deployer.Config
import typingsSlinky.hexo.mod.extend.Generator.Return
import typingsSlinky.minimist.mod.ParsedArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extend {
  
  @js.native
  trait Console extends StObject {
    
    def register(name: String, desc: String, fn: js.Function1[/* args */ ParsedArgs, Unit]): Unit = js.native
    def register(name: String, desc: String, options: Options, fn: js.Function1[/* args */ ParsedArgs, Unit]): Unit = js.native
    def register(name: String, fn: js.Function1[/* args */ ParsedArgs, Unit]): Unit = js.native
    def register(name: String, options: Options, fn: js.Function1[/* args */ ParsedArgs, Unit]): Unit = js.native
  }
  object Console {
    
    @js.native
    trait Options extends StObject {
      
      /**
        * The description of each argument of a console command.
        */
      var arguments: js.UndefOr[js.Array[Desc]] = js.native
      
      /**
        * More detailed information about a console command.
        */
      var desc: js.UndefOr[String] = js.native
      
      /**
        * The description of each option of a console command.
        */
      var options: js.UndefOr[js.Array[Desc]] = js.native
      
      /**
        * The usage of a console command.
        */
      var usage: js.UndefOr[String] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setArguments(value: js.Array[Desc]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
        
        @scala.inline
        def setArgumentsVarargs(value: Desc*): Self = StObject.set(x, "arguments", js.Array(value :_*))
        
        @scala.inline
        def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
        
        @scala.inline
        def setOptions(value: js.Array[Desc]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
        
        @scala.inline
        def setOptionsVarargs(value: Desc*): Self = StObject.set(x, "options", js.Array(value :_*))
        
        @scala.inline
        def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
      }
    }
  }
  
  @js.native
  trait Deployer extends StObject {
    
    def register(name: String, fn: js.Function1[/* args */ Config, Unit]): Unit = js.native
  }
  object Deployer {
    
    @scala.inline
    def apply(register: (String, js.Function1[/* args */ Config, Unit]) => Unit): Deployer = {
      val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
      __obj.asInstanceOf[Deployer]
    }
    
    @js.native
    trait Config
      extends /* key */ StringDictionary[js.Any] {
      
      val `type`: js.UndefOr[String] = js.native
    }
    object Config {
      
      @scala.inline
      def apply(): Config = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Config]
      }
      
      @scala.inline
      implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @scala.inline
    implicit class DeployerMutableBuilder[Self <: Deployer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegister(value: (String, js.Function1[/* args */ Config, Unit]) => Unit): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Filter extends StObject {
    
    def exec(`type`: String): js.Any = js.native
    def exec(
      `type`: String,
      data: js.UndefOr[scala.Nothing],
      options: typingsSlinky.hexo.mod.extend.Filter.Options
    ): js.Any = js.native
    def exec(`type`: String, data: js.Any): js.Any = js.native
    def exec(`type`: String, data: js.Any, options: typingsSlinky.hexo.mod.extend.Filter.Options): js.Any = js.native
    
    def execSync(`type`: String): js.Any = js.native
    def execSync(
      `type`: String,
      data: js.UndefOr[scala.Nothing],
      options: typingsSlinky.hexo.mod.extend.Filter.Options
    ): js.Any = js.native
    def execSync(`type`: String, data: js.Any): js.Any = js.native
    def execSync(`type`: String, data: js.Any, options: typingsSlinky.hexo.mod.extend.Filter.Options): js.Any = js.native
    
    def register(`type`: String, fn: js.Function2[/* data */ js.Any, /* repeated */ js.Any, _]): Unit = js.native
    def register(`type`: String, fn: js.Function2[/* data */ js.Any, /* repeated */ js.Any, _], priority: Double): Unit = js.native
    /**
      * Executed after generated files and cache are removed with hexo clean command.
      */
    @JSName("register")
    def register_afterclean(`type`: after_clean, fn: js.Function0[Unit]): Unit = js.native
    @JSName("register")
    def register_afterclean(`type`: after_clean, fn: js.Function0[Unit], priority: Double): Unit = js.native
    /**
      * Executed after generation finishes.
      */
    @JSName("register")
    def register_aftergenerate(`type`: after_generate, fn: js.Function0[Unit]): Unit = js.native
    @JSName("register")
    def register_aftergenerate(`type`: after_generate, fn: js.Function0[Unit], priority: Double): Unit = js.native
    /**
      * Executed after Hexo is initialized – this will run right after `hexo.init` completes.
      */
    @JSName("register")
    def register_afterinit(`type`: after_init, fn: js.Function0[Unit]): Unit = js.native
    @JSName("register")
    def register_afterinit(`type`: after_init, fn: js.Function0[Unit], priority: Double): Unit = js.native
    /**
      * Executed after a post is rendered. Refer to post rendering to learn the execution steps.
      */
    @JSName("register")
    def register_afterpostrender(`type`: after_post_render, fn: js.Function1[/* data */ Dictkey, Dictkey | Unit]): Unit = js.native
    @JSName("register")
    def register_afterpostrender(`type`: after_post_render, fn: js.Function1[/* data */ Dictkey, Dictkey | Unit], priority: Double): Unit = js.native
    /**
      * Executed after rendering finishes. You can see rendering for more info.
      */
    @JSName("register")
    def register_afterrenderhtml(
      `type`: after_renderColonhtml,
      fn: js.Function2[/* result */ String, /* data */ Path, String | Unit]
    ): Unit = js.native
    @JSName("register")
    def register_afterrenderhtml(
      `type`: after_renderColonhtml,
      fn: js.Function2[/* result */ String, /* data */ Path, String | Unit],
      priority: Double
    ): Unit = js.native
    /**
      * Executed before Hexo is about to exit – this will run right after `hexo.exit` is called.
      */
    @JSName("register")
    def register_beforeexit(`type`: before_exit, fn: js.Function0[Unit]): Unit = js.native
    @JSName("register")
    def register_beforeexit(`type`: before_exit, fn: js.Function0[Unit], priority: Double): Unit = js.native
    /**
      * Executed before generation begins.
      */
    @JSName("register")
    def register_beforegenerate(`type`: before_generate, fn: js.Function1[/* data */ js.Any, _]): Unit = js.native
    @JSName("register")
    def register_beforegenerate(`type`: before_generate, fn: js.Function1[/* data */ js.Any, _], priority: Double): Unit = js.native
    /**
      * Executed before a post is rendered. Refer to post rendering to learn the execution steps.
      */
    @JSName("register")
    def register_beforepostrender(`type`: before_post_render, fn: js.Function1[/* data */ Dictkey, Dictkey | Unit]): Unit = js.native
    @JSName("register")
    def register_beforepostrender(`type`: before_post_render, fn: js.Function1[/* data */ Dictkey, Dictkey | Unit], priority: Double): Unit = js.native
    /**
      * Executed when creating a post to determine the path of new posts.
      */
    @JSName("register")
    def register_newpostpath(`type`: new_post_path, fn: js.Function2[/* data */ Data, /* replace */ js.UndefOr[Boolean], Unit]): Unit = js.native
    @JSName("register")
    def register_newpostpath(
      `type`: new_post_path,
      fn: js.Function2[/* data */ Data, /* replace */ js.UndefOr[Boolean], Unit],
      priority: Double
    ): Unit = js.native
    /**
      * Used to determine the permalink of posts.
      */
    @JSName("register")
    def register_postpermalink(`type`: post_permalink, fn: js.Function1[/* permalink */ String, String]): Unit = js.native
    @JSName("register")
    def register_postpermalink(`type`: post_permalink, fn: js.Function1[/* permalink */ String, String], priority: Double): Unit = js.native
    /**
      * Add middleware to the server. app is a Connect instance.
      */
    @JSName("register")
    def register_servermiddleware(`type`: server_middleware, fn: js.Function1[/* app */ Server, Server | Unit]): Unit = js.native
    @JSName("register")
    def register_servermiddleware(`type`: server_middleware, fn: js.Function1[/* app */ Server, Server | Unit], priority: Double): Unit = js.native
    /**
      * Modify [local variables](https://hexo.io/docs/variables) in templates.
      */
    @JSName("register")
    def register_templatelocals(`type`: template_locals, fn: js.Function1[/* locals */ TemplateLocals, TemplateLocals | Unit]): Unit = js.native
    @JSName("register")
    def register_templatelocals(
      `type`: template_locals,
      fn: js.Function1[/* locals */ TemplateLocals, TemplateLocals | Unit],
      priority: Double
    ): Unit = js.native
    
    def unregister(`type`: String, fn: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  }
  object Filter {
    
    @js.native
    trait Options extends StObject {
      
      /**
        * Arguments. This must be an array.
        */
      var args: js.UndefOr[js.Array[_]] = js.native
      
      /**
        * `hexo` object.
        */
      var context: js.UndefOr[Hexo] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): typingsSlinky.hexo.mod.extend.Filter.Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.hexo.mod.extend.Filter.Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: typingsSlinky.hexo.mod.extend.Filter.Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
        
        @scala.inline
        def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
        
        @scala.inline
        def setContext(value: Hexo): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      }
    }
  }
  
  @js.native
  trait Generator extends StObject {
    
    def register(name: String, fn: js.Function1[/* locals */ Site, Return | js.Array[Return]]): Unit = js.native
  }
  object Generator {
    
    @scala.inline
    def apply(register: (String, js.Function1[/* locals */ Site, Return | js.Array[Return]]) => Unit): Generator = {
      val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
      __obj.asInstanceOf[Generator]
    }
    
    @scala.inline
    implicit class GeneratorMutableBuilder[Self <: Generator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegister(value: (String, js.Function1[/* locals */ Site, Return | js.Array[Return]]) => Unit): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
    }
    
    @js.native
    trait Return extends StObject {
      
      var data: js.Any = js.native
      
      /**
        * Layout. Specify the layouts for rendering. The value can be a string or an array. If it’s ignored then the route will return data directly.
        */
      var layout: String | js.Array[String] = js.native
      
      /**
        * Path not including the prefixing `/` .
        */
      var path: String = js.native
    }
    object Return {
      
      @scala.inline
      def apply(data: js.Any, layout: String | js.Array[String], path: String): Return = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
        __obj.asInstanceOf[Return]
      }
      
      @scala.inline
      implicit class ReturnMutableBuilder[Self <: Return] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLayout(value: String | js.Array[String]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLayoutVarargs(value: String*): Self = StObject.set(x, "layout", js.Array(value :_*))
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait Helper extends StObject {
    
    def get(name: String): js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    def list(): StringDictionary[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    def register(name: String, fn: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  }
  object Helper {
    
    @scala.inline
    def apply(
      get: String => js.UndefOr[js.Function1[/* repeated */ js.Any, _]],
      list: () => StringDictionary[js.Function1[/* repeated */ js.Any, _]],
      register: (String, js.Function1[/* repeated */ js.Any, _]) => Unit
    ): Helper = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction0(list), register = js.Any.fromFunction2(register))
      __obj.asInstanceOf[Helper]
    }
    
    @scala.inline
    implicit class HelperMutableBuilder[Self <: Helper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: String => js.UndefOr[js.Function1[/* repeated */ js.Any, _]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setList(value: () => StringDictionary[js.Function1[/* repeated */ js.Any, _]]): Self = StObject.set(x, "list", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegister(value: (String, js.Function1[/* repeated */ js.Any, _]) => Unit): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Migrator extends StObject {
    
    def register(
      name: String,
      fn: js.Function2[/* args */ ParsedArgs, /* fn */ js.Function1[/* err */ js.Any, Unit], Unit]
    ): Unit = js.native
  }
  object Migrator {
    
    @scala.inline
    def apply(
      register: (String, js.Function2[/* args */ ParsedArgs, /* fn */ js.Function1[/* err */ js.Any, Unit], Unit]) => Unit
    ): Migrator = {
      val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
      __obj.asInstanceOf[Migrator]
    }
    
    @scala.inline
    implicit class MigratorMutableBuilder[Self <: Migrator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegister(
        value: (String, js.Function2[/* args */ ParsedArgs, /* fn */ js.Function1[/* err */ js.Any, Unit], Unit]) => Unit
      ): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Processor extends StObject {
    
    def register(fn: js.Function1[/* file */ File, Unit]): Unit = js.native
    def register(pattern: String, fn: js.Function1[/* file */ File, Unit]): Unit = js.native
    def register(pattern: js.Function1[/* str */ String, _], fn: js.Function1[/* file */ File, Unit]): Unit = js.native
    def register(pattern: js.RegExp, fn: js.Function1[/* file */ File, Unit]): Unit = js.native
  }
  
  @js.native
  trait Renderer extends StObject {
    
    def register(
      srcExt: String,
      outExt: String,
      fn: js.Function2[/* data */ RendererData, /* options */ js.Any, js.Promise[String]]
    ): Unit = js.native
    @JSName("register")
    def register_false(
      srcExt: String,
      outExt: String,
      fn: js.Function2[/* data */ RendererData, /* options */ js.Any, js.Promise[String]],
      sync: `false`
    ): Unit = js.native
    @JSName("register")
    def register_true(
      srcExt: String,
      outExt: String,
      fn: js.Function2[/* data */ RendererData, /* options */ js.Any, String],
      sync: `true`
    ): Unit = js.native
  }
  
  @js.native
  trait RendererData extends StObject {
    
    /**
      * File path.
      */
    val path: js.UndefOr[String] = js.native
    
    /**
      * File content.
      */
    val text: String = js.native
  }
  object RendererData {
    
    @scala.inline
    def apply(text: String): RendererData = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[RendererData]
    }
    
    @scala.inline
    implicit class RendererDataMutableBuilder[Self <: RendererData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Tag extends StObject {
    
    def register(
      name: String,
      fn: js.Function2[/* args */ js.Array[String], /* content */ js.UndefOr[String], String]
    ): Unit = js.native
    def register(
      name: String,
      fn: js.Function2[/* args */ js.Array[String], /* content */ js.UndefOr[String], String],
      options: typingsSlinky.hexo.mod.extend.Tag.Options
    ): Unit = js.native
  }
  object Tag {
    
    @js.native
    trait Options extends StObject {
      
      var async: js.UndefOr[Boolean] = js.native
      
      var ends: js.UndefOr[Boolean] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): typingsSlinky.hexo.mod.extend.Tag.Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.hexo.mod.extend.Tag.Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: typingsSlinky.hexo.mod.extend.Tag.Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
        
        @scala.inline
        def setEnds(value: Boolean): Self = StObject.set(x, "ends", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndsUndefined: Self = StObject.set(x, "ends", js.undefined)
      }
    }
  }
}
