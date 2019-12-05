package typingsSlinky.listDashStream.listDashStreamMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.node.streamMod.DuplexOptions
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStreamConstructor
  extends ListStreamMethod
     with Instantiable2[
      /* options */ DuplexOptions, 
      /* callback */ js.Function2[/* err */ Error, /* data */ js.Array[js.Any], Unit], 
      ListStream
    ]
     with Instantiable0[ListStream]
     with Instantiable1[
      (/* options */ DuplexOptions) | (/* callback */ js.Function2[/* err */ Error, /* data */ js.Array[js.Any], Unit]), 
      ListStream
    ] {
  @JSName("obj")
  var obj_Original: ListStreamMethod = js.native
  def obj(): ListStream = js.native
  def obj(callback: js.Function2[/* err */ Error, /* data */ js.Array[_], Unit]): ListStream = js.native
  def obj(options: DuplexOptions): ListStream = js.native
  def obj(options: DuplexOptions, callback: js.Function2[/* err */ js.Error, /* data */ js.Array[_], Unit]): ListStream = js.native
}

