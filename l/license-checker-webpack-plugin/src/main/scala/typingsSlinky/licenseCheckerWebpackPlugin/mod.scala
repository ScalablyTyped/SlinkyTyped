package typingsSlinky.licenseCheckerWebpackPlugin

import typingsSlinky.licenseCheckerWebpackPlugin.anon.PartialDependency
import typingsSlinky.licenseCheckerWebpackPlugin.anon.PartialOptions
import typingsSlinky.std.Plugin
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("license-checker-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ () extends Plugin {
    def this(options: PartialOptions) = this()
  }
  
  @js.native
  trait Dependency extends StObject {
    
    var licenseName: String = js.native
    
    var licenseText: String = js.native
    
    var name: String = js.native
    
    var repository: String = js.native
    
    var version: String = js.native
  }
  object Dependency {
    
    @scala.inline
    def apply(licenseName: String, licenseText: String, name: String, repository: String, version: String): Dependency = {
      val __obj = js.Dynamic.literal(licenseName = licenseName.asInstanceOf[js.Any], licenseText = licenseText.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dependency]
    }
    
    @scala.inline
    implicit class DependencyMutableBuilder[Self <: Dependency] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLicenseName(value: String): Self = StObject.set(x, "licenseName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseText(value: String): Self = StObject.set(x, "licenseText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type LicenseCheckerWebpackPlugin = Plugin
  
  @js.native
  trait Options extends StObject {
    
    /**
      * SPDX expression with allowed licenses.
      *
      * Default: `"(Apache-2.0 OR BSD-2-Clause OR BSD-3-Clause OR MIT)"`
      */
    var allow: String = js.native
    
    /**
      * Whether to emit errors instead of warnings.
      *
      * Default: `false`
      */
    var emitError: Boolean = js.native
    
    /**
      * Regular expression that matches the file paths of dependencies to check.
      */
    var filter: js.RegExp = js.native
    
    /**
      * Array of dependencies to ignore, in the format `["<dependency name>@<version range>"]`.
      * For example, `["assignment@^2.0.0"]`.
      *
      * Default: `[]`
      */
    var ignore: js.Array[String] = js.native
    
    /**
      * Name of the third-party notices file with all licensing information.
      *
      * Default: `"ThirdPartyNotices.txt"`
      */
    var outputFilename: String = js.native
    
    /**
      * Path to a `.ejs` template, or function that will generate the contents
      * of the third-party notices file.
      */
    var outputWriter: String | OutputWriter = js.native
    
    /**
      * Object of dependencies to override, in the format `{"<dependency name>@<version range>": { ... }}`.
      * For example, `{"assignment@^2.0.0": { licenseName: "MIT" }}`.
      *
      * Default: `{}`
      */
    var `override`: Record[String, PartialDependency] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
      allow: String,
      emitError: Boolean,
      filter: js.RegExp,
      ignore: js.Array[String],
      outputFilename: String,
      outputWriter: String | OutputWriter,
      `override`: Record[String, PartialDependency]
    ): Options = {
      val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], emitError = emitError.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], outputFilename = outputFilename.asInstanceOf[js.Any], outputWriter = outputWriter.asInstanceOf[js.Any])
      __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllow(value: String): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitError(value: Boolean): Self = StObject.set(x, "emitError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter(value: js.RegExp): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setOutputFilename(value: String): Self = StObject.set(x, "outputFilename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputWriter(value: String | OutputWriter): Self = StObject.set(x, "outputWriter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputWriterFunction1(value: /* args */ OutputWriterArgs => String): Self = StObject.set(x, "outputWriter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOverride(value: Record[String, PartialDependency]): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    }
  }
  
  type OutputWriter = js.Function1[/* args */ OutputWriterArgs, String]
  
  @js.native
  trait OutputWriterArgs extends StObject {
    
    var dependencies: js.Array[Dependency] = js.native
  }
  object OutputWriterArgs {
    
    @scala.inline
    def apply(dependencies: js.Array[Dependency]): OutputWriterArgs = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputWriterArgs]
    }
    
    @scala.inline
    implicit class OutputWriterArgsMutableBuilder[Self <: OutputWriterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDependencies(value: js.Array[Dependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesVarargs(value: Dependency*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
    }
  }
}
