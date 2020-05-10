package typingsSlinky.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a source file which is used to generate the service
  * configuration defined by `google.api.Service`.
  */
@js.native
trait SchemaConfigSource extends js.Object {
  /**
    * Set of source configuration files that are used to generate a service
    * configuration (`google.api.Service`).
    */
  var files: js.UndefOr[js.Array[SchemaConfigFile]] = js.native
  /**
    * A unique ID for a specific instance of this message, typically assigned
    * by the client for tracking purpose. If empty, the server may choose to
    * generate one instead.
    */
  var id: js.UndefOr[String] = js.native
}

object SchemaConfigSource {
  @scala.inline
  def apply(): SchemaConfigSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigSource]
  }
  @scala.inline
  implicit class SchemaConfigSourceOps[Self <: SchemaConfigSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFiles(value: js.Array[SchemaConfigFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

