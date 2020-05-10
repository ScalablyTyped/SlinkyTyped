package typingsSlinky.ddTrace.mod.plugins

import typingsSlinky.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This plugin automatically instruments the
  * [mysql](https://github.com/mysqljs/mysql) module.
  */
@js.native
trait mysql
  extends Integration
     with Analyzable

object mysql {
  @scala.inline
  def apply(): mysql = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[mysql]
  }
}

