package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a reference to a resource.
  */
@js.native
trait SchemaReference extends js.Object {
  /**
    * [Output Only] Type of the resource. Always compute#reference for
    * references.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A description of the reference type with no implied semantics. Possible
    * values include:   - MEMBER_OF
    */
  var referenceType: js.UndefOr[String] = js.native
  /**
    * URL of the resource which refers to the target.
    */
  var referrer: js.UndefOr[String] = js.native
  /**
    * URL of the resource to which this reference points.
    */
  var target: js.UndefOr[String] = js.native
}

object SchemaReference {
  @scala.inline
  def apply(): SchemaReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReference]
  }
  @scala.inline
  implicit class SchemaReferenceOps[Self <: SchemaReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceType")(js.undefined)
        ret
    }
    @scala.inline
    def withReferrer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferrer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrer")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

