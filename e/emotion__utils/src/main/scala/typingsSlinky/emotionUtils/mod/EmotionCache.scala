package typingsSlinky.emotionUtils.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.emotionUtils.emotionUtilsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmotionCache extends js.Object {
  var compat: js.UndefOr[`true`] = js.native
  var inserted: StringDictionary[String | `true`] = js.native
  var key: String = js.native
  var nonce: js.UndefOr[String] = js.native
  var registered: RegisteredCache = js.native
  var sheet: StyleSheet = js.native
  def stylis(key: String, value: String): js.Array[String] = js.native
}

object EmotionCache {
  @scala.inline
  def apply(
    inserted: StringDictionary[String | `true`],
    key: String,
    registered: RegisteredCache,
    sheet: StyleSheet,
    stylis: (String, String) => js.Array[String]
  ): EmotionCache = {
    val __obj = js.Dynamic.literal(inserted = inserted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], registered = registered.asInstanceOf[js.Any], sheet = sheet.asInstanceOf[js.Any], stylis = js.Any.fromFunction2(stylis))
    __obj.asInstanceOf[EmotionCache]
  }
  @scala.inline
  implicit class EmotionCacheOps[Self <: EmotionCache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInserted(value: StringDictionary[String | `true`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inserted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegistered(value: RegisteredCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSheet(value: StyleSheet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStylis(value: (String, String) => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylis")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCompat(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compat")(js.undefined)
        ret
    }
    @scala.inline
    def withNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(js.undefined)
        ret
    }
  }
  
}

