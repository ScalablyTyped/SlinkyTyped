package typingsSlinky.reactContentLoader

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactContentLoader.interfaceMod.IContentLoaderProps
import typingsSlinky.reactNativeSvg.mod.CircleProps
import typingsSlinky.reactNativeSvg.mod.RectProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-content-loader/dist/native", JSImport.Namespace)
@js.native
object nativeMod extends js.Object {
  @js.native
  class Circle protected ()
    extends typingsSlinky.reactContentLoader.holderMod.Circle {
    def this(props: CircleProps) = this()
    def this(props: CircleProps, context: js.Any) = this()
  }
  
  @js.native
  class Rect protected ()
    extends typingsSlinky.reactContentLoader.holderMod.Rect {
    def this(props: RectProps) = this()
    def this(props: RectProps, context: js.Any) = this()
  }
  
  val BulletList: ReactComponentClass[IContentLoaderProps] = js.native
  val Code: ReactComponentClass[IContentLoaderProps] = js.native
  val Facebook: ReactComponentClass[IContentLoaderProps] = js.native
  val Instagram: ReactComponentClass[IContentLoaderProps] = js.native
  val List: ReactComponentClass[IContentLoaderProps] = js.native
  def default(props: IContentLoaderProps): ReactElement = js.native
  @js.native
  object Circle extends TopLevel[ReactComponentClass[CircleProps]]
  
  @js.native
  object Rect extends TopLevel[ReactComponentClass[RectProps]]
  
}

