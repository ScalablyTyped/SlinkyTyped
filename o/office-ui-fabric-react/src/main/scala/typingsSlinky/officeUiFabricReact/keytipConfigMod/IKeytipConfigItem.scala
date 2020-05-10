package typingsSlinky.officeUiFabricReact.keytipConfigMod

import typingsSlinky.officeUiFabricReact.PartialIKeytipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeytipConfigItem extends js.Object {
  /**
    * Children keytips of this keytip
    */
  var children: js.UndefOr[js.Array[IKeytipConfigItem]] = js.native
  /**
    * Content for the keytip
    */
  var content: String = js.native
  /**
    * Identifier for the keytip, to be used to access in the configMap
    */
  var id: String = js.native
  /**
    * Optional props in IKeytipProps
    */
  var optionalProps: js.UndefOr[PartialIKeytipProps] = js.native
  /**
    * Key Sequence for this keytip only
    * If sequence is not defined it will be derived from the content string
    */
  var sequence: js.UndefOr[String] = js.native
}

object IKeytipConfigItem {
  @scala.inline
  def apply(content: String, id: String): IKeytipConfigItem = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeytipConfigItem]
  }
  @scala.inline
  implicit class IKeytipConfigItemOps[Self <: IKeytipConfigItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[IKeytipConfigItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionalProps(value: PartialIKeytipProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionalProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalProps")(js.undefined)
        ret
    }
    @scala.inline
    def withSequence(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(js.undefined)
        ret
    }
  }
  
}

