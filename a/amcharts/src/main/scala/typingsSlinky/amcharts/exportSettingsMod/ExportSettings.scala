package typingsSlinky.amcharts.exportSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportSettings extends js.Object {
  var config: js.Any = js.native
  var enabled: Boolean = js.native
  var libs: js.Object = js.native
  var menu: js.Object = js.native
  def capture(config: js.Any, callback: js.Function0[Unit]): js.Any = js.native
  def toArray(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  def toBlob(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  def toCSV(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  def toCanvas(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  def toImage(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  def toJPG(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  def toJSON(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  def toPDF(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  def toPNG(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  def toSVG(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  def toXLSX(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
}

object ExportSettings {
  @scala.inline
  def apply(
    capture: (js.Any, js.Function0[Unit]) => js.Any,
    config: js.Any,
    enabled: Boolean,
    libs: js.Object,
    menu: js.Object,
    toArray: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toBlob: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toCSV: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toCanvas: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toImage: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toJPG: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toJSON: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toPDF: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toPNG: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toSVG: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toXLSX: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any
  ): ExportSettings = {
    val __obj = js.Dynamic.literal(capture = js.Any.fromFunction2(capture), config = config.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], libs = libs.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], toArray = js.Any.fromFunction2(toArray), toBlob = js.Any.fromFunction2(toBlob), toCSV = js.Any.fromFunction2(toCSV), toCanvas = js.Any.fromFunction2(toCanvas), toImage = js.Any.fromFunction2(toImage), toJPG = js.Any.fromFunction2(toJPG), toJSON = js.Any.fromFunction2(toJSON), toPDF = js.Any.fromFunction2(toPDF), toPNG = js.Any.fromFunction2(toPNG), toSVG = js.Any.fromFunction2(toSVG), toXLSX = js.Any.fromFunction2(toXLSX))
    __obj.asInstanceOf[ExportSettings]
  }
  @scala.inline
  implicit class ExportSettingsOps[Self <: ExportSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapture(value: (js.Any, js.Function0[Unit]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLibs(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenu(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToArray(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toArray")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToBlob(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBlob")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToCSV(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toCSV")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToCanvas(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toCanvas")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToImage(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toImage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToJPG(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJPG")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToJSON(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToPDF(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toPDF")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToPNG(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toPNG")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToSVG(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSVG")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToXLSX(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toXLSX")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

