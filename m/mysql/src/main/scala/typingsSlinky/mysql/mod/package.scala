package typingsSlinky.mysql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type packetCallback = js.Function1[/* packet */ js.Any, scala.Unit]
  type queryCallback = js.Function3[
    /* err */ typingsSlinky.mysql.mod.MysqlError | scala.Null, 
    /* results */ js.UndefOr[js.Any], 
    /* fields */ js.UndefOr[js.Array[typingsSlinky.mysql.mod.FieldInfo]], 
    scala.Unit
  ]
}
