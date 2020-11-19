package typingsSlinky.reactVirtualized

import typingsSlinky.reactVirtualized.anon.KeyMapper
import typingsSlinky.reactVirtualized.esMasonryMod.MasonryProps
import typingsSlinky.reactVirtualized.esMasonryMod.MasonryState
import typingsSlinky.reactVirtualized.esMasonryMod.Positioner
import typingsSlinky.reactVirtualized.esMasonryMod.createCellPositionerParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized/dist/commonjs/Masonry", JSImport.Namespace)
@js.native
object masonryMod extends js.Object {
  
  val DEFAULT_SCROLLING_RESET_TIME_INTERVAL: /* 150 */ Double = js.native
  
  def createCellPositioner(params: createCellPositionerParams): Positioner = js.native
  
  @js.native
  class Masonry ()
    extends typingsSlinky.reactVirtualized.esMasonryMod.Masonry
  /* static members */
  @js.native
  object Masonry extends js.Object {
    
    var defaultProps: KeyMapper = js.native
    
    def getDerivedStateFromProps(nextProps: MasonryProps, prevState: MasonryState): MasonryState | Null = js.native
  }
}
