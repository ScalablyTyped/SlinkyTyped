package typingsSlinky.applicationinsightsJs.AI

import typingsSlinky.applicationinsightsJs.Microsoft.Telemetry.Domain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteDependencyData extends Domain {
  var async: Boolean = js.native
  var commandName: String = js.native
  var count: Double = js.native
  var dependencyKind: DependencyKind = js.native
  var dependencySource: DependencySourceType = js.native
  var dependencyTypeName: String = js.native
  var id: String = js.native
  var kind: DataPointType = js.native
  var max: Double = js.native
  var min: Double = js.native
  var name: String = js.native
  var properties: js.Any = js.native
  var resultCode: String = js.native
  var stdDev: Double = js.native
  var success: Boolean = js.native
  var value: Double = js.native
  var ver: Double = js.native
}

object RemoteDependencyData {
  @scala.inline
  def apply(
    async: Boolean,
    commandName: String,
    count: Double,
    dependencyKind: DependencyKind,
    dependencySource: DependencySourceType,
    dependencyTypeName: String,
    id: String,
    kind: DataPointType,
    max: Double,
    min: Double,
    name: String,
    properties: js.Any,
    resultCode: String,
    stdDev: Double,
    success: Boolean,
    value: Double,
    ver: Double
  ): RemoteDependencyData = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], commandName = commandName.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], dependencyKind = dependencyKind.asInstanceOf[js.Any], dependencySource = dependencySource.asInstanceOf[js.Any], dependencyTypeName = dependencyTypeName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any], stdDev = stdDev.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteDependencyData]
  }
  @scala.inline
  implicit class RemoteDependencyDataOps[Self <: RemoteDependencyData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommandName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependencyKind(value: DependencyKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencyKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependencySource(value: DependencySourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencySource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependencyTypeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencyTypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: DataPointType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStdDev(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdDev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ver")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

