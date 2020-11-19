package typingsSlinky.mithrilGlobal.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.mithril.anon.Fn0
import typingsSlinky.mithril.anon.FnCallElementComponent
import typingsSlinky.mithril.anon.FnCallUrlOptions
import typingsSlinky.mithril.anon.JsonpOptionsurlstring
import typingsSlinky.mithril.anon.Key
import typingsSlinky.mithril.anon.Lifecycleanyanykeystringa
import typingsSlinky.mithril.anon.Url
import typingsSlinky.mithril.mod.Params
import typingsSlinky.mithril.mod.Redraw
import typingsSlinky.mithrilGlobal.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mithril.mithril.Static & {  stream :{None <T>(value : T): mithril.mithril/stream.Stream<T>, None <T>(): mithril.mithril/stream.Stream<T>, readonly merge <S extends std.Array<any>>(streams : {[ I in keyof S ]: mithril.mithril/stream.Stream<S[I]>}): mithril.mithril/stream.Stream<{[ I in keyof S ]: S[I]}>, readonly lift <S extends std.Array<any>, T>(fn : (values : S): T, streams : {[ I in keyof S ]: mithril.mithril/stream.Stream<S[I]>}): mithril.mithril/stream.Stream<T>, readonly combine <T>(combiner : (streams : ...any): T, streams : std.Array<mithril.mithril/stream.Stream<any>>): mithril.mithril/stream.Stream<T>,  readonly SKIP :symbol, readonly scan <T, U>(fn : (acc : U, value : T): U, acc : U, stream : mithril.mithril/stream.Stream<T>): mithril.mithril/stream.Stream<U>, readonly scanMerge <T, U>(pairs : std.Array<[mithril.mithril/stream.Stream<T>, (acc : U, value : T): U]>, acc : U): mithril.mithril/stream.Stream<U>, readonly scanMerge <U>(pairs : std.Array<[mithril.mithril/stream.Stream<any>, (acc : U, value : any): U]>, acc : U): mithril.mithril/stream.Stream<U>}} */
@js.native
trait Static extends js.Object {
  
  /** Creates a virtual element (Vnode). */
  def apply(
    selector: String,
    attributes: typingsSlinky.mithril.mod.Attributes,
    children: typingsSlinky.mithril.mod.Children*
  ): typingsSlinky.mithril.mod.Vnode[_, _] = js.native
  /** Creates a virtual element (Vnode). */
  def apply(selector: String, children: typingsSlinky.mithril.mod.Children*): typingsSlinky.mithril.mod.Vnode[_, _] = js.native
  /** Creates a virtual element (Vnode). */
  def apply[Attrs, State](
    component: typingsSlinky.mithril.mod.ComponentTypes[Attrs, State],
    args: typingsSlinky.mithril.mod.Children*
  ): typingsSlinky.mithril.mod.Vnode[Attrs, State] = js.native
  /** Creates a virtual element (Vnode). */
  def apply[Attrs, State](
    component: typingsSlinky.mithril.mod.ComponentTypes[Attrs, State],
    attributes: Attrs with (typingsSlinky.mithril.mod.Lifecycle[Attrs, State]) with Key,
    args: typingsSlinky.mithril.mod.Children*
  ): typingsSlinky.mithril.mod.Vnode[Attrs, State] = js.native
  
  /** Build path name */
  def buildPathname(template: String): String = js.native
  def buildPathname(template: String, params: Params): String = js.native
  
  /** Turns the key/value pairs of an object into a string of the form: a=1&b=2 */
  def buildQueryString(values: Params): String = js.native
  
  /** Creates a fragment virtual element (Vnode). */
  def fragment(attrs: Lifecycleanyanykeystringa, children: typingsSlinky.mithril.mod.ChildArrayOrPrimitive): typingsSlinky.mithril.mod.Vnode[_, _] = js.native
  
  def jsonp[T](options: JsonpOptionsurlstring): js.Promise[T] = js.native
  def jsonp[T](url: String): js.Promise[T] = js.native
  def jsonp[T](url: String, options: typingsSlinky.mithril.mod.JsonpOptions): js.Promise[T] = js.native
  @JSName("jsonp")
  var jsonp_Original: Fn0 = js.native
  
  def mount(element: Element, component: Null): Unit = js.native
  def mount(element: Element, component: typingsSlinky.mithril.mod.ComponentTypes[_, _]): Unit = js.native
  @JSName("mount")
  var mount_Original: FnCallElementComponent = js.native
  
  /** Parse path name */
  def parsePathname(url: String): typingsSlinky.mithril.anon.Params = js.native
  
  /** Returns an object with key/value pairs parsed from a string of the form: ?a=1&b=2 */
  def parseQueryString(queryString: String): Params = js.native
  
  /** Manually triggers an asynchronous redraw of mounted components. */
  def redraw(): Unit = js.native
  @JSName("redraw")
  var redraw_Original: Redraw = js.native
  
  def render(el: Element, vnodes: typingsSlinky.mithril.mod.Children): Unit = js.native
  @JSName("render")
  var render_Original: js.Function2[/* el */ Element, /* vnodes */ typingsSlinky.mithril.mod.Children, Unit] = js.native
  
  def request[T](options: typingsSlinky.mithril.mod.RequestOptions[T] with Url): js.Promise[T] = js.native
  def request[T](url: String): js.Promise[T] = js.native
  def request[T](url: String, options: typingsSlinky.mithril.mod.RequestOptions[T]): js.Promise[T] = js.native
  @JSName("request")
  var request_Original: FnCallUrlOptions = js.native
  
  /** Creates application routes and mounts Components and/or RouteResolvers to a DOM element. */
  def route(element: Element, defaultRoute: String, routes: typingsSlinky.mithril.mod.RouteDefs): Unit = js.native
  @JSName("route")
  var route_Original: typingsSlinky.mithril.mod.Route = js.native
  
  def stream[T](): typingsSlinky.mithril.streamMod.Stream[T] = js.native
  def stream[T](value: T): typingsSlinky.mithril.streamMod.Stream[T] = js.native
  @JSName("stream")
  var stream_Original: Call = js.native
  
  /** Turns an HTML string into a virtual element (Vnode). Do not use trust on unsanitized user input. */
  def trust(html: String): typingsSlinky.mithril.mod.Vnode[_, _] = js.native
}
