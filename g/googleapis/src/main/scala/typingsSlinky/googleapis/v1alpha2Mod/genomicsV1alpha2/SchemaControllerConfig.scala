package typingsSlinky.googleapis.v1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stores the information that the controller will fetch from the server in
  * order to run. Should only be used by VMs created by the Pipelines Service
  * and not by end users.
  */
@js.native
trait SchemaControllerConfig extends js.Object {
  var cmd: js.UndefOr[String] = js.native
  var disks: js.UndefOr[StringDictionary[String]] = js.native
  var gcsLogPath: js.UndefOr[String] = js.native
  var gcsSinks: js.UndefOr[StringDictionary[SchemaRepeatedString]] = js.native
  var gcsSources: js.UndefOr[StringDictionary[SchemaRepeatedString]] = js.native
  var image: js.UndefOr[String] = js.native
  var machineType: js.UndefOr[String] = js.native
  var vars: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaControllerConfig {
  @scala.inline
  def apply(): SchemaControllerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaControllerConfig]
  }
  @scala.inline
  implicit class SchemaControllerConfigOps[Self <: SchemaControllerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCmd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCmd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmd")(js.undefined)
        ret
    }
    @scala.inline
    def withDisks(value: StringDictionary[String]): Self = {
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
    def withGcsLogPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsLogPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcsLogPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsLogPath")(js.undefined)
        ret
    }
    @scala.inline
    def withGcsSinks(value: StringDictionary[SchemaRepeatedString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsSinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcsSinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsSinks")(js.undefined)
        ret
    }
    @scala.inline
    def withGcsSources(value: StringDictionary[SchemaRepeatedString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcsSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsSources")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withMachineType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("machineType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMachineType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("machineType")(js.undefined)
        ret
    }
    @scala.inline
    def withVars(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vars")(js.undefined)
        ret
    }
  }
  
}

