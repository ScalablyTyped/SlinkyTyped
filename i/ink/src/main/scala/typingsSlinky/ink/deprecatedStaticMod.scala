package typingsSlinky.ink

import slinky.core.facade.ReactElement
import typingsSlinky.ink.anon.ChildrenRequireable
import typingsSlinky.ink.stylesMod.Styles
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecatedStaticMod {
  
  @JSImport("ink/build/components/DeprecatedStatic", "DeprecatedStatic")
  @js.native
  class DeprecatedStatic protected ()
    extends Component[Styles, State, js.Any] {
    def this(props: Styles) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Styles, context: js.Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MDeprecatedStatic(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDeprecatedStatic(_prevProps: Styles, prevState: State): Unit = js.native
    
    def saveLastIndex(children: ReactElement): Unit = js.native
  }
  /* static members */
  object DeprecatedStatic {
    
    @JSImport("ink/build/components/DeprecatedStatic", "DeprecatedStatic")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ink/build/components/DeprecatedStatic", "DeprecatedStatic.propTypes")
    @js.native
    def propTypes: ChildrenRequireable = js.native
    @scala.inline
    def propTypes_=(x: ChildrenRequireable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait State extends StObject {
    
    var lastIndex: Double | Null = js.native
  }
  object State {
    
    @scala.inline
    def apply(): State = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLastIndex(value: Double): Self = StObject.set(x, "lastIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastIndexNull: Self = StObject.set(x, "lastIndex", null)
    }
  }
}
