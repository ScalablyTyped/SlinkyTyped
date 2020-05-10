package typingsSlinky.awsSdkBuildTypes.apiModelMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.input
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.output
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.structure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Structure
  extends ShapeDef
     with ComplexShape
     with Shape {
  var error: js.UndefOr[Error] = js.native
  var exception: js.UndefOr[scala.Boolean] = js.native
  var fault: js.UndefOr[scala.Boolean] = js.native
  var members: StringDictionary[StructureMember] = js.native
  var payload: js.UndefOr[java.lang.String] = js.native
  var required: js.UndefOr[js.Array[java.lang.String]] = js.native
  var topLevel: js.UndefOr[input | output] = js.native
  @JSName("type")
  val type_Structure: structure = js.native
}

object Structure {
  @scala.inline
  def apply(members: StringDictionary[StructureMember], `type`: structure): Structure = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
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
    def withMembers(value: StringDictionary[StructureMember]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: structure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withException(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exception")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutException: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exception")(js.undefined)
        ret
    }
    @scala.inline
    def withFault(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fault")(js.undefined)
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
    @scala.inline
    def withRequired(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withTopLevel(value: input | output): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLevel")(js.undefined)
        ret
    }
  }
  
}

