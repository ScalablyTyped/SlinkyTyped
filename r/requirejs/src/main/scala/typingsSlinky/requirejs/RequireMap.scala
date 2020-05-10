package typingsSlinky.requirejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
*
**/
@js.native
trait RequireMap extends js.Object {
  /**
  	*
  	**/
  var fullName: String = js.native
  /**
  	*
  	**/
  var name: String = js.native
  /**
  	*
  	**/
  var originalName: String = js.native
  /**
  	*
  	**/
  var parentMap: RequireMap = js.native
  /**
  	*
  	**/
  var prefix: String = js.native
  /**
  	*
  	**/
  var url: String = js.native
}

object RequireMap {
  @scala.inline
  def apply(
    fullName: String,
    name: String,
    originalName: String,
    parentMap: RequireMap,
    prefix: String,
    url: String
  ): RequireMap = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], originalName = originalName.asInstanceOf[js.Any], parentMap = parentMap.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequireMap]
  }
  @scala.inline
  implicit class RequireMapOps[Self <: RequireMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentMap(value: RequireMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

