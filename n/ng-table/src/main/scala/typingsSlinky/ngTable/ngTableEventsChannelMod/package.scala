package typingsSlinky.ngTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ngTableEventsChannelMod {
  type IAfterCreatedListener = js.Function1[
    /* publisher */ typingsSlinky.ngTable.ngTableParamsMod.NgTableParams[js.Any], 
    js.Any
  ]
  type IAfterDataFilteredListener[T] = js.Function2[
    /* publisher */ typingsSlinky.ngTable.ngTableParamsMod.NgTableParams[T], 
    /* newData */ js.Array[typingsSlinky.ngTable.resultsMod.DataResult[T]], 
    js.Any
  ]
  type IAfterDataSortedListener[T] = js.Function2[
    /* publisher */ typingsSlinky.ngTable.ngTableParamsMod.NgTableParams[T], 
    /* newData */ js.Array[typingsSlinky.ngTable.resultsMod.DataResult[T]], 
    js.Any
  ]
  type IAfterReloadDataListener[T] = js.Function3[
    /* publisher */ typingsSlinky.ngTable.ngTableParamsMod.NgTableParams[T], 
    /* newData */ js.Array[typingsSlinky.ngTable.resultsMod.DataResult[T]], 
    /* oldData */ js.Array[typingsSlinky.ngTable.resultsMod.DataResult[T]], 
    js.Any
  ]
  type IDatasetChangedListener[T] = js.Function3[
    /* publisher */ typingsSlinky.ngTable.ngTableParamsMod.NgTableParams[T], 
    /* newDataset */ js.Array[T], 
    /* oldDataset */ js.Array[T], 
    js.Any
  ]
  type IEventSelectorFunc = js.Function1[
    /* publisher */ typingsSlinky.ngTable.ngTableParamsMod.NgTableParams[js.Any], 
    scala.Boolean
  ]
  type IPagesChangedListener = js.Function3[
    /* publisher */ typingsSlinky.ngTable.ngTableParamsMod.NgTableParams[js.Any], 
    /* newPages */ js.Array[typingsSlinky.ngTable.pagingMod.IPageButton], 
    /* oldPages */ js.Array[typingsSlinky.ngTable.pagingMod.IPageButton], 
    js.Any
  ]
  type IUnregistrationFunc = js.Function0[scala.Unit]
}
