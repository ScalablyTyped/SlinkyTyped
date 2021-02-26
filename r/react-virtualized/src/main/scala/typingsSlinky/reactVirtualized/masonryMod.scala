package typingsSlinky.reactVirtualized

import typingsSlinky.reactVirtualized.anon.KeyMapper
import typingsSlinky.reactVirtualized.esMasonryMod.MasonryProps
import typingsSlinky.reactVirtualized.esMasonryMod.MasonryState
import typingsSlinky.reactVirtualized.esMasonryMod.Positioner
import typingsSlinky.reactVirtualized.esMasonryMod.createCellPositionerParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object masonryMod {
  
  @JSImport("react-virtualized/dist/commonjs/Masonry", "DEFAULT_SCROLLING_RESET_TIME_INTERVAL")
  @js.native
  val DEFAULT_SCROLLING_RESET_TIME_INTERVAL: /* 150 */ Double = js.native
  
  @JSImport("react-virtualized/dist/commonjs/Masonry", "Masonry")
  @js.native
  class Masonry protected ()
    extends typingsSlinky.reactVirtualized.esMasonryMod.Masonry {
    def this(props: MasonryProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MasonryProps, context: js.Any) = this()
  }
  /* static members */
  object Masonry {
    
    @JSImport("react-virtualized/dist/commonjs/Masonry", "Masonry")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/commonjs/Masonry", "Masonry.defaultProps")
    @js.native
    def defaultProps: KeyMapper = js.native
    @scala.inline
    def defaultProps_=(x: KeyMapper): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-virtualized/dist/commonjs/Masonry", "Masonry.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: MasonryProps, prevState: MasonryState): MasonryState | Null = js.native
  }
  
  @JSImport("react-virtualized/dist/commonjs/Masonry", "createCellPositioner")
  @js.native
  def createCellPositioner(params: createCellPositionerParams): Positioner = js.native
}
