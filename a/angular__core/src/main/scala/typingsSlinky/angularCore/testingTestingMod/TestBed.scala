package typingsSlinky.angularCore.testingTestingMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.angularCore.anon.Deps
import typingsSlinky.angularCore.anon.Providers
import typingsSlinky.angularCore.anon.UseFactory
import typingsSlinky.angularCore.anon.UseValue
import typingsSlinky.angularCore.mod.AbstractType
import typingsSlinky.angularCore.mod.Component
import typingsSlinky.angularCore.mod.Directive
import typingsSlinky.angularCore.mod.InjectFlags
import typingsSlinky.angularCore.mod.InjectionToken
import typingsSlinky.angularCore.mod.NgModule
import typingsSlinky.angularCore.mod.Pipe
import typingsSlinky.angularCore.mod.PlatformRef
import typingsSlinky.angularCore.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestBed extends js.Object {
  
  def compileComponents(): js.Promise[_] = js.native
  
  def configureCompiler(config: Providers): Unit = js.native
  
  def configureTestingModule(moduleDef: TestModuleMetadata): Unit = js.native
  
  def createComponent[T](component: Type[T]): ComponentFixture[T] = js.native
  
  def execute(tokens: js.Array[_], fn: js.Function): js.Any = js.native
  def execute(tokens: js.Array[_], fn: js.Function, context: js.Any): js.Any = js.native
  
  /** @deprecated from v9.0.0 use TestBed.inject */
  def get(token: js.Any): js.Any = js.native
  def get(token: js.Any, notFoundValue: js.Any): js.Any = js.native
  def get[T](token: InjectionToken[T]): js.Any = js.native
  def get[T](token: InjectionToken[T], notFoundValue: T): js.Any = js.native
  def get[T](token: InjectionToken[T], notFoundValue: T, flags: InjectFlags): js.Any = js.native
  def get[T](token: InjectionToken[T], notFoundValue: js.UndefOr[scala.Nothing], flags: InjectFlags): js.Any = js.native
  /** @deprecated from v9.0.0 use TestBed.inject */
  def get[T](token: Type[T]): js.Any = js.native
  def get[T](token: Type[T], notFoundValue: T): js.Any = js.native
  def get[T](token: Type[T], notFoundValue: T, flags: InjectFlags): js.Any = js.native
  def get[T](token: Type[T], notFoundValue: js.UndefOr[scala.Nothing], flags: InjectFlags): js.Any = js.native
  
  def initTestEnvironment(ngModule: js.Array[Type[_]], platform: PlatformRef): Unit = js.native
  def initTestEnvironment(ngModule: js.Array[Type[_]], platform: PlatformRef, aotSummaries: js.Function0[js.Array[_]]): Unit = js.native
  /**
    * Initialize the environment for testing with a compiler factory, a PlatformRef, and an
    * angular module. These are common to every test in the suite.
    *
    * This may only be called once, to set up the common providers for the current test
    * suite on the current platform. If you absolutely need to change the providers,
    * first use `resetTestEnvironment`.
    *
    * Test modules and platforms for individual platforms are available from
    * '@angular/<platform_name>/testing'.
    */
  def initTestEnvironment(ngModule: Type[_], platform: PlatformRef): Unit = js.native
  def initTestEnvironment(ngModule: Type[_], platform: PlatformRef, aotSummaries: js.Function0[js.Array[_]]): Unit = js.native
  
  def inject[T](token: AbstractType[T]): T | Null = js.native
  def inject[T](token: AbstractType[T], notFoundValue: T): T = js.native
  def inject[T](token: AbstractType[T], notFoundValue: T, flags: InjectFlags): T = js.native
  def inject[T](token: AbstractType[T], notFoundValue: js.UndefOr[scala.Nothing], flags: InjectFlags): T = js.native
  def inject[T](token: AbstractType[T], notFoundValue: Null, flags: InjectFlags): T | Null = js.native
  def inject[T](token: InjectionToken[T]): T | Null = js.native
  def inject[T](token: InjectionToken[T], notFoundValue: T): T = js.native
  def inject[T](token: InjectionToken[T], notFoundValue: T, flags: InjectFlags): T = js.native
  def inject[T](token: InjectionToken[T], notFoundValue: js.UndefOr[scala.Nothing], flags: InjectFlags): T = js.native
  def inject[T](token: InjectionToken[T], notFoundValue: Null, flags: InjectFlags): T | Null = js.native
  def inject[T](token: Type[T]): T | Null = js.native
  def inject[T](token: Type[T], notFoundValue: T): T = js.native
  def inject[T](token: Type[T], notFoundValue: T, flags: InjectFlags): T = js.native
  def inject[T](token: Type[T], notFoundValue: js.UndefOr[scala.Nothing], flags: InjectFlags): T = js.native
  def inject[T](token: Type[T], notFoundValue: Null, flags: InjectFlags): T | Null = js.native
  @JSName("inject")
  def inject_T_T[T](token: AbstractType[T]): T = js.native
  @JSName("inject")
  def inject_T_T[T](token: InjectionToken[T]): T = js.native
  @JSName("inject")
  def inject_T_T[T](token: Type[T]): T = js.native
  
  var ngModule: Type[_] | js.Array[Type[_]] = js.native
  
  def overrideComponent(component: Type[_], `override`: MetadataOverride[Component]): Unit = js.native
  
  def overrideDirective(directive: Type[_], `override`: MetadataOverride[Directive]): Unit = js.native
  
  def overrideModule(ngModule: Type[_], `override`: MetadataOverride[NgModule]): Unit = js.native
  
  def overridePipe(pipe: Type[_], `override`: MetadataOverride[Pipe]): Unit = js.native
  
  /**
    * Overwrites all providers for the given token with the given provider definition.
    */
  def overrideProvider(token: js.Any, provider: Deps): Unit = js.native
  def overrideProvider(token: js.Any, provider: UseFactory): Unit = js.native
  def overrideProvider(token: js.Any, provider: UseValue): Unit = js.native
  
  def overrideTemplateUsingTestingModule(component: Type[_], template: String): Unit = js.native
  
  var platform: PlatformRef = js.native
  
  /**
    * Reset the providers for the test injector.
    */
  def resetTestEnvironment(): Unit = js.native
  
  def resetTestingModule(): Unit = js.native
}
@JSImport("@angular/core/testing/testing", "TestBed")
@js.native
object TestBed extends TopLevel[TestBedStatic]
