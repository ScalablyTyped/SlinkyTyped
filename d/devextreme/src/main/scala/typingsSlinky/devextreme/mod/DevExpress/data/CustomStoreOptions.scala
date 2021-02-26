package typingsSlinky.devextreme.mod.DevExpress.data

import typingsSlinky.devextreme.anon.Filter
import typingsSlinky.devextreme.devextremeStrings.processed
import typingsSlinky.devextreme.devextremeStrings.raw
import typingsSlinky.devextreme.mod.global.JQueryPromise
import typingsSlinky.devextreme.mod.global.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomStoreOptions extends StoreOptions[CustomStore] {
  
  /**
    * [descr:CustomStore.Options.byKey]
    */
  var byKey: js.UndefOr[js.Function1[/* key */ js.Any | String | Double, Promise[_] | JQueryPromise[_]]] = js.native
  
  /**
    * [descr:CustomStore.Options.cacheRawData]
    */
  var cacheRawData: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:CustomStore.Options.insert]
    */
  var insert: js.UndefOr[js.Function1[/* values */ js.Any, Promise[_] | JQueryPromise[_]]] = js.native
  
  /**
    * [descr:CustomStore.Options.load]
    */
  var load: js.UndefOr[
    js.Function1[/* options */ LoadOptions, Promise[_] | JQueryPromise[_] | js.Array[_]]
  ] = js.native
  
  /**
    * [descr:CustomStore.Options.loadMode]
    */
  var loadMode: js.UndefOr[processed | raw] = js.native
  
  /**
    * [descr:CustomStore.Options.remove]
    */
  var remove: js.UndefOr[
    js.Function1[/* key */ js.Any | String | Double, Promise[Unit] | JQueryPromise[Unit]]
  ] = js.native
  
  /**
    * [descr:CustomStore.Options.totalCount]
    */
  var totalCount: js.UndefOr[js.Function1[/* loadOptions */ Filter, Promise[Double] | JQueryPromise[Double]]] = js.native
  
  /**
    * [descr:CustomStore.Options.update]
    */
  var update: js.UndefOr[
    js.Function2[
      /* key */ js.Any | String | Double, 
      /* values */ js.Any, 
      Promise[_] | JQueryPromise[_]
    ]
  ] = js.native
  
  /**
    * [descr:CustomStore.Options.useDefaultSearch]
    */
  var useDefaultSearch: js.UndefOr[Boolean] = js.native
}
object CustomStoreOptions {
  
  @scala.inline
  def apply(): CustomStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomStoreOptions]
  }
  
  @scala.inline
  implicit class CustomStoreOptionsMutableBuilder[Self <: CustomStoreOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByKey(value: /* key */ js.Any | String | Double => Promise[_] | JQueryPromise[_]): Self = StObject.set(x, "byKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setByKeyUndefined: Self = StObject.set(x, "byKey", js.undefined)
    
    @scala.inline
    def setCacheRawData(value: Boolean): Self = StObject.set(x, "cacheRawData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheRawDataUndefined: Self = StObject.set(x, "cacheRawData", js.undefined)
    
    @scala.inline
    def setInsert(value: /* values */ js.Any => Promise[_] | JQueryPromise[_]): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
    
    @scala.inline
    def setLoad(value: /* options */ LoadOptions => Promise[_] | JQueryPromise[_] | js.Array[_]): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadMode(value: processed | raw): Self = StObject.set(x, "loadMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadModeUndefined: Self = StObject.set(x, "loadMode", js.undefined)
    
    @scala.inline
    def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    @scala.inline
    def setRemove(value: /* key */ js.Any | String | Double => Promise[Unit] | JQueryPromise[Unit]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setTotalCount(value: /* loadOptions */ Filter => Promise[Double] | JQueryPromise[Double]): Self = StObject.set(x, "totalCount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
    
    @scala.inline
    def setUpdate(value: (/* key */ js.Any | String | Double, /* values */ js.Any) => Promise[_] | JQueryPromise[_]): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    @scala.inline
    def setUseDefaultSearch(value: Boolean): Self = StObject.set(x, "useDefaultSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDefaultSearchUndefined: Self = StObject.set(x, "useDefaultSearch", js.undefined)
  }
}
