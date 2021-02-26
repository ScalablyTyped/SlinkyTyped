package typingsSlinky.aureliaDependencyInjection

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.aureliaDependencyInjection.mod.Args
import typingsSlinky.aureliaDependencyInjection.mod.Container
import typingsSlinky.aureliaDependencyInjection.mod.ContainerConfiguration
import typingsSlinky.aureliaDependencyInjection.mod.Impl
import typingsSlinky.aureliaDependencyInjection.mod.PrimitiveOrDependencyCtor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0`[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] extends StObject {
    
    def get(container: Container, key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): TImpl = js.native
  }
  object `0` {
    
    @scala.inline
    def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](get: (Container, PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) => TImpl): `0`[TBase, TImpl, TArgs] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
      __obj.asInstanceOf[`0`[TBase, TImpl, TArgs]]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`[_, _, _], TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] (val x: Self with (`0`[TBase, TImpl, TArgs])) extends AnyVal {
      
      @scala.inline
      def setGet(value: (Container, PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) => TImpl): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait `1` extends StObject {
    
    var inject: js.UndefOr[js.Any] = js.native
  }
  object `1` {
    
    @scala.inline
    def apply(): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInject(value: js.Any): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
    }
  }
  
  @js.native
  trait Decorates extends StObject {
    
    var decorates: js.UndefOr[
        js.Function1[/* key */ js.Any, /* is aurelia-dependency-injection.anon.Get */ Boolean]
      ] = js.native
  }
  object Decorates {
    
    @scala.inline
    def apply(): Decorates = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Decorates]
    }
    
    @scala.inline
    implicit class DecoratesMutableBuilder[Self <: Decorates] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecorates(value: /* key */ js.Any => /* is aurelia-dependency-injection.anon.Get */ Boolean): Self = StObject.set(x, "decorates", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDecoratesUndefined: Self = StObject.set(x, "decorates", js.undefined)
    }
  }
  
  @js.native
  trait Get extends StObject {
    
    def get(container: Container, key: js.Any): js.Any = js.native
  }
  object Get {
    
    @scala.inline
    def apply(get: (Container, js.Any) => js.Any): Get = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
      __obj.asInstanceOf[Get]
    }
    
    @scala.inline
    implicit class GetMutableBuilder[Self <: Get] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: (Container, js.Any) => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Inject[TArgs /* <: Args[TBase] */, TBase] extends StObject {
    
    var inject: js.UndefOr[
        js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
        ]
      ] = js.native
  }
  object Inject {
    
    @scala.inline
    def apply[TArgs /* <: Args[TBase] */, TBase](): Inject[TArgs, TBase] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Inject[TArgs, TBase]]
    }
    
    @scala.inline
    implicit class InjectMutableBuilder[Self <: Inject[_, _], TArgs /* <: Args[TBase] */, TBase] (val x: Self with (Inject[TArgs, TBase])) extends AnyVal {
      
      @scala.inline
      def setInject(
        value: js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
            ]
      ): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      @scala.inline
      def setInjectVarargs(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any)*
      ): Self = StObject.set(x, "inject", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TypeofContainer
    extends Instantiable0[Container]
       with Instantiable1[/* configuration */ ContainerConfiguration, Container] {
    
    var instance: Container = js.native
  }
}
