package typingsSlinky.apolloProtobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.apolloProtobufjs.mod.AnyNestedObject because Already inherited */ @js.native
trait IType extends INamespace {
  /** Extension ranges */
  var extensions: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  /** Field descriptors */
  var fields: StringDictionary[IField] = js.native
  /** Whether a legacy group or not */
  var group: js.UndefOr[Boolean] = js.native
  /** Oneof descriptors */
  var oneofs: js.UndefOr[StringDictionary[IOneOf]] = js.native
  /** Reserved ranges */
  var reserved: js.UndefOr[js.Array[js.Array[Double]]] = js.native
}

object IType {
  @scala.inline
  def apply(fields: StringDictionary[IField]): IType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[IType]
  }
  @scala.inline
  implicit class ITypeOps[Self <: IType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: StringDictionary[IField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withOneofs(value: StringDictionary[IOneOf]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneofs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOneofs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneofs")(js.undefined)
        ret
    }
    @scala.inline
    def withReserved(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reserved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReserved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reserved")(js.undefined)
        ret
    }
  }
  
}

