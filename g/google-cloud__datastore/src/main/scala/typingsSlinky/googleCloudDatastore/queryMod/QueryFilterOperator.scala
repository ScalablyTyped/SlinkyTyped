package typingsSlinky.googleCloudDatastore.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.Lessthansign
  - typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.LessthansignEqualssign
  - typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.Equalssign
  - typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.GreaterthansignEqualssign
  - typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.Greaterthansign
*/
trait QueryFilterOperator extends js.Object

object QueryFilterOperator {
  @scala.inline
  def Equalssign: typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.Equalssign = this.cast("=")
  @scala.inline
  def Greaterthansign: typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

