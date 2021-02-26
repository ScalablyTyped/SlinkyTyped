package typingsSlinky.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NightwatchSeleniumOptions extends StObject {
  
  /**
    * List of cli arguments to be passed to the Selenium process. Here you can set various options for browser drivers, such as:
    *
    * webdriver.firefox.profile: Selenium will be default create a new Firefox profile for each session.
    * If you wish to use an existing Firefox profile you can specify its name here.
    * Complete list of Firefox Driver arguments available https://code.google.com/p/selenium/wiki/FirefoxDriver.
    *
    * webdriver.chrome.driver: Nightwatch can run the tests using Chrome browser also. To enable this you have to download the ChromeDriver binary
    * (http://chromedriver.storage.googleapis.com/index.html) and specify it's location here. Also don't forget to specify chrome as the browser name in the
    * desiredCapabilities object.
    * More information can be found on the ChromeDriver website (https://sites.google.com/a/chromium.org/chromedriver/).
    *
    * webdriver.ie.driver: Nightwatch has support for Internet Explorer also. To enable this you have to download the IE Driver binary
    * (https://code.google.com/p/selenium/wiki/InternetExplorerDriver) and specify it's location here. Also don't forget to specify "internet explorer" as the browser
    * name in the desiredCapabilities object.
    */
  var cli_args: js.Any = js.native
  
  /**
    * Usually not required and only used if start_process is true. Specify the IP address you wish Selenium to listen on.
    */
  var host: String = js.native
  
  /**
    * The location where the selenium Selenium-debug.log file will be placed. Defaults to current directory. To disable Selenium logging, set this to false
    */
  var log_path: String | Boolean = js.native
  
  /**
    * The port number Selenium will listen on.
    */
  var port: Double = js.native
  
  /**
    * The location of the selenium jar file. This needs to be specified if start_process is enabled.E.g.: lib/selenium-server-standalone-2.43.0.jar
    */
  var server_path: String = js.native
  
  /**
    * Whether or not to manage the selenium process automatically.
    */
  var start_process: Boolean = js.native
  
  /**
    * Whether or not to automatically start the Selenium session.
    */
  var start_session: Boolean = js.native
}
object NightwatchSeleniumOptions {
  
  @scala.inline
  def apply(
    cli_args: js.Any,
    host: String,
    log_path: String | Boolean,
    port: Double,
    server_path: String,
    start_process: Boolean,
    start_session: Boolean
  ): NightwatchSeleniumOptions = {
    val __obj = js.Dynamic.literal(cli_args = cli_args.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], log_path = log_path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], server_path = server_path.asInstanceOf[js.Any], start_process = start_process.asInstanceOf[js.Any], start_session = start_session.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchSeleniumOptions]
  }
  
  @scala.inline
  implicit class NightwatchSeleniumOptionsMutableBuilder[Self <: NightwatchSeleniumOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCli_args(value: js.Any): Self = StObject.set(x, "cli_args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog_path(value: String | Boolean): Self = StObject.set(x, "log_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServer_path(value: String): Self = StObject.set(x, "server_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_process(value: Boolean): Self = StObject.set(x, "start_process", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_session(value: Boolean): Self = StObject.set(x, "start_session", value.asInstanceOf[js.Any])
  }
}
