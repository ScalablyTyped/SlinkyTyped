package typingsSlinky.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Address extends js.Object {
  /**
    * The address expressed as a byte offset from the start of the addressable region.
    */
  var absoluteAddress: js.UndefOr[Double] = js.native
  /**
    * A human-readable fully qualified name that is associated with the address.
    */
  var fullyQualifiedName: js.UndefOr[String] = js.native
  /**
    * The index within run.addresses of the cached object for this address.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * An open-ended string that identifies the address kind. 'data', 'function', 'header','instruction', 'module',
    * 'page', 'section', 'segment', 'stack', 'stackFrame', 'table' are well-known values.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The number of bytes in this range of addresses.
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * A name that is associated with the address, e.g., '.text'.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The byte offset of this address from the absolute or relative address of the parent object.
    */
  var offsetFromParent: js.UndefOr[Double] = js.native
  /**
    * The index within run.addresses of the parent object.
    */
  var parentIndex: js.UndefOr[Double] = js.native
  /**
    * Key/value pairs that provide additional information about the address.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * The address expressed as a byte offset from the absolute address of the top-most parent object.
    */
  var relativeAddress: js.UndefOr[Double] = js.native
}

object Address {
  @scala.inline
  def apply(): Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Address]
  }
  @scala.inline
  implicit class AddressOps[Self <: Address] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsoluteAddress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsoluteAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withFullyQualifiedName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullyQualifiedName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullyQualifiedName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullyQualifiedName")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
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
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetFromParent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetFromParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetFromParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetFromParent")(js.undefined)
        ret
    }
    @scala.inline
    def withParentIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: PropertyBag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativeAddress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeAddress")(js.undefined)
        ret
    }
  }
  
}

