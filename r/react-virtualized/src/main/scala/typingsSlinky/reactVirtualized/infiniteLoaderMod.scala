package typingsSlinky.reactVirtualized

import typingsSlinky.reactVirtualized.anon.IsRowLoaded
import typingsSlinky.reactVirtualized.anon.MinimumBatchSize
import typingsSlinky.reactVirtualized.esInfiniteLoaderMod.InfiniteLoaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infiniteLoaderMod {
  
  @JSImport("react-virtualized/dist/commonjs/InfiniteLoader", "InfiniteLoader")
  @js.native
  class InfiniteLoader protected ()
    extends typingsSlinky.reactVirtualized.esInfiniteLoaderMod.InfiniteLoader {
    def this(props: InfiniteLoaderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: InfiniteLoaderProps, context: js.Any) = this()
  }
  /* static members */
  object InfiniteLoader {
    
    @JSImport("react-virtualized/dist/commonjs/InfiniteLoader", "InfiniteLoader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/commonjs/InfiniteLoader", "InfiniteLoader.defaultProps")
    @js.native
    def defaultProps: MinimumBatchSize = js.native
    @scala.inline
    def defaultProps_=(x: MinimumBatchSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-virtualized/dist/commonjs/InfiniteLoader", "InfiniteLoader.propTypes")
    @js.native
    def propTypes: IsRowLoaded = js.native
    @scala.inline
    def propTypes_=(x: IsRowLoaded): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
