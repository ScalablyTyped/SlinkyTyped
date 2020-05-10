package typingsSlinky.cliBox.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.cliBox.AnonMarks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxConstructor
  extends Instantiable1[(/* options */ Options) | (/* options */ String), Box]
     with Instantiable2[
      (/* options */ Options) | (/* options */ String), 
      (/* text */ String) | (/* text */ Text), 
      Box
    ] {
  var defaults: AnonMarks = js.native
  def apply(options: String): Box = js.native
  def apply(options: String, text: String): Box = js.native
  def apply(options: String, text: Text): Box = js.native
  def apply(options: Options): Box = js.native
  def apply(options: Options, text: String): Box = js.native
  def apply(options: Options, text: Text): Box = js.native
}

