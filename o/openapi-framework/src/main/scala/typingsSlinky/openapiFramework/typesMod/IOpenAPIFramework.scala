package typingsSlinky.openapiFramework.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOpenAPIFramework extends js.Object {
  var featureType: String = js.native
  var loggingPrefix: String = js.native
  var name: String = js.native
}

object IOpenAPIFramework {
  @scala.inline
  def apply(featureType: String, loggingPrefix: String, name: String): IOpenAPIFramework = {
    val __obj = js.Dynamic.literal(featureType = featureType.asInstanceOf[js.Any], loggingPrefix = loggingPrefix.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOpenAPIFramework]
  }
  @scala.inline
  implicit class IOpenAPIFrameworkOps[Self <: IOpenAPIFramework] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatureType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoggingPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

