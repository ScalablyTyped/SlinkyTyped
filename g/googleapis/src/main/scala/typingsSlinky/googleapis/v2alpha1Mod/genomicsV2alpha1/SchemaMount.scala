package typingsSlinky.googleapis.v2alpha1Mod.genomicsV2alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Carries information about a particular disk mount inside a container.
  */
@js.native
trait SchemaMount extends js.Object {
  /**
    * The name of the disk to mount, as specified in the resources section.
    */
  var disk: js.UndefOr[String] = js.native
  /**
    * The path to mount the disk inside the container.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * If true, the disk is mounted read-only inside the container.
    */
  var readOnly: js.UndefOr[Boolean] = js.native
}

object SchemaMount {
  @scala.inline
  def apply(): SchemaMount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMount]
  }
  @scala.inline
  implicit class SchemaMountOps[Self <: SchemaMount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisk(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disk")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
  }
  
}

