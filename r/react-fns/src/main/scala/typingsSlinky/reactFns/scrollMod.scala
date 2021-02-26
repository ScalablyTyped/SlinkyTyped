package typingsSlinky.reactFns

import slinky.core.ReactComponentClass
import typingsSlinky.reactFns.anon.PartialScrollConfig
import typingsSlinky.reactFns.scrollScrollMod.ScrollConfig
import typingsSlinky.reactFns.scrollScrollMod.ScrollProps
import typingsSlinky.reactFns.typesMod.SharedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollMod {
  
  @JSImport("react-fns/dist/Scroll", "Scroll")
  @js.native
  class Scroll protected ()
    extends typingsSlinky.reactFns.scrollScrollMod.Scroll {
    def this(props: ScrollConfig with SharedRenderProps[ScrollProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollConfig with SharedRenderProps[ScrollProps], context: js.Any) = this()
  }
  /* static members */
  object Scroll {
    
    @JSImport("react-fns/dist/Scroll", "Scroll")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-fns/dist/Scroll", "Scroll.defaultProps")
    @js.native
    def defaultProps: PartialScrollConfig = js.native
    @scala.inline
    def defaultProps_=(x: PartialScrollConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-fns/dist/Scroll", "withScroll")
  @js.native
  def withScroll[Props](Component: ReactComponentClass[Props with ScrollProps]): ReactComponentClass[Props] = js.native
}
