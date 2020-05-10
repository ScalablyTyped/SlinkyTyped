package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformReflectionCapabilities extends js.Object {
  /**
    * Return a list of annotations declared on the class
    */
  def annotations(`type`: Type[_]): js.Array[_] = js.native
  def factory(`type`: Type[_]): js.Function = js.native
  def getter(name: String): ɵGetterFn = js.native
  def guards(`type`: js.Any): StringDictionary[js.Any] = js.native
  def hasLifecycleHook(`type`: js.Any, lcProperty: String): Boolean = js.native
  def importUri(`type`: Type[_]): String = js.native
  def isReflectionEnabled(): Boolean = js.native
  def method(name: String): ɵMethodFn = js.native
  /**
    * Return a list of annotations/types for constructor parameters
    */
  def parameters(`type`: Type[_]): js.Array[js.Array[_]] = js.native
  /**
    * Return a object literal which describes the annotations on Class fields/properties.
    */
  def propMetadata(typeOrFunc: Type[_]): StringDictionary[js.Array[_]] = js.native
  def resolveEnum(enumIdentifier: js.Any, name: String): js.Any = js.native
  def resolveIdentifier(name: String, moduleUrl: String, members: js.Array[String], runtime: js.Any): js.Any = js.native
  def resourceUri(`type`: Type[_]): String = js.native
  def setter(name: String): ɵSetterFn = js.native
}

object PlatformReflectionCapabilities {
  @scala.inline
  def apply(
    annotations: Type[_] => js.Array[_],
    factory: Type[_] => js.Function,
    getter: String => ɵGetterFn,
    guards: js.Any => StringDictionary[js.Any],
    hasLifecycleHook: (js.Any, String) => Boolean,
    importUri: Type[_] => String,
    isReflectionEnabled: () => Boolean,
    method: String => ɵMethodFn,
    parameters: Type[_] => js.Array[js.Array[_]],
    propMetadata: Type[_] => StringDictionary[js.Array[_]],
    resolveEnum: (js.Any, String) => js.Any,
    resolveIdentifier: (String, String, js.Array[String], js.Any) => js.Any,
    resourceUri: Type[_] => String,
    setter: String => ɵSetterFn
  ): PlatformReflectionCapabilities = {
    val __obj = js.Dynamic.literal(annotations = js.Any.fromFunction1(annotations), factory = js.Any.fromFunction1(factory), getter = js.Any.fromFunction1(getter), guards = js.Any.fromFunction1(guards), hasLifecycleHook = js.Any.fromFunction2(hasLifecycleHook), importUri = js.Any.fromFunction1(importUri), isReflectionEnabled = js.Any.fromFunction0(isReflectionEnabled), method = js.Any.fromFunction1(method), parameters = js.Any.fromFunction1(parameters), propMetadata = js.Any.fromFunction1(propMetadata), resolveEnum = js.Any.fromFunction2(resolveEnum), resolveIdentifier = js.Any.fromFunction4(resolveIdentifier), resourceUri = js.Any.fromFunction1(resourceUri), setter = js.Any.fromFunction1(setter))
    __obj.asInstanceOf[PlatformReflectionCapabilities]
  }
  @scala.inline
  implicit class PlatformReflectionCapabilitiesOps[Self <: PlatformReflectionCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotations(value: Type[_] => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFactory(value: Type[_] => js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetter(value: String => ɵGetterFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGuards(value: js.Any => StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guards")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasLifecycleHook(value: (js.Any, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasLifecycleHook")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withImportUri(value: Type[_] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importUri")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsReflectionEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReflectionEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMethod(value: String => ɵMethodFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParameters(value: Type[_] => js.Array[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPropMetadata(value: Type[_] => StringDictionary[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propMetadata")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResolveEnum(value: (js.Any, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveEnum")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withResolveIdentifier(value: (String, String, js.Array[String], js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveIdentifier")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withResourceUri(value: Type[_] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceUri")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetter(value: String => ɵSetterFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setter")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

