package typingsSlinky.gestalt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AbstractEventHandler[T /* <: (slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, org.scalajs.dom.raw.HTMLElement]) | org.scalajs.dom.raw.Event */, U] = js.Function1[/* arg */ U with typingsSlinky.gestalt.anon.Event[T], scala.Unit]
  
  type ReactForwardRef[T, P] = typingsSlinky.react.mod.ForwardRefExoticComponent[
    typingsSlinky.react.mod.PropsWithoutRef[P] with typingsSlinky.react.mod.RefAttributes[T]
  ]
  
  type SheetNodeOrRenderProp = (js.Function1[
    /* prop */ typingsSlinky.gestalt.anon.OnDismissStart, 
    slinky.core.facade.ReactElement
  ]) | slinky.core.facade.ReactElement
}
