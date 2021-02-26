package typingsSlinky.jfs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jfs.jfsStrings.memory
import typingsSlinky.jfs.jfsStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("jfs", JSImport.Namespace)
  @js.native
  class ^[T /* <: Storable */] () extends Instance[T] {
    def this(name: String) = this()
    def this(name: js.UndefOr[scala.Nothing], opts: Options) = this()
    def this(name: String, opts: Options) = this()
  }
  @JSImport("jfs", JSImport.Namespace)
  @js.native
  val ^ : JsonFileStore = js.native
  
  @js.native
  trait Instance[T] extends StObject {
    
    def all(cb: js.Function2[/* err */ js.UndefOr[js.Error], /* all */ js.UndefOr[T], Unit]): Unit = js.native
    
    def allSync(): T = js.native
    
    def delete[K /* <: /* keyof T */ String */](id: K): Unit = js.native
    def delete[K /* <: /* keyof T */ String */](id: K, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    def deleteSync[K /* <: /* keyof T */ String */](id: K): js.Error | Unit = js.native
    
    def get[K /* <: /* keyof T */ String */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any */](id: K): Unit = js.native
    def get[K /* <: /* keyof T */ String */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any */](id: K, cb: js.Function2[/* err */ js.UndefOr[js.Error], /* o */ js.UndefOr[V], Unit]): Unit = js.native
    
    def getSync[K /* <: /* keyof T */ String */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any */](id: K): V | js.Error = js.native
    
    def save[V /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](o: V): Unit = js.native
    def save[V /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](o: V, cb: js.Function2[/* err */ js.UndefOr[js.Error], /* id */ js.UndefOr[String], Unit]): Unit = js.native
    def save[K /* <: /* keyof T */ String */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any */](id: K, o: V): Unit = js.native
    def save[K /* <: /* keyof T */ String */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any */](id: K, o: V, cb: js.Function2[/* err */ js.UndefOr[js.Error], /* id */ js.UndefOr[K], Unit]): Unit = js.native
    
    def saveSync[V /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](o: V): Unit = js.native
    def saveSync[K /* <: /* keyof T */ String */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any */](id: K, o: V): Unit = js.native
  }
  
  @js.native
  trait JsonFileStore
    extends Instantiable0[Instance[Storable]]
       with Instantiable1[/* name */ String, Instance[Storable]]
       with Instantiable2[js.UndefOr[/* name */ String], /* opts */ Options, Instance[Storable]]
  
  @js.native
  trait Options extends StObject {
    
    var pretty: js.UndefOr[Boolean] = js.native
    
    var saveId: js.UndefOr[Boolean | String] = js.native
    
    var `type`: js.UndefOr[single | memory] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
      
      @scala.inline
      def setSaveId(value: Boolean | String): Self = StObject.set(x, "saveId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveIdUndefined: Self = StObject.set(x, "saveId", js.undefined)
      
      @scala.inline
      def setType(value: single | memory): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type Storable = StringDictionary[js.Any]
  
  type _To = JsonFileStore
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: JsonFileStore = ^
}
