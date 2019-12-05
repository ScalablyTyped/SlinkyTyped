package typingsSlinky.reactDashResolver

import org.scalajs.dom.raw.Node
import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.Factory
import typingsSlinky.reactDashResolver.reactDashResolverMod.ResolveFn
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-resolver", JSImport.Namespace)
@js.native
object reactDashResolverMod extends js.Object {
  @js.native
  trait Resolver extends js.Object {
    def render(factory: Factory[_]): Unit = js.native
    def render(factory: Factory[_], root: Node): Unit = js.native
    def resolve[P](factory: Factory[P]): js.Promise[Anon_Data[P]] = js.native
  }
  
  val Resolver: typingsSlinky.reactDashResolver.reactDashResolverMod.Resolver = js.native
  def client(loadingComponent: ReactComponentClass[_]): js.Function1[/* component */ ReactComponentClass[_], ReactComponentClass[_]] = js.native
  def context[K /* <: String */](prop: K): js.Function1[
    /* component */ ReactComponentClass[_], 
    ReactComponentClass[js.Any with (Record[K, _])]
  ] = js.native
  def resolve[OwnProps, ResolvableProps, MoreProps](
    resolversMap: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof ResolvableProps ]: react-resolver.react-resolver.ResolveFn<OwnProps & MoreProps, ResolvableProps[K]>}
    */ typingsSlinky.reactDashResolver.reactDashResolverStrings.resolve with ResolvableProps
  ): js.Function1[
    /* component */ ReactComponentClass[
      OwnProps with typingsSlinky.reactDashResolver.reactDashResolverStrings.resolve with ResolvableProps
    ], 
    ReactComponentClass[OwnProps with MoreProps]
  ] = js.native
  def resolve[OwnProps, K /* <: String */, V, MoreProps](prop: K, resolveFn: ResolveFn[OwnProps with MoreProps, V]): js.Function1[
    /* component */ ReactComponentClass[
      OwnProps with typingsSlinky.reactDashResolver.reactDashResolverStrings.resolve with js.Any
    ], 
    ReactComponentClass[OwnProps with MoreProps]
  ] = js.native
  type ResolveFn[Props, V] = js.Function1[/* props */ Props, js.Promise[V]]
}

