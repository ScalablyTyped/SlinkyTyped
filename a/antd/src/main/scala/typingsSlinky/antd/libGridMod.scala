package typingsSlinky.antd

import typingsSlinky.antd.anon.Gutter
import typingsSlinky.antd.gridRowMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/grid", JSImport.Namespace)
@js.native
object libGridMod extends js.Object {
  @js.native
  class Col ()
    extends typingsSlinky.antd.gridColMod.Col
  
  @js.native
  class Row () extends default
  
  /* static members */
  @js.native
  object Row extends js.Object {
    var defaultProps: Gutter = js.native
  }
  
}

