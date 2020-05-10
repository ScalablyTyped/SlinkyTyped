package typingsSlinky.googleapis.firebaserulesV1Mod.firebaserulesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Issues include warnings, errors, and deprecation notices.
  */
@js.native
trait SchemaIssue extends js.Object {
  /**
    * Short error description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The severity of the issue.
    */
  var severity: js.UndefOr[String] = js.native
  /**
    * Position of the issue in the `Source`.
    */
  var sourcePosition: js.UndefOr[SchemaSourcePosition] = js.native
}

object SchemaIssue {
  @scala.inline
  def apply(): SchemaIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIssue]
  }
  @scala.inline
  implicit class SchemaIssueOps[Self <: SchemaIssue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withSeverity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcePosition(value: SchemaSourcePosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePosition")(js.undefined)
        ret
    }
  }
  
}

