package typingsSlinky.reactWindow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GridItemKeySelector = js.Function1[
    /* params */ typingsSlinky.reactWindow.anon.ColumnIndex, 
    typingsSlinky.react.mod.Key
  ]
  
  type ListItemKeySelector = js.Function2[/* index */ scala.Double, /* data */ js.Any, typingsSlinky.react.mod.Key]
  
  type ReactElementType = slinky.core.ReactComponentClass[js.Any] | java.lang.String
  
  @scala.inline
  def areEqual(prevProps: js.Object, nextProps: js.Object): scala.Boolean = (typingsSlinky.reactWindow.mod.^.asInstanceOf[js.Dynamic].applyDynamic("areEqual")(prevProps.asInstanceOf[js.Any], nextProps.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def shouldComponentUpdate[P, S](nextProps: P, nextState: S): scala.Boolean = (typingsSlinky.reactWindow.mod.^.asInstanceOf[js.Dynamic].applyDynamic("shouldComponentUpdate")(nextProps.asInstanceOf[js.Any], nextState.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
}
