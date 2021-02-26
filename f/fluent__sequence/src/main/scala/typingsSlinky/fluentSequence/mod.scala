package typingsSlinky.fluentSequence

import typingsSlinky.fluentBundle.mod.FluentBundle
import typingsSlinky.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fluent/sequence", "mapBundleAsync")
  @js.native
  val mapBundleAsync: MapBundleAsync_ = js.native
  
  @JSImport("@fluent/sequence", "mapBundleSync")
  @js.native
  val mapBundleSync: MapBundleSync_ = js.native
  
  @js.native
  trait MapBundleAsync_ extends StObject {
    
    def apply(bundles: AsyncIterable[FluentBundle], id: String): js.Promise[FluentBundle | Null] = js.native
    def apply(bundles: AsyncIterable[FluentBundle], id: js.Array[String]): js.Promise[js.Array[FluentBundle | Null]] = js.native
  }
  
  @js.native
  trait MapBundleSync_ extends StObject {
    
    def apply(bundles: js.Iterable[FluentBundle], id: String): FluentBundle | Null = js.native
    def apply(bundles: js.Iterable[FluentBundle], id: js.Array[String]): js.Array[FluentBundle | Null] = js.native
  }
}
