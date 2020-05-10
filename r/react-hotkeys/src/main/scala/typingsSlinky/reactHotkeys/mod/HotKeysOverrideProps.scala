package typingsSlinky.reactHotkeys.mod

import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HotKeysOverrideProps extends HTMLAttributes[HotKeys] {
  /**
    * The blacklist of keys that keyevents should be not ignored. i.e. if you place
    * a key in this list, all events related to it will be still be observed by react
    * hotkeys
    */
  var except: js.UndefOr[ListOfKeys] = js.native
  /**
    * The whitelist of keys that keyevents should be ignored. i.e. if you place
    * a key in this list, all events related to it will be ignored by react hotkeys
    */
  var only: js.UndefOr[ListOfKeys] = js.native
}

object HotKeysOverrideProps {
  @scala.inline
  def apply(): HotKeysOverrideProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HotKeysOverrideProps]
  }
  @scala.inline
  implicit class HotKeysOverridePropsOps[Self <: HotKeysOverrideProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcept(value: ListOfKeys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("except")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("except")(js.undefined)
        ret
    }
    @scala.inline
    def withOnly(value: ListOfKeys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(js.undefined)
        ret
    }
  }
  
}

