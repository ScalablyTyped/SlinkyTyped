package typingsSlinky.reactResolver

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Node
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Factory
import typingsSlinky.reactResolver.anon.Data
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait Resolver extends StObject {
    
    def render(factory: Factory[_]): Unit = js.native
    def render(factory: Factory[_], root: Node): Unit = js.native
    
    def resolve[P](factory: Factory[P]): js.Promise[Data[P]] = js.native
  }
  @JSImport("react-resolver", "Resolver")
  @js.native
  val Resolver: typingsSlinky.reactResolver.mod.Resolver = js.native
  
  @JSImport("react-resolver", "client")
  @js.native
  def client(loadingComponent: ReactComponentClass[_]): js.Function1[/* component */ ReactComponentClass[_], ReactComponentClass[_]] = js.native
  
  @JSImport("react-resolver", "context")
  @js.native
  def context[K /* <: String */](prop: K): js.Function1[
    /* component */ ReactComponentClass[_], 
    ReactComponentClass[js.Any with (Record[K, _])]
  ] = js.native
  
  @JSImport("react-resolver", "resolve")
  @js.native
  def resolve[OwnProps, ResolvableProps, MoreProps](
    resolversMap: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof ResolvableProps ]: react-resolver.react-resolver.ResolveFn<OwnProps & MoreProps, ResolvableProps[K]>}
    */ typingsSlinky.reactResolver.reactResolverStrings.resolve with TopLevel[ResolvableProps]
  ): js.Function1[
    /* component */ ReactComponentClass[
      OwnProps with typingsSlinky.reactResolver.reactResolverStrings.resolve with TopLevel[ResolvableProps]
    ], 
    ReactComponentClass[OwnProps with MoreProps]
  ] = js.native
  @JSImport("react-resolver", "resolve")
  @js.native
  def resolve[OwnProps, K /* <: String */, V, MoreProps](prop: K, resolveFn: ResolveFn[OwnProps with MoreProps, V]): js.Function1[
    /* component */ ReactComponentClass[
      OwnProps with typingsSlinky.reactResolver.reactResolverStrings.resolve with TopLevel[js.Any]
    ], 
    ReactComponentClass[OwnProps with MoreProps]
  ] = js.native
  
  type ResolveFn[Props, V] = js.Function1[/* props */ Props, js.Promise[V]]
}
