package typingsSlinky.angularCore.r3SymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configures the `Injector` to return an instance of `useClass` for a token.
  * @see ["Dependency Injection Guide"](guide/dependency-injection).
  *
  * @usageNotes
  *
  * {@example core/di/ts/provider_spec.ts region='ClassProvider'}
  *
  * Note that following two providers are not equal:
  *
  * {@example core/di/ts/provider_spec.ts region='ClassProviderDifference'}
  *
  * ### Multi-value example
  *
  * {@example core/di/ts/provider_spec.ts region='MultiProviderAspect'}
  *
  * @publicApi
  */
@js.native
trait ClassProvider extends ClassSansProvider {
  
  /**
    * When true, injector returns an array of instances. This is useful to allow multiple
    * providers spread across many files to provide configuration information to a common token.
    */
  var multi: js.UndefOr[Boolean] = js.native
  
  /**
    * An injection token. (Typically an instance of `Type` or `InjectionToken`, but can be `any`).
    */
  var provide: js.Any = js.native
}
object ClassProvider {
  
  @scala.inline
  def apply(provide: js.Any, useClass: Type[_]): ClassProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useClass = useClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassProvider]
  }
  
  @scala.inline
  implicit class ClassProviderOps[Self <: ClassProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProvide(value: js.Any): Self = this.set("provide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMulti(value: Boolean): Self = this.set("multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMulti: Self = this.set("multi", js.undefined)
  }
}
