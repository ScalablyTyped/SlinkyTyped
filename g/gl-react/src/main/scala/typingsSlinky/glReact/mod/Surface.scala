package typingsSlinky.glReact.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.WebGLBuffer
import org.scalajs.dom.raw.WebGLRenderingContext
import org.scalajs.dom.raw.WebGLTexture
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gl-react", "Surface")
@js.native
class Surface[T] protected ()
  extends Component[SurfaceProps, SurfaceState, js.Any] {
  def this(props: SurfaceProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: SurfaceProps, context: js.Any) = this()
  
  var buffer: WebGLBuffer = js.native
  
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
  
  def captureAsBlob(args: js.Any*): js.Promise[Blob] = js.native
  
  def captureAsDataURL(args: js.Any*): String = js.native
  
  def flush(): Unit = js.native
  
  def getEmptyTexture(): WebGLTexture = js.native
  
  def getGLName(): String = js.native
  
  def getGLShortName(): String = js.native
  
  def getGLSize(): js.Tuple2[Double, Double] = js.native
  
  def getVisitors(): js.Array[Visitor] = js.native
  
  var gl: js.UndefOr[WebGLRenderingContext] = js.native
  
  def glIsAvailable(): Boolean = js.native
  
  var glView: T = js.native
  
  var id: Double = js.native
  
  var loaderResolver: js.UndefOr[js.Any] = js.native
  
  def mapRenderableContent(inst: js.Any): js.Any = js.native
  
  def rebootForDebug(): Unit = js.native
  
  def redraw(): Unit = js.native
  
  var root: Node = js.native
  
  var shaders: StringDictionary[js.Any] = js.native
}
