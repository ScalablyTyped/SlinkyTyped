package typingsSlinky.frctlFractal.mod.fractal.api

import typingsSlinky.frctlFractal.frctlFractalBooleans.`true`
import typingsSlinky.frctlFractal.mod.fractal.core.entities.Entity
import typingsSlinky.frctlFractal.mod.fractal.core.entities.EntityCollection
import typingsSlinky.frctlFractal.mod.fractal.core.mixins.Source
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.std.IterableIterator
import typingsSlinky.vinyl.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@frctl/fractal", "fractal.api.assets")
@js.native
object assets extends js.Object {
  
  @js.native
  class Asset () extends Entity {
    
    val isAsset: `true` = js.native
    
    @JSName("isCollection")
    val isCollection_Asset: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("isComponent")
    val isComponent_Asset: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("isDoc")
    val isDoc_Asset: js.UndefOr[scala.Nothing] = js.native
    
    val isFile: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("isVariant")
    val isVariant_Asset: js.UndefOr[scala.Nothing] = js.native
    
    def toVinyl(): File = js.native
  }
  
  @js.native
  trait AssetCollection extends EntityCollection[Asset] {
    
    def assets(): this.type = js.native
    
    def toVinylArray(): js.Array[File] = js.native
  }
  
  @js.native
  trait AssetSource
    extends Source[File, js.Any] {
    
    def assets(): js.Array[File] = js.native
    
    def gulpify(): Readable = js.native
    
    def toVinylArray(): js.Array[File] = js.native
    
    def toVinylStream(): Readable = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.frctlFractal.mod.fractal.core.mixins.Configurable because Inheritance from two classes. Inlined config, config, set, set, get, get */ @js.native
  trait AssetSourceCollection extends EventEmitter {
    
    def add(name: String, config: js.Any): AssetSource = js.native
    
    def config(): js.Any = js.native
    def config(config: js.Any): this.type = js.native
    
    def find(name: String): js.UndefOr[AssetSource] = js.native
    
    def get[K /* <: /* keyof T */ String */, V](path: K): js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any) | V | Null
      ] = js.native
    def get[K /* <: /* keyof T */ String */, V](path: K, defaultValue: V): js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any) | V | Null
      ] = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[AssetSource]] = js.native
    
    val label: String = js.native
    
    def load(): js.Promise[Unit] = js.native
    
    def remove(name: String): this.type = js.native
    
    def set[K /* <: /* keyof T */ String */](path: K): this.type = js.native
    def set[K /* <: /* keyof T */ String */](
      path: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): this.type = js.native
    
    def sources(): js.Array[AssetSource] = js.native
    
    val title: String = js.native
    
    def toArray(): js.Array[AssetSource] = js.native
    
    def toJSON(): js.Object = js.native
    
    def unwatch(): this.type = js.native
    
    def visible(): js.Array[AssetSource] = js.native
    
    def watch(): this.type = js.native
  }
}
