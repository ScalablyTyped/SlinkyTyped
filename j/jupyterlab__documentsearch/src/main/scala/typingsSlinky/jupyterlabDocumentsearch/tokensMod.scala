package typingsSlinky.jupyterlabDocumentsearch

import typingsSlinky.jupyterlabDocumentsearch.interfacesMod.ISearchProvider
import typingsSlinky.jupyterlabDocumentsearch.interfacesMod.ISearchProviderConstructor
import typingsSlinky.luminoCoreutils.mod.Token
import typingsSlinky.luminoDisposable.mod.IDisposable
import typingsSlinky.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokensMod {
  
  @js.native
  trait ISearchProviderRegistry extends StObject {
    
    /**
      * Signal that emits when a new search provider has been registered
      * or removed.
      */
    var changed: ISignal[ISearchProviderRegistry, Unit] = js.native
    
    /**
      * Returns a matching provider for the widget.
      *
      * @param widget - The widget to search over.
      * @returns the search provider, or undefined if none exists.
      */
    def getProviderForWidget(widget: js.Any): js.UndefOr[ISearchProvider[_]] = js.native
    
    /**
      * Add a provider to the registry.
      *
      * @param key - The provider key.
      * @returns A disposable delegate that, when disposed, deregisters the given search provider
      */
    def register(key: String, provider: ISearchProviderConstructor[_]): IDisposable = js.native
  }
  object ISearchProviderRegistry {
    
    @JSImport("@jupyterlab/documentsearch/lib/tokens", "ISearchProviderRegistry")
    @js.native
    val ^ : Token[ISearchProviderRegistry] = js.native
    
    @scala.inline
    implicit class ISearchProviderRegistryMutableBuilder[Self <: ISearchProviderRegistry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChanged(value: ISignal[ISearchProviderRegistry, Unit]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetProviderForWidget(value: js.Any => js.UndefOr[ISearchProvider[_]]): Self = StObject.set(x, "getProviderForWidget", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegister(value: (String, ISearchProviderConstructor[_]) => IDisposable): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
    }
  }
}
