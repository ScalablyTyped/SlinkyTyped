package typingsSlinky.firebaseFirestore.queryMod

import typingsSlinky.firebaseFirestore.documentMod.Document
import typingsSlinky.firebaseFirestore.pathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/core/query", "OrderBy")
@js.native
class OrderBy protected () extends js.Object {
  def this(field: FieldPath) = this()
  def this(field: FieldPath, dir: Direction) = this()
  val dir: Direction = js.native
  val field: FieldPath = js.native
  val isKeyOrderBy: js.Any = js.native
  def canonicalId(): String = js.native
  def compare(d1: Document, d2: Document): Double = js.native
  def isEqual(other: OrderBy): Boolean = js.native
}

