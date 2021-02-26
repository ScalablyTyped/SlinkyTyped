package typingsSlinky.nodeMysqlWrapper

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodeMysqlWrapper.anon.Connection
import typingsSlinky.nodeMysqlWrapper.anon.Fetch
import typingsSlinky.nodeMysqlWrapper.anon.Fields
import typingsSlinky.nodeMysqlWrapper.anon.InsertedId
import typingsSlinky.nodeMysqlWrapper.anon.Multi
import typingsSlinky.nodeMysqlWrapper.anon.Reactive
import typingsSlinky.nodeMysqlWrapper.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Mongo {
  
  @js.native
  trait Collection[T] extends StObject {
    
    def _ensureIndex(indexName: String): Unit = js.native
    def _ensureIndex(indexName: String, options: StringDictionary[js.Any]): Unit = js.native
    
    def allow(options: Fetch[T]): Boolean = js.native
    
    def deny(options: Fetch[T]): Boolean = js.native
    
    def find(): Cursor[T] = js.native
    def find(selector: js.UndefOr[scala.Nothing], options: Fields): Cursor[T] = js.native
    def find(selector: js.Any): Cursor[T] = js.native
    def find(selector: js.Any, options: Fields): Cursor[T] = js.native
    
    def findOne(): T = js.native
    def findOne(selector: js.UndefOr[scala.Nothing], options: Reactive): T = js.native
    def findOne(selector: js.Any): T = js.native
    def findOne(selector: js.Any, options: Reactive): T = js.native
    
    def insert(doc: T): String = js.native
    def insert(doc: T, callback: js.Function): String = js.native
    
    def rawCollection(): js.Any = js.native
    
    def rawDatabase(): js.Any = js.native
    
    def remove(selector: js.Any): Unit = js.native
    def remove(selector: js.Any, callback: js.Function): Unit = js.native
    
    def update(selector: js.Any, modifier: js.Any): Double = js.native
    def update(selector: js.Any, modifier: js.Any, options: js.UndefOr[scala.Nothing], callback: js.Function): Double = js.native
    def update(selector: js.Any, modifier: js.Any, options: Multi): Double = js.native
    def update(selector: js.Any, modifier: js.Any, options: Multi, callback: js.Function): Double = js.native
    
    def upsert(selector: js.Any, modifier: js.Any): InsertedId = js.native
    def upsert(selector: js.Any, modifier: js.Any, options: js.UndefOr[scala.Nothing], callback: js.Function): InsertedId = js.native
    def upsert(selector: js.Any, modifier: js.Any, options: `0`): InsertedId = js.native
    def upsert(selector: js.Any, modifier: js.Any, options: `0`, callback: js.Function): InsertedId = js.native
  }
  
  @js.native
  trait CollectionStatic
    extends Instantiable1[/* name */ String, Collection[js.Object]]
       with Instantiable2[/* name */ String, /* options */ Connection, Collection[js.Object]]
  
  @js.native
  trait Cursor[T] extends StObject {
    
    def count(): Double = js.native
    
    def fetch(): js.Array[T] = js.native
    
    def forEach(callback: js.Function3[/* doc */ js.Any, /* index */ Double, /* cursor */ Cursor[_], Unit]): Unit = js.native
    def forEach(
      callback: js.Function3[/* doc */ js.Any, /* index */ Double, /* cursor */ Cursor[_], Unit],
      thisArg: js.Any
    ): Unit = js.native
    
    def map[U](callback: js.Function3[/* doc */ T, /* index */ Double, /* cursor */ Cursor[T], U]): js.Array[U] = js.native
    def map[U](
      callback: js.Function3[/* doc */ T, /* index */ Double, /* cursor */ Cursor[T], U],
      thisArg: js.Any
    ): js.Array[U] = js.native
    
    def observe(callbacks: js.Object): js.Any = js.native
    
    def observeChanges(callbacks: js.Object): js.Any = js.native
  }
  
  @js.native
  trait CursorStatic
    extends Instantiable0[Cursor[js.Object]]
  
  @js.native
  trait ObjectID extends StObject
  
  @js.native
  trait ObjectIDStatic extends Instantiable1[/* hexString */ String, ObjectID]
}
