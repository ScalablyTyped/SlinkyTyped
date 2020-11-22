package typingsSlinky.blueprintjsCore

import typingsSlinky.blueprintjsCore.anon.Children
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/common/abstractPureComponent", JSImport.Namespace)
@js.native
object abstractPureComponentMod extends js.Object {
  
  @js.native
  abstract class AbstractPureComponent[P, S] protected ()
    extends Component[P, S, js.Any] {
    def this(props: P) = this()
    def this(props: P, context: js.Any) = this()
    
    /**
      * Clear all known timeouts.
      */
    def clearTimeouts(): Unit = js.native
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MAbstractPureComponent(nextProps: P with Children): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MAbstractPureComponent(): Unit = js.native
    
    /**
      * Set a timeout and remember its ID.
      * All stored timeouts will be cleared when component unmounts.
      * @returns a "cancel" function that will clear timeout when invoked.
      */
    def setTimeout(callback: js.Function0[Unit]): js.Function0[Unit] = js.native
    def setTimeout(callback: js.Function0[Unit], timeout: Double): js.Function0[Unit] = js.native
    
    var timeoutIds: js.Any = js.native
    
    /**
      * Ensures that the props specified for a component are valid.
      * Implementations should check that props are valid and usually throw an Error if they are not.
      * Implementations should not duplicate checks that the type system already guarantees.
      *
      * This method should be used instead of React's
      * [propTypes](https://facebook.github.io/react/docs/reusable-components.html#prop-validation) feature.
      * Like propTypes, these runtime checks run only in development mode.
      */
    /* protected */ def validateProps(_props: P with Children): Unit = js.native
  }
}
