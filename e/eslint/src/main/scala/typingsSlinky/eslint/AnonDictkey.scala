package typingsSlinky.eslint

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  var experimentalObjectRestSpread: js.UndefOr[Boolean] = js.native
  var globalReturn: js.UndefOr[Boolean] = js.native
  var impliedStrict: js.UndefOr[Boolean] = js.native
  var jsx: js.UndefOr[Boolean] = js.native
}

object AnonDictkey {
  @scala.inline
  def apply(): AnonDictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDictkey]
  }
  @scala.inline
  implicit class AnonDictkeyOps[Self <: AnonDictkey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExperimentalObjectRestSpread(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentalObjectRestSpread")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimentalObjectRestSpread: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentalObjectRestSpread")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalReturn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalReturn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalReturn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalReturn")(js.undefined)
        ret
    }
    @scala.inline
    def withImpliedStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impliedStrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImpliedStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impliedStrict")(js.undefined)
        ret
    }
    @scala.inline
    def withJsx(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsx")(js.undefined)
        ret
    }
  }
  
}

