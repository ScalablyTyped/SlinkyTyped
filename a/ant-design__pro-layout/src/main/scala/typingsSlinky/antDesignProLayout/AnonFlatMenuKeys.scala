package typingsSlinky.antDesignProLayout

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.antDesignProLayout.typingsMod.MenuDataItem
import typingsSlinky.react.mod.Dispatch
import typingsSlinky.react.mod.SetStateAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFlatMenuKeys extends js.Object {
  var flatMenuKeys: js.Array[String] = js.native
  var flatMenus: js.UndefOr[StringDictionary[MenuDataItem]] = js.native
  var setFlatMenuKeys: Dispatch[SetStateAction[js.Array[String]]] = js.native
  var setFlatMenus: Dispatch[SetStateAction[js.UndefOr[StringDictionary[MenuDataItem]]]] = js.native
}

object AnonFlatMenuKeys {
  @scala.inline
  def apply(
    flatMenuKeys: js.Array[String],
    setFlatMenuKeys: SetStateAction[js.Array[String]] => Unit,
    setFlatMenus: SetStateAction[js.UndefOr[StringDictionary[MenuDataItem]]] => Unit
  ): AnonFlatMenuKeys = {
    val __obj = js.Dynamic.literal(flatMenuKeys = flatMenuKeys.asInstanceOf[js.Any], setFlatMenuKeys = js.Any.fromFunction1(setFlatMenuKeys), setFlatMenus = js.Any.fromFunction1(setFlatMenus))
    __obj.asInstanceOf[AnonFlatMenuKeys]
  }
  @scala.inline
  implicit class AnonFlatMenuKeysOps[Self <: AnonFlatMenuKeys] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlatMenuKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatMenuKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetFlatMenuKeys(value: SetStateAction[js.Array[String]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFlatMenuKeys")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFlatMenus(value: SetStateAction[js.UndefOr[StringDictionary[MenuDataItem]]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFlatMenus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFlatMenus(value: StringDictionary[MenuDataItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatMenus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlatMenus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatMenus")(js.undefined)
        ret
    }
  }
  
}

