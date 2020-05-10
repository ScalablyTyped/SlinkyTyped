package typingsSlinky.meteor.mongoMod.Mongo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowDenyOptions extends js.Object {
  var fetch: js.UndefOr[js.Array[String]] = js.native
  var insert: js.UndefOr[js.Function2[/* userId */ String, /* doc */ js.Any, Boolean]] = js.native
  var remove: js.UndefOr[js.Function2[/* userId */ String, /* doc */ js.Any, Boolean]] = js.native
  var transform: js.UndefOr[js.Function | Null] = js.native
  var update: js.UndefOr[
    js.Function4[
      /* userId */ String, 
      /* doc */ js.Any, 
      /* fieldNames */ js.Array[String], 
      /* modifier */ js.Any, 
      Boolean
    ]
  ] = js.native
}

object AllowDenyOptions {
  @scala.inline
  def apply(): AllowDenyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowDenyOptions]
  }
  @scala.inline
  implicit class AllowDenyOptionsOps[Self <: AllowDenyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFetch(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.undefined)
        ret
    }
    @scala.inline
    def withInsert(value: (/* userId */ String, /* doc */ js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: (/* userId */ String, /* doc */ js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(null)
        ret
    }
    @scala.inline
    def withUpdate(
      value: (/* userId */ String, /* doc */ js.Any, /* fieldNames */ js.Array[String], /* modifier */ js.Any) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

