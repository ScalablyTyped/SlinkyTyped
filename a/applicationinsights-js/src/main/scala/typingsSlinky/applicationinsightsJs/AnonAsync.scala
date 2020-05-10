package typingsSlinky.applicationinsightsJs

import typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAsync extends js.Object {
  var async: FieldType = js.native
  var commandName: FieldType = js.native
  var count: FieldType = js.native
  var dependencyKind: FieldType = js.native
  var dependencySource: FieldType = js.native
  var dependencyTypeName: FieldType = js.native
  var id: FieldType = js.native
  var kind: FieldType = js.native
  var max: FieldType = js.native
  var min: FieldType = js.native
  var name: FieldType = js.native
  var properties: FieldType = js.native
  var resultCode: FieldType = js.native
  var stdDev: FieldType = js.native
  var success: FieldType = js.native
  var value: FieldType = js.native
  var ver: FieldType = js.native
}

object AnonAsync {
  @scala.inline
  def apply(
    async: FieldType,
    commandName: FieldType,
    count: FieldType,
    dependencyKind: FieldType,
    dependencySource: FieldType,
    dependencyTypeName: FieldType,
    id: FieldType,
    kind: FieldType,
    max: FieldType,
    min: FieldType,
    name: FieldType,
    properties: FieldType,
    resultCode: FieldType,
    stdDev: FieldType,
    success: FieldType,
    value: FieldType,
    ver: FieldType
  ): AnonAsync = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], commandName = commandName.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], dependencyKind = dependencyKind.asInstanceOf[js.Any], dependencySource = dependencySource.asInstanceOf[js.Any], dependencyTypeName = dependencyTypeName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any], stdDev = stdDev.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAsync]
  }
  @scala.inline
  implicit class AnonAsyncOps[Self <: AnonAsync] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsync(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommandName(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependencyKind(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencyKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependencySource(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencySource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependencyTypeName(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencyTypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultCode(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStdDev(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdDev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVer(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ver")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

