package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Custom authenticator credentials.
  */
@js.native
trait SchemaMetadataCredentialsFromPlugin extends js.Object {
  /**
    * Plugin name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A text proto that conforms to a Struct type definition interpreted by the
    * plugin.
    */
  var structConfig: js.UndefOr[String] = js.native
}

object SchemaMetadataCredentialsFromPlugin {
  @scala.inline
  def apply(): SchemaMetadataCredentialsFromPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetadataCredentialsFromPlugin]
  }
  @scala.inline
  implicit class SchemaMetadataCredentialsFromPluginOps[Self <: SchemaMetadataCredentialsFromPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withStructConfig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structConfig")(js.undefined)
        ret
    }
  }
  
}

