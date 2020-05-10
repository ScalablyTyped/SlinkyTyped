package typingsSlinky.jupyterlabDocumentsearch.tokensMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.jupyterlabDocumentsearch.interfacesMod.ISearchProvider
import typingsSlinky.jupyterlabDocumentsearch.interfacesMod.ISearchProviderConstructor
import typingsSlinky.phosphorCoreutils.mod.Token
import typingsSlinky.phosphorDisposable.mod.IDisposable
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchProviderRegistry extends js.Object {
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

@JSImport("@jupyterlab/documentsearch/lib/tokens", "ISearchProviderRegistry")
@js.native
object ISearchProviderRegistry extends TopLevel[Token[ISearchProviderRegistry]]

