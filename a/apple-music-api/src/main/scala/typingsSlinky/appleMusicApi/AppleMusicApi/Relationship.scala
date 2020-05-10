package typingsSlinky.appleMusicApi.AppleMusicApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/relationship
@js.native
trait Relationship[ResourceType] extends js.Object {
  var data: js.Array[ResourceType] = js.native
  var href: String = js.native
  var meta: js.UndefOr[js.Any] = js.native
  var next: js.UndefOr[String] = js.native
}

object Relationship {
  @scala.inline
  def apply[ResourceType](data: js.Array[ResourceType], href: String): Relationship[ResourceType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relationship[ResourceType]]
  }
  @scala.inline
  implicit class RelationshipOps[Self[resourcetype] <: Relationship[resourcetype], ResourceType] (val x: Self[ResourceType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ResourceType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ResourceType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ResourceType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ResourceType] with Other]
    @scala.inline
    def withData(value: js.Array[ResourceType]): Self[ResourceType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHref(value: String): Self[ResourceType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: js.Any): Self[ResourceType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeta: Self[ResourceType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(js.undefined)
        ret
    }
    @scala.inline
    def withNext(value: String): Self[ResourceType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext: Self[ResourceType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.undefined)
        ret
    }
  }
  
}

