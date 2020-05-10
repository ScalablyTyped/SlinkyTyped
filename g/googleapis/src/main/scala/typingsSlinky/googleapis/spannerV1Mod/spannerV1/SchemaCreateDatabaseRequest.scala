package typingsSlinky.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for CreateDatabase.
  */
@js.native
trait SchemaCreateDatabaseRequest extends js.Object {
  /**
    * Required. A `CREATE DATABASE` statement, which specifies the ID of the
    * new database.  The database ID must conform to the regular expression
    * `a-z*[a-z0-9]` and be between 2 and 30 characters in length. If the
    * database ID is a reserved word or if it contains a hyphen, the database
    * ID must be enclosed in backticks (`` ` ``).
    */
  var createStatement: js.UndefOr[String] = js.native
  /**
    * An optional list of DDL statements to run inside the newly created
    * database. Statements can create tables, indexes, etc. These statements
    * execute atomically with the creation of the database: if there is an
    * error in any statement, the database is not created.
    */
  var extraStatements: js.UndefOr[js.Array[String]] = js.native
}

object SchemaCreateDatabaseRequest {
  @scala.inline
  def apply(): SchemaCreateDatabaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateDatabaseRequest]
  }
  @scala.inline
  implicit class SchemaCreateDatabaseRequestOps[Self <: SchemaCreateDatabaseRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateStatement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraStatements(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraStatements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraStatements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraStatements")(js.undefined)
        ret
    }
  }
  
}

