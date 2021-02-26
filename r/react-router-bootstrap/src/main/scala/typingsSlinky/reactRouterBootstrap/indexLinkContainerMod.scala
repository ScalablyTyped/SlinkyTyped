package typingsSlinky.reactRouterBootstrap

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.history.mod.LocationState
import typingsSlinky.react.mod.Component
import typingsSlinky.reactRouterDom.mod.NavLinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexLinkContainerMod extends Shortcut {
  
  @JSImport("react-router-bootstrap/lib/IndexLinkContainer", JSImport.Default)
  @js.native
  val default: ReactComponentClass[NavLinkProps[LocationState]] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-router-bootstrap/lib/IndexLinkContainer", JSImport.Default)
  @js.native
  class defaultCls protected ()
    extends Component[NavLinkProps[LocationState], js.Object, js.Any] {
    def this(props: NavLinkProps[LocationState]) = this()
    def this(props: NavLinkProps[LocationState], context: js.Any) = this()
  }
  
  //IndexLink is removed in react-router, but continues there in react-router-bootstrap for backwards compatibility.
  //Better use <LinkContainer exact/>
  type IndexLinkContainer = ReactComponentClass[NavLinkProps[LocationState]]
  
  type _To = ReactComponentClass[NavLinkProps[LocationState]]
  
  /* This means you don't have to write `default`, but can instead just say `indexLinkContainerMod.foo` */
  override def _to: ReactComponentClass[NavLinkProps[LocationState]] = default
}
