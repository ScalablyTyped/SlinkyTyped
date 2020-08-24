package typingsSlinky.ddTrace.mod.plugins

import typingsSlinky.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This plugin automatically instruments the
  * [tedious](https://github.com/tediousjs/tedious/) module.
  */
@js.native
trait tedious
  extends Integration
     with Analyzable

object tedious {
  @scala.inline
  def apply(): tedious = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[tedious]
  }
}

