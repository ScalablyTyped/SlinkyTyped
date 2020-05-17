package typingsSlinky.knex.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ref[TSrc /* <: String */, TMapping /* <: js.Object */]
  extends Raw[String]
     with InferrableColumnDescriptor[js.Any] {
  def as[TAlias /* <: String */](alias: TAlias): Ref[
    TSrc, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in TAlias ]: TSrc}
    */ typingsSlinky.knex.knexStrings.Ref with TopLevel[js.Any]
  ] = js.native
  def withSchema(schema: String): this.type = js.native
}

