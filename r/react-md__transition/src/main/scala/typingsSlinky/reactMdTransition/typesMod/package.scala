package typingsSlinky.reactMdTransition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type EnterHandler[E /* <: org.scalajs.dom.raw.HTMLElement */] = js.Function2[/* node */ E, /* isAppearing */ scala.Boolean, scala.Unit]
  
  type ExitHandler[E /* <: org.scalajs.dom.raw.HTMLElement */] = js.Function1[/* node */ E, scala.Unit]
  
  type TransitionTimeout = /* import warning: importer.ImportType#apply Failed type conversion: std.Required<react-transition-group.react-transition-group/Transition.TransitionProps<undefined>>['timeout'] */ js.Any
}
