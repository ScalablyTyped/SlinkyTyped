package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  /**
    * An Amazon DynamoDB table location.
    */
  var DynamoDB: js.UndefOr[CodeGenNodeArgs] = js.native
  /**
    * A JDBC location.
    */
  var Jdbc: js.UndefOr[CodeGenNodeArgs] = js.native
  /**
    * An Amazon Simple Storage Service (Amazon S3) location.
    */
  var S3: js.UndefOr[CodeGenNodeArgs] = js.native
}

object Location {
  @scala.inline
  def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDynamoDB(value: CodeGenNodeArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DynamoDB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamoDB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DynamoDB")(js.undefined)
        ret
    }
    @scala.inline
    def withJdbc(value: CodeGenNodeArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Jdbc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJdbc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Jdbc")(js.undefined)
        ret
    }
    @scala.inline
    def withS3(value: CodeGenNodeArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3")(js.undefined)
        ret
    }
  }
  
}

