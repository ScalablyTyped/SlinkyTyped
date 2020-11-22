package typingsSlinky.bmapgl.global

import typingsSlinky.bmapgl.BMapGL.Map
import typingsSlinky.bmapgl.MapVGL.LayerOptions
import typingsSlinky.bmapgl.MapVGL.ViewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MapVGL")
@js.native
object MapVGL extends js.Object {
  
  @js.native
  class Effects ()
    extends typingsSlinky.bmapgl.MapVGL.Effects {
    def this(opts: js.Object) = this()
  }
  
  @js.native
  class Layer protected ()
    extends typingsSlinky.bmapgl.MapVGL.Layer {
    def this(map: Map) = this()
    def this(map: Map, opts: LayerOptions) = this()
  }
  
  @js.native
  class View protected ()
    extends typingsSlinky.bmapgl.MapVGL.View {
    def this(opts: ViewOptions) = this()
  }
}
