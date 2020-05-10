package typingsSlinky.awsSdkTypes.protocolMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.structure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Structure
  extends Shape
     with SerializationModel {
  var exceptionCode: js.UndefOr[java.lang.String] = js.native
  var exceptionType: js.UndefOr[java.lang.String] = js.native
  var members: StringDictionary[Member] = js.native
  var payload: js.UndefOr[java.lang.String] = js.native
  var required: js.Array[java.lang.String] = js.native
  @JSName("type")
  var type_Structure: structure = js.native
}

object Structure {
  @scala.inline
  def apply(members: StringDictionary[Member], required: js.Array[java.lang.String], `type`: structure): Structure = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Structure]
  }
  @scala.inline
  implicit class StructureOps[Self <: Structure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMembers(value: StringDictionary[Member]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: structure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExceptionCode(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptionCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExceptionCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptionCode")(js.undefined)
        ret
    }
    @scala.inline
    def withExceptionType(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExceptionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptionType")(js.undefined)
        ret
    }
    @scala.inline
    def withPayload(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
        ret
    }
  }
  
}

