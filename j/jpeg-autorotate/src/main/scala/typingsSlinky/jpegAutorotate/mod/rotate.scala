package typingsSlinky.jpegAutorotate.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jpeg-autorotate", "rotate")
@js.native
object rotate extends js.Object {
  
  def apply(path_or_buffer: String, options: RotateOptions): Unit = js.native
  def apply(
    path_or_buffer: String,
    options: RotateOptions,
    module_callback: js.Function5[
      /* error */ CustomError | Null, 
      /* buffer */ Buffer, 
      /* orientation */ Double | Null, 
      /* dimensions */ RotateDimensions | Null, 
      /* quality */ Double | Null, 
      Unit
    ]
  ): Unit = js.native
  def apply(path_or_buffer: Buffer, options: RotateOptions): Unit = js.native
  def apply(
    path_or_buffer: Buffer,
    options: RotateOptions,
    module_callback: js.Function5[
      /* error */ CustomError | Null, 
      /* buffer */ Buffer, 
      /* orientation */ Double | Null, 
      /* dimensions */ RotateDimensions | Null, 
      /* quality */ Double | Null, 
      Unit
    ]
  ): Unit = js.native
}
