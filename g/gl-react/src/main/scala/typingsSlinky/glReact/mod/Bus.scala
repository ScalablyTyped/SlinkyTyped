package typingsSlinky.glReact.mod

import typingsSlinky.glReact.anon.GlParent
import typingsSlinky.glReact.anon.GlParentAny
import typingsSlinky.glReact.anon.GlParentBus
import typingsSlinky.glReact.anon.GlSurface
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gl-react", "Bus")
@js.native
class Bus protected ()
  extends Component[BusProps, js.Object, js.Any] {
  def this(props: BusProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: BusProps, context: js.Any) = this()
  
  def capture(): js.Array[_] = js.native
  def capture(
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    w: js.UndefOr[scala.Nothing],
    h: Double
  ): js.Array[_] = js.native
  def capture(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], w: Double): js.Array[_] = js.native
  def capture(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], w: Double, h: Double): js.Array[_] = js.native
  def capture(x: js.UndefOr[scala.Nothing], y: Double): js.Array[_] = js.native
  def capture(x: js.UndefOr[scala.Nothing], y: Double, w: js.UndefOr[scala.Nothing], h: Double): js.Array[_] = js.native
  def capture(x: js.UndefOr[scala.Nothing], y: Double, w: Double): js.Array[_] = js.native
  def capture(x: js.UndefOr[scala.Nothing], y: Double, w: Double, h: Double): js.Array[_] = js.native
  def capture(x: Double): js.Array[_] = js.native
  def capture(x: Double, y: js.UndefOr[scala.Nothing], w: js.UndefOr[scala.Nothing], h: Double): js.Array[_] = js.native
  def capture(x: Double, y: js.UndefOr[scala.Nothing], w: Double): js.Array[_] = js.native
  def capture(x: Double, y: js.UndefOr[scala.Nothing], w: Double, h: Double): js.Array[_] = js.native
  def capture(x: Double, y: Double): js.Array[_] = js.native
  def capture(x: Double, y: Double, w: js.UndefOr[scala.Nothing], h: Double): js.Array[_] = js.native
  def capture(x: Double, y: Double, w: Double): js.Array[_] = js.native
  def capture(x: Double, y: Double, w: Double, h: Double): js.Array[_] = js.native
  
  @JSName("context")
  var context_Bus: GlParent = js.native
  
  var dependents: js.Array[Node | Surface[_]] = js.native
  
  def getChildContext(): GlParentBus = js.native
  
  def getGLName(): String = js.native
  
  def getGLRenderableContent(): js.Any = js.native
  
  def getGLRenderableNode(): Node = js.native
  
  def getGLShortName(): String = js.native
  
  var glBusRootNode: js.Any = js.native
  
  var glNode: js.UndefOr[Node] = js.native
  
  var id: Double = js.native
  
  def onRef(ref: js.Any): Unit = js.native
  
  def redraw(): Unit = js.native
}
/* static members */
object Bus {
  
  @JSImport("gl-react", "Bus")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gl-react", "Bus.childContextTypes")
  @js.native
  def childContextTypes: GlParentAny = js.native
  @scala.inline
  def childContextTypes_=(x: GlParentAny): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("gl-react", "Bus.contextTypes")
  @js.native
  def contextTypes: GlSurface = js.native
  @scala.inline
  def contextTypes_=(x: GlSurface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("gl-react", "Bus.defaultProps")
  @js.native
  def defaultProps: BusProps = js.native
  @scala.inline
  def defaultProps_=(x: BusProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
