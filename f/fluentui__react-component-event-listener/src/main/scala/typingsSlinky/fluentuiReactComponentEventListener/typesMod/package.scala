package typingsSlinky.fluentuiReactComponentEventListener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type EventHandler[T /* <: typingsSlinky.fluentuiReactComponentEventListener.typesMod.EventTypes */] = js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: std.DocumentEventMap[T] */ /* e */ js.Any, 
    scala.Unit
  ]
  
  type Target = org.scalajs.dom.raw.Node | org.scalajs.dom.raw.Window
  
  type TargetRef = slinky.core.facade.ReactRef[typingsSlinky.fluentuiReactComponentEventListener.typesMod.Target]
}
