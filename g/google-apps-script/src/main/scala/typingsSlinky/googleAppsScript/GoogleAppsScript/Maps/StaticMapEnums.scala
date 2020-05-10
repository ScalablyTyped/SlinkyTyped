package typingsSlinky.googleAppsScript.GoogleAppsScript.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of enums used by StaticMap.
  */
@js.native
trait StaticMapEnums extends js.Object {
  var Color: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Color */ js.Any = js.native
  var Format: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Format */ js.Any = js.native
  var MarkerSize: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MarkerSize */ js.Any = js.native
  var Type: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Type */ js.Any = js.native
}

object StaticMapEnums {
  @scala.inline
  def apply(
    Color: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Color */ js.Any,
    Format: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Format */ js.Any,
    MarkerSize: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MarkerSize */ js.Any,
    Type: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Type */ js.Any
  ): StaticMapEnums = {
    val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], MarkerSize = MarkerSize.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticMapEnums]
  }
  @scala.inline
  implicit class StaticMapEnumsOps[Self <: StaticMapEnums] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Color */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Format */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkerSize(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MarkerSize */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarkerSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Type */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

