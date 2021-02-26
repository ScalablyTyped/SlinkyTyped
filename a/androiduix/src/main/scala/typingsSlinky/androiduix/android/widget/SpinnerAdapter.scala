package typingsSlinky.androiduix.android.widget

import typingsSlinky.androiduix.android.database.DataSetObserver
import typingsSlinky.androiduix.android.view.View
import typingsSlinky.androiduix.android.view.ViewGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpinnerAdapter extends Adapter {
  
  def getDropDownView(position: Double, convertView: View, parent: ViewGroup): View = js.native
}
object SpinnerAdapter {
  
  @scala.inline
  def apply(
    getCount: () => Double,
    getDropDownView: (Double, View, ViewGroup) => View,
    getItem: Double => js.Any,
    getItemId: Double => Double,
    getItemViewType: Double => Double,
    getView: (Double, View, ViewGroup) => View,
    getViewTypeCount: () => Double,
    hasStableIds: () => Boolean,
    isEmpty: () => Boolean,
    registerDataSetObserver: DataSetObserver => Unit,
    unregisterDataSetObserver: DataSetObserver => Unit
  ): SpinnerAdapter = {
    val __obj = js.Dynamic.literal(getCount = js.Any.fromFunction0(getCount), getDropDownView = js.Any.fromFunction3(getDropDownView), getItem = js.Any.fromFunction1(getItem), getItemId = js.Any.fromFunction1(getItemId), getItemViewType = js.Any.fromFunction1(getItemViewType), getView = js.Any.fromFunction3(getView), getViewTypeCount = js.Any.fromFunction0(getViewTypeCount), hasStableIds = js.Any.fromFunction0(hasStableIds), isEmpty = js.Any.fromFunction0(isEmpty), registerDataSetObserver = js.Any.fromFunction1(registerDataSetObserver), unregisterDataSetObserver = js.Any.fromFunction1(unregisterDataSetObserver))
    __obj.asInstanceOf[SpinnerAdapter]
  }
  
  @scala.inline
  implicit class SpinnerAdapterMutableBuilder[Self <: SpinnerAdapter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDropDownView(value: (Double, View, ViewGroup) => View): Self = StObject.set(x, "getDropDownView", js.Any.fromFunction3(value))
  }
}
