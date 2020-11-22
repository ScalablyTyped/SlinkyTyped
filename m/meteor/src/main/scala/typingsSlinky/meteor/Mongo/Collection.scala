package typingsSlinky.meteor.Mongo

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.meteor.anon.ArrayFilters
import typingsSlinky.meteor.anon.Insert
import typingsSlinky.meteor.anon.InsertedId
import typingsSlinky.meteor.anon.Multi
import typingsSlinky.meteor.meteorStrings.limit
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collection[T, U] extends js.Object {
  
  def _dropIndex(keys: String): Unit = js.native
  def _dropIndex(keys: StringDictionary[Double | String]): Unit = js.native
  
  def _ensureIndex(keys: String): Unit = js.native
  def _ensureIndex(keys: String, options: StringDictionary[js.Any]): Unit = js.native
  def _ensureIndex(keys: StringDictionary[Double | String]): Unit = js.native
  def _ensureIndex(keys: StringDictionary[Double | String], options: StringDictionary[js.Any]): Unit = js.native
  
  def allow[Fn /* <: Transform[T] */](options: Insert[Fn, T, U]): Boolean = js.native
  
  def deny[Fn /* <: Transform[T] */](options: Insert[Fn, T, U]): Boolean = js.native
  
  def find(): Cursor[T, U] = js.native
  def find(selector: String): Cursor[T, U] = js.native
  def find(selector: ObjectID): Cursor[T, U] = js.native
  def find(selector: Selector[T]): Cursor[T, U] = js.native
  def find[O /* <: Options[T] */](selector: js.UndefOr[Selector[T]], options: O): Cursor[
    T, 
    DispatchTransform[
      /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
      T, 
      U
    ]
  ] = js.native
  def find[O /* <: Options[T] */](selector: String, options: O): Cursor[
    T, 
    DispatchTransform[
      /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
      T, 
      U
    ]
  ] = js.native
  def find[O /* <: Options[T] */](selector: ObjectID, options: O): Cursor[
    T, 
    DispatchTransform[
      /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
      T, 
      U
    ]
  ] = js.native
  
  def findOne(): js.UndefOr[U] = js.native
  def findOne(selector: String): js.UndefOr[U] = js.native
  def findOne(selector: ObjectID): js.UndefOr[U] = js.native
  def findOne(selector: Selector[T]): js.UndefOr[U] = js.native
  def findOne[O /* <: Omit[Options[T], limit] */](selector: js.UndefOr[Selector[T]], options: O): js.UndefOr[
    DispatchTransform[
      /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
      T, 
      U
    ]
  ] = js.native
  def findOne[O /* <: Omit[Options[T], limit] */](selector: String, options: O): js.UndefOr[
    DispatchTransform[
      /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
      T, 
      U
    ]
  ] = js.native
  def findOne[O /* <: Omit[Options[T], limit] */](selector: ObjectID, options: O): js.UndefOr[
    DispatchTransform[
      /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
      T, 
      U
    ]
  ] = js.native
  @JSName("findOne")
  def findOne_O_OmitOptionsTlimit[O /* <: Omit[Options[T], limit] */](): js.UndefOr[
    DispatchTransform[
      /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
      T, 
      U
    ]
  ] = js.native
  @JSName("findOne")
  def findOne_O_OmitOptionsTlimit[O /* <: Omit[Options[T], limit] */](selector: String): js.UndefOr[
    DispatchTransform[
      /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
      T, 
      U
    ]
  ] = js.native
  @JSName("findOne")
  def findOne_O_OmitOptionsTlimit[O /* <: Omit[Options[T], limit] */](selector: ObjectID): js.UndefOr[
    DispatchTransform[
      /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
      T, 
      U
    ]
  ] = js.native
  @JSName("findOne")
  def findOne_O_OmitOptionsTlimit[O /* <: Omit[Options[T], limit] */](selector: Selector[T]): js.UndefOr[
    DispatchTransform[
      /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
      T, 
      U
    ]
  ] = js.native
  
  @JSName("find")
  def find_O_OptionsT[O /* <: Options[T] */](): Cursor[
    T, 
    DispatchTransform[
      /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
      T, 
      U
    ]
  ] = js.native
  @JSName("find")
  def find_O_OptionsT[O /* <: Options[T] */](selector: String): Cursor[
    T, 
    DispatchTransform[
      /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
      T, 
      U
    ]
  ] = js.native
  @JSName("find")
  def find_O_OptionsT[O /* <: Options[T] */](selector: ObjectID): Cursor[
    T, 
    DispatchTransform[
      /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
      T, 
      U
    ]
  ] = js.native
  @JSName("find")
  def find_O_OptionsT[O /* <: Options[T] */](selector: Selector[T]): Cursor[
    T, 
    DispatchTransform[
      /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
      T, 
      U
    ]
  ] = js.native
  
  def insert(doc: OptionalId[T]): String = js.native
  def insert(doc: OptionalId[T], callback: js.Function): String = js.native
  
  def rawCollection(): js.Any = js.native
  
  def rawDatabase(): js.Any = js.native
  
  def remove(selector: String): Double = js.native
  def remove(selector: String, callback: js.Function): Double = js.native
  def remove(selector: ObjectID): Double = js.native
  def remove(selector: ObjectID, callback: js.Function): Double = js.native
  def remove(selector: Selector[T]): Double = js.native
  def remove(selector: Selector[T], callback: js.Function): Double = js.native
  
  def update(selector: String, modifier: Modifier[T]): Double = js.native
  def update(selector: String, modifier: Modifier[T], options: js.UndefOr[scala.Nothing], callback: js.Function): Double = js.native
  def update(selector: String, modifier: Modifier[T], options: ArrayFilters): Double = js.native
  def update(selector: String, modifier: Modifier[T], options: ArrayFilters, callback: js.Function): Double = js.native
  def update(selector: ObjectID, modifier: Modifier[T]): Double = js.native
  def update(
    selector: ObjectID,
    modifier: Modifier[T],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function
  ): Double = js.native
  def update(selector: ObjectID, modifier: Modifier[T], options: ArrayFilters): Double = js.native
  def update(selector: ObjectID, modifier: Modifier[T], options: ArrayFilters, callback: js.Function): Double = js.native
  def update(selector: Selector[T], modifier: Modifier[T]): Double = js.native
  def update(
    selector: Selector[T],
    modifier: Modifier[T],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function
  ): Double = js.native
  def update(selector: Selector[T], modifier: Modifier[T], options: ArrayFilters): Double = js.native
  def update(selector: Selector[T], modifier: Modifier[T], options: ArrayFilters, callback: js.Function): Double = js.native
  
  def upsert(selector: String, modifier: Modifier[T]): InsertedId = js.native
  def upsert(selector: String, modifier: Modifier[T], options: js.UndefOr[scala.Nothing], callback: js.Function): InsertedId = js.native
  def upsert(selector: String, modifier: Modifier[T], options: Multi): InsertedId = js.native
  def upsert(selector: String, modifier: Modifier[T], options: Multi, callback: js.Function): InsertedId = js.native
  def upsert(selector: ObjectID, modifier: Modifier[T]): InsertedId = js.native
  def upsert(
    selector: ObjectID,
    modifier: Modifier[T],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function
  ): InsertedId = js.native
  def upsert(selector: ObjectID, modifier: Modifier[T], options: Multi): InsertedId = js.native
  def upsert(selector: ObjectID, modifier: Modifier[T], options: Multi, callback: js.Function): InsertedId = js.native
  def upsert(selector: Selector[T], modifier: Modifier[T]): InsertedId = js.native
  def upsert(
    selector: Selector[T],
    modifier: Modifier[T],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function
  ): InsertedId = js.native
  def upsert(selector: Selector[T], modifier: Modifier[T], options: Multi): InsertedId = js.native
  def upsert(selector: Selector[T], modifier: Modifier[T], options: Multi, callback: js.Function): InsertedId = js.native
}
