package typingsSlinky.matrixAppserviceBridge

import typingsSlinky.matrixAppservice.mod.AppServiceRegistration
import typingsSlinky.matrixAppserviceBridge.anon.AffectsRegistration
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cliMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/cli", "Cli")
  @js.native
  class Cli[ConfigType /* <: Record[String, _] */] protected () extends StObject {
    /**
      * @constructor
      * @param opts CLI options
      * @param opts.run The function called when you should run the bridge.
      * @param opts.generateRegistration The function
      * called when you should generate a registration.
      * @param opts.bridgeConfig Bridge-specific config info. If null, no
      * --config option will be present in the CLI. Default: null.
      * @param opts.bridgeConfig.affectsRegistration True to make the
      * --config option required when generating the registration. The parsed config
      * can be accessed via <code>Cli.getConfig()</code>.
      * @param opts.bridgeConfig.schema Path to a schema YAML file
      * (string) or the parsed schema file (Object).
      * @param opts.bridgeConfig.defaults The default options for the
      * config file.
      * @param opts.noUrl Don't ask user for appservice url when generating
      * registration.
      * @param opts.enableRegistration Enable '--generate-registration'.
      * Default True.
      * @param opts.registrationPath The path to write the registration
      * file to. Users can overwrite this with -f.
      * @param opts.enableLocalpart Enable '--localpart [-l]'. Default: false.
      */
    def this(opts: CliOpts[ConfigType]) = this()
    
    var args: js.Any = js.native
    
    var assignConfigFile: js.Any = js.native
    
    var bridgeConfig: js.Any = js.native
    
    var generateRegistration: js.Any = js.native
    
    /**
      * Get the parsed arguments. Only set after run is called and arguments parsed.
      * @return The parsed arguments
      */
    def getArgs(): CliArgs | Null = js.native
    
    /**
      * Get the loaded and parsed bridge config. Only set after run() has been called.
      * @return The config
      */
    def getConfig(): ConfigType | Null = js.native
    
    /**
      * Get the path to the registration file. This may be different to the one supplied
      * in the constructor if the user passed a -f flag.
      * @return The path to the registration file.
      */
    def getRegistrationFilePath(): String = js.native
    
    var loadConfig: js.Any = js.native
    
    var loadYaml: js.Any = js.native
    
    var opts: js.Any = js.native
    
    var printHelp: js.Any = js.native
    
    /**
      * Run the app from the command line. Will parse sys args.
      */
    def run(): Unit = js.native
    def run(args: CliArgs): Unit = js.native
    
    var startWithConfig: js.Any = js.native
  }
  /* static members */
  object Cli {
    
    @JSImport("matrix-appservice-bridge/lib/components/cli", "Cli")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("matrix-appservice-bridge/lib/components/cli", "Cli.DEFAULT_FILENAME")
    @js.native
    def DEFAULT_FILENAME: String = js.native
    @scala.inline
    def DEFAULT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_FILENAME")(x.asInstanceOf[js.Any])
    
    @JSImport("matrix-appservice-bridge/lib/components/cli", "Cli.DEFAULT_PORT")
    @js.native
    def DEFAULT_PORT: Double = js.native
    @scala.inline
    def DEFAULT_PORT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_PORT")(x.asInstanceOf[js.Any])
    
    @JSImport("matrix-appservice-bridge/lib/components/cli", "Cli.DEFAULT_WATCH_INTERVAL")
    @js.native
    def DEFAULT_WATCH_INTERVAL: Double = js.native
    @scala.inline
    def DEFAULT_WATCH_INTERVAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_WATCH_INTERVAL")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CliArgs extends StObject {
    
    var config: String = js.native
    
    var file: String = js.native
    
    var `generate-registration`: Boolean = js.native
    
    var help: Boolean = js.native
    
    var localpart: String = js.native
    
    var port: Double = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object CliArgs {
    
    @scala.inline
    def apply(
      config: String,
      file: String,
      `generate-registration`: Boolean,
      help: Boolean,
      localpart: String,
      port: Double
    ): CliArgs = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], localpart = localpart.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.updateDynamic("generate-registration")(`generate-registration`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CliArgs]
    }
    
    @scala.inline
    implicit class CliArgsMutableBuilder[Self <: CliArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGenerate-registration`(value: Boolean): Self = StObject.set(x, "generate-registration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelp(value: Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalpart(value: String): Self = StObject.set(x, "localpart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait CliOpts[ConfigType /* <: Record[String, _] */] extends StObject {
    
    var bridgeConfig: js.UndefOr[AffectsRegistration] = js.native
    
    var enableLocalpart: js.UndefOr[Boolean] = js.native
    
    var enableRegistration: js.UndefOr[Boolean] = js.native
    
    var generateRegistration: js.UndefOr[
        js.Function2[
          /* reg */ AppServiceRegistration, 
          /* cb */ js.Function1[/* finalReg */ AppServiceRegistration, Unit], 
          Unit
        ]
      ] = js.native
    
    var noUrl: js.UndefOr[Boolean] = js.native
    
    var onConfigChanged: js.UndefOr[js.Function1[/* config */ ConfigType, Unit]] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var registrationPath: js.UndefOr[String] = js.native
    
    def run(port: Double): Unit = js.native
    def run(port: Double, config: ConfigType): Unit = js.native
    def run(port: Double, config: ConfigType, registration: AppServiceRegistration): Unit = js.native
    def run(port: Double, config: Null, registration: AppServiceRegistration): Unit = js.native
  }
}
