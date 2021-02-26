package typingsSlinky.depcheck

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.depcheck.anon.Dependencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("depcheck", JSImport.Namespace)
  @js.native
  def apply(rootDir: String, options: Options): js.Promise[Results] = js.native
  @JSImport("depcheck", JSImport.Namespace)
  @js.native
  def apply[T](rootDir: String, options: Options, callback: js.Function1[/* results */ Results, T]): js.Promise[T] = js.native
  
  object detector {
    
    @JSImport("depcheck", "detector")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("depcheck", "detector.exportDeclaration")
    @js.native
    def exportDeclaration: Detector_ = js.native
    @JSImport("depcheck", "detector.exportDeclaration")
    @js.native
    def exportDeclaration(node: Node): js.Array[String] | String = js.native
    @scala.inline
    def exportDeclaration_=(x: Detector_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exportDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "detector.expressViewEngine")
    @js.native
    def expressViewEngine: Detector_ = js.native
    @JSImport("depcheck", "detector.expressViewEngine")
    @js.native
    def expressViewEngine(node: Node): js.Array[String] | String = js.native
    @scala.inline
    def expressViewEngine_=(x: Detector_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expressViewEngine")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "detector.extract")
    @js.native
    def extract: Detector_ = js.native
    @JSImport("depcheck", "detector.extract")
    @js.native
    def extract(node: Node): js.Array[String] | String = js.native
    @scala.inline
    def extract_=(x: Detector_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extract")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "detector.gruntLoadTaskCallExpression")
    @js.native
    def gruntLoadTaskCallExpression: Detector_ = js.native
    @JSImport("depcheck", "detector.gruntLoadTaskCallExpression")
    @js.native
    def gruntLoadTaskCallExpression(node: Node): js.Array[String] | String = js.native
    @scala.inline
    def gruntLoadTaskCallExpression_=(x: Detector_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gruntLoadTaskCallExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "detector.importCallExpression")
    @js.native
    def importCallExpression: Detector_ = js.native
    @JSImport("depcheck", "detector.importCallExpression")
    @js.native
    def importCallExpression(node: Node): js.Array[String] | String = js.native
    @scala.inline
    def importCallExpression_=(x: Detector_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("importCallExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "detector.importDeclaration")
    @js.native
    def importDeclaration: Detector_ = js.native
    @JSImport("depcheck", "detector.importDeclaration")
    @js.native
    def importDeclaration(node: Node): js.Array[String] | String = js.native
    @scala.inline
    def importDeclaration_=(x: Detector_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("importDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "detector.requireCallExpression")
    @js.native
    def requireCallExpression: Detector_ = js.native
    @JSImport("depcheck", "detector.requireCallExpression")
    @js.native
    def requireCallExpression(node: Node): js.Array[String] | String = js.native
    @scala.inline
    def requireCallExpression_=(x: Detector_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requireCallExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "detector.requireResolveCallExpression")
    @js.native
    def requireResolveCallExpression: Detector_ = js.native
    @JSImport("depcheck", "detector.requireResolveCallExpression")
    @js.native
    def requireResolveCallExpression(node: Node): js.Array[String] | String = js.native
    @scala.inline
    def requireResolveCallExpression_=(x: Detector_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requireResolveCallExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "detector.typescriptImportEqualsDeclaration")
    @js.native
    def typescriptImportEqualsDeclaration: Detector_ = js.native
    @JSImport("depcheck", "detector.typescriptImportEqualsDeclaration")
    @js.native
    def typescriptImportEqualsDeclaration(node: Node): js.Array[String] | String = js.native
    @scala.inline
    def typescriptImportEqualsDeclaration_=(x: Detector_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typescriptImportEqualsDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "detector.typescriptImportType")
    @js.native
    def typescriptImportType: Detector_ = js.native
    @JSImport("depcheck", "detector.typescriptImportType")
    @js.native
    def typescriptImportType(node: Node): js.Array[String] | String = js.native
    @scala.inline
    def typescriptImportType_=(x: Detector_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typescriptImportType")(x.asInstanceOf[js.Any])
  }
  
  object parser {
    
    @JSImport("depcheck", "parser")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("depcheck", "parser.coffee")
    @js.native
    def coffee: Parser_ = js.native
    @JSImport("depcheck", "parser.coffee")
    @js.native
    def coffee(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
    @scala.inline
    def coffee_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("coffee")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "parser.es6")
    @js.native
    def es6: Parser_ = js.native
    @JSImport("depcheck", "parser.es6")
    @js.native
    def es6(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
    @scala.inline
    def es6_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("es6")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "parser.es7")
    @js.native
    def es7: Parser_ = js.native
    @JSImport("depcheck", "parser.es7")
    @js.native
    def es7(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
    @scala.inline
    def es7_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("es7")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "parser.jsx")
    @js.native
    def jsx: Parser_ = js.native
    @JSImport("depcheck", "parser.jsx")
    @js.native
    def jsx(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
    @scala.inline
    def jsx_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jsx")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "parser.sass")
    @js.native
    def sass: Parser_ = js.native
    @JSImport("depcheck", "parser.sass")
    @js.native
    def sass(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
    @scala.inline
    def sass_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sass")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "parser.typescript")
    @js.native
    def typescript: Parser_ = js.native
    @JSImport("depcheck", "parser.typescript")
    @js.native
    def typescript(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
    @scala.inline
    def typescript_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typescript")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "parser.vue")
    @js.native
    def vue: Parser_ = js.native
    @JSImport("depcheck", "parser.vue")
    @js.native
    def vue(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
    @scala.inline
    def vue_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vue")(x.asInstanceOf[js.Any])
  }
  
  object special {
    
    @JSImport("depcheck", "special")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("depcheck", "special.babel")
    @js.native
    def babel: Parser_ = js.native
    @JSImport("depcheck", "special.babel")
    @js.native
    def babel(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
    @scala.inline
    def babel_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("babel")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.bin")
    @js.native
    def bin: Parser_ = js.native
    @JSImport("depcheck", "special.bin")
    @js.native
    def bin(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
    @scala.inline
    def bin_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bin")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.commitizen")
    @js.native
    def commitizen: Parser_ = js.native
    @JSImport("depcheck", "special.commitizen")
    @js.native
    def commitizen(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
    @scala.inline
    def commitizen_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("commitizen")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.eslint")
    @js.native
    def eslint: Parser_ = js.native
    @JSImport("depcheck", "special.eslint")
    @js.native
    def eslint(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
    @scala.inline
    def eslint_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eslint")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.feross-standard")
    @js.native
    def ferossStandard: Parser_ = js.native
    @JSImport("depcheck", "special.feross-standard")
    @js.native
    def ferossStandard(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
    
    @scala.inline
    def ferossStandard_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feross-standard")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.gatsby")
    @js.native
    def gatsby: Parser_ = js.native
    @JSImport("depcheck", "special.gatsby")
    @js.native
    def gatsby(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
    @scala.inline
    def gatsby_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gatsby")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.gulp-load-plugins")
    @js.native
    def gulpLoadPlugins: Parser_ = js.native
    @JSImport("depcheck", "special.gulp-load-plugins")
    @js.native
    def gulpLoadPlugins(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
    
    @scala.inline
    def gulpLoadPlugins_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gulp-load-plugins")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.husky")
    @js.native
    def husky: Parser_ = js.native
    @JSImport("depcheck", "special.husky")
    @js.native
    def husky(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
    @scala.inline
    def husky_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("husky")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.istanbul")
    @js.native
    def istanbul: Parser_ = js.native
    @JSImport("depcheck", "special.istanbul")
    @js.native
    def istanbul(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
    @scala.inline
    def istanbul_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("istanbul")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.jest")
    @js.native
    def jest: Parser_ = js.native
    @JSImport("depcheck", "special.jest")
    @js.native
    def jest(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
    @scala.inline
    def jest_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jest")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.karma")
    @js.native
    def karma: Parser_ = js.native
    @JSImport("depcheck", "special.karma")
    @js.native
    def karma(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
    @scala.inline
    def karma_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("karma")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.lint-staged")
    @js.native
    def lintStaged: Parser_ = js.native
    @JSImport("depcheck", "special.lint-staged")
    @js.native
    def lintStaged(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
    
    @scala.inline
    def lintStaged_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lint-staged")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.mocha")
    @js.native
    def mocha: Parser_ = js.native
    @JSImport("depcheck", "special.mocha")
    @js.native
    def mocha(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
    @scala.inline
    def mocha_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mocha")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.prettier")
    @js.native
    def prettier: Parser_ = js.native
    @JSImport("depcheck", "special.prettier")
    @js.native
    def prettier(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
    @scala.inline
    def prettier_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prettier")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.react17")
    @js.native
    def react17: Parser_ = js.native
    @JSImport("depcheck", "special.react17")
    @js.native
    def react17(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
    @scala.inline
    def react17_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("react17")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.serverless")
    @js.native
    def serverless: Parser_ = js.native
    @JSImport("depcheck", "special.serverless")
    @js.native
    def serverless(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
    @scala.inline
    def serverless_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serverless")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.tslint")
    @js.native
    def tslint: Parser_ = js.native
    @JSImport("depcheck", "special.tslint")
    @js.native
    def tslint(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
    @scala.inline
    def tslint_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tslint")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.ttypescript")
    @js.native
    def ttypescript: Parser_ = js.native
    @JSImport("depcheck", "special.ttypescript")
    @js.native
    def ttypescript(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
    @scala.inline
    def ttypescript_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ttypescript")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.webpack")
    @js.native
    def webpack: Parser_ = js.native
    @JSImport("depcheck", "special.webpack")
    @js.native
    def webpack(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
    @scala.inline
    def webpack_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("webpack")(x.asInstanceOf[js.Any])
  }
  
  type Detector_ = js.Function1[/* node */ Node, js.Array[String] | String]
  
  type Node = StringDictionary[js.Any]
  
  @js.native
  trait Options extends StObject {
    
    @JSName("package")
    var _package: js.UndefOr[Dependencies] = js.native
    
    var detectors: js.UndefOr[js.Array[Detector_]] = js.native
    
    var ignoreBinPackage: js.UndefOr[Boolean] = js.native
    
    var ignoreDirs: js.UndefOr[js.Array[String]] = js.native
    
    var ignoreMatches: js.UndefOr[js.Array[String]] = js.native
    
    var parsers: js.UndefOr[StringDictionary[Parser_]] = js.native
    
    var skipMissing: js.UndefOr[Boolean] = js.native
    
    var specials: js.UndefOr[js.Array[Parser_]] = js.native
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
      def setDetectors(value: js.Array[Detector_]): Self = StObject.set(x, "detectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectorsUndefined: Self = StObject.set(x, "detectors", js.undefined)
      
      @scala.inline
      def setDetectorsVarargs(value: Detector_ *): Self = StObject.set(x, "detectors", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreBinPackage(value: Boolean): Self = StObject.set(x, "ignoreBinPackage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreBinPackageUndefined: Self = StObject.set(x, "ignoreBinPackage", js.undefined)
      
      @scala.inline
      def setIgnoreDirs(value: js.Array[String]): Self = StObject.set(x, "ignoreDirs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreDirsUndefined: Self = StObject.set(x, "ignoreDirs", js.undefined)
      
      @scala.inline
      def setIgnoreDirsVarargs(value: String*): Self = StObject.set(x, "ignoreDirs", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreMatches(value: js.Array[String]): Self = StObject.set(x, "ignoreMatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreMatchesUndefined: Self = StObject.set(x, "ignoreMatches", js.undefined)
      
      @scala.inline
      def setIgnoreMatchesVarargs(value: String*): Self = StObject.set(x, "ignoreMatches", js.Array(value :_*))
      
      @scala.inline
      def setParsers(value: StringDictionary[Parser_]): Self = StObject.set(x, "parsers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParsersUndefined: Self = StObject.set(x, "parsers", js.undefined)
      
      @scala.inline
      def setSkipMissing(value: Boolean): Self = StObject.set(x, "skipMissing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipMissingUndefined: Self = StObject.set(x, "skipMissing", js.undefined)
      
      @scala.inline
      def setSpecials(value: js.Array[Parser_]): Self = StObject.set(x, "specials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecialsUndefined: Self = StObject.set(x, "specials", js.undefined)
      
      @scala.inline
      def setSpecialsVarargs(value: Parser_ *): Self = StObject.set(x, "specials", js.Array(value :_*))
      
      @scala.inline
      def set_package(value: Dependencies): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
    }
  }
  
  type PackageDependencies = StringDictionary[String]
  
  type Parser_ = js.Function4[
    /* content */ String, 
    /* filePath */ String, 
    /* deps */ js.Array[String], 
    /* rootDir */ String, 
    Node
  ]
  
  @js.native
  trait Results extends StObject {
    
    var dependencies: js.Array[String] = js.native
    
    var devDependencies: js.Array[String] = js.native
    
    var invalidDirs: StringDictionary[js.Any] = js.native
    
    var invalidFiles: StringDictionary[js.Any] = js.native
    
    var missing: StringDictionary[js.Array[String]] = js.native
    
    var using: StringDictionary[js.Array[String]] = js.native
  }
  object Results {
    
    @scala.inline
    def apply(
      dependencies: js.Array[String],
      devDependencies: js.Array[String],
      invalidDirs: StringDictionary[js.Any],
      invalidFiles: StringDictionary[js.Any],
      missing: StringDictionary[js.Array[String]],
      using: StringDictionary[js.Array[String]]
    ): Results = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], devDependencies = devDependencies.asInstanceOf[js.Any], invalidDirs = invalidDirs.asInstanceOf[js.Any], invalidFiles = invalidFiles.asInstanceOf[js.Any], missing = missing.asInstanceOf[js.Any], using = using.asInstanceOf[js.Any])
      __obj.asInstanceOf[Results]
    }
    
    @scala.inline
    implicit class ResultsMutableBuilder[Self <: Results] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
      
      @scala.inline
      def setDevDependencies(value: js.Array[String]): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevDependenciesVarargs(value: String*): Self = StObject.set(x, "devDependencies", js.Array(value :_*))
      
      @scala.inline
      def setInvalidDirs(value: StringDictionary[js.Any]): Self = StObject.set(x, "invalidDirs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidFiles(value: StringDictionary[js.Any]): Self = StObject.set(x, "invalidFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMissing(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsing(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "using", value.asInstanceOf[js.Any])
    }
  }
}
