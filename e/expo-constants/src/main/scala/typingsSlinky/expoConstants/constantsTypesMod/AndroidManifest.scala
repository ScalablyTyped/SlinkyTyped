package typingsSlinky.expoConstants.constantsTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidManifest
  extends /* key */ StringDictionary[js.Any] {
  var versionCode: Double = js.native
}

object AndroidManifest {
  @scala.inline
  def apply(versionCode: Double): AndroidManifest = {
    val __obj = js.Dynamic.literal(versionCode = versionCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidManifest]
  }
  @scala.inline
  implicit class AndroidManifestOps[Self <: AndroidManifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVersionCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

