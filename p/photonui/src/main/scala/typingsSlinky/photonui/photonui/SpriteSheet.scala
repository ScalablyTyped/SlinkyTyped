package typingsSlinky.photonui.photonui

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.photonui.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpriteSheet extends Base {
  var icons: StringDictionary[js.Array[Double]] = js.native
  var imageUrl: String = js.native
  var name: String = js.native
  var size: String = js.native
  def addIcon(iconName: String, x: Double, y: Double): Unit = js.native
  def getIconCSS(iconName: String): String = js.native
  def getIconPosition(iconName: String): X = js.native
  def removeIcon(iconName: String): Unit = js.native
}

object SpriteSheet {
  @scala.inline
  def apply(
    addIcon: (String, Double, Double) => Unit,
    destroy: () => Unit,
    getIconCSS: String => String,
    getIconPosition: String => X,
    icons: StringDictionary[js.Array[Double]],
    imageUrl: String,
    name: String,
    registerCallback: (String, String, js.Function, js.Any) => Unit,
    removeCallback: String => Unit,
    removeIcon: String => Unit,
    size: String
  ): SpriteSheet = {
    val __obj = js.Dynamic.literal(addIcon = js.Any.fromFunction3(addIcon), destroy = js.Any.fromFunction0(destroy), getIconCSS = js.Any.fromFunction1(getIconCSS), getIconPosition = js.Any.fromFunction1(getIconPosition), icons = icons.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback), removeIcon = js.Any.fromFunction1(removeIcon), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteSheet]
  }
  @scala.inline
  implicit class SpriteSheetOps[Self <: SpriteSheet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddIcon(value: (String, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addIcon")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetIconCSS(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIconCSS")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIconPosition(value: String => X): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIconPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIcons(value: StringDictionary[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveIcon(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

