package typingsSlinky.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Preserved state for a given instance.
  */
@js.native
trait SchemaPreservedState extends js.Object {
  /**
    * Preserved disks defined for this instance. This map is keyed with the
    * device names of the disks.
    */
  var disks: js.UndefOr[StringDictionary[SchemaPreservedStatePreservedDisk]] = js.native
  /**
    * Preserved metadata defined for this instance.
    */
  var metadata: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaPreservedState {
  @scala.inline
  def apply(): SchemaPreservedState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPreservedState]
  }
  @scala.inline
  implicit class SchemaPreservedStateOps[Self <: SchemaPreservedState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisks(value: StringDictionary[SchemaPreservedStatePreservedDisk]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disks")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
  }
  
}

