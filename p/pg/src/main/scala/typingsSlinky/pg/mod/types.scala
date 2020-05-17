package typingsSlinky.pg.mod

import typingsSlinky.pg.anon.TypeofarrayParser
import typingsSlinky.pgTypes.mod.TypeParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg", "types")
@js.native
object types extends js.Object {
  val arrayParser: TypeofarrayParser = js.native
  def getTypeParser(oid: Double, format: String): TypeParser = js.native
  def setTypeParser(oid: Double, format: String, parseFn: TypeParser): Unit = js.native
  def setTypeParser(oid: Double, parseFn: TypeParser): Unit = js.native
}

