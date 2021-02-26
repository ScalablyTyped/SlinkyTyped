package typingsSlinky.hardSourceWebpackPlugin

import typingsSlinky.hardSourceWebpackPlugin.anon.Directories
import typingsSlinky.hardSourceWebpackPlugin.anon.Level
import typingsSlinky.hardSourceWebpackPlugin.anon.MaxAge
import typingsSlinky.hardSourceWebpackPlugin.mod.ExcludeModulePlugin.Option
import typingsSlinky.node.childProcessMod.ChildProcess
import typingsSlinky.node.childProcessMod.ForkOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hard-source-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ ()
    extends typingsSlinky.hardSourceWebpackPlugin.mod.hardSourceWebpackPlugin {
    def this(options: Options) = this()
  }
  
  @JSImport("hard-source-webpack-plugin", "ExcludeModulePlugin")
  @js.native
  class ExcludeModulePlugin protected () extends StObject {
    def this(options: js.Array[Option]) = this()
    def this(options: Option) = this()
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
  }
  object ExcludeModulePlugin {
    
    @js.native
    trait Option extends StObject {
      
      var exclude: js.UndefOr[TestElement] = js.native
      
      var include: js.UndefOr[TestElement] = js.native
      
      var test: TestElement = js.native
    }
    object Option {
      
      @scala.inline
      def apply(test: TestElement): Option = {
        val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
        __obj.asInstanceOf[Option]
      }
      
      @scala.inline
      implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setExclude(value: TestElement): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExcludeFunction1(value: /* source */ String => Boolean): Self = StObject.set(x, "exclude", js.Any.fromFunction1(value))
        
        @scala.inline
        def setExcludeRegExp(value: js.RegExp): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
        
        @scala.inline
        def setExcludeVarargs(value: Option*): Self = StObject.set(x, "exclude", js.Array(value :_*))
        
        @scala.inline
        def setInclude(value: TestElement): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIncludeFunction1(value: /* source */ String => Boolean): Self = StObject.set(x, "include", js.Any.fromFunction1(value))
        
        @scala.inline
        def setIncludeRegExp(value: js.RegExp): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
        
        @scala.inline
        def setIncludeVarargs(value: Option*): Self = StObject.set(x, "include", js.Array(value :_*))
        
        @scala.inline
        def setTest(value: TestElement): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTestFunction1(value: /* source */ String => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
        
        @scala.inline
        def setTestRegExp(value: js.RegExp): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTestVarargs(value: Option*): Self = StObject.set(x, "test", js.Array(value :_*))
      }
    }
    
    type TestElement = js.RegExp | String | (js.Function1[/* source */ String, Boolean]) | js.Array[Option]
  }
  
  @JSImport("hard-source-webpack-plugin", "HardSourceLevelDbSerializerPlugin")
  @js.native
  class HardSourceLevelDbSerializerPlugin () extends StObject {
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
  }
  
  @JSImport("hard-source-webpack-plugin", "LevelDbSerializerPlugin")
  @js.native
  class LevelDbSerializerPlugin () extends StObject {
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
  }
  
  @JSImport("hard-source-webpack-plugin", "ParallelModulePlugin")
  @js.native
  class ParallelModulePlugin protected () extends StObject {
    def this(options: typingsSlinky.hardSourceWebpackPlugin.mod.ParallelModulePlugin.Options) = this()
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
  }
  object ParallelModulePlugin {
    
    @js.native
    trait Options extends StObject {
      
      var fork: js.UndefOr[
            js.Function3[
              /* fork */ forkFn, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any, 
              /* webpackBin */ String, 
              Unit
            ]
          ] = js.native
      
      var minModules: js.UndefOr[Double] = js.native
      
      var numWorkers: js.UndefOr[Double | js.Function0[Double]] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): typingsSlinky.hardSourceWebpackPlugin.mod.ParallelModulePlugin.Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.hardSourceWebpackPlugin.mod.ParallelModulePlugin.Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: typingsSlinky.hardSourceWebpackPlugin.mod.ParallelModulePlugin.Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFork(
          value: (/* fork */ forkFn, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any, /* webpackBin */ String) => Unit
        ): Self = StObject.set(x, "fork", js.Any.fromFunction3(value))
        
        @scala.inline
        def setForkUndefined: Self = StObject.set(x, "fork", js.undefined)
        
        @scala.inline
        def setMinModules(value: Double): Self = StObject.set(x, "minModules", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinModulesUndefined: Self = StObject.set(x, "minModules", js.undefined)
        
        @scala.inline
        def setNumWorkers(value: Double | js.Function0[Double]): Self = StObject.set(x, "numWorkers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNumWorkersFunction0(value: () => Double): Self = StObject.set(x, "numWorkers", js.Any.fromFunction0(value))
        
        @scala.inline
        def setNumWorkersUndefined: Self = StObject.set(x, "numWorkers", js.undefined)
      }
    }
    
    // NOTE: not using `Parameters` and `ReturnType` on purpose to compatibility. better of code this below.
    //     type forkFn = (...args: Parameters<typeof fork>) => ReturnType<typeof fork>
    // this code working on supported versions of `infer` keyword (version 2.8 higher.
    type forkFn = js.Function3[
        /* modulePath */ String, 
        /* args */ js.UndefOr[js.Array[String]], 
        /* options */ js.UndefOr[ForkOptions], 
        ChildProcess
      ]
  }
  
  @JSImport("hard-source-webpack-plugin", "SerializerAppend2Plugin")
  @js.native
  class SerializerAppend2Plugin () extends StObject {
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
  }
  
  @JSImport("hard-source-webpack-plugin", "SerializerAppendPlugin")
  @js.native
  class SerializerAppendPlugin () extends StObject {
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
  }
  
  @JSImport("hard-source-webpack-plugin", "SerializerCacachePlugin")
  @js.native
  class SerializerCacachePlugin () extends StObject {
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
  }
  
  @JSImport("hard-source-webpack-plugin", "SerializerJsonPlugin")
  @js.native
  class SerializerJsonPlugin () extends StObject {
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var cacheDirectory: js.UndefOr[String] = js.native
    
    var cachePrune: js.UndefOr[MaxAge] = js.native
    
    var configHash: js.UndefOr[
        String | (js.Function1[
          /* webpackConfig */ js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any
          ], 
          String
        ])
      ] = js.native
    
    var environmentHash: js.UndefOr[Directories] = js.native
    
    var info: js.UndefOr[Level] = js.native
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
      def setCacheDirectory(value: String): Self = StObject.set(x, "cacheDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheDirectoryUndefined: Self = StObject.set(x, "cacheDirectory", js.undefined)
      
      @scala.inline
      def setCachePrune(value: MaxAge): Self = StObject.set(x, "cachePrune", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCachePruneUndefined: Self = StObject.set(x, "cachePrune", js.undefined)
      
      @scala.inline
      def setConfigHash(
        value: String | (js.Function1[
              /* webpackConfig */ js.UndefOr[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any
              ], 
              String
            ])
      ): Self = StObject.set(x, "configHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigHashFunction1(
        value: /* webpackConfig */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any
            ] => String
      ): Self = StObject.set(x, "configHash", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConfigHashUndefined: Self = StObject.set(x, "configHash", js.undefined)
      
      @scala.inline
      def setEnvironmentHash(value: Directories): Self = StObject.set(x, "environmentHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentHashUndefined: Self = StObject.set(x, "environmentHash", js.undefined)
      
      @scala.inline
      def setInfo(value: Level): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    }
  }
  
  @js.native
  trait hardSourceWebpackPlugin extends StObject {
    
    @JSName("apply")
    def apply(args: js.Any*): Unit = js.native
  }
  object hardSourceWebpackPlugin {
    
    @scala.inline
    def apply(apply: /* repeated */ js.Any => Unit): typingsSlinky.hardSourceWebpackPlugin.mod.hardSourceWebpackPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[typingsSlinky.hardSourceWebpackPlugin.mod.hardSourceWebpackPlugin]
    }
    
    @scala.inline
    implicit class hardSourceWebpackPluginMutableBuilder[Self <: typingsSlinky.hardSourceWebpackPlugin.mod.hardSourceWebpackPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    }
  }
}
