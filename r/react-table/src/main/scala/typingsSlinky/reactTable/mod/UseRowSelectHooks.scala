package typingsSlinky.reactTable.mod

import typingsSlinky.reactTable.anon.PartialTableToggleAllRows
import typingsSlinky.reactTable.anon.PartialTableToggleRowsSel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseRowSelectHooks[D /* <: js.Object */] extends StObject {
  
  var getToggleAllPageRowsSelectedProps: js.Array[
    PropGetter[D, TableToggleAllRowsSelectedProps, scala.Nothing, PartialTableToggleAllRows]
  ] = js.native
  
  var getToggleAllRowsSelectedProps: js.Array[
    PropGetter[D, TableToggleAllRowsSelectedProps, scala.Nothing, PartialTableToggleAllRows]
  ] = js.native
  
  var getToggleRowSelectedProps: js.Array[
    PropGetter[D, TableToggleRowsSelectedProps, scala.Nothing, PartialTableToggleRowsSel]
  ] = js.native
}
object UseRowSelectHooks {
  
  @scala.inline
  def apply[D /* <: js.Object */](
    getToggleAllPageRowsSelectedProps: js.Array[
      PropGetter[D, TableToggleAllRowsSelectedProps, scala.Nothing, PartialTableToggleAllRows]
    ],
    getToggleAllRowsSelectedProps: js.Array[
      PropGetter[D, TableToggleAllRowsSelectedProps, scala.Nothing, PartialTableToggleAllRows]
    ],
    getToggleRowSelectedProps: js.Array[
      PropGetter[D, TableToggleRowsSelectedProps, scala.Nothing, PartialTableToggleRowsSel]
    ]
  ): UseRowSelectHooks[D] = {
    val __obj = js.Dynamic.literal(getToggleAllPageRowsSelectedProps = getToggleAllPageRowsSelectedProps.asInstanceOf[js.Any], getToggleAllRowsSelectedProps = getToggleAllRowsSelectedProps.asInstanceOf[js.Any], getToggleRowSelectedProps = getToggleRowSelectedProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseRowSelectHooks[D]]
  }
  
  @scala.inline
  implicit class UseRowSelectHooksMutableBuilder[Self <: UseRowSelectHooks[_], D /* <: js.Object */] (val x: Self with UseRowSelectHooks[D]) extends AnyVal {
    
    @scala.inline
    def setGetToggleAllPageRowsSelectedProps(
      value: js.Array[
          PropGetter[D, TableToggleAllRowsSelectedProps, scala.Nothing, PartialTableToggleAllRows]
        ]
    ): Self = StObject.set(x, "getToggleAllPageRowsSelectedProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetToggleAllPageRowsSelectedPropsVarargs(value: (PropGetter[D, TableToggleAllRowsSelectedProps, scala.Nothing, PartialTableToggleAllRows])*): Self = StObject.set(x, "getToggleAllPageRowsSelectedProps", js.Array(value :_*))
    
    @scala.inline
    def setGetToggleAllRowsSelectedProps(
      value: js.Array[
          PropGetter[D, TableToggleAllRowsSelectedProps, scala.Nothing, PartialTableToggleAllRows]
        ]
    ): Self = StObject.set(x, "getToggleAllRowsSelectedProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetToggleAllRowsSelectedPropsVarargs(value: (PropGetter[D, TableToggleAllRowsSelectedProps, scala.Nothing, PartialTableToggleAllRows])*): Self = StObject.set(x, "getToggleAllRowsSelectedProps", js.Array(value :_*))
    
    @scala.inline
    def setGetToggleRowSelectedProps(
      value: js.Array[
          PropGetter[D, TableToggleRowsSelectedProps, scala.Nothing, PartialTableToggleRowsSel]
        ]
    ): Self = StObject.set(x, "getToggleRowSelectedProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetToggleRowSelectedPropsVarargs(value: (PropGetter[D, TableToggleRowsSelectedProps, scala.Nothing, PartialTableToggleRowsSel])*): Self = StObject.set(x, "getToggleRowSelectedProps", js.Array(value :_*))
  }
}
