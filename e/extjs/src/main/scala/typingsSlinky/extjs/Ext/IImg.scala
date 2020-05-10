package typingsSlinky.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IImg extends IComponent {
  /** [Config Option] (String) */
  var alt: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Number/String) */
  var glyph: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var imgCls: js.UndefOr[java.lang.String] = js.native
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IImg: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Updates the src of the image
  		* @param src String
  		*/
  var setSrc: js.UndefOr[js.Function1[/* src */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Config Option] (String) */
  var src: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.native
}

object IImg {
  @scala.inline
  def apply(): IImg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IImg]
  }
  @scala.inline
  implicit class IImgOps[Self <: IImg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlt(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyph(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyph")(js.undefined)
        ret
    }
    @scala.inline
    def withImgCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImgCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgCls")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRender(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRender")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRender")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSrc(value: /* src */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSrc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withSrc(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

