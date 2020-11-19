package typingsSlinky.frctlFractal.mod.fractal.core

import typingsSlinky.frctlFractal.frctlFractalBooleans.`true`
import typingsSlinky.frctlFractal.mod.fractal.core.entities.EntitySource
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@frctl/fractal", "fractal.core.mixins")
@js.native
object mixins extends js.Object {
  
  @js.native
  trait Collection[T] extends js.Object {
    
    def collections(): this.type = js.native
    
    def each(fn: js.Function1[/* item */ T, Unit]): this.type = js.native
    
    def eq(pos: Double): js.UndefOr[T] = js.native
    
    def filter(handle: String): js.Array[T] = js.native
    def filter[TKey /* <: /* keyof T */ String */](
      name: TKey,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
    ): js.Array[T] = js.native
    
    def filterItems(items: js.Array[T], handle: String): js.Array[T] = js.native
    def filterItems[TKey /* <: /* keyof T */ String */](
      items: js.Array[T],
      name: TKey,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
    ): js.Array[T] = js.native
    
    def find(handle: String): T = js.native
    def find[TKey /* <: /* keyof T */ String */](
      name: TKey,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
    ): T = js.native
    
    def findCollection(handle: String): Collection[T] = js.native
    def findCollection[TKey /* <: /* keyof T */ String */](
      name: TKey,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
    ): Collection[T] = js.native
    
    def first(): js.UndefOr[T] = js.native
    
    def flatten(): this.type = js.native
    
    def flattenDeep(): this.type = js.native
    
    def flattenItems(items: js.Array[T]): js.Array[T] = js.native
    def flattenItems(items: js.Array[T], deep: Boolean): js.Array[T] = js.native
    
    def forEach(fn: js.Function1[/* item */ T, Unit]): this.type = js.native
    
    val isAsset: js.UndefOr[scala.Nothing] = js.native
    
    val isCollection: `true` = js.native
    
    val isComponent: js.UndefOr[scala.Nothing] = js.native
    
    val isDoc: js.UndefOr[scala.Nothing] = js.native
    
    val isFile: js.UndefOr[scala.Nothing] = js.native
    
    val isVariant: js.UndefOr[scala.Nothing] = js.native
    
    val items: js.Array[T] = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[T]] = js.native
    
    def last(): js.UndefOr[T] = js.native
    
    def map(fn: js.Function1[/* item */ T, T]): this.type = js.native
    
    def newSelf(items: js.Array[T]): this.type = js.native
    
    def orderBy(): this.type = js.native
    
    def pushItem(item: T): this.type = js.native
    
    def removeItem(item: T): this.type = js.native
    
    def setItems(items: js.Array[T]): this.type = js.native
    
    val size: Double = js.native
    
    def squash(): this.type = js.native
    
    def squashItems(items: js.Array[T]): js.Array[T] = js.native
    
    def toArray(): js.Array[T] = js.native
    
    def toJSON(): js.Object = js.native
    
    def toStream(): Readable = js.native
  }
  
  @js.native
  abstract class Configurable[T] () extends js.Object {
    
    def config(): T = js.native
    def config(config: T): this.type = js.native
    
    def get[K /* <: /* keyof T */ String */, V](path: K): js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any) | V | Null
      ] = js.native
    def get[K /* <: /* keyof T */ String */, V](path: K, defaultValue: V): js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any) | V | Null
      ] = js.native
    
    def set[K /* <: /* keyof T */ String */](path: K): this.type = js.native
    def set[K /* <: /* keyof T */ String */](
      path: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): this.type = js.native
  }
  
  /**
    * Combined EventEmitter and Configurable mixins
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.frctlFractal.mod.fractal.core.mixins.Configurable because Inheritance from two classes. Inlined config, config, set, set, get, get */ @js.native
  abstract class ConfigurableEmitter[T] () extends EventEmitter {
    
    def config(): T = js.native
    def config(config: T): this.type = js.native
    
    def get[K /* <: /* keyof T */ String */, V](path: K): js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any) | V | Null
      ] = js.native
    def get[K /* <: /* keyof T */ String */, V](path: K, defaultValue: V): js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any) | V | Null
      ] = js.native
    
    def set[K /* <: /* keyof T */ String */](path: K): this.type = js.native
    def set[K /* <: /* keyof T */ String */](
      path: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): this.type = js.native
  }
  
  @js.native
  abstract class Entity () extends js.Object {
    
    val alias: String | Null = js.native
    
    var config: js.Any = js.native
    
    var handle: String = js.native
    
    var id: String = js.native
    
    def initEntity(name: String, config: js.Any, parent: Entity): Unit = js.native
    
    val isHidden: Boolean = js.native
    
    var label: String = js.native
    
    var name: String = js.native
    
    var order: Double = js.native
    
    val parent: Entity = js.native
    
    val source: EntitySource[typingsSlinky.frctlFractal.mod.fractal.core.entities.Entity, _] = js.native
    
    var title: String = js.native
    
    def toJSON(): js.Object = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.frctlFractal.mod.fractal.core.mixins.Configurable because Inheritance from two classes. Inlined config, config, set, set, get, get */ @js.native
  trait Source[T, TConfig]
    extends EventEmitter
       with Collection[T] {
    
    def config(): TConfig = js.native
    def config(config: TConfig): this.type = js.native
    
    def exists(): Boolean = js.native
    
    val fullPath: String | Null = js.native
    
    def get[K /* <: /* keyof T */ String */, V](path: K): js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any) | V | Null
      ] = js.native
    def get[K /* <: /* keyof T */ String */, V](path: K, defaultValue: V): js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any) | V | Null
      ] = js.native
    
    def isConfig(file: String): Boolean = js.native
    
    val isWatching: Boolean = js.native
    
    val label: String = js.native
    
    def load(): js.Promise[this.type] = js.native
    def load(force: Boolean): js.Promise[this.type] = js.native
    
    def refresh(): js.Promise[this.type] = js.native
    
    val relPath: String = js.native
    
    def set[K /* <: /* keyof T */ String */](path: K): this.type = js.native
    def set[K /* <: /* keyof T */ String */](
      path: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): this.type = js.native
    
    val source: this.type = js.native
    
    val title: String = js.native
    
    def unwatch(): Unit = js.native
    
    def watch(): Unit = js.native
  }
}
