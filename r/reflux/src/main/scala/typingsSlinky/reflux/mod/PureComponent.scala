package typingsSlinky.reflux.mod

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("reflux", "PureComponent")
@js.native
class PureComponent[TOfStore /* <: Instantiable0[Store] */, P, S, SS] ()
  extends typingsSlinky.react.mod.Component[P, S, SS] {
  
  def mapStoreToState(storeType: TOfStore, mappingFunc: js.Function1[/* newState */ js.Any, _]): Unit = js.native
  
  var store: TOfStore = js.native
  
  var storeKeys: js.Array[String] = js.native
  
  var stores: js.Array[TOfStore] = js.native
}
