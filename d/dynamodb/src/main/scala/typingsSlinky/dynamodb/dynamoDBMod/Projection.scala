package typingsSlinky.dynamodb.dynamoDBMod

import typingsSlinky.dynamodb.dynamodbStrings.ALL
import typingsSlinky.dynamodb.dynamodbStrings.INCLUDE
import typingsSlinky.dynamodb.dynamodbStrings.KEYS_ONLY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Projection extends js.Object {
  var NonKeyAttributes: js.UndefOr[js.Array[String]] = js.native
  var ProjectionType: js.UndefOr[ALL | KEYS_ONLY | INCLUDE | String] = js.native
}

object Projection {
  @scala.inline
  def apply(): Projection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Projection]
  }
  @scala.inline
  implicit class ProjectionOps[Self <: Projection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNonKeyAttributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NonKeyAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonKeyAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NonKeyAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectionType(value: ALL | KEYS_ONLY | INCLUDE | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectionType")(js.undefined)
        ret
    }
  }
  
}

