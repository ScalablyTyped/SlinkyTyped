package typingsSlinky.reactSvg

import typingsSlinky.react.mod.Component
import typingsSlinky.reactSvg.anon.AfterInjection
import typingsSlinky.reactSvg.anon.BeforeInjection
import typingsSlinky.reactSvg.anon.HasError
import typingsSlinky.reactSvg.typesMod.Props
import typingsSlinky.reactSvg.typesMod.State
import typingsSlinky.reactSvg.typesMod.WrapperType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactSVGMod {
  
  @JSImport("react-svg/dist/ReactSVG", "ReactSVG")
  @js.native
  class ReactSVG protected ()
    extends Component[Props, State, js.Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: js.Any) = this()
    
    var _isMounted: Boolean = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MReactSVG(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MReactSVG(prevProps: Props): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MReactSVG(): Unit = js.native
    
    var container: js.UndefOr[WrapperType | Null] = js.native
    
    var initialState: HasError = js.native
    
    def refCallback(): Unit = js.native
    def refCallback(container: WrapperType): Unit = js.native
    
    def removeSVG(): Unit = js.native
    
    def renderSVG(): Unit = js.native
    
    @JSName("state")
    var state_ReactSVG: HasError = js.native
    
    var svgWrapper: js.UndefOr[WrapperType | Null] = js.native
  }
  /* static members */
  object ReactSVG {
    
    @JSImport("react-svg/dist/ReactSVG", "ReactSVG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-svg/dist/ReactSVG", "ReactSVG.defaultProps")
    @js.native
    def defaultProps: AfterInjection = js.native
    @scala.inline
    def defaultProps_=(x: AfterInjection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-svg/dist/ReactSVG", "ReactSVG.propTypes")
    @js.native
    def propTypes: BeforeInjection = js.native
    @scala.inline
    def propTypes_=(x: BeforeInjection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
