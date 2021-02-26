package typingsSlinky.eggMock

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.egg.mod.Application
import typingsSlinky.egg.mod.Context
import typingsSlinky.eggMock.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("egg-mock", JSImport.Namespace)
  @js.native
  val ^ : EggMock = js.native
  
  @js.native
  trait EggMock extends StObject {
    
    /**
      * Create a egg mocked application
      */
    def app(): MockApplication = js.native
    def app(option: MockOption): MockApplication = js.native
    
    /**
      * mock console level
      */
    def consoleLevel(level: String): Unit = js.native
    
    /**
      * mock the serverEnv of Egg
      */
    def env(env: EnvType): Unit = js.native
    
    /**
      * set EGG_HOME path
      */
    def home(homePath: String): Unit = js.native
    
    /**
      * restore mock
      */
    def restore(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.eggMock.eggMockStrings.default
    - typingsSlinky.eggMock.eggMockStrings.test
    - typingsSlinky.eggMock.eggMockStrings.prod
    - typingsSlinky.eggMock.eggMockStrings.local
    - typingsSlinky.eggMock.eggMockStrings.unittest
  */
  trait EnvType extends StObject
  object EnvType {
    
    @scala.inline
    def default: typingsSlinky.eggMock.eggMockStrings.default = "default".asInstanceOf[typingsSlinky.eggMock.eggMockStrings.default]
    
    @scala.inline
    def local: typingsSlinky.eggMock.eggMockStrings.local = "local".asInstanceOf[typingsSlinky.eggMock.eggMockStrings.local]
    
    @scala.inline
    def prod: typingsSlinky.eggMock.eggMockStrings.prod = "prod".asInstanceOf[typingsSlinky.eggMock.eggMockStrings.prod]
    
    @scala.inline
    def test: typingsSlinky.eggMock.eggMockStrings.test = "test".asInstanceOf[typingsSlinky.eggMock.eggMockStrings.test]
    
    @scala.inline
    def unittest: typingsSlinky.eggMock.eggMockStrings.unittest = "unittest".asInstanceOf[typingsSlinky.eggMock.eggMockStrings.unittest]
  }
  
  @js.native
  trait MockApplication extends Application {
    
    /**
      * mock Context
      */
    def mockContext(): Context = js.native
    def mockContext(data: js.Any): Context = js.native
    
    def mockCookies(cookies: js.Any): MockApplication = js.native
    
    def mockHeaders(headers: js.Any): MockApplication = js.native
    
    def mockHttpclient(mockUrl: String, mockMethod: String, mockResult: Data): MockApplication = js.native
    def mockHttpclient(mockUrl: String, mockMethod: js.Array[String], mockResult: Data): MockApplication = js.native
    
    /**
      * Mock service
      */
    def mockService(service: String, methodName: String, fn: js.Any): MockApplication = js.native
    
    /**
      * mock service that return error
      */
    def mockServiceError(service: String, methodName: String): MockApplication = js.native
    def mockServiceError(service: String, methodName: String, err: js.Error): MockApplication = js.native
    
    /**
      * mock cookie session
      */
    def mockSession(data: js.Any): MockApplication = js.native
  }
  
  @js.native
  trait MockOption extends StObject {
    
    /**
      * The directory of the application
      */
    var baseDir: js.UndefOr[String] = js.native
    
    /**
      * Cache application based on baseDir
      */
    var cache: js.UndefOr[Boolean] = js.native
    
    /**
      * Remove $baseDir/logs
      */
    var clean: js.UndefOr[Boolean] = js.native
    
    /**
      * Swtich on process coverage, but it'll be slower
      */
    var coverage: js.UndefOr[Boolean] = js.native
    
    /**
      * The directory of the egg framework
      */
    var framework: js.UndefOr[String] = js.native
    
    /**
      * Custom you plugins
      */
    var plugins: js.UndefOr[js.Any] = js.native
  }
  object MockOption {
    
    @scala.inline
    def apply(): MockOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockOption]
    }
    
    @scala.inline
    implicit class MockOptionMutableBuilder[Self <: MockOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseDirUndefined: Self = StObject.set(x, "baseDir", js.undefined)
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setClean(value: Boolean): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleanUndefined: Self = StObject.set(x, "clean", js.undefined)
      
      @scala.inline
      def setCoverage(value: Boolean): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverageUndefined: Self = StObject.set(x, "coverage", js.undefined)
      
      @scala.inline
      def setFramework(value: String): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameworkUndefined: Self = StObject.set(x, "framework", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Any): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    }
  }
  
  type _To = EggMock
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: EggMock = ^
}
