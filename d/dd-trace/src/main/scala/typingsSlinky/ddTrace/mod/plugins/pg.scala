package typingsSlinky.ddTrace.mod.plugins

import typingsSlinky.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This plugin automatically instruments the
  * [pg](https://node-postgres.com/) module.
  */
@js.native
trait pg
  extends Integration
     with Analyzable

object pg {
  @scala.inline
  def apply(): pg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pg]
  }
}

